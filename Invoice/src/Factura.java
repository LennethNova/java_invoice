import java.util.Optional;

// Clase Factura
class Factura {
    // Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
    }

    // Resumen de la factura
    public String getResumen() {
        String rfcTexto = rfc.isPresent() ? rfc.get() : "[No proporcionado]";
        return "\uD83D\uDCC4 Factura generada:\n" +
                "Descripción: " + descripcion + "\n" +
                "Monto: $" + monto + "\n" +
                "RFC: " + rfcTexto + "\n";
    }
}