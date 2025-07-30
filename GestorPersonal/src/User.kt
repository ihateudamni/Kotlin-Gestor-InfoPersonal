data class User(
    val nombre: String,
    val edad: Int,
    val altura: Double,
    val peso: Double,
    val email: String,
    val ciudad: String
) {
    fun calcularIMC(): Double = peso / (altura * altura)

    fun esMayorDeEdad(): Boolean = edad >= 18

    fun nombreMayus(): String = nombre.uppercase()

    fun nombreMinus(): String = nombre.lowercase()

    fun dominioEmail(): String = email.substringAfter("@")

    fun resumen(): String {
        return """
            --- Información del Usuario ---
            Nombre: $nombre
            Nombre en MAYÚSCULAS: ${nombreMayus()}
            Nombre en minúsculas: ${nombreMinus()}
            Edad: $edad (${if (esMayorDeEdad()) "Mayor de edad" else "Menor de edad"})
            Altura: $altura m
            Peso: $peso kg
            IMC: ${"%.2f".format(calcularIMC())}
            Email: $email (Dominio: ${dominioEmail()})
            Ciudad: $ciudad
        """.trimIndent()
    }
}
