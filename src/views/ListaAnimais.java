package views;

import javax.swing.table.DefaultTableModel;

public class ListaAnimais extends FormListagem{
    
    public ListaAnimais(){
        setTitle("Lista de Animais");
    }

    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 80, 80, 200, 60, 100, 100}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda","esquerda","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Tipo", "Raça","Idade","Porte","Cor","Abrigo"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }   
}