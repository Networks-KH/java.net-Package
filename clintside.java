import java.net.*;
import java.io.*;

public class clintside
{
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip;
        ip = InetAddress.getByName("192.168.58.1");
        
        byte[] sdata = new byte[1024];
        byte[] rdata = new byte[1024];
         
        String objRead = read.readLine();
        sdata = objRead.getBytes();
        DatagramPacket sPacket = new DatagramPacket(sdata, sdata.length,"192.168.58.1", 9999);
        ds.receive(sPacket);

        DatagramPacket rPacket = new DatagramPacket(rdata, rdata.length);
        ds.receive(rPacket);

        String objServer = new String(rPacket.getData());
        System.out.println("FROM SERVER: "+ objServer);
        ds.close();
    }
}