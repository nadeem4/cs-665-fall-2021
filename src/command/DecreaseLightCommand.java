package command;

public class DecreaseLightCommand implements Command {
    private Light theLight;

    public DecreaseLightCommand(final Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
