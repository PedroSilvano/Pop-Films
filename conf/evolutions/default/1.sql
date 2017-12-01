# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table filme (
  id                            bigint auto_increment not null,
  nome                          varchar(255),
  genero                        varchar(255),
  data_lancamento               datetime(6),
  constraint pk_filme primary key (id)
);


# --- !Downs

drop table if exists filme;

