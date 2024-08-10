package main.java.ru.zharinov;

import java.util.ArrayList;
import java.util.List;

public class Visualization {
    private static final Visualization visualization = new Visualization();
    public final List<String> image = new ArrayList<>();


    private Visualization() {
    }

    public static Visualization getVisualization() {
        return visualization;
    }


    {
        String firstPart = "============\n" +
                "   |   ||   \n" +
                "       ||   \n" +
                "       ||  \n" +
                "       ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(firstPart);
        String secondPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(secondPart);
        String thirdPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "   I\\  ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(thirdPart);
        String fourthPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "  /I\\  ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(fourthPart);
        String fifthPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "  /I\\  ||   \n" +
                "   I   ||   \n" +
                "       ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(fifthPart);
        String sixthPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "  /I\\  ||   \n" +
                "   I   ||   \n" +
                "    \\  ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(sixthPart);
        String seventhPart = "============\n" +
                "   |   ||   \n" +
                "   0   ||   \n" +
                "  /I\\  ||   \n" +
                "   I   ||   \n" +
                "  / \\  ||   \n" +
                "       ||   \n" +
                "============\n";
        image.add(seventhPart);
    }
}
