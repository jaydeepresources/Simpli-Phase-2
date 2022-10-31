# Simpli-Phase-2

CREATE TABLE `test`.`posts` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `body` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `test`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);
