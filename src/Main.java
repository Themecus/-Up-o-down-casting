//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Bebe tu= new Adulto();

     tu.setNombre("adam");

     tu.Hablar();//hasta aqui podriamos decir que estamos haciendo Upcasting
     // tu.trabajar(); esto no podemos usarlo ya que marca error, metodos fuera de la clase padre que se hereden no se pueden usar
        //((Adulto) tu).trabajar(); //Podrias escribirlo asi y si funcionaria

        //haremos downcasting siendo el otro metodo

        Adulto adulto = (Adulto) tu;

        adulto.trabajar();
        //ahora si podriamos usar sus metodos y los del padre tambien


    }
}