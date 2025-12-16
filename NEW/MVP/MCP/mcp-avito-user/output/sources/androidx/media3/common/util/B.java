package androidx.media3.common.util;

import android.os.SystemClock;
import j.P;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RunnableFutureTask.java */
@J
/* loaded from: classes.dex */
public abstract class B<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b, reason: collision with root package name */
    public final C23118i f47865b = new C23118i();

    /* renamed from: c, reason: collision with root package name */
    public final C23118i f47866c = new C23118i();

    /* renamed from: d, reason: collision with root package name */
    public final Object f47867d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @P
    public Exception f47868e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public R f47869f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Thread f47870g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47871h;

    @I
    public abstract R b();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        boolean z13;
        synchronized (this.f47867d) {
            try {
                if (!this.f47871h) {
                    C23118i c23118i = this.f47866c;
                    synchronized (c23118i) {
                        z13 = c23118i.f47909b;
                    }
                    if (!z13) {
                        this.f47871h = true;
                        a();
                        Thread thread = this.f47870g;
                        if (thread == null) {
                            this.f47865b.d();
                            this.f47866c.d();
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
    @I
    public final R get() throws ExecutionException {
        this.f47866c.a();
        if (this.f47871h) {
            throw new CancellationException();
        }
        if (this.f47868e == null) {
            return this.f47869f;
        }
        throw new ExecutionException(this.f47868e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f47871h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z12;
        C23118i c23118i = this.f47866c;
        synchronized (c23118i) {
            z12 = c23118i.f47909b;
        }
        return z12;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f47867d) {
            try {
                if (this.f47871h) {
                    return;
                }
                this.f47870g = Thread.currentThread();
                this.f47865b.d();
                try {
                    try {
                        this.f47869f = b();
                        synchronized (this.f47867d) {
                            this.f47866c.d();
                            this.f47870g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f47867d) {
                            this.f47866c.d();
                            this.f47870g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e12) {
                    this.f47868e = e12;
                    synchronized (this.f47867d) {
                        this.f47866c.d();
                        this.f47870g = null;
                        Thread.interrupted();
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @I
    public final R get(long j12, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z12;
        long jConvert = TimeUnit.MILLISECONDS.convert(j12, timeUnit);
        C23118i c23118i = this.f47866c;
        synchronized (c23118i) {
            if (jConvert <= 0) {
                z12 = c23118i.f47909b;
            } else {
                c23118i.f47908a.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j13 = jConvert + jElapsedRealtime;
                if (j13 < jElapsedRealtime) {
                    c23118i.a();
                } else {
                    while (!c23118i.f47909b && jElapsedRealtime < j13) {
                        c23118i.wait(j13 - jElapsedRealtime);
                        c23118i.f47908a.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z12 = c23118i.f47909b;
            }
        }
        if (z12) {
            if (!this.f47871h) {
                if (this.f47868e == null) {
                    return this.f47869f;
                }
                throw new ExecutionException(this.f47868e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void a() {
    }
}
