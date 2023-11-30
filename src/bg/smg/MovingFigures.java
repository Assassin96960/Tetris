package bg.smg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingFigures extends JFrame implements ActionListener {
    private JButton leftBtn = new JButton("Left");
    private JButton rightBtn = new JButton("Right");
    private JButton upBtn = new JButton("Up");
    private JButton downBtn = new JButton("Down");

    public BlocksPanel getBallPanel() {
        return ballPanel;
    }

    private BlocksPanel ballPanel = new BlocksPanel();

    public MovingFigures(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftBtn);
        buttonPanel.add(rightBtn);
        buttonPanel.add(upBtn);
        buttonPanel.add(downBtn);

        ballPanel.setBackground(Color.WHITE);
        this.add(ballPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        leftBtn.addActionListener(this);
        rightBtn.addActionListener(this);
        upBtn.addActionListener(this);
        downBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent buttonPressed) {
        if(buttonPressed.getSource() == leftBtn)
            BlocksPanel.left();
        else if(buttonPressed.getSource() == rightBtn)
            BlocksPanel.right();
    }
}