CREATE USER 'member'@'localhost' IDENTIFIED BY 'member';

GRANT ALL PRIVILEGES ON * . * TO 'member'@'localhost';


ALTER USER 'member'@'localhost' IDENTIFIED WITH mysql_native_password BY 'member';