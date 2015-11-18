package actions;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import main.Messages;

public class Receiver {
	private Messages messages = null;
	
	public Receiver(Messages messages){
		lightBulb.init_me(); //Start the phillips hue light
		this.messages = messages;
	}
	
	public void getTemperature(){
		messages.writeDM("HomeTweetie: the temperature is 23^C");
		System.out.println("HomeTweetie: Get Temperature!");
	}
	public void getTime(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		messages.writeDM("HomeTweetie: the date is "+ dateFormat.format(date));
		System.out.println("HomeTweetie: Time has been sent");
	}
	public void getWebCamImage(){
		messages.writeDM("HomeTweetie: here is the image");
		System.out.println("HomeTweet: Got Image");
	}
	public void turnOnLights(){
		messages.writeDM("HomeTweetie: lights have been turned on");
		System.out.println("HomeTweet: Lights on");
		lightBulb.TurnOnLights();
	}
	public void turnOffLights(){
		messages.writeDM("HomeTweetie: lights have been turned off");
		System.out.println("HomeTweet: Lights off");
		lightBulb.TurnOnLights();
	}
	public void turnHeatOn(){
		messages.writeDM("HomeTweetie: Heating has been turned on");
		System.out.println("HomeTweet: Heating has been turned on");
	}
}
