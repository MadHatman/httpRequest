CREATE TABLE test.log (
  user_id varchar(30) NOT NULL,
  first_name varchar(50) NULL,
  second_name varchar(50) NULL,
  message varchar(1000) NULL,
  created_at varchar(50) NULL,
  CONSTRAINT test_log_un UNIQUE (user_id)
);