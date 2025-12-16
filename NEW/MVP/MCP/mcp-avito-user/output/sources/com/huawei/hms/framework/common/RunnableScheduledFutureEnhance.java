package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {

    /* renamed from: b, reason: collision with root package name */
    public final RunnableScheduledFuture<T> f363470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f363471c = Thread.currentThread().getName();

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
        this.f363470b = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z12) {
        return this.f363470b.cancel(z12);
    }

    public boolean equals(Object obj) {
        return this.f363470b.equals(obj);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f363470b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f363470b.getDelay(timeUnit);
    }

    public String getParentName() {
        return this.f363471c;
    }

    public int hashCode() {
        return this.f363470b.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f363470b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f363470b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.f363470b.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f363470b.run();
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.f363470b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public T get(long j12, TimeUnit timeUnit) {
        return this.f363470b.get(j12, timeUnit);
    }
}
