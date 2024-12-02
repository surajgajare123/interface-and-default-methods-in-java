interface Network{
    String[] showNetwork();
    void connectNetwork(String Net);
}
interface Camera{
    void takePhoto();
    void onMusic();
    default void gps(){
        System.out.println("gps are here"); // default method in interface 
    }
}
class Cellphone{
    public void connectCall(){
        System.out.println("Connecting call...........!");
    }
    public void endCall(){
        System.out.println("Call Disconnected........!");
    }
}
class Smartphone extends Cellphone implements Camera, Network{
    public String[] showNetwork(){
        System.out.println("Getting network list.......!");
        String[] networks = {"suraj", "dhiraj", "soham"};
        return networks;
    }
    public void connectNetwork(String Net){
        System.out.println("networks are connected " + Net);
    }
    public void takePhoto(){
        System.out.println("Capturing photo.....!");
    }
    public void onMusic(){
        System.out.println("turn on music........!");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Smartphone sh = new Smartphone();
		String[] s = sh.showNetwork();
		for(String i : s){
		    System.out.println(i);
		}
		sh.connectNetwork("suraj");
	}
}
