package audio;

import java.io.File;
import java.io.IOException;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
  
public class Sound 
{
  
    // to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
    static String filePath;
  
    // constructor to initialize streams and clip
    public Sound(String filePath) {

        try {
        // create AudioInputStream object
        audioInputStream = 
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
          
        // create clip reference
        clip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        clip.open(audioInputStream);
        
        }
        catch(UnsupportedAudioFileException uns) {uns.printStackTrace();}
        catch(IOException Ioe) {Ioe.printStackTrace();}
        catch(LineUnavailableException lue) {lue.printStackTrace();}

    }
     //Method to play the audio
    public void play() 
    {
        //restart();
        clip.start();
       
        status = "play";
        
    }

    // Method to stop the audio
    public void stop() 
    {
      //  currentFrame = 0L;
       // clip.stop();
        
        clip.setMicrosecondPosition(0);
        clip.stop();
    }
    
    public void restart()
    {
        clip.start();
        clip.stop();
        clip.close();
        resetAudioStream();
        currentFrame = 0L;
        clip.setMicrosecondPosition(0);
        clip.start();

    }
    
    public void resetAudioStream()  
    {
        try
        {
        audioInputStream = AudioSystem.getAudioInputStream(
        new File(filePath).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(UnsupportedAudioFileException uns) {uns.printStackTrace();}
        catch(IOException Ioe) {Ioe.printStackTrace();}
        catch(LineUnavailableException lue) {lue.printStackTrace();}
        
    }
    
      
//    // Method to reset audio stream
//    public void resetAudioStream() throws UnsupportedAudioFileException, IOException,
//                                            LineUnavailableException 
//    {
//        audioInputStream = AudioSystem.getAudioInputStream(
//        new File(filePath).getAbsoluteFile());
//        clip.open(audioInputStream);
//        clip.loop(Clip.LOOP_CONTINUOUSLY);
//    }
//  
}