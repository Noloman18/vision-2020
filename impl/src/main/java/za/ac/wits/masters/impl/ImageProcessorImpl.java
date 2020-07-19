package za.ac.wits.masters.impl;

import lombok.NonNull;
import lombok.extern.java.Log;
import za.ac.wits.masters.core.ImageProcessor;

import java.awt.image.BufferedImage;

@Log
public class ImageProcessorImpl implements ImageProcessor {
    @Override
    public BufferedImage detectEdges(@NonNull BufferedImage inputImage) {
        log.info("Performing edge detection...");
        return null;
    }
}
