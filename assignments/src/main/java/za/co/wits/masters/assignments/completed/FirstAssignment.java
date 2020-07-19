package za.co.wits.masters.assignments.completed;

import lombok.extern.java.Log;
import za.ac.wits.masters.core.ImageProcessor;
import za.co.wits.masters.assignments.Assignment;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.ServiceLoader;

@Log
public class FirstAssignment implements Assignment {
    @Override
    public void doAssignment() {
        log.info(String.format("Doing the first assignment today %s %n", LocalDateTime.now()));

        var imageProcessors = ServiceLoader.load(ImageProcessor.class);

        log.info("Number of items "+imageProcessors.stream().count());

        imageProcessors.findFirst().ifPresent(imageProcessor -> {
            BufferedImage bufferedImage = new BufferedImage(3,3,3);
            imageProcessor.detectEdges(bufferedImage);
        });
    }
}
