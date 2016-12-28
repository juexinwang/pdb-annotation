--
-- database `pdb`
--
drop table IF EXISTS pdb_seq_alignment;
drop table IF EXISTS uniprot_entry;
drop table IF EXISTS ensembl_entry;
drop table IF EXISTS pdb_entry;
drop table IF EXISTS seq_entry;

CREATE TABLE `seq_entry`(
    `SEQ_ID` int(255) NOT NULL,
    `SEQENCE` VARCHAR(8191),
    PRIMARY KEY(`SEQ_ID`)
);
CREATE TABLE `uniprot_entry`(
    `UNIPROT_ID_ISO` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
    `UNIPROT_ID` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
    `ISOFORM` VARCHAR(2) NOT NULL,
    `SEQ_ID` int(255),
    PRIMARY KEY(`UNIPROT_ID_ISO`),
    FOREIGN KEY(`SEQ_ID`) REFERENCES `seq_entry` (`SEQ_ID`)
);
CREATE TABLE `ensembl_entry` (
    `ENSEMBL_ID` VARCHAR(20) NOT NULL,
    `ENSEMBL_GENE` VARCHAR(20),
    `ENSEMBL_TRANSCRIPT` VARCHAR(20),
    `SEQ_ID` int(255),
    PRIMARY KEY(`ENSEMBL_ID`),
    FOREIGN KEY(`SEQ_ID`) REFERENCES `seq_entry` (`SEQ_ID`)
);
CREATE TABLE `pdb_entry` (
    `PDB_NO` VARCHAR(12) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
    `PDB_ID` VARCHAR(4) NOT NULL,
    `CHAIN` VARCHAR(4) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
    `PDB_SEG` VARCHAR(2) NOT NULL,
    `DBREF` VARCHAR(255),
    PRIMARY KEY(`PDB_NO`)
);
CREATE TABLE `pdb_seq_alignment` (
  `ALIGNMENT_ID` int NOT NULL AUTO_INCREMENT,
  `PDB_NO` VARCHAR(12) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `PDB_ID` VARCHAR(4) NOT NULL,
  `CHAIN` VARCHAR(4) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `PDB_SEG` VARCHAR(2) NOT NULL,
  `SEQ_ID` int(255) NOT NULL,
  `PDB_FROM` int NOT NULL,
  `PDB_TO` int NOT NULL,
  `SEQ_FROM` int NOT NULL,
  `SEQ_TO` int NOT NULL,
  `EVALUE` double,
  `BITSCORE` float,
  `IDENTITY` float,
  `IDENTP` float,
  `SEQ_ALIGN` text,
  `PDB_ALIGN` text,
  `MIDLINE_ALIGN` text,
  `UPDATE_DATE` DATE,
  PRIMARY KEY (`ALIGNMENT_ID`),
  KEY(`SEQ_ID`),
  KEY(`PDB_ID`, `CHAIN`, `PDB_SEG`),
  FOREIGN KEY(`PDB_NO`) REFERENCES `pdb_entry` (`PDB_NO`),
  FOREIGN KEY(`SEQ_ID`) REFERENCES `seq_entry` (`SEQ_ID`)
);
