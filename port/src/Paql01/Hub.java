package Paql01;

import java.util.Arrays;

public class Hub {

    //he quitado lo de capacity era demasiado lioso
    static Container[][] hub= new Container[10][12];

    public Hub(){}


    public Hub(Container[][] hub){
        this.hub=hub;
    }

    public Container[][] getHub() {
        return hub;
    }

    public String toString() {
        return "Hubs{" +
                "hub=" + hub.toString() +
                '}';
    }

    public void setHub(Container[][] hub) {
        this.hub = hub;
    }
    public void vacio(Container container){
        if (container==null){
            container= new Container();
        }
        else {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 12; j++) {
                    this.hub[i][j].setIdentifierNumber(-1);
                    this.hub[i][j].setContentDescription("Empty");
                    this.hub[i][j].setPriorityLevel(0);
                    this.hub[i][j].setWeight(0);
                    this.hub[i][j].setCompanyReceiver("Empty");
                    this.hub[i][j].setCompanySender("Empty");
                    this.hub[i][j].setCountryOfOrigin("Empty");
                    this.hub[i][j].setInspectedByCustoms(false);

                }
            }

        }
    }



    public boolean stackContainer(Container container) {
        if (container == null) {
            System.out.println("The container cannot be null");
            return false;
        }
        if (container.getPriorityLevel() == 1) {
            for (int i = 0; i < 10; i++) {
                if (hub[i][0] == null) {
                    if (hub[i][0]==null){
                        //row = i;
                        hub[i][0]=container;
                        return true;
                    }
                }
            }

            return true;
        } else if (container.getPriorityLevel() == 2) {
            for (int i = 0; i < 10; i++) {
                if (hub[i][1] == null) {
                    //row = i;
                    hub[i][1] = container;
                    return true;
                }
            }
        }else if (container.getPriorityLevel() == 3) {
            for (int i = 0; i < 10; i++) {
                for (int j = 2; j < 12; j++) {
                    if (hub[i][j] == null) {
                        hub[i][j]=container;
                        return true;
                    }
                }
            }
        }
        return false;
    }



    public boolean removeContainer(int column){

        for (int row = 0; row < 10; row++) {
            if (hub[row][column - 1] != null) {
                hub[row][column - 1] = null;
                return true;
            }
        }
        return false;
    }


    public String display(int identifierNumber) {
        //int row = -1;
        //int column = -1;
       //String result = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (hub[i][j] !=null && hub[i][j].getIdentifierNumber()==identifierNumber) {
                    return hub[i][j].toString();
                }
            }

        }
        return "No container with that ID";
        /*
        if (row == -1 || column == -1) {
            result = "The container with the identification number " + container.getIdentifierNumber() + " has not been found in the hub";
        } else {
            result += "The container with the identification number " + identifierNumber + " is in the row: " + row + " and column: " + column + "\n";
            result += "The weight " + container.getWeight() + "\n";
            result += "The Country of origin " + container.getCountryOfOrigin() + "\n";
            result += "If it has been inspected by customs or not " + container.isInspectedByCustoms() + "\n";
            result += "The Content description " + container.getContentDescription() + "\n";
            result += "The Priority level " + container.getPriorityLevel() + "\n";
            result += "The Company that sends the container " + container.getCompanySender() + "\n";
            result += "The Company that receives the container " + container.getCompanyReceiver() + "\n";
        }

        return result;

         */
    }


    public int countContainers(String country){
        int counter=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if(hub[i][j] != null && hub[i][j].getCountryOfOrigin() == country){
                    counter++;
                }
            }
        }
        return counter;
    }

    //para el state(hub plan)  free f and occupied O
    public String printState() {
        StringBuilder text= new StringBuilder();
        //int row = -1;
        //int column = -1;
        //String result = ""; //lo cambio por el StringBuilder porque es mas sencillo

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (hub[i][j] == null) {
                    text.append("F   ");
                } else if (hub[i][j] !=null){
                    text.append("O   ");
                }


            }
            text.append("/n");
        }
        return text.toString();
    }


}



