create database Shopping_Computer;
use Shopping_Computer;


create table Categories(
	id_category int(5) not null primary key auto_increment,
    name_category nvarchar(20) not null
);

create table Products(
	id_product int(5) not null primary key auto_increment,
    id_category int(5) not null,
    name_product nvarchar(20) not null,
    price int(10) not null,
    quantity int(5) not null,
    status_product boolean not null,
    describe_product nvarchar(100),
    picture nvarchar(100) not null,
    foreign key (id_category) references Categories(id_category)
);

select * from categories;
select * from products;
