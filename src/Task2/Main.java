package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String args[] ){

        Room room1 = new Room(4,2,3,2);
        Room room2 = new Room(6,3,5,4);
        Room room3 = new Room(4,1,3,1);
        Room room4 = new Room(3, 1,1,1);

        ArrayList<Room> roomList = new ArrayList();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);

        Building building1 = new Building(roomList,1,5,true);
        int totalLamps = room1.getNumberOfLamps() + room2.getNumberOfLamps() +
                    room3.getNumberOfLamps() + room4.getNumberOfLamps();
        System.out.println(totalLamps);

        if (building1.getNumberOfFloors() > roomList.size()){
            System.out.println("This is an odd building");
        } else {
            System.out.println("This is a normal building");
        }

    }
}
