create table Specialty
(
    idSpecialty integer,
    name        varchar,
    description text
);

create table Student
(
    idStudent   integer,
    name        varchar,
    score       float,
    idSpecialty integer,
    foreign key (idSpecialty) references Specialty (idSpecialty)
);