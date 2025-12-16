package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.AbstractC37018a;
import com.google.android.gms.tasks.C37019b;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import j.k0;
import j.l0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37645n {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f362374b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f362375c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    @RX0.a
    public final q f362373a = new q();

    @j.N
    @RX0.a
    public final <T> Task<T> a(@j.N final Executor executor, @j.N final Callable<T> callable, @j.N final AbstractC37018a abstractC37018a) {
        C36729v.m(this.f362374b.get() > 0);
        if (abstractC37018a.a()) {
            return C37030m.d();
        }
        final C37019b c37019b = new C37019b();
        final C37028k c37028k = new C37028k(c37019b.f355671a);
        this.f362373a.a(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.E
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                Callable callable2 = callable;
                C37028k c37028k2 = c37028k;
                AbstractC37645n abstractC37645n = this.f362311b;
                abstractC37645n.getClass();
                AbstractC37018a abstractC37018a2 = abstractC37018a;
                boolean zA2 = abstractC37018a2.a();
                C37019b c37019b2 = c37019b;
                if (zA2) {
                    c37019b2.a();
                    return;
                }
                AtomicBoolean atomicBoolean = abstractC37645n.f362375c;
                try {
                    try {
                        if (!atomicBoolean.get()) {
                            abstractC37645n.b();
                            atomicBoolean.set(true);
                        }
                        if (abstractC37018a2.a()) {
                            c37019b2.a();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (abstractC37018a2.a()) {
                            c37019b2.a();
                        } else {
                            c37028k2.b(objCall);
                        }
                    } catch (RuntimeException e12) {
                        throw new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e12);
                    }
                } catch (Exception e13) {
                    if (abstractC37018a2.a()) {
                        c37019b2.a();
                    } else {
                        c37028k2.a(e13);
                    }
                }
            }
        }, new Executor() { // from class: com.google.mlkit.common.sdkinternal.D
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e12) {
                    if (abstractC37018a.a()) {
                        c37019b.a();
                    } else {
                        c37028k.a(e12);
                    }
                    throw e12;
                }
            }
        });
        return c37028k.f355672a;
    }

    @k0
    @RX0.a
    @l0
    public abstract void b();

    @RX0.a
    @l0
    public abstract void c();
}
