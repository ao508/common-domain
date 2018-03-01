package org.mskcc.domain;

import java.util.HashMap;
import java.util.Map;

public enum QcStatus {
    RESEQUENCE_POOL("Resequence-Pool"),
    REPOOL_SAMPLE("Repool-Sample"),
    UNDER_REVIEW("Under-Review"),
    PASSED("Passed"),
    FAILED_DO_NOT_DELIVER("Failed-Do-Not-Deliver"),
    RECAPTURE_SAMPLE("Recapture-Sample"),
    NEW_LIBRARY_NEEDED("New-Library-Needed");

    private String value;
    private static final Map<String, QcStatus> valueToQcStatus = new HashMap<>();

    static {
        for (QcStatus qcStatus : values()) {
            valueToQcStatus.put(qcStatus.value, qcStatus);
        }
    }

    QcStatus(String value) {
        this.value = value;
    }

    public static QcStatus getByValue(String value) {
        if(!valueToQcStatus.containsKey(value))
            throw new RuntimeException(String.format("Qc status: %s doesn't exist", value));

        return valueToQcStatus.get(value);
    }

    public String getValue() {
        return value;
    }
}
