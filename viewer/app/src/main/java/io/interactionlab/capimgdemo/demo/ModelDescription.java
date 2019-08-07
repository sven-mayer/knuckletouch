package io.interactionlab.capimgdemo.demo;

/**
 * Created by Huy on 28/06/2018.
 */

@SuppressWarnings("ALL")
public class ModelDescription {
    public final String modelPath;
    public final String modelName;
    public final String inputNode;
    public final String outputNode;
    public final long[] inputDimensions;
    public final String[] labels;
    public final int[] labelColor;

    public ModelDescription(String modelName, String modelPath, String inputNode, String outputNode, long[] inputDimensions, String[] labels, int[] labelColor) {
        this.modelName = modelName;
        this.modelPath = modelPath;
        this.inputNode = inputNode;
        this.outputNode = outputNode;
        this.inputDimensions = inputDimensions;
        this.labels = labels;
        this.labelColor = labelColor;
    }
}
