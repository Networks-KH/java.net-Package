import java.net.*;
import java.io.*;
public class serverside {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9999);

        byte[] rdata = new byte[1024];
        byte[] sdata = new byte[1024];
        while(true)
        {
            DatagramPacket rPacket = new DatagramPacket(sdata, sdata.length);
            ds.receive(rPacket);

            String objClient = new String(rPacket.getData());
        }
    }
    
}
