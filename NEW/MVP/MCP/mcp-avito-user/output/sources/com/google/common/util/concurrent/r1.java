package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WrappingScheduledExecutorService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
abstract class r1 extends q1 implements ScheduledExecutorService {
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j12, TimeUnit timeUnit) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j12, TimeUnit timeUnit) {
        a(callable);
        throw null;
    }
}
