import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            ApiRequest apiRequest = new ApiRequest();

            Scanner sc = new Scanner(System.in);
            System.out.print("Insira o nome do seu piloto favorito da temporada de 2025: ");
            String fullName = sc.nextLine();

            Piloto[] pilotos = apiRequest.fetchDrivers();

            boolean pilotoEncontrado = false;

            sc.close();

            for(Piloto p : pilotos) {
                if(p.getFullName() != null && p.getFullName().equalsIgnoreCase(fullName)) {
                    System.out.print(p);
                    pilotoEncontrado = true;
                    break;
                }
            }

            if(!pilotoEncontrado) {
                System.out.print("Piloto não encontrado.");
            }
        } catch (Exception e) {
            System.out.print("Erro ao processar a API: " + e.getMessage());
            e.printStackTrace();
        }
    }
}