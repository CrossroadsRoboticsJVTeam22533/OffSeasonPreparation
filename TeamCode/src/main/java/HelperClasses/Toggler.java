package HelperClasses;

public class Toggler {

    boolean wasPressed;

    boolean check(boolean isPressed) {

        if(isPressed && !wasPressed) {

            wasPressed = isPressed;
            return true;

        }

        wasPressed = isPressed;
        return false;

    }

}
