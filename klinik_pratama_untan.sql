CREATE DATABASE  IF NOT EXISTS `klinik_pratama_untan` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `klinik_pratama_untan`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: klinik_pratama_untan
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bagian`
--

DROP TABLE IF EXISTS `bagian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bagian` (
  `kd_bagian` char(4) NOT NULL,
  `nama_bagian` varchar(30) NOT NULL,
  `deskripsi_bagian` text NOT NULL,
  PRIMARY KEY (`kd_bagian`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bagian`
--

LOCK TABLES `bagian` WRITE;
/*!40000 ALTER TABLE `bagian` DISABLE KEYS */;
INSERT INTO `bagian` VALUES ('BG01','Poli Umum','Poli umum merupakan salah satu dari jenis layanan di Puskesmas yang memberikan pelayanan kedokteran berupa pemeriksaan kesehatan, pengobatan dan penyuluhan kepada pasien atau masyarakat, serta meningkatkan pengetahuan dan kesadaran masyarakat dalam bidang kesehatan.'),('BG02','Poli Gigi','Melayani pemeriksaan dan perawatan gigi'),('BG03','Poli Anak','Melayani pemeriksaan dan kesehatan anak'),('BG04','Poli Kebidanan dan Kandungan','Melayani pemeriksaan dan kesehatan ibu hamil dan bayi'),('BG05','Poli Lansia','Melayani pemeriksaan dan kesehatan lansia'),('BG06','OB','melakukan pembersihan dan perawatan lingkungan klinik');
/*!40000 ALTER TABLE `bagian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dokter`
--

DROP TABLE IF EXISTS `dokter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dokter` (
  `no_str` char(16) NOT NULL,
  `id_karyawan` char(6) NOT NULL,
  `kd_bagian` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nama` varchar(40) NOT NULL,
  `jenis_kelamin` set('Laki-laki','Perempuan') NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  PRIMARY KEY (`no_str`),
  KEY `FK_DokterKaryawan` (`id_karyawan`),
  KEY `FK_DokterBagian` (`kd_bagian`),
  CONSTRAINT `FK_DokterBagian` FOREIGN KEY (`kd_bagian`) REFERENCES `bagian` (`kd_bagian`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_DokterKaryawan` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dokter`
--

LOCK TABLES `dokter` WRITE;
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
INSERT INTO `dokter` VALUES ('0101010101010101','000202','BG02','Arya','Laki-laki','Jl. Sudirman No. 24','1996-03-08','08789012345'),('0202020202020202','000201','BG01','Rahma','Perempuan','Jl. Gajah Mada No. 12','1990-05-02','08234567890'),('1234123412345432','123123','BG01','Fadhil','Laki-laki','Pontianak','2005-05-10','081208120812');
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `karyawan`
--

DROP TABLE IF EXISTS `karyawan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `karyawan` (
  `id_karyawan` char(6) NOT NULL,
  `kd_bagian` char(4) NOT NULL,
  `kd_shift` char(4) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `jenis_kelamin` set('Laki-laki','Perempuan') NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id_karyawan`),
  KEY `FK_KaryawanBagian` (`kd_bagian`),
  KEY `Fk_KaryawanShift` (`kd_shift`),
  CONSTRAINT `FK_KaryawanBagian` FOREIGN KEY (`kd_bagian`) REFERENCES `bagian` (`kd_bagian`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Fk_KaryawanShift` FOREIGN KEY (`kd_shift`) REFERENCES `shift` (`kd_shift`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `karyawan`
--

LOCK TABLES `karyawan` WRITE;
/*!40000 ALTER TABLE `karyawan` DISABLE KEYS */;
INSERT INTO `karyawan` VALUES ('000101','BG03','SN02','Tono','Laki-laki','Imam Bonjol','2000-02-07','081234567890','Perawat','tono123'),('000201','BG01','SN02','Rahma','Perempuan','Jl. Gajah Mada No. 12','1990-05-02','08234567890','Dokter','rahma123'),('000202','BG02','SN01','Arya','Laki-laki','Jl. Sudirman No. 24','1996-03-08','08789012345','Dokter Gigi','arya123'),('000301','BG02','SL02','Budi','Laki-laki','Jl. Diponegoro No. 34','1985-11-10','08567890123','Bidan','budi123'),('000401','BG05','SL01','Ani','Perempuan','Jl. Sudirman No. 56','1995-03-08','08789012345','Apoteker','ani123'),('000501','BG04','SL02','Fadhil','Laki-laki','Jl. Sudirman No. 90','1995-03-08','08789012345','Resepsionis','fadhil123'),('000602','BG06','EV10','Arujino','Laki-laki','Tanray','2004-01-31','085248831702','Cleaning Service','aryoganteng'),('123123','BG01','SN01','ferdinan','Laki-laki','Kendawangan','2003-12-08','081213141516','Dokter Umum','ferdian123');
/*!40000 ALTER TABLE `karyawan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `obat`
--

DROP TABLE IF EXISTS `obat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `obat` (
  `kd_obat` varchar(16) NOT NULL,
  `nama_obat` varchar(50) NOT NULL,
  `stok` int NOT NULL,
  `harga_obat` decimal(8,0) NOT NULL,
  PRIMARY KEY (`kd_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obat`
--

LOCK TABLES `obat` WRITE;
/*!40000 ALTER TABLE `obat` DISABLE KEYS */;
INSERT INTO `obat` VALUES ('0111022203330444','Paracetamol',37,10000),('0111022203330555','Ketoconazole',130,4000),('0111022203330666','Amoxicillin',50,8000),('0111022203330777','Azithromycin',20,15000),('0111022203330888','Cephalexin',75,6500),('0111022203330999','Ibuprofen',100,5000),('0111022203331010','Loratadine',60,10000),('0111022203331111','Ciprofloxacin',45,18000),('0111022203331222','Metformin',90,12500),('0111022203331333','Simvastatin',30,20000),('0111022203331909','Antibiotik',239,11500),('1111222233334444','obat nyamuk',3,20000);
/*!40000 ALTER TABLE `obat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasien`
--

DROP TABLE IF EXISTS `pasien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pasien` (
  `nik` char(16) NOT NULL,
  `nama_pasien` varchar(40) NOT NULL,
  `usia` int NOT NULL,
  `jenis_kelamin` set('Laki-laki','Perempuan') NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabel yang berisikan data-data Pasien';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasien`
--

LOCK TABLES `pasien` WRITE;
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
INSERT INTO `pasien` VALUES ('0000000000000001','Surya',47,'Laki-laki','Bekasi','081234567890'),('0000000000000002','Tuti',55,'Perempuan','Cimahi Gg.Kebenaran','081234567891'),('1234213421342134','Ferdian',12,'Laki-laki','adasdad','081213141516'),('4321432143214321','Ferdian',19,'Laki-laki','Bandaran','123123123123'),('5555101010051234','fadhil mafia',20,'Laki-laki','kobar','08123456789');
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `after_insert_pasien` AFTER INSERT ON `pasien` FOR EACH ROW BEGIN
    INSERT INTO pemeriksaan (nik, kd_bagian, id_karyawan, keluhan, diagnosa, tgl_periksa)
    VALUES (NEW.nik, "BG01", "123123", DEFAULT, DEFAULT, NOW());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `pembayaran`
--

DROP TABLE IF EXISTS `pembayaran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pembayaran` (
  `kd_resep` char(8) NOT NULL,
  `kd_periksa` int NOT NULL,
  `total` decimal(8,0) NOT NULL,
  `metode_pembayaran` set('Tunai','Non-Tunai') NOT NULL,
  KEY `FK_PembayaranPeriksa` (`kd_periksa`),
  KEY `FK_PembayaranResep` (`kd_resep`),
  CONSTRAINT `FK_PembayaranPeriksa` FOREIGN KEY (`kd_periksa`) REFERENCES `pemeriksaan` (`kd_periksa`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PembayaranResep` FOREIGN KEY (`kd_resep`) REFERENCES `resep` (`kd_resep`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pembayaran`
--

LOCK TABLES `pembayaran` WRITE;
/*!40000 ALTER TABLE `pembayaran` DISABLE KEYS */;
INSERT INTO `pembayaran` VALUES ('00000004',20,2059500,'Tunai');
/*!40000 ALTER TABLE `pembayaran` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pemeriksaan`
--

DROP TABLE IF EXISTS `pemeriksaan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pemeriksaan` (
  `kd_periksa` int NOT NULL AUTO_INCREMENT,
  `nik` char(16) NOT NULL,
  `kd_bagian` char(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'BG01',
  `id_karyawan` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '123123',
  `keluhan` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `diagnosa` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  `tgl_periksa` datetime NOT NULL,
  `harga` decimal(8,0) DEFAULT NULL,
  UNIQUE KEY `pemeriksaan_kd_periksa_nik_uk` (`kd_periksa`,`nik`),
  KEY `FK_PeriksaBagian` (`kd_bagian`),
  KEY `FK_PeriksaKaryawan` (`id_karyawan`),
  KEY `FK_PeriksaNik` (`nik`),
  CONSTRAINT `FK_PeriksaBagian` FOREIGN KEY (`kd_bagian`) REFERENCES `bagian` (`kd_bagian`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PeriksaKaryawan` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PeriksaNik` FOREIGN KEY (`nik`) REFERENCES `pasien` (`nik`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pemeriksaan`
--

LOCK TABLES `pemeriksaan` WRITE;
/*!40000 ALTER TABLE `pemeriksaan` DISABLE KEYS */;
INSERT INTO `pemeriksaan` VALUES (4,'1234213421342134','BG01','123123','cis','cis','2024-05-29 19:22:38',NULL),(8,'4321432143214321','BG01','123123','lah','suka tidur','2024-05-31 00:00:00',4000000),(11,'5555101010051234','BG01','123123',NULL,NULL,'2024-06-02 19:13:42',NULL),(12,'0000000000000001','BG01','123123',NULL,NULL,'2024-06-02 21:38:10',NULL),(13,'0000000000000002','BG01','123123',NULL,NULL,'2024-06-02 21:38:10',NULL),(18,'0000000000000002','BG02','000202','sakit gigi','Gigi Berlubang','2024-06-02 00:00:00',200000),(20,'5555101010051234','BG02','000202','sakit gigi','operasi gigi geraham bungsu','2024-06-03 00:52:31',2000000);
/*!40000 ALTER TABLE `pemeriksaan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resep`
--

DROP TABLE IF EXISTS `resep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resep` (
  `kd_resep` char(8) NOT NULL,
  `kd_obat` varchar(16) NOT NULL,
  `kd_periksa` int NOT NULL,
  `nama_obat` varchar(40) NOT NULL,
  `dosis` varchar(40) NOT NULL,
  `deskripsi` text NOT NULL,
  `jumlah` int DEFAULT NULL,
  `harga` decimal(8,0) DEFAULT NULL,
  UNIQUE KEY `resep_kd_resep_kd_obat_uk` (`kd_resep`,`kd_obat`),
  KEY `FK_ResepObat` (`kd_obat`),
  KEY `FK_ResepPeriksa` (`kd_periksa`),
  CONSTRAINT `FK_ResepObat` FOREIGN KEY (`kd_obat`) REFERENCES `obat` (`kd_obat`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_ResepPeriksa` FOREIGN KEY (`kd_periksa`) REFERENCES `pemeriksaan` (`kd_periksa`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resep`
--

LOCK TABLES `resep` WRITE;
/*!40000 ALTER TABLE `resep` DISABLE KEYS */;
INSERT INTO `resep` VALUES ('00000002','1111222233334444',8,'obat nyamuk','serah','kamu',2,NULL),('00000003','0111022203330444',18,'Paracetamol','3 x 1','makan setelah minum',2,NULL),('00000003','0111022203330999',18,'Ibuprofen','1x1','diminum sebelum bangun',3,NULL),('00000003','1111222233334444',8,'obat nyamuk','1','serah',1,NULL),('00000004','0111022203330444',20,'Paracetamol','3 x 1','setiap setelah makan',3,30000),('00000004','0111022203330888',18,'Cephalexin','serah','sekali sehari',2,6500),('00000004','0111022203331909',20,'Antibiotik','3 x 1','setiap setelah makan',2,23000),('00000004','1111222233334444',8,'obat nyamuk','1','serah',1,NULL),('12344321','1111222233334444',4,'obat nyamuk','satu gelas','tiap malam',NULL,NULL);
/*!40000 ALTER TABLE `resep` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shift`
--

DROP TABLE IF EXISTS `shift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shift` (
  `kd_shift` char(4) NOT NULL,
  `hari` varchar(7) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  PRIMARY KEY (`kd_shift`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shift`
--

LOCK TABLES `shift` WRITE;
/*!40000 ALTER TABLE `shift` DISABLE KEYS */;
INSERT INTO `shift` VALUES ('EV10','Sen-Sab','07:00-17:00'),('RB01','Rabu','08:30-12:00'),('SL01','Selasa','08:00-12:00'),('SL02','Selasa','13:00-16:00'),('SN01','Senin','08:00 - 12:00'),('SN02','Senin','13:00-16:00');
/*!40000 ALTER TABLE `shift` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'klinik_pratama_untan'
--

--
-- Dumping routines for database 'klinik_pratama_untan'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-04  0:32:08
