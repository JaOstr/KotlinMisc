fun arr() {
    val a = arrayOf("12", "1.2", "1,2", "1.2e0", "1.2e1",
        "1.2e2", "1.2e3", "1.2e10", "12.3e10",
        "1.2e-1", "1.2e-10")

    for (x in a) {
        try {
            x.toDouble()
        } catch (e: Exception) {
            println(x)
        }
    }
}
