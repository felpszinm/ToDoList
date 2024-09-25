
package todolistprogram;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListProgram {

    
    public static void main(String[] args) {
        
        ArrayList<Tarefa> ToDoList = new ArrayList<Tarefa>();
        Scanner texto = new Scanner(System.in);
        int esc = 0;
        
        do{
        exibirTarefas(ToDoList);
        System.out.println("[1] Nova Tarefa  |  [2] Apagar Tarefa  |  [3] Sair");
        System.out.println("\nDigite sua opcao: ");
        esc = texto.nextInt();
        
        switch(esc){
            case 1:
                novaTarefa(ToDoList);
                break;
            case 2:
                removerTarefa(ToDoList);
                break;
            case 3:
                System.out.println("Finalizando programa...");
            default:
                System.out.println("Opcao invalida. Tente novamente.");
                break;
        }        
        }while (esc != 3);
        texto.close();
    }
    
    public static void novaTarefa(ArrayList lista){
        Scanner texto = new Scanner(System.in);
        String nome, desc;
        System.out.println("Digite o nome da tarefa:");
        nome = texto.nextLine();
        System.out.println("Digite a descricao da tarefa:");
        desc = texto.nextLine();
        lista.add(new Tarefa(nome, desc));
        
        
    }
    
    public static void exibirTarefas(ArrayList<Tarefa> lista){
        int c = lista.size();
        int contador = 1;
        System.out.println("   -= Tarefas =-");
        for (Tarefa tarefa : lista){
            
            System.out.println(contador + " - " + "Nome: " + tarefa.getNome());
            System.out.println("   Descricao: " + tarefa.getDescricao());
            System.out.println("-----------------------");
            contador += 1;
        }
        contador = 1;
       
    }
    
    public static void removerTarefa(ArrayList<Tarefa> lista){
        Scanner texto = new Scanner(System.in);
        int n;
        System.out.println("Digite a posicao da tarefa que deseja remover: ");
        n = texto.nextInt();
        lista.remove(n+1);
        System.out.println("Item removido com sucesso!");
        
    }
    
}
