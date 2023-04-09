package Paql01;

import java.util.ArrayList;

public class Port {
    private Hub[][] hub= new Hub[12][3];
    public Port(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                hub[i][j]=new Hub();

            }

        }
    }
   /* private ArrayList<Container> containers;

    public Port() {
        containers = new ArrayList<>();
    }

    public void addContainer(Container container) {
        containers.add(container);
    }

    public Container getContainer(int index) {
        if(index >= 0 && index < containers.size()) {
            return containers.get(index);
        } else {
            return null;
        }
    }

    */
}
