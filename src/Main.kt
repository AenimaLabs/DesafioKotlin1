fun main (){
    var nombre = "Aquiles Baeza Talla"
    val num1 = 10
    val num2 = 20
    val num3 = 30
    val string = "Pascual Arroyo"
    var char = 'A'
    var x : Float
    x = 3.14F
    var patrañas = false

    getname(nombre)
    suma(num1,num2,num3)
    contarcaracter(string)

    char = 'b'

    println(char)
    minmax(x)
    lamentira(patrañas)

    imprimiendoParametros(nombre, string)
    obtieneIva(num3)

    }

fun getname (name: String) {
    println(name)}

fun suma (n1:Int,n2:Int, n3:Int) {
    println(n1+n2+n3)}

fun contarcaracter (s:String) {
    println(s.count())
}

fun minmax (z:Float) {
    println(z)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Long.MIN_VALUE)
}

fun lamentira (tau:Boolean) {
    println(tau)
}







