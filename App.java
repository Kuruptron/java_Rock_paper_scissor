import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                // Instantiate a rock paper scissor gui
                RockPaperScissorGUI rockPaperScissorGUI = new RockPaperScissorGUI();

                // display the gui
                rockPaperScissorGUI.setVisible(true);
            }
        });
    }    
}
