package org.mskcc.domain.sample;

import java.util.HashMap;
import java.util.Map;

public enum SampleOrigin {
    URINE("Urine"),
    CEREBROSPINAL_FLUID("Cerebrospinal Fluid"),
    PLASMA("Plasma"),
    WHOLE_BLOOD("Whole Blood"),
    TISSUE("Tissue");

    private static final Map<String, SampleOrigin> valueToSampleOrigin = new HashMap<>();

    static {
        for (SampleOrigin sampleClass : values())
            valueToSampleOrigin.put(sampleClass.value, sampleClass);
    }

    private String value;

    SampleOrigin(String value) {
        this.value = value;
    }

    public static SampleOrigin fromValue(String value) {
        if (!valueToSampleOrigin.containsKey(value))
            throw new RuntimeException(String.format("Unsupported Sample Origin: %s", value));
        return valueToSampleOrigin.get(value);
    }

    public String getValue() {
        return value;
    }
}