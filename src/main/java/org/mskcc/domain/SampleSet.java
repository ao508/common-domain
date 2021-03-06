package org.mskcc.domain;

import org.mskcc.domain.sample.Sample;

import java.util.*;

public class SampleSet {
    private final String name;
    private Map<String, Request> requestIdToRequest = new LinkedHashMap<>();
    private Map<String, Sample> sampleIdToSample = new LinkedHashMap<>();
    private List<PairingInfo> pairings = new ArrayList<>();
    private String primaryRequestId;
    private String baitSet;
    private String finalProjectTitle;
    private Recipe recipe;

    public SampleSet(String name) {
        this.name = name;
    }

    public List<? extends Request> getRequests() {
        return new ArrayList<>(requestIdToRequest.values());
    }

    public void setRequests(List<Request> requests) {
        for (Request request : requests) {
            requestIdToRequest.put(request.getId(), request);
        }
    }

    public Map<String, Request> getRequestIdToRequest() {
        return requestIdToRequest;
    }

    public String getPrimaryRequestId() {
        return primaryRequestId;
    }

    public void setPrimaryRequestId(String primaryRequestId) {
        this.primaryRequestId = primaryRequestId;
    }

    public String getBaitSet() {
        return baitSet;
    }

    public void setBaitSet(String baitSet) {
        this.baitSet = baitSet;
    }

    public String getFinalProjectTitle() {
        return finalProjectTitle;
    }

    public void setFinalProjectTitle(String finalProjectTitle) {
        this.finalProjectTitle = finalProjectTitle;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public Request getPrimaryRequest() {
        if (!requestIdToRequest.containsKey(primaryRequestId))
            throw new PrimaryRequestNotPartOfSampleSetException(String.format("Primary request: %s for project: %s is" +
                    " not part of this project", primaryRequestId, name));

        return requestIdToRequest.get(primaryRequestId);
    }

    public List<PairingInfo> getPairings() {
        return pairings;
    }

    public void setPairings(List<PairingInfo> pairings) {
        this.pairings = pairings;
    }

    public void addPairing(PairingInfo pairing) {
        this.pairings.add(pairing);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleSet sampleSet = (SampleSet) o;
        return Objects.equals(name, sampleSet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Sample putSampleIfAbsent(String igoSampleId) {
        return putSampleIfAbsent(new Sample(igoSampleId));
    }

    public Sample putSampleIfAbsent(Sample sample) {
        sampleIdToSample.putIfAbsent(sample.getIgoId(), sample);
        return sampleIdToSample.get(sample.getIgoId());
    }

    public Request putRequestIfAbsent(String requestId) {
        return putRequestIfAbsent(new Request(requestId));
    }

    public Request putRequestIfAbsent(Request request) {
        requestIdToRequest.putIfAbsent(request.getId(), request);
        return requestIdToRequest.get(request.getId());
    }

    public Map<String, Sample> getSampleIdToSample() {
        return sampleIdToSample;
    }

    public List<Sample> getSamples() {
        return new ArrayList<>(sampleIdToSample.values());
    }

    public static class PrimaryRequestNotPartOfSampleSetException extends RuntimeException {
        public PrimaryRequestNotPartOfSampleSetException(String message) {
            super(message);
        }
    }
}
