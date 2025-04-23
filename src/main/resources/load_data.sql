create database nosqlprojectdb;
\c nosqlprojectdb;
create table student_course_grades(
    studentid text,
    courseid text,
    rollno text,
    emailid text,
    grade text,
    last_modified timestamp default now(),
    primary key(studentid,courseid)
);
\copy student_course_grades(studentid, courseid, rollno, emailid, grade) FROM '/home/abhi/Downloads/nosql_proj/Data-Synchronization-Across-Heterogeneous-Systems/src/main/resources/student_course_grades.csv' DELIMITER E',' CSV HEADER ENCODING 'UTF8';
