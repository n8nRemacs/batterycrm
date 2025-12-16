package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37532c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ImmediateFuture.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
class A0<V> implements D0<V> {

    /* renamed from: c, reason: collision with root package name */
    public static final D0<?> f360480c = new A0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f360481d = Logger.getLogger(A0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    @T0
    public final V f360482b;

    /* compiled from: ImmediateFuture.java */
    public static final class a<V> extends AbstractC37532c.j<V> {
        static {
            if (AbstractC37532c.f360557e) {
                return;
            }
            new a();
        }

        public a() {
            cancel(false);
        }
    }

    /* compiled from: ImmediateFuture.java */
    public static final class b<V> extends AbstractC37532c.j<V> {
    }

    public A0(@T0 V v12) {
        this.f360482b = v12;
    }

    @Override // com.google.common.util.concurrent.D0
    public final void N(Runnable runnable, Executor executor) {
        com.google.common.base.M.j(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e12) {
            f360481d.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e12);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @T0
    public final V get() {
        return this.f360482b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=SUCCESS, result=[");
        return androidx.appcompat.app.r.o(this.f360482b, "]]", sb2);
    }

    @Override // java.util.concurrent.Future
    @T0
    public final V get(long j12, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f360482b;
    }
}
