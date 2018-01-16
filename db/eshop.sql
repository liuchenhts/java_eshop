create table product(
    id bigserial primary key,
    name varchar(30) unique not null,
    price numeric(6,1),
    date_created timestamp with time zone not null default now()
);