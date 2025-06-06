package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class ColecaoTelefone {
    private HashMap<String, String> dados;
    private final String ER = "^[0-9]+$";

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

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        dados.forEach((rotulo, valor)-> {
            sb.append(rotulo).append(": ").append(formata("+## (##) #####−####", valor)).append("\n");
        });
        return sb.toString();
    }
}
