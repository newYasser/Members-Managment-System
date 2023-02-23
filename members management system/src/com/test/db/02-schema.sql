CREATE DATABASE  IF NOT EXISTS `members_management_system` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `members_management_system`;


--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `committee` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;

INSERT INTO `member` VALUES 
	(1,'Mohammed','Yasser','mohammedyassser@gmail.com','CW'),
	(2,'Mohammed','Ashraf','mohammedashraf@gmail.com','WEB'),
	(3,'Abdallah','El-Said','abdallah@gmail.com','PR'),
	(4,'Mohammed','Said','mohammedsaid@gmail.com','AC');

