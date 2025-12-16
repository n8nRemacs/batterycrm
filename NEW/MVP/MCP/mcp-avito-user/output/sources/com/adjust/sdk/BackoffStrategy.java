package com.adjust.sdk;

/* loaded from: classes10.dex */
public enum BackoffStrategy {
    LONG_WAIT(1, 120000, 86400000, 0.5d, 1.0d),
    SHORT_WAIT(1, 200, 3600000, 0.5d, 1.0d),
    TEST_WAIT(1, 200, 1000, 0.5d, 1.0d),
    NO_WAIT(100, 1, 1000, 1.0d, 1.0d);

    double maxRange;
    long maxWait;
    long milliSecondMultiplier;
    double minRange;
    int minRetries;

    BackoffStrategy(int i12, long j12, long j13, double d12, double d13) {
        this.minRetries = i12;
        this.milliSecondMultiplier = j12;
        this.maxWait = j13;
        this.minRange = d12;
        this.maxRange = d13;
    }
}
