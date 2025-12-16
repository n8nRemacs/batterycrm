package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes10.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j12);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j12, long j13);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j12);

    void teardown();
}
