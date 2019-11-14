public class Config {


    //URL PARA ACCESO REMOTA A BASE DE DATOS MYSQL DEL SERVIDOR DEL PROF. GÁMEZ EN LA NUBE.
    public static final String urlGuardar = "http://mjgl.com.sv/mysqlcrud/guardar.php";                               //Guardar datos DB.
    public static final String urlEliminar = "http://mjgl.com.sv/mysqlcrud/eliminar.php";                             //Eliminar datos DB.
    public static final String urlActualizar = "http://mjgl.com.sv/mysqlcrud/actualizar.php";                          //Actualizar datos DB.

    public static final String urlConsultaApiMySQLi = "http://mjgl.com.sv/mysqlcrud/Api.php";                          //Ver todos los registros DB.
    public static final String urlConsultaApiPDO = "http://mjgl.com.sv/mysqlcrud/buscarAll.php";                       //Ver todos los registros DB.

    public static final String urlConsultaCodigo = "http://mjgl.com.sv/mysqlcrud/buscarArticulosCodigo.php";            //Busquedas por código.
    public static final String urlConsultaDescripcion = "http://mjgl.com.sv/mysqlcrud/buscarArticulosDescripcion.php";  //Busquedas por descripción.
    public static final String urlConsultaAllArticulos = "http://mjgl.com.sv/mysqlcrud/buscarArticulos.php";            //Devuelve todos los registros de la tabla MySQL.


 /*
    //URL PARA ACCESO A BASE DE DATOS LOCAL MYSQL.
    //public static final String urlGuardar = "http://(ingresarip)/mysqlcrud/guardar.php";                               //Guardar datos DB.
    public static final String urlGuardar = "http://(ingresarip)/mysqlcrud/guardar.php";                               //Guardar datos DB.

    public static final String urlEliminar = "http://(ingresarip)/mysqlcrud/eliminar.php";                             //Eliminar datos DB.
    public static final String urlActualizar = "http://(ingresarip)/mysqlcrud/actualizar.php";                          //Actualizar datos DB.

    public static final String urlConsultaApiMySQLi = "http://(ingresarip)/mysqlcrud/Api.php";                          //Ver todos los registros DB.
    public static final String urlConsultaApiPDO = "http://(ingresarip)/mysqlcrud/buscarAll.php";                       //Ver todos los registros DB.

    public static final String urlConsultaCodigo = "http://(ingresarip)/mysqlcrud/buscarArticulosCodigo.php";            //Busquedas por código.
    public static final String urlConsultaDescripcion = "http://(ingresarip)/mysqlcrud/buscarArticulosDescripcion.php";  //Busquedas por descripción.
    public static final String urlConsultaAllArticulos = "http://(ingresarip)/mysqlcrud/buscarArticulos.php";            //Devuelve todos los registros de la tabla MySQL.
  */
}
