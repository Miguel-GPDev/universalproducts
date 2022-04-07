CREATE TABLE AMAZONPRODUCTOS (
    ASIN                VARCHAR(100)    NOT NULL,
    TITULO              VARCHAR(100)         ,
    PRECIO              DOUBLE               ,
    DESCRIPCION         VARCHAR(100)         ,
    CATEGORIA           VARCHAR(100)         ,
    VALORACION          DOUBLE               ,
    N_VALORACIONES      INTEGER(100)         ,
    MARCA               VARCHAR(100)         ,
    MODELO              VARCHAR(100)         ,
    URL                 VARCHAR(100)         ,
    IMAGEN              VARCHAR(100)         ,
    FECHA_ALTA          TIMESTAMP            ,
    SEGUIDORES          INTEGER              ,
    USUARIO_ID_ALTA     VARCHAR(100)         ,

    PRIMARY KEY (ASIN)


);

CREATE TABLE USUARIOS (
    ID                  VARCHAR(100)        ,
    NOMBRE              VARCHAR(100)        ,
    EMAIL               VARCHAR(100)        ,
    TELEFONO            VARCHAR(100)        ,

    PRIMARY KEY (ID)

);

CREATE TABLE LISTADO (
    ID                  VARCHAR(100)        ,
    ASIN                VARCHAR(100)        ,

    PRIMARY KEY (ID, ASIN)

);


CREATE TABLE MEDICOS (
	DNI					VARCHAR(100)	NOT NULL,
	NOMBRE				VARCHAR(100)	,
	APELLIDO1			VARCHAR(100)	,
	APELLIDO2			VARCHAR(100)	,
	FECHA_ALTA			TIMESTAMP		,
	DIRECCION			VARCHAR(100)	,
	POBLACION			VARCHAR(100)	,
	PROVINCIA			VARCHAR(100)	,
	CODIGO_POSTAL		VARCHAR(100)	,
	ACTIVO				BOOLEAN			,
	PAIS				VARCHAR(100)	,
	TELEFONO			VARCHAR(100)	,
	EMAIL				VARCHAR(100)	,
	ESPECIALIDAD		VARCHAR(100)	,
	
	
	PRIMARY KEY (DNI)
);
