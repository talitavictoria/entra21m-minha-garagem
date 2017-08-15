
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author Aluno talita vitoria
 */
public class CarroDAOJUnitTest {

    @Test
    public void inserir() {
        Carro gol = new Carro();
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setCor("Vermelho");
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setDescricao("asodnoasndo asadoaosdinoansdon oasindoinasd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setPermitidaCirculacao(true);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(198745);

        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo, 1);

        gol.setId(codigo);

        Carro carroBuscado = dao.buscarPorid(codigo);
        validarIgualdadeCarro(gol, carroBuscado);
    }

    @Test
    public void excluir() {
        Carro gol = new Carro();
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setCor("Vermelho");
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setDescricao("asodnoasndo asadoaosdinoansdon oasindoinasd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setPermitidaCirculacao(true);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(198745);

        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);

        Carro carroBuscado = dao.buscarPorid(codigo);
        assertNull(carroBuscado);

    }

    @Test
    public void alterar() {
        Carro gol = new Carro();
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setCor("Vermelho");
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setDescricao("asodnoasndo asadoaosdinoansdon oasindoinasd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setPermitidaCirculacao(true);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(198745);

        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        gol.setId(codigo);

        gol.setNome("Felps");
        gol.setPlaca("MKT-2107");
        gol.setPotencia(160f);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 3);
        gol.setCor("Verde");
        gol.setDataCompra(new Date(2001, 7, 21));
        gol.setAnoFabricacao((short) 2001);
        gol.setAnoLancamento((short) 2000);
        gol.setChassi("5151878");
        gol.setDescricao("ASDASDASFASDFASDFASDFA");
        gol.setEstaFuncional(false);
        gol.setFabricante("Nukeer");
        gol.setPermitidaCirculacao(true);
        gol.setQuilometragem(23911f);
        gol.setTipoPneu((short) 18);
        gol.setRenavam(198749);
        dao.alterar(gol);

        Carro carroModificado = dao.buscarPorid(gol.getId());
        validarIgualdadeCarro(gol, carroModificado);
    }

    public void validarIgualdadeCarro(Carro carro, Carro outroCarro) {
        assertEquals(carro.getId(), outroCarro.getId());
        assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
        assertEquals(carro.getChassi(), outroCarro.getChassi());
        assertEquals(carro.getCor(), outroCarro.getCor());
        assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
        assertEquals(carro.getDescricao(), outroCarro.getDescricao());
        assertEquals(carro.getFabricante(), outroCarro.getFabricante());
        assertEquals(carro.getNome(), outroCarro.getNome());
        assertEquals(carro.getPlaca(), outroCarro.getPlaca());
        assertEquals(carro.getPotencia(), outroCarro.getPotencia(), 0);
        assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
        assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(), 0);
        assertEquals(carro.getRenavam(), outroCarro.getRenavam());
        assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
        assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
        assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());

    }
}
