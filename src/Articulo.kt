class Articulo(
    var nombre: String,
    var precio: Double
) {
    companion object {
        private var totalArticulos: Int = 0
        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    private val id: Int = generarId()

    fun promocionNavidad(porcentajeRebaja: Double) {
        precio -= precio * (porcentajeRebaja / 100)
    }

    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: $id)"
    }
}