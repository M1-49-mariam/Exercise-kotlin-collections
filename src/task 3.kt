val countries = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
fun main() {
    countries.put("Kuwait", "Kuwait City")
    val countriesValues = countries.values
    val countriesKeys = countries.keys

    println("Countries: $countriesKeys")
    println("Capitals: $countriesValues")
    countries.remove("France")
    println("Final Map: $countries")

}