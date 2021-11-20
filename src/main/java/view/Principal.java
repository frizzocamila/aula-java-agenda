package view;

import java.util.List;
import model.Contato;
import model.dao.ContatoDaoJDBC;
import model.dao.DaoFactory;

/**
 *
 * @author frizzocamila
 */
public class Principal {

    public static void main(String[] args) {
        try {
            ContatoDaoJDBC dao = DaoFactory.novoContatoDao();
            
            //INCLUIR
            /*
            Contato c = new Contato("Teste DAO","dao@dao.com","22 123456789");
            dao.incluir(c);
             */

            //EDITAR
            /*
            Contato c = new Contato("Teste DAO Editado","dao@dao.com","22 123456789");
            c.setId(9);
            dao.editar(c);
             */
            
            //EXCLUIR
            /*
            Contato c = new Contato();
            c.setId(9);
            dao.excluir(c);
            */
            
            //LISTAR
            /*
            List<Contato> lista = dao.listar();
            for (Contato contato : lista) {
                System.out.println(contato);
            }
            */
            
            //BUSCAR POR ID
            Contato contatoBusca = dao.pesquisarPorId(5);
            if(contatoBusca != null){
                System.out.println(contatoBusca);
            } else {
                System.out.println("Contato não localizado");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
