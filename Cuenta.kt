class Cuenta(titular: String) {
    private var titular: String = titular
    private var cantidad: Int = 0

    fun ingresar(cantidad: Int){
        if (cantidad < 0){
            println("No se pueden ingresar cantidades negativas")
        } else {
            this.cantidad = this.cantidad + cantidad
        }
    }

    fun retirar(cantidad: Int) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0
        } else {
            this.cantidad = this.cantidad - cantidad
        }
    }

    fun setTitular(titular: String) {
        this.titular = titular
    }

    fun getTitular(): String {
        return this.titular
    }

    fun setCantidad(cantidad: Int) {
        this.cantidad = cantidad
    }

    fun getCantidad(): Int {
        return this.cantidad
    }
}
