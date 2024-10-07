public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void clasificarEdad(){
        if (this.edad <= 10){
            System.out.println(nombre +" es un niño ");
        } else if (this.edad >=11 && this.edad <=19) {
            System.out.println(nombre +" es un adolescente ");
        } else if (this.edad >=20 && this.edad <=65) {
            System.out.println(nombre +" es un adulto ");
        } else if (this.edad >65) {
            System.out.println(nombre +" es un anciano ");
        }
    }

}
