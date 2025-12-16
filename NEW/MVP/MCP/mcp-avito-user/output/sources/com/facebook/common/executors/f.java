package com.facebook.common.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ScheduledFutureImpl.java */
/* loaded from: classes5.dex */
public class f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: b, reason: collision with root package name */
    public final FutureTask<V> f339815b;

    public f(Callable callable) {
        this.f339815b = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        return this.f339815b.cancel(z12);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f339815b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f339815b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f339815b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f339815b.run();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j12, TimeUnit timeUnit) {
        return this.f339815b.get(j12, timeUnit);
    }

    public f(Runnable runnable, @I41.h Object obj) {
        this.f339815b = new FutureTask<>(runnable, obj);
    }
}
