package Paql01;

public class Hub {
    private int[][] capacity;
    public Hub(){
        this.capacity=new int[10][12];
    }

    public int[][] getCapacity() {
        return capacity;
    }

    public void setCapacity(int[][] capacity) {
        this.capacity = capacity;
    }
    Container[][] containers;

    public void stackContainer(Container container) {
        int priority = container.getPriorityLevel();
        int row = 0;
        if (priority == 1) {
            for (int i = 0; i < 10; i++) {
                if (capacity[i][0] == 0) {
                    row = i;
                    break;
                }
            }
            capacity[row][0] = container.getIdentifierNumber();
        } else if (priority == 2) {
            for (int i = 0; i < 10; i++) {
                if (capacity[i][1] == 0) {
                    row = i;
                    break;
                }
            }
            capacity[row][1] = container.getIdentifierNumber();
        } else if (priority == 3) {
            for (int i = 0; i < 10; i++) {
                for (int j = 2; j < 12; j++) {
                    if (capacity[i][j] == 0) {
                        row = i;
                        break;
                    }
                }
                if (row != 0) {
                    break;
                }
            }
            capacity[row][row + 2] = container.getIdentifierNumber();
        }
    }

    public void removeContainer(int priority, int identifierNumber){
        int column=0;
        int row = 0;
        if (priority == 1) {
            for (int i = 0; i < 10; i++) {
                if (capacity[i][0] == identifierNumber) {
                    row = i;
                    column=0;
                    break;
                }
            }
            capacity[row][0] = 0; //here is removed
        } else if (priority==2) {
            for (int i = 0; i <10 ; i++) {
                if (capacity[i][1]== identifierNumber){
                    row=i;
                    column=1;
                    break;
                }
            }
            capacity[row][1]=0;

        }else if (priority==2) {
            for (int i = 0; i <10 ; i++) {
                for (int j = 2; j < 12; j++) {
                    if (capacity[i][j]== identifierNumber){
                        row=i;
                        column=j;
                        break;
                    }
                }
                if (column!=0){
                    break;
                }
            }
            capacity[row][column]=0;
        }
    }

    public String display(int identifierNumber, Container container) {
        int row = -1;
        int column = -1;
        String result = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (capacity[i][j] == identifierNumber) {
                    row = i;
                    column = j;
                    break;
                }
                if (row != -1) {
                    break;
                }
            }
        }

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
    }


    public int countContainers(String country){
        int counter=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if(containers[i][j] != null && containers[i][j].getCountryOfOrigin() == country){
                    counter++;
                }
            }
        }
        return counter;
    }





}



