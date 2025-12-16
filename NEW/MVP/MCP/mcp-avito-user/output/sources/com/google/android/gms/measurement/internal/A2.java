package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class A2 extends AbstractC36884g3 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f354510k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public F2 f354511c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public F2 f354512d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue<G2<?>> f354513e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f354514f;

    /* renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f354515g;

    /* renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f354516h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f354517i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f354518j;

    public A2(I2 i22) {
        super(i22);
        this.f354517i = new Object();
        this.f354518j = new Semaphore(2);
        this.f354513e = new PriorityBlockingQueue<>();
        this.f354514f = new LinkedBlockingQueue();
        this.f354515g = new C2(this, "Thread death: Uncaught exception on worker thread");
        this.f354516h = new C2(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final void e() {
        if (Thread.currentThread() != this.f354511c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36884g3
    public final boolean h() {
        return false;
    }

    @j.P
    public final <T> T i(AtomicReference<T> atomicReference, long j12, String str, Runnable runnable) {
        synchronized (atomicReference) {
            super.zzl().n(runnable);
            try {
                atomicReference.wait(j12);
            } catch (InterruptedException unused) {
                super.zzj().f354892i.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        T t12 = atomicReference.get();
        if (t12 == null) {
            super.zzj().f354892i.b("Timed out waiting for ".concat(str));
        }
        return t12;
    }

    public final <V> Future<V> j(Callable<V> callable) {
        f();
        G2<?> g22 = new G2<>(this, callable, false);
        if (Thread.currentThread() == this.f354511c) {
            if (!this.f354513e.isEmpty()) {
                super.zzj().f354892i.b("Callable skipped the worker queue.");
            }
            g22.run();
        } else {
            k(g22);
        }
        return g22;
    }

    public final void k(G2<?> g22) {
        synchronized (this.f354517i) {
            try {
                this.f354513e.add(g22);
                F2 f22 = this.f354511c;
                if (f22 == null) {
                    F2 f23 = new F2(this, "Measurement Worker", this.f354513e);
                    this.f354511c = f23;
                    f23.setUncaughtExceptionHandler(this.f354515g);
                    this.f354511c.start();
                } else {
                    synchronized (f22.f354673b) {
                        f22.f354673b.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(Runnable runnable) {
        f();
        G2 g22 = new G2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f354517i) {
            try {
                this.f354514f.add(g22);
                F2 f22 = this.f354512d;
                if (f22 == null) {
                    F2 f23 = new F2(this, "Measurement Network", this.f354514f);
                    this.f354512d = f23;
                    f23.setUncaughtExceptionHandler(this.f354516h);
                    this.f354512d.start();
                } else {
                    synchronized (f22.f354673b) {
                        f22.f354673b.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <V> Future<V> m(Callable<V> callable) {
        f();
        G2<?> g22 = new G2<>(this, callable, true);
        if (Thread.currentThread() == this.f354511c) {
            g22.run();
        } else {
            k(g22);
        }
        return g22;
    }

    public final void n(Runnable runnable) {
        f();
        C36729v.j(runnable);
        k(new G2<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void o(Runnable runnable) {
        f();
        k(new G2<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean p() {
        return Thread.currentThread() == this.f354511c;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
