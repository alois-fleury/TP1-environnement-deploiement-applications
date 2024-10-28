import org.example.addInt
import org.example.carre
import org.example.pourcentage
import org.example.puissance
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculKtTest {

    @Test
    fun testAdd() {
        assertEquals(5, addInt(2, 3), "Addition de 2 et 3 devrait donner 5")
        assertEquals(-1, addInt(-2, 1), "Addition de -2 et 1 devrait donner -1")
        assertEquals(0, addInt(0, 0), "Addition de 0 et 0 devrait donner 0")
    }

    @Test
    fun testPuissance() {
        assertEquals(1, puissance(2, 0), "2^0 devrait donner 1")
        assertEquals(4, puissance(2, 2), "2^2 devrait donner 4")
        assertEquals(27, puissance(3, 3), "3^3 devrait donner 27")
        assertEquals(1, puissance(1, 10), "1^10 devrait donner 1")
    }

    @Test
    fun testCarre() {
        assertEquals(4, carre(2), "Le carré de 2 devrait donner 4")
        assertEquals(9, carre(3), "Le carré de 3 devrait donner 9")
        assertEquals(0, carre(0), "Le carré de 0 devrait donner 0")
        assertEquals(1, carre(-1), "Le carré de -1 devrait donner 1")
    }

    @Test
    fun testPourcentage() {
        assertEquals(0.4, pourcentage(50), "50% de 100 devrait donner 0.5")
        assertEquals(1.0, pourcentage(100), "100% de 100 devrait donner 1.0")
        assertEquals(0.0, pourcentage(0), "0% de 100 devrait donner 0.0")
        assertEquals(2.5, pourcentage(250), "250% de 100 devrait donner 2.5")
    }
}