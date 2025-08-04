data class User(
    val nombre: String,
    val edad: Int,
    val altura: Double,
    val peso: Double,
    val email: String,
    val ciudad: String
) {
    fun calcularIMC(): Double {
        return if (altura > 0) peso / (altura * altura) else 0.0
    }

    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }

    fun resumen(): String {
        return """
            --- Información del Usuario ---
            Nombre: $nombre
            Edad: $edad (${if (esMayorDeEdad()) "Mayor de edad" else "Menor de edad"})
            Altura: $altura m
            Peso: $peso kg
            IMC: ${"%.2f".format(calcularIMC())}
            Email: $email
            Ciudad: $ciudad
        """.trimIndent()
    }
}
