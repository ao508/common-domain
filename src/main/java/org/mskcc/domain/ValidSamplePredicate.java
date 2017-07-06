package org.mskcc.domain;

import java.util.function.Predicate;

class ValidSamplePredicate implements Predicate<Sample> {
    @Override
    public boolean test(Sample sample) {
        return sample.getRuns().stream()
                .anyMatch(r -> r.isPassed());
    }
}
