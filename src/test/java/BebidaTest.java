import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {

    @Test
    void deveRetornarPrecoCafeSimples() {
        Bebida bebida = new CafeSimples();
        assertEquals(5.0, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeite() {
        Bebida bebida = new Leite(new CafeSimples());
        assertEquals(6.5, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComChocolate() {
        Bebida bebida = new Chocolate(new CafeSimples());
        assertEquals(7.5, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComCanela() {
        Bebida bebida = new Canela(new CafeSimples());
        assertEquals(6.0, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisChocolate() {
        Bebida bebida = new Chocolate(new Leite(new CafeSimples()));
        assertEquals(9.0, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisCanela() {
        Bebida bebida = new Canela(new Leite(new CafeSimples()));
        assertEquals(7.5, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComChocolateMaisCanela() {
        Bebida bebida = new Canela(new Chocolate(new CafeSimples()));
        assertEquals(8.5, bebida.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComLeiteMaisChocolateMaisCanela() {
        Bebida bebida = new Canela(new Chocolate(new Leite(new CafeSimples())));
        assertEquals(10.0, bebida.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafeSimples() {
        Bebida bebida = new CafeSimples();
        assertEquals("Café Simples", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeite() {
        Bebida bebida = new Leite(new CafeSimples());
        assertEquals("Café Simples, com Leite", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComChocolate() {
        Bebida bebida = new Chocolate(new CafeSimples());
        assertEquals("Café Simples, com Chocolate", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComCanela() {
        Bebida bebida = new Canela(new CafeSimples());
        assertEquals("Café Simples, com Canela", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisChocolate() {
        Bebida bebida = new Chocolate(new Leite(new CafeSimples()));
        assertEquals("Café Simples, com Leite, com Chocolate", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisCanela() {
        Bebida bebida = new Canela(new Leite(new CafeSimples()));
        assertEquals("Café Simples, com Leite, com Canela", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComChocolateMaisCanela() {
        Bebida bebida = new Canela(new Chocolate(new CafeSimples()));
        assertEquals("Café Simples, com Chocolate, com Canela", bebida.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComLeiteMaisChocolateMaisCanela() {
        Bebida bebida = new Canela(new Chocolate(new Leite(new CafeSimples())));
        assertEquals("Café Simples, com Leite, com Chocolate, com Canela", bebida.getDescricao());
    }
}