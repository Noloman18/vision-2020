package za.ac.wits.masters.core;

import lombok.NonNull;

import java.awt.image.BufferedImage;

public interface ImageProcessor {
    BufferedImage detectEdges(@NonNull BufferedImage inputImage);
}
