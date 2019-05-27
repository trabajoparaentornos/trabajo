/**
 * 
 * @author Jose Gutierrez
 *Esta clase es para una persona
 */

public class Persona //Nombre de la clase
{	
		/**
		 * Atributo Nombre: asignar un nombre a la persona
		 */
		private String nombre; // Nombre de la persona.
		/**
		 * Atributo edad: asignar una edad a la persona
		 */
		private int edad; // Edad de la persona.
		/**
		 * Atributo deportista: asignar un deportista como boolean a la persona
		 */
		private boolean deportista; // Deportista ( verdadero o falso (si o no)) la persona.

		//Constructor
		/**
		 *Constructor por defecto con nombre edad y no deportista
		 */
		  public Persona (){
		      nombre = "";
		      edad = 0;
		      deportista = true;//hace deporte la persona (si o no)
		  }//Cierre del constructor

//Método para obtener el nombre.
		  /**
		   * Metodo para obtener el nombre
		   * @return atributo nombre
		   */
		public String getNombre() {
			return nombre; 
		}//Cierre del método
//Método para establecer el nombre.
		/**
		 * Método para establecer el nombre.
		 * @param elnombre
		 */
		 public void setNombre (String elnombre){
			 this.nombre = "nombre" + elnombre; //La persona coge el valor de "elnombre"
		     }//cierre del método
		  
//Método para obtener la edad.
		 /**
		  * Método para obtener la edad.
		  * @return
		  */
		 public int getEdad () {
			 return edad; 
			 } //Cierre del método
//Método para establecer los edad.
		 /**
		  * Método para establecer los edad.
		  * @param laedad
		  */
		    public void setEdad (int laedad){
		        this.edad = laedad;//la edad de personacoge el valor que contenga "laedad"
		    }//Cierre del método
		    
//Método para obtener si la persona es deportista o no.
		    /**
		     * Método para obtener si la persona es deportista o no.
		     * @return deportista
		     */
		    public boolean getDeportista () { 
		    	return deportista; 
		    } //Cierre del método
//Método para establecer si una persona es deportista o no
		    /**
		     * Método para establecer si una persona es deportista o no
		     * @param eldeportista
		     */
	    public void setDeportista (boolean eldeportista){
	        this.deportista = eldeportista;// sabemos si la persona es o no es deportista.
	    }//Cierre del método	  
	    /**
	     * Cierre de la clase
	     */
}//Cierre de la clase