fun main() {
    println("=== Gestor de Información Personal ===")

    println("\nRegistro Usuario #1")
    val usuario1 = registrarUsuario()

    println("\nRegistro Usuario #2")
    val usuario2 = registrarUsuario()

    println("\nRegistro Usuario #3")
    val usuario3 = registrarUsuario()

    println("\n=== Resumen de Usuarios ===")
    println(usuario1.resumen())
    println(usuario2.resumen())
    println(usuario3.resumen())
}

fun registrarUsuario(): User {
    print("Nombre completo: ")
    val nombre = readLine()?.trim().orEmpty()

    print("Edad: ")
    var edad = readLine()?.toIntOrNull() ?: -1
    if (edad <= 0) {
        println("Edad inválida, se asignará 0.")
        edad = 0
    }

    print("Altura (m): ")
    var altura = readLine()?.toDoubleOrNull() ?: -1.0
    if (altura <= 0) {
        println("Altura inválida, se asignará 0.0.")
        altura = 0.0
    }

    print("Peso (kg): ")
    var peso = readLine()?.toDoubleOrNull() ?: -1.0
    if (peso <= 0) {
        println("Peso inválido, se asignará 0.0.")
        peso = 0.0
    }

    print("Email: ")
    var email = readLine()?.trim().orEmpty()
    if (!(email.contains("@") && email.contains("."))) {
        println("Email inválido, se dejará vacío.")
        email = ""
    }

    print("Ciudad de residencia: ")
    val ciudad = readLine()?.trim().orEmpty()

    return User(nombre, edad, altura, peso, email, ciudad)
}
