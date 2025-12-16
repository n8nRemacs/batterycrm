package com.yandex.mobile.ads.impl;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public abstract class b11<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b, reason: collision with root package name */
    private final bl f383752b = new bl();

    /* renamed from: c, reason: collision with root package name */
    private final bl f383753c = new bl();

    /* renamed from: d, reason: collision with root package name */
    private final Object f383754d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Exception f383755e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Thread f383756f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f383757g;

    public final void a() {
        this.f383753c.b();
    }

    public abstract void b();

    public abstract void c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        synchronized (this.f383754d) {
            try {
                if (!this.f383757g && !this.f383753c.d()) {
                    this.f383757g = true;
                    b();
                    Thread thread = this.f383756f;
                    if (thread == null) {
                        this.f383752b.e();
                        this.f383753c.e();
                    } else if (z12) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException {
        this.f383753c.a();
        if (this.f383757g) {
            throw new CancellationException();
        }
        if (this.f383755e == null) {
            return null;
        }
        throw new ExecutionException(this.f383755e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f383757g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f383753c.d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f383754d) {
            try {
                if (this.f383757g) {
                    return;
                }
                this.f383756f = Thread.currentThread();
                this.f383752b.e();
                try {
                    try {
                        c();
                        synchronized (this.f383754d) {
                            this.f383753c.e();
                            this.f383756f = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e12) {
                        this.f383755e = e12;
                        synchronized (this.f383754d) {
                            this.f383753c.e();
                            this.f383756f = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.f383754d) {
                        this.f383753c.e();
                        this.f383756f = null;
                        Thread.interrupted();
                        throw th2;
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j12, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (this.f383753c.a(TimeUnit.MILLISECONDS.convert(j12, timeUnit))) {
            if (!this.f383757g) {
                if (this.f383755e == null) {
                    return null;
                }
                throw new ExecutionException(this.f383755e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
