/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clientcode;

import edu.wpi.first.networktables.EntryListenerFlags;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import javax.swing.*;


public class BBClient {
    public String getGreeting() {
        return "Big Bertha has enterd the log... \r\n  Client initializing";
    }

    public static void main(String[] args) {
        BBClient bbc = new BBClient();
        bbc.runClient();
        System.out.println(bbc.getGreeting());
              //get the default instance of NetworkTables
        NetworkTableInstance inst = NetworkTable.getDefault();

        //get a reference to the subtable called "datatable"
        NetworkTable datatable = inst.getTable("datatable");

        //get a reference to key in "datatable" called "Y"
        NetworkTableEntry yEntry = datatable.getEntry("Y");
        inst.startClientTeam(190);
    }

    private void runClient(){
        
    }

    private void runServer(){


    }

    
}
