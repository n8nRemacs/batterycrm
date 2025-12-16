package com.google.common.util.concurrent;

import com.google.common.base.InterfaceC37276u;
import com.google.common.util.concurrent.AbstractC37545i0;
import java.lang.Throwable;

/* compiled from: AbstractCatchingFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC37528a<V, X extends Throwable, F, T> extends AbstractC37545i0.a<V> implements Runnable {

    /* compiled from: AbstractCatchingFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    public static final class C10691a<V, X extends Throwable> extends AbstractRunnableC37528a<V, X, InterfaceC37569v<? super X, ? extends V>, D0<? extends V>> {
    }

    /* compiled from: AbstractCatchingFuture.java */
    /* renamed from: com.google.common.util.concurrent.a$b */
    public static final class b<V, X extends Throwable> extends AbstractRunnableC37528a<V, X, InterfaceC37276u<? super X, ? extends V>, V> {
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final void c() {
        k(null);
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    @I41.a
    public final String l() {
        String strL = super.l();
        if (strL != null) {
            return androidx.appcompat.app.r.q("", strL);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
