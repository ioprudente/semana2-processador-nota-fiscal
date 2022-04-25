package test;

import br.com.alura.oobj.application.ItemPedido;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class SubtotalTest {
    BigDecimal valorUnitario = BigDecimal.valueOf(5);

    @Test
    public void deveriaCalcularSubtotalItemComUmaUnidade() {
        int quantidade = 1;

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setValorUnitario(valorUnitario);
        itemPedido.setQuantidade(quantidade);

        BigDecimal testaSubtotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
        BigDecimal subtotal = itemPedido.getSubtotal();

        Assertions.assertEquals(testaSubtotal, subtotal);
    }

    @Test
    public void deveriaCalcularSubtotalItemComMaisDeUmaUnidade() {
        int quantidade = 2;

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setValorUnitario(valorUnitario);
        itemPedido.setQuantidade(quantidade);

        BigDecimal testaSubtotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
        BigDecimal subtotal = itemPedido.getSubtotal();

        Assertions.assertEquals(testaSubtotal,subtotal);
    }
}
