package com.google.mlkit.common.sdkinternal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public boolean f362383b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f362382a = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public final ArrayDeque f362384c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f362385d = new AtomicReference();

    @RX0.a
    public final void a(@j.N Runnable runnable, @j.N Executor executor) {
        synchronized (this.f362382a) {
            try {
                if (this.f362383b) {
                    this.f362384c.add(new M(executor, runnable, null));
                } else {
                    this.f362383b = true;
                    c(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f362382a) {
            try {
                if (this.f362384c.isEmpty()) {
                    this.f362383b = false;
                    return;
                }
                M m12 = (M) this.f362384c.remove();
                c(m12.f362324b, m12.f362323a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(final Runnable runnable, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.K
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    O o12 = new O(this.f362321b, null);
                    try {
                        runnable.run();
                        o12.close();
                    } catch (Throwable th2) {
                        try {
                            o12.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            b();
        }
    }
}
