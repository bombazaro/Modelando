package ads.poo;

import java.util.HashMap;

public class ColecaoTelefone {
    private HashMap<String, String> dados;

    public boolean add(String rotulo, String valor) {
        String eR = "^[0-9]+$";

        if(valor.matches(eR) && dados.get(rotulo) == null) {
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

    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        dados.forEach((rotulo, valor)-> {
            sb.append(rotulo).append(": ").append(valor).append("\n");
        });
        return sb.toString();
    }
}
