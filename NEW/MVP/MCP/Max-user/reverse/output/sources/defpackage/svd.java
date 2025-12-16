package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class svd implements RunnableFuture {
    public Thread X;
    public boolean Y;
    public final yn3 a = new yn3();
    public final yn3 b = new yn3();
    public final Object c = new Object();
    public Exception d;
    public Object o;

    public final void a() {
        this.b.b();
    }

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.c) {
            try {
                if (!this.Y && !this.b.e()) {
                    this.Y = true;
                    b();
                    Thread thread = this.X;
                    if (thread == null) {
                        this.a.f();
                        this.b.f();
                    } else if (z) {
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
    public final Object get() throws ExecutionException {
        this.b.a();
        if (this.Y) {
            throw new CancellationException();
        }
        if (this.d == null) {
            return this.o;
        }
        throw new ExecutionException(this.d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.Y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                if (this.Y) {
                    return;
                }
                this.X = Thread.currentThread();
                this.a.f();
                try {
                    try {
                        this.o = c();
                        synchronized (this.c) {
                            this.b.f();
                            this.X = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.b.f();
                            this.X = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.b.f();
                        this.X = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        yn3 yn3Var = this.b;
        synchronized (yn3Var) {
            if (jConvert <= 0) {
                z = yn3Var.b;
            } else {
                yn3Var.a.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jConvert + jElapsedRealtime;
                if (j2 < jElapsedRealtime) {
                    yn3Var.a();
                } else {
                    while (!yn3Var.b && jElapsedRealtime < j2) {
                        yn3Var.a.getClass();
                        yn3Var.wait(j2 - jElapsedRealtime);
                        yn3Var.a.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = yn3Var.b;
            }
        }
        if (z) {
            if (!this.Y) {
                if (this.d == null) {
                    return this.o;
                }
                throw new ExecutionException(this.d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
