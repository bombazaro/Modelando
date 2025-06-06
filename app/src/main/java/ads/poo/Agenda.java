package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
       return contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome) {
        ArrayList<Contato> nova = new ArrayList<>();

        contatos.stream()
                .filter(contato -> contato.getNome().equals(nome) && contato.getSobrenome().equals(sobreNome))
                .forEach(nova::add);

        return nova;
    }

    public boolean removeContato(int indiceContatoNaLista) {

    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {

    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {

    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista) {

    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista) {

    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista) {

    }

    public boolean removeEmail(String rotulo, int indiceContatoNaLista) {

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
