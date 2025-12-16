package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.android.volley.w;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFuture.java */
/* loaded from: classes10.dex */
public class H<T> implements Future<T>, w.b<T>, w.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f67110b = false;

    /* renamed from: c, reason: collision with root package name */
    public T f67111c;

    /* renamed from: d, reason: collision with root package name */
    public VolleyError f67112d;

    @Override // com.android.volley.w.a
    public final synchronized void a(VolleyError volleyError) {
        this.f67112d = volleyError;
        notifyAll();
    }

    @Override // com.android.volley.w.b
    public final synchronized void b(T t12) {
        this.f67110b = true;
        this.f67111c = t12;
        notifyAll();
    }

    public final synchronized T c(Long l12) {
        if (this.f67112d != null) {
            throw new ExecutionException(this.f67112d);
        }
        if (this.f67110b) {
            return this.f67111c;
        }
        if (l12 == null) {
            while (!isDone()) {
                wait(0L);
            }
        } else if (l12.longValue() > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jLongValue = l12.longValue() + jUptimeMillis;
            while (!isDone() && jUptimeMillis < jLongValue) {
                wait(jLongValue - jUptimeMillis);
                jUptimeMillis = SystemClock.uptimeMillis();
            }
        }
        if (this.f67112d != null) {
            throw new ExecutionException(this.f67112d);
        }
        if (!this.f67110b) {
            throw new TimeoutException();
        }
        return this.f67111c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z12) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        try {
            return c(null);
        } catch (TimeoutException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f67110b     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            com.android.volley.VolleyError r0 = r1.f67112d     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            r0 = 0
            goto Le
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.H.isDone():boolean");
    }

    @Override // java.util.concurrent.Future
    public final T get(long j12, TimeUnit timeUnit) {
        return c(Long.valueOf(TimeUnit.MILLISECONDS.convert(j12, timeUnit)));
    }
}
