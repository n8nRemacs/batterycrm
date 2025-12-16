package com.yandex.metrica.networktasks.api;

/* loaded from: classes7.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z12);

    void onHostAttemptFinished(boolean z12);
}
