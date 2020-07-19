module impl {
    requires transitive core;
    requires java.logging;
    provides za.ac.wits.masters.core.ImageProcessor with za.ac.wits.masters.impl.ImageProcessorImpl;
}