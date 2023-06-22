import org.example.Triangulo;
import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
        @Test
        public void testCalcularArea() {
            double base = 5.0;
            double altura = 3.0;
            double esperado = 7.5;

            Triangulo triangulo = new Triangulo(base, altura);
            double resultado = triangulo.calcularArea();
            Assert.assertEquals(esperado, resultado, 0.0001);

    }
}
