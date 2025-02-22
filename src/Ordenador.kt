enum class TipoOrdenador {
    BASICO, OFIMATICA, TODOTERRENO, GAMING
}

class Ordenador(
    nombre: String,
    precio: Double,
    val tipo: TipoOrdenador = TipoOrdenador.BASICO
) : Articulo(nombre, precio) {

    override fun promocionNavidad(porcentajeRebaja: Double) {
        if (precio > 500) {
            super.promocionNavidad(porcentajeRebaja)
        }
    }
}