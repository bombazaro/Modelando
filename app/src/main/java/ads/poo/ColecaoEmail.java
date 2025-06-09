package ads.poo;

import java.util.HashMap;

public class ColecaoEmail {
    private HashMap<String, String> dados;
    private final String ER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public boolean add(String rotulo, String valor) {

        if(valor.matches(ER) && dados.get(rotulo) == null) {
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo) {

        if(dados.get(rotulo) != null) {
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String valor) {

        if(dados.get(rotulo) != null && valor.matches(ER)) {
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        dados.forEach((rotulo, valor)-> {
            sb.append(rotulo).append(": ").append(valor).append("\n");
        });
        return sb.toString();
    }
}
