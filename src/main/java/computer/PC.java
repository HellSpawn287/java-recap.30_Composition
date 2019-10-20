package computer;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(String programName){
       theCase.pressPowerButton();
        drwaLogo();
        motherboard.loadProgram(programName);
    }

    private void drwaLogo() {
    monitor.drawPixelAt(1200, 50, "green");
    }

}
