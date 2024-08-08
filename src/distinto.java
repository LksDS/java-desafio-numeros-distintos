import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class distinto {
    public static void Solucao1(){
        Scanner scan = new Scanner(System.in);
        int tamanhoSequencia = scan.nextInt();
        int[] sequencia = new int[tamanhoSequencia];
        List<Integer> distintos = new ArrayList<>();
        int maiorIntervalo = 0;
        int intervaloAtual = 0;
        for (int i = 0; i < tamanhoSequencia; i++){
            sequencia[i] = scan.nextInt();
            if (!distintos.contains(sequencia[i])){
                distintos.add(sequencia[i]);
                intervaloAtual++;
            }else{
                if (intervaloAtual > maiorIntervalo){
                    maiorIntervalo = intervaloAtual;
                }
                intervaloAtual = distintos.size() - distintos.indexOf(sequencia[i]);
                for (int j = distintos.indexOf(sequencia[i]); j >= 0; j--){
                    distintos.remove(distintos.get(j));
                }
            }
        }
        System.out.println(maiorIntervalo);
    }
    public static void Solucao2(){
      Scanner scan = new Scanner(System.in);
      int tamanhoSequencia = scan.nextInt();
      int[] sequencia = new int[tamanhoSequencia];
      List<List<Integer>> intervalos = new ArrayList<>();
      int maiorIntervalo = 0;
      for (int i = 0; i < tamanhoSequencia; i++) {
          sequencia[i] = scan.nextInt();
      }
      for (int i = 0; i < sequencia.length; i++) {
          intervalos.add(new ArrayList<>());
          for (int e = i; e < sequencia.length; e++) {
              if (!intervalos.get(i).contains(sequencia[e])) {
                  intervalos.get(i).add(sequencia[e]);
              } else {
                  if (intervalos.get(i).size() > maiorIntervalo){
                      maiorIntervalo = intervalos.get(i).size();
                  }
                  break;
              }
          }
      }
      System.out.println(maiorIntervalo);
          }
          public static void main(String[]args){
            Solucao1();
              System.out.println();
            Solucao2();
          }
      }