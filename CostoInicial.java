/*En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de enero y finalizan a final de marzo. Por otro lado, las rebajas de verano empiezan durante la primera semana del mes de julio y finalizan durante el mes de septiembre.

Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento? */
public class CostoInicial {
    public static void main(String[] args) {
        var PrecioDescuento =34;
        var descuento = 0.15;
        var precioInicial = PrecioDescuento + (PrecioDescuento * descuento);
        System.out.println("El precio inicial de los pantalones era de: "+ precioInicial +"€");
    }
}
