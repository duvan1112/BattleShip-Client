package network;

import controller.IData;

public class Client {


    /**
     * @param data
     */
    public void sendInfo(IData data) {
        int row = data.getRow();
        int col = data.getCol();
        System.out.println("row: " + row + " col: " + col);
        data.setStatus(2);
        data.setScore(222);
        //data.setIsWinner(true);
    }
}
