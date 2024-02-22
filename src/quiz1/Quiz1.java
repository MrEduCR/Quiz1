package quiz1;
//Eduardo Ramos

import javax.swing.JOptionPane;

public class Quiz1 {

    public static void main(String[] args) {
        String cursos = JOptionPane.showInputDialog("Ingrese el numero de cursos: ");
        int cursosInt = Integer.parseInt(cursos);
        double impuesto = 0.02;
        double totalBruto = 0.0;

        for (int i = 0; i < cursosInt; i++) { // incia en cero
            String materiaNombre = JOptionPane.showInputDialog("Ingrese el nombre de curso: ");
            String materiaPrecio = JOptionPane.showInputDialog("Ingrese el precio de curso: ");
            double materiaPrecioDouble = Double.parseDouble(materiaPrecio);
            JOptionPane.showMessageDialog(null, "El precio de la materia " + materiaNombre + " es de: " + materiaPrecioDouble + " y el impuesto será de " + (impuesto * materiaPrecioDouble) + " colones");

            totalBruto += materiaPrecioDouble; // acumular el monto bruto de cada curso

        }

        double impuestosTotales = totalBruto * impuesto;
        double totalNeto = totalBruto + impuestosTotales;

        JOptionPane.showMessageDialog(null, "El total bruto (osea sin impuesto) de todas las materias es de: " + totalBruto + " colones"); // OJO bruto es SIN impuesto
        JOptionPane.showMessageDialog(null, "El total de impuestos de todas las materias es de: " + impuestosTotales + " colones");
        JOptionPane.showMessageDialog(null, "El total neto (osea con impuesto) de todas las materias es de: " + totalNeto + " colones"); // OJO neto es CON impuesto
    }//main
}// public clss
