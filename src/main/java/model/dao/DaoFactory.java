package model.dao;

/**
 *
 * @author frizzocamila
 */
public class DaoFactory {

    public static ContatoDaoJDBC novoContatoDao() throws Exception {
        return new ContatoDaoJDBC();
    }
}
