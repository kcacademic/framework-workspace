CREATE TABLE CUSTOMER (
 CUSTOMER_ID INT (5) NOT NULL AUTO_INCREMENT,
 FIRST_NAME VARCHAR (20) NOT NULL,
 LAST_NAME VARCHAR (20) NOT NULL,
 CREATED_BY VARCHAR (20) DEFAULT 'Self' NOT NULL,
 CREATED_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
 PRIMARY KEY ( CUSTOMER_ID )
);