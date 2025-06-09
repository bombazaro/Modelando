package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
        if(contatos.stream().filter(contato -> contato.getNome().equals(c.getNome())).findFirst().orElse(null) == null) {
            contatos.add(c);
            return true;
        }
        return false;
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome) {
        ArrayList<Contato> nova = new ArrayList<>();

        contatos.stream()
                .filter(contato -> contato.getNome().equals(nome) && contato.getSobrenome().equals(sobreNome))
                .forEach(nova::add);

        return nova;
    }

    public boolean removeContato(int indiceContatoNaLista) {
        if (contatos.get(indiceContatoNaLista) != null) {
            contatos.remove(indiceContatoNaLista);
            return true;
        } 
    
        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).addTelefone(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).addEmail(rotulo, valor);
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).updateTelefone(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).updateEmail(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista) {
        return contatos.get(indiceContatoNaLista).removeEmail(rotulo);
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "Agenda" + "\n" +
        "contatos: " + contatos + "\n";
    }
}
