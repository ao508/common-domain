package org.mskcc.domain.external;

public class ExternalSample {
    private String externalId;
    private String filePath;
    private String externalPatientId;
    private String tumorNormal;
    private int counter;
    private String runId;
    private String sampleOrigin;
    private String sampleClass;
    private String cmoId;
    private String nucleidAcid;
    private String patientCmoId;
    private String specimenType;

    public ExternalSample(int counter,
                          String externalId,
                          String externalPatientId,
                          String filePath,
                          String runId,
                          String sampleClass,
                          String sampleOrigin,
                          String tumorNormal) {
        this.counter = counter;
        this.externalId = externalId;
        this.externalPatientId = externalPatientId;
        this.filePath = filePath;
        this.sampleOrigin = sampleOrigin;
        this.runId = runId;
        this.sampleClass = sampleClass;
        this.tumorNormal = tumorNormal;
    }

    protected ExternalSample() {
    }

    public String getExternalRunId() {
        return this.runId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getSampleOrigin() {
        return this.sampleOrigin;
    }

    public String getSpecimenType() {
        return this.specimenType;
    }

    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType;
    }

    public String getNucleidAcid() {
        return this.nucleidAcid;
    }

    public void setNucleidAcid(String nucleidAcid) {
        this.nucleidAcid = nucleidAcid;
    }

    public String getCmoId() {
        return this.cmoId;
    }

    public void setCmoId(String cmoId) {
        this.cmoId = cmoId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getPatientCmoId() {
        return this.patientCmoId;
    }

    public void setPatientCmoId(String patientCmoId) {
        this.patientCmoId = patientCmoId;
    }

    public String getExternalPatientId() {
        return this.externalPatientId;
    }

    public int getCounter() {
        return counter;
    }

    public String getSampleClass() {
        return sampleClass;
    }

    public String getTumorNormal() {
        return tumorNormal;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setExternalPatientId(String externalPatientId) {
        this.externalPatientId = externalPatientId;
    }

    public void setTumorNormal(String tumorNormal) {
        this.tumorNormal = tumorNormal;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public void setSampleOrigin(String sampleOrigin) {
        this.sampleOrigin = sampleOrigin;
    }

    public void setSampleClass(String sampleClass) {
        this.sampleClass = sampleClass;
    }

    @Override
    public String toString() {
        return "ExternalSample{" +
                "externalId='" + externalId + '\'' +
                ", externalPatientId='" + externalPatientId + '\'' +
                ", tumorNormal='" + tumorNormal + '\'' +
                ", counter=" + counter +
                ", runId='" + runId + '\'' +
                ", sampleOrigin='" + sampleOrigin + '\'' +
                ", sampleClass='" + sampleClass + '\'' +
                ", cmoId='" + cmoId + '\'' +
                ", nucleidAcid='" + nucleidAcid + '\'' +
                ", patientCmoId='" + patientCmoId + '\'' +
                ", specimenType='" + specimenType + '\'' +
                '}';
    }
}