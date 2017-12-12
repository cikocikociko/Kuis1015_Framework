-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 12, 2017 at 08:44 AM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1015`
--
CREATE DATABASE IF NOT EXISTS `kuis1015` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `kuis1015`;

-- --------------------------------------------------------

--
-- Table structure for table `cv_1015`
--

CREATE TABLE `cv_1015` (
  `id` int(11) NOT NULL,
  `jenis` varchar(50) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cv_1015`
--

INSERT INTO `cv_1015` (`id`, `jenis`, `nama`) VALUES
(12, 'cv', 'ciko'),
(13, 'cv', 'koci');

-- --------------------------------------------------------

--
-- Table structure for table `nilai_1015`
--

CREATE TABLE `nilai_1015` (
  `id_nilai` int(11) NOT NULL,
  `nilai_praktikum` int(11) DEFAULT NULL,
  `nilai_teori` int(11) DEFAULT NULL,
  `cv_1015_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nilai_1015`
--

INSERT INTO `nilai_1015` (`id_nilai`, `nilai_praktikum`, `nilai_teori`, `cv_1015_id`) VALUES
(124, 90, 97, 13),
(9643, 90, 95, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1015`
--
ALTER TABLE `cv_1015`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nilai_1015`
--
ALTER TABLE `nilai_1015`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `FKifr2isq36mavg9pftx7hndmf0` (`cv_1015_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1015`
--
ALTER TABLE `cv_1015`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `nilai_1015`
--
ALTER TABLE `nilai_1015`
  MODIFY `id_nilai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9644;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `nilai_1015`
--
ALTER TABLE `nilai_1015`
  ADD CONSTRAINT `FKifr2isq36mavg9pftx7hndmf0` FOREIGN KEY (`cv_1015_id`) REFERENCES `cv_1015` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
