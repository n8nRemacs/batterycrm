package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import com.google.common.util.concurrent.C37535d0;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: ListenableFutureTask.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
public class E0<V> extends FutureTask<V> implements D0<V> {

    /* renamed from: b, reason: collision with root package name */
    public final C37535d0 f360529b;

    public E0(com.avito.android.tariff_lf_constructor.configure.checkbox_selector.f fVar) {
        super(fVar);
        this.f360529b = new C37535d0();
    }

    @Override // com.google.common.util.concurrent.D0
    public final void N(Runnable runnable, Executor executor) {
        C37535d0 c37535d0 = this.f360529b;
        c37535d0.getClass();
        com.google.common.base.M.j(executor, "Executor was null.");
        synchronized (c37535d0) {
            try {
                if (c37535d0.f360592b) {
                    C37535d0.a(runnable, executor);
                } else {
                    c37535d0.f360591a = new C37535d0.a(runnable, executor, c37535d0.f360591a);
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        C37535d0 c37535d0 = this.f360529b;
        synchronized (c37535d0) {
            try {
                if (c37535d0.f360592b) {
                    return;
                }
                c37535d0.f360592b = true;
                C37535d0.a aVar = c37535d0.f360591a;
                C37535d0.a aVar2 = null;
                c37535d0.f360591a = null;
                while (aVar != null) {
                    C37535d0.a aVar3 = aVar.f360595c;
                    aVar.f360595c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    C37535d0.a(aVar2.f360593a, aVar2.f360594b);
                    aVar2 = aVar2.f360595c;
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @InterfaceC19845a
    @T0
    public final V get(long j12, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j12);
        return nanos <= 2147483647999999999L ? (V) super.get(j12, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
