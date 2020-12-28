/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roaddetection;

/**
 *
 * @author btdou
 */
public class MyThread implements Runnable{
    
    private Hough h;
    private int start;
    private int stop;
    
    /**
     *
     * @param h - Hough object
     * @param start - beginning of the range of angles this thread will check
     * @param stop - end of the range of angles this thread will check
     */
    public MyThread(Hough h, int start, int stop){
        this.h = h;
        this.start = start;
        this.stop = stop;
    }
    
    @Override
    public void run(){
        int a = h.Nangles;
        h.getEdges(start, stop);
    }
    
    public static void main(String[] args){
        String imagepath = "D:\\Comp-SciSoftware\\home\\btdou\\Lab6_RoadDetection-main\\Lab6_RoadDetection-main\\road.png";
        String threshhold = "5";
        
    }
}
