# Запускать не нужно, настроенна автогенерация бд и таблиц
create database if not exists kataWorkDB;
use kataWorkDB;
CREATE TABLE if not exists Users
(
    id            int primary key auto_increment,
    name          varchar(100) NOT NULL,
    surname       varchar(100) NOT NULL,
    year_of_birth int          NOT NULL,
    role          varchar(100)
)

