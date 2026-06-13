import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables
        int edad;
        double salario;
        float promedio;
        char sexo;
        boolean estado;
        String nombres;

        /* 
        //Entrada de datos por consola
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite el nombre del estudiante: ");
        nombres = entrada.nextLine();

        System.out.println("Digite la edad: "); 
        edad = entrada.nextInt();

        System.out.println("Digite el salario: "); 
        salario = entrada.nextDouble();

        System.out.println("Digite el promedio: "); 
        promedio = entrada.nextFloat();

        System.out.println("Digite el sexo f/m: "); 
        sexo = entrada.next().charAt(0);

        System.out.println("Digite el estado: "); 
        estado = entrada.nextBoolean();

        //Salida de datos por consola
        System.out.println("El nombre del estudiante es: " + nombres);
        System.out.println("El edad del estudiante es: " + edad);
        System.out.println("El salario del estudiante es: " + salario);
        System.out.println("El promedio del estudiante es: " + promedio);
        System.out.println("El sexo del estudiante es: " + sexo);
        System.out.println("El estado del estudiante es: " + estado);
        */ 

        //Declarar variables
        //Las mismas variables de consola

        //Entrada de datos por ventana emergente
        nombres = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio: "));
        sexo = JOptionPane.showInputDialog("Digite el sexo : ").charAt(0);
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite el estado: "));

        //Salida de datos por ventana emergente 
        JOptionPane.showMessageDialog(null, "Nombre: " +  nombres + "\nEdad: " + edad + "\nSalario: " + salario + "\nPromedio: "+ promedio + "\nsexo: " +  sexo + "\nEstado: "+estado);
    }   
}