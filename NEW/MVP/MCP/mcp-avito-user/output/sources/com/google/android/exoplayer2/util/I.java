package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RunnableFutureTask.java */
/* loaded from: classes6.dex */
public abstract class I<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b, reason: collision with root package name */
    public final C36592h f348077b = new C36592h();

    /* renamed from: c, reason: collision with root package name */
    public final C36592h f348078c = new C36592h();

    /* renamed from: d, reason: collision with root package name */
    public final Object f348079d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Exception f348080e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public R f348081f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public Thread f348082g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348083h;

    public final void a() {
        this.f348078c.b();
    }

    @Q
    public abstract R c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        boolean z13;
        synchronized (this.f348079d) {
            try {
                if (!this.f348083h) {
                    C36592h c36592h = this.f348078c;
                    synchronized (c36592h) {
                        z13 = c36592h.f348131b;
                    }
                    if (!z13) {
                        this.f348083h = true;
                        b();
                        Thread thread = this.f348082g;
                        if (thread == null) {
                            this.f348077b.c();
                            this.f348078c.c();
                        } else if (z12) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @Q
    public final R get() throws ExecutionException {
        this.f348078c.a();
        if (this.f348083h) {
            throw new CancellationException();
        }
        if (this.f348080e == null) {
            return this.f348081f;
        }
        throw new ExecutionException(this.f348080e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f348083h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z12;
        C36592h c36592h = this.f348078c;
        synchronized (c36592h) {
            z12 = c36592h.f348131b;
        }
        return z12;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f348079d) {
            try {
                if (this.f348083h) {
                    return;
                }
                this.f348082g = Thread.currentThread();
                this.f348077b.c();
                try {
                    try {
                        this.f348081f = c();
                        synchronized (this.f348079d) {
                            this.f348078c.c();
                            this.f348082g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f348079d) {
                            this.f348078c.c();
                            this.f348082g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e12) {
                    this.f348080e = e12;
                    synchronized (this.f348079d) {
                        this.f348078c.c();
                        this.f348082g = null;
                        Thread.interrupted();
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @Q
    public final R get(long j12, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z12;
        long jConvert = TimeUnit.MILLISECONDS.convert(j12, timeUnit);
        C36592h c36592h = this.f348078c;
        synchronized (c36592h) {
            if (jConvert <= 0) {
                z12 = c36592h.f348131b;
            } else {
                c36592h.f348130a.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j13 = jConvert + jElapsedRealtime;
                if (j13 < jElapsedRealtime) {
                    c36592h.a();
                } else {
                    while (!c36592h.f348131b && jElapsedRealtime < j13) {
                        c36592h.wait(j13 - jElapsedRealtime);
                        c36592h.f348130a.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z12 = c36592h.f348131b;
            }
        }
        if (z12) {
            if (!this.f348083h) {
                if (this.f348080e == null) {
                    return this.f348081f;
                }
                throw new ExecutionException(this.f348080e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void b() {
    }
}
