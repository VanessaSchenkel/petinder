CREATE TABLE IF NOT EXISTS address (
    id INT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(255) NOT NULL,
    streetname VARCHAR(255) NOT NULL,
    address_number INT NOT NULL,
    apartment_number INT,
    zip_code INT
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS human (
    id INT AUTO_INCREMENT PRIMARY KEY,
    password_user VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    name_user VARCHAR(255) NOT NULL,
    telephone INT,
    id_address INT,
    registration_date timestamp,
    FOREIGN KEY (id_address) REFERENCES address (id)
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS pet (
    id INT AUTO_INCREMENT PRIMARY KEY,
    registration_date timestamp NOT NULL,
    is_dog boolean NOT NULL,
    is_available boolean NOT NULL, 
    name_pet varchar(255), 
    birthdate DATE NOT NULL, 
    size varchar(2), 
    gender varchar(2) NOT NULL, 
    breed varchar(255) NOT NULL, 
    is_vaccinated boolean, 
    is_castrated boolean, 
    is_dewormed boolean,
    has_FIVorFELV boolean, 
    is_dogfriendly boolean, 
    is_catfriendly boolean, 
    is_childfriendly boolean, 
    is_curious boolean, 
    is_sociable boolean,
    is_dominant boolean,
    is_playful boolean,
    is_outgoing boolean,
    bio varchar(255) NOT NULL,
    id_human int NOT NULL, 
    FOREIGN KEY (id_human) 
    REFERENCES human (id) 
    ON UPDATE RESTRICT 
    ON DELETE CASCADE
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS matches (
    id INT AUTO_INCREMENT PRIMARY KEY,
    match_date TIMESTAMP, 
    is_adopted boolean NOT NULL, 
    has_seen boolean NOT NULL, 
    id_pet INT, 
    id_human INT,
    FOREIGN KEY (id_pet) 
    REFERENCES pet (id) 
    ON UPDATE RESTRICT 
    ON DELETE CASCADE,
    FOREIGN KEY (id_human) 
    REFERENCES human (id) 
    ON UPDATE RESTRICT 
    ON DELETE CASCADE
)  ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS picture (
    id INT AUTO_INCREMENT PRIMARY KEY,
    path_picture VARCHAR(255) NOT NULL,
    registration_date timestamp,
	id_pet INT,
    FOREIGN KEY (id_pet) 
    REFERENCES pet (id) 
    ON UPDATE RESTRICT 
    ON DELETE CASCADE
)  ENGINE=INNODB;