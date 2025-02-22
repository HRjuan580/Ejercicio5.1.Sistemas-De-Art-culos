fun main() {

    val articulo1 = Articulo("Artículo 1" , 25.0)
    val articulo2 = Articulo("Artículo 2" , 45.0)


    val ordenador1 = Ordenador("Ordenador GAMING" , 1299.99 , TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Ordenador Básico" , 399.99)


    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)


    for (articulo in articulos) {
        articulo.promocionNavidad(20.0) // Aplicar 20% de descuento
        println(articulo)
    }
}