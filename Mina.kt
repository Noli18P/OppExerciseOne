fun main() {

    var cuentaUno = Cuenta("Martin Martinez")
    cuentaUno.setCantidad(1000)

    println(cuentaUno.getTitular())
    println(cuentaUno.getCantidad())

    cuentaUno.ingresar(1000)
    println(cuentaUno.getCantidad())

    cuentaUno.retirar(1110)
    println(cuentaUno.getCantidad())

}
