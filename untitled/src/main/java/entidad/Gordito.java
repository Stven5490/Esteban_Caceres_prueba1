package entidad;


//1. Crear la clase Gordito que contenga como atributos los datos que se le registra al paciente
public class Gordito {
    //Atributos
    private String RUT_Paciente;
    private String NOMBRE_Paciente;
    private int EDAD_Paciente;
    private String FONO_Paciente;
    private double[] PESOS_Paciente;
    private double[] ALTURA_PAciente;

    //Constructor

    public Gordito(String RUT_Paciente, String NOMBRE_Paciente, int EDAD_Paciente, String FONO_Paciente) {
        this.RUT_Paciente = RUT_Paciente;
        this.NOMBRE_Paciente = NOMBRE_Paciente;
        this.EDAD_Paciente = EDAD_Paciente;
        this.FONO_Paciente = FONO_Paciente;
        this.PESOS_Paciente = new double[12];
        this.ALTURA_PAciente = new double[12];


    }


    //Accesadores y mutadores

    public String getRUT_Paciente() {
        return RUT_Paciente;
    }

    public void setRUT_Paciente(String RUT_Paciente) {
        this.RUT_Paciente = RUT_Paciente;
    }

    public String getNOMBRE_Paciente() {
        return NOMBRE_Paciente;
    }

    public void setNOMBRE_Paciente(String NOMBRE_Paciente) {
        this.NOMBRE_Paciente = NOMBRE_Paciente;
    }

    public int getEDAD_Paciente() {
        return EDAD_Paciente;
    }

    public void setEDAD_Paciente(int EDAD_Paciente) {
        this.EDAD_Paciente = EDAD_Paciente;
    }

    public String getFONO_Paciente() {
        return FONO_Paciente;
    }

    public void setFONO_Paciente(String FONO_Paciente) {
        this.FONO_Paciente = FONO_Paciente;
    }

    public double[] getPESOS_Paciente() {
        return PESOS_Paciente;
    }

    public void setPESOS_Paciente(double[] PESOS_Paciente) {
        this.PESOS_Paciente = PESOS_Paciente;
    }

    //Peso Promedio (pesosPromedio)
    public double pesosPromedio(){
        double suma = 0;
        for (double peso: PESOS_Paciente){
            suma = suma + peso;
        } return suma/ PESOS_Paciente.length;
    }

    //IMC (indiceMasaCorporal)
    public double indiceMasaCorporal(){

    }
}
