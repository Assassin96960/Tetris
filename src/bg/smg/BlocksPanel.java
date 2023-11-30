package bg.smg;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

    public class BlocksPanel extends JPanel {
        private Image[] blocks;
        private int xCoord;
        private int yCoord;
        private Dimension preferredSize;
        private Image currentBlock;
        private boolean dirXRight = true;
        private boolean dirYDown = true;
        BlocksPanel(){
            this.blocks = new Image[7];
            this.xCoord = -1;
            this.yCoord = -1;
            this.preferredSize = new Dimension(300,600);
            this.currentBlock=blocks[0];
        }

        public void left() {
            xCoord -= 5;
            repaint();
        }
        public void right() {
            xCoord += 5;
            repaint();
        }
        public void down() {
            yCoord += 5;
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {

     //       return preferredSize;
            return null;
        }

        @Override
        protected void paintComponent(Graphics block) {
            super.paintComponent(block);

            block.drawImage(currentBlock, xCoord, yCoord, this);
        }

        public void move(){

            int width = 400;
            int height = 400;
            int dx = 3;
            int dy = 3;
            int radius = 5;
            int x=0;
            int y=0;

            while(true) {
                down();
                if(xCoord+25>width)
                    dirXRight=false;
                else
                    dirXRight=true;

                if(yCoord+25>height)
                    dirYDown=false;
                else
                    dirYDown=true;


                if(dirXRight)
                    right();
                else
                    left();

                if(dirYDown)
                    down();

  //             try {
     //               Thread.sleep(50);
     //           } catch (InterruptedException e){
   //             }
            }
        }
    }
}
