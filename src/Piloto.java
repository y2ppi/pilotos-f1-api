import com.google.gson.annotations.SerializedName;

class Piloto {
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("driver_number")
    private int driverNumber;
    @SerializedName("name_acronym")
    private String nameAcronym;
    @SerializedName("team_name")
    private String teamName;

    public String getFullName(){
        return fullName;
    }
    public int getDriverNumber(){
        return driverNumber;
    }

    public String getNameAcronym(){
        return nameAcronym;
    }

    public String getTeamName(){
        return teamName;
    }

@Override

public String toString() {
    return "Detalhes do piloto: \n" + fullName + "\nNumero: \n" + driverNumber + "\nEquipe: \n" + teamName + "\nNome exibido: \n" + nameAcronym;
    }
}