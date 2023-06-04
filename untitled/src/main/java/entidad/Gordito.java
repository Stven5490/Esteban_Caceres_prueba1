package entidad;

import java.util.Random;

public class Gordito {
        private String RUT_Paciente;
        private String NOMBRE_Paciente;
        private int EDAD_Paciente;
        private String FONO_Paciente;
        private int[] PESO_Mensual_Paciente;

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

        public int[] getPESO_Mensual_Paciente() {
            return PESO_Mensual_Paciente;
        }

        public void setPESO_Mensual_Paciente(int[] PESO_Mensual_Paciente) {
            this.PESO_Mensual_Paciente = PESO_Mensual_Paciente;
        }

        public Gordito(String RUT_Paciente, String NOMBRE_Paciente, int edad, String FONO_Paciente, int[] PESO_Mensual_Paciente) {
            this.RUT_Paciente = RUT_Paciente;
            this.NOMBRE_Paciente = NOMBRE_Paciente;
            this.EDAD_Paciente = EDAD_Paciente;
            this.FONO_Paciente = FONO_Paciente;
            this.PESO_Mensual_Paciente = new int[12];
            for(int P = 0; P < PESO_Mensual_Paciente.length; P++){
                PESO_Mensual_Paciente[P] = (int) (Math.random() * (250-75)+1);
            }

        }

        public double pesoPromedio(){
            int suma = 0;
            for(int peso : PESO_Mensual_Paciente){
                suma += peso;
            }
            return (double) suma / PESO_Mensual_Paciente.length;
        }

        public double  indiceMasaCorporal(int mes, double estatura){
            double peso = PESO_Mensual_Paciente[mes - 1];
            return peso / Math.pow(estatura, 2);
        }

        public int[] masDeXKilos(int x){
            int count = 0;
            for(int peso : PESO_Mensual_Paciente){
                if(peso > 0){
                    count++;
                }
            }
            if (count == 0){
                return null;
            }else{
                int[] meses = new int[count];
                int index = 0;
                for(int i = 0; i < PESO_Mensual_Paciente.length; i++){
                    if(PESO_Mensual_Paciente[i] > x){
                        meses[index] = i +1;
                        index++;
                    }
                }
                return meses;
            }
        }

        public String ultimoMes(double estatura){
            double IMC = indiceMasaCorporal(12, estatura);
            if(IMC < 18.5){
                return  "Normal";
            } else if (IMC < 25) {
                return "Sobrepreso";
            } else {
                return "Obeso";
            }
        }
    }
