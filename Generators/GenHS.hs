{-# LANGUAGE OverloadedStrings #-}

import Test.QuickCheck
import System.IO

gerarNumeroUnico :: Gen Int
gerarNumeroUnico = choose (100000000, 999999999)

data Fornecedor = EDP | Galp | Iberdrola | Endesa | GoldEnergy | Coopernico | Enat | YIce | MEOEnergia | Muon | Luzboa | EnergiaSimples | SUElectricidade | EDA
  deriving (Show, Eq)

data Nome = Diana | Rui | Afonso | Gongas | Artur | Bea
  deriving (Show, Eq)

data Casa = Casa Nome Int Fornecedor
  deriving (Show, Eq)

data Divisao = Quarto | Cozinha | Sotao | Cave | Sala | Escritorio
  deriving (Show, Eq)

data Cores = Vermelho | Amarelo | Azul | Laranja | Verde | Roxo | Branco
  deriving (Show, Eq)

data Estacao = Comercial | RFM | Noticias | AUMINHO | MEGAHITS | M80 | RTP | Renascenca
  deriving (Show, Eq)

data Marca =  Sony | Marshall | JBL | Sennheiser | BowersWilkins | Philips
  deriving (Show, Eq)

data SmartDevice = SmartBulb Cores Int Double | SmartCamera Int Int Int Double | SmartSpeaker Int Estacao Marca Double
  deriving (Show, Eq)

data Registro = Fornecedor Fornecedor | CasaRegisto Casa | DivisaoRegisto Divisao | SmartDevice SmartDevice
  deriving (Show, Eq)

instance Arbitrary Fornecedor where
  arbitrary = elements [EDP, Galp, Iberdrola, Endesa, GoldEnergy, Coopernico, Enat, YIce, MEOEnergia, Muon, Luzboa, EnergiaSimples, SUElectricidade, EDA]

instance Arbitrary Nome where
  arbitrary = elements [Diana, Rui, Afonso, Gongas, Artur, Bea]

instance Arbitrary Casa where
  arbitrary = Casa <$> arbitrary <*> gerarNumeroUnico <*> arbitrary

instance Arbitrary Divisao where
  arbitrary = elements [Quarto, Cozinha, Sotao, Cave, Sala, Escritorio]

instance Arbitrary Cores where
  arbitrary = elements [Vermelho, Amarelo, Azul, Laranja, Verde, Roxo, Branco]

instance Arbitrary Estacao where
  arbitrary = elements [Comercial, RFM, Noticias, AUMINHO, MEGAHITS, M80, RTP, Renascenca]

instance Arbitrary Marca where
  arbitrary = elements [Sony, Marshall, JBL, Sennheiser, BowersWilkins, Philips]

instance Arbitrary SmartDevice where
  arbitrary = oneof [SmartBulb <$> arbitrary <*> arbitrary <*> arbitrary, SmartCamera <$> arbitrary <*> arbitrary <*> arbitrary <*> arbitrary, SmartSpeaker <$> arbitrary <*> arbitrary <*> arbitrary <*> arbitrary]

instance Arbitrary Registro where
  arbitrary = oneof [Fornecedor <$> arbitrary, CasaRegisto <$> arbitrary, DivisaoRegisto <$> arbitrary, SmartDevice <$> arbitrary]

formatRegistro :: Registro -> String
formatRegistro (Fornecedor fornecedor) = "Fornecedor:" ++ show fornecedor
formatRegistro (CasaRegisto (Casa nome num fornecedor)) = "Casa:" ++ show nome ++ "," ++ show num ++ "," ++ show fornecedor
formatRegistro (DivisaoRegisto divisao) = "Divisao:" ++ show divisao
formatRegistro (SmartDevice device) = case device of
  SmartBulb t i d -> "SmartBulb:" ++ show t ++ "," ++ show i ++ "," ++ show d
  SmartCamera a b i d -> "SmartCamera:" ++ show a ++ "x" ++ show b ++ "," ++ show i ++ "," ++ show d
  SmartSpeaker i s b d -> "SmartSpeaker:" ++ show i ++ "," ++ show s ++ "," ++ show b ++ "," ++ show d

generateRegistro :: IO Registro
generateRegistro = generate arbitrary

generateFile :: FilePath -> Int -> IO ()
generateFile filePath numLines = do
  registros <- generate $ vectorOf numLines arbitrary
  withFile filePath WriteMode $ \handle -> do
    hPutStr handle $ unlines $ map formatRegistro registros

main :: IO ()
main = generateFile "arquivo.txt" 20
