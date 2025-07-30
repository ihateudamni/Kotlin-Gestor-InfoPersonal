fun main() {
    val usuarios = mutableListOf<User>()

    println("=== Gestor de Información Personal ===")

    for (i in 1..3) {
        println("\nUsuario #$i")

        print("Nombre completo: ")
        val nombre = readLine()?.trim().orEmpty()

        var edad: Int
        do {
            print("Edad: ")
            edad = readLine()?.toIntOrNull() ?: -1
            if (edad <= 17) println("Menor de Edad.")
        } while (edad <= 0)

        var altura: Double
        do {
            print("Altura (m): ")
            altura = readLine()?.toDoubleOrNull() ?: -1.0
            if (altura <= 0) println("Altura inválida. Intente de nuevo.")
        } while (altura <= 0)

        var peso: Double
        do {
            print("Peso (kg): ")
            peso = readLine()?.toDoubleOrNull() ?: -1.0
            if (peso <= 0) println("Peso inválido. Intente de nuevo.")
        } while (peso <= 0)

        var email: String
        do {
            print("Email: ")
            email = readLine()?.trim().orEmpty()
            if (!email.contains("@") || !email.contains(".")) {
                println("Email inválido. Intente de nuevo.")
            }
        } while (!email.contains("@") || !email.contains("."))

        print("Ciudad de residencia: ")
        val ciudad = readLine()?.trim().orEmpty()

        usuarios.add(User(nombre, edad, altura, peso, email, ciudad))
    }

    println("\nResumen de Usuarios")
    usuarios.forEachIndexed { index, user ->
        println("\nUsuario #${index + 1}")
        println(user.resumen())
    }
}
