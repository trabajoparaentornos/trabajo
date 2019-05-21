//Esta clase es para una persona//
public class Persona //Nombre de la clase
{	
		private String nombre; // Nombre de la persona.
		private int edad; // Edad de la persona.
		private boolean deportista; // Deportista ( verdadero o falso (si o no)) la persona.

		//Constructor
		  public Persona (){
		      nombre = "";
		      edad = 0;
		      deportista = true;//hace deporte la persona (si o no)
		  }//Cierre del constructor

//Método para obtener el nombre.
		public String getNombre() {
			return nombre; 
		}//Cierre del método
//Método para establecer el nombre.
		 public void setNombre (String elnombre){
			 this.nombre = "nombre" + elnombre; //La persona coge el valor de "elnombre"
		     }//cierre del método
		  
//Método para obtener la edad.
		 public int getEdad () {
			 return edad; 
			 } //Cierre del método
//Método para establecer los edad.
		    public void setEdad (int laedad){
		        this.edad = laedad;//la edad de personacoge el valor que contenga "laedad"
		    }//Cierre del método
		    
//Método para obtener si la persona es deportista o no.
		    public boolean getDeportista () { 
		    	return deportista; 
		    } //Cierre del método
//Método para establecer si una persona es deportista o no
	    public void setDeportista (boolean eldeportista){
	        this.deportista = eldeportista;// sabemos si la persona es o no es deportista.
	    }//Cierre del método	  
	    
}//Cierre de la clase