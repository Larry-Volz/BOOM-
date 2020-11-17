/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boom;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author larryvolz
 */
public class PlayAudio {
    
    public static void playAudio(String filepath){
        InputStream audio;
        try
        {
            audio = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(audio);
            AudioPlayer.player.start(audios);
            
            
        }
        catch (Exception e)
                {
                  JOptionPane.showMessageDialog(null, "Error: ");
                    System.out.println(e);  
                }
        
    }
    
}
