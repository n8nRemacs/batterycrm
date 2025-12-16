package com.facebook.common.executors;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: StatefulRunnable.java */
@Nullsafe
/* loaded from: classes5.dex */
public abstract class h<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f339816b = new AtomicInteger(0);

    public final void a() {
        if (this.f339816b.compareAndSet(0, 2)) {
            d();
        }
    }

    @I41.h
    public abstract T c();

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f339816b;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                T tC2 = c();
                atomicInteger.set(3);
                try {
                    f(tC2);
                } finally {
                    b(tC2);
                }
            } catch (Exception e12) {
                atomicInteger.set(4);
                e(e12);
            }
        }
    }

    public void d() {
    }

    public void b(@I41.h T t12) {
    }

    public void e(Exception exc) {
    }

    public void f(@I41.h T t12) {
    }
}
