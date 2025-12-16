package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PausableScheduledExecutorServiceImpl.java */
/* loaded from: classes13.dex */
final class v extends h implements u {
    @Override // com.google.firebase.concurrent.h, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.h, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
