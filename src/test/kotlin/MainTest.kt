import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa funcionalidades da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "VIP", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "comum", "xt3456"), "Welcome.")
        Assertions.assertEquals(portaria(20, "comum", "3456"), "Negado.")
        Assertions.assertEquals(portaria(20, "premium", "xl3456"), "Welcome.")
        Assertions.assertEquals(portaria(20, "premium", "3456"), "Negado.")
    }
}