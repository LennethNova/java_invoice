// Clase Principal
public class Principal {
    public static void main(String[] args) {
        // Crear facturas
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        // Imprimir resumen
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}