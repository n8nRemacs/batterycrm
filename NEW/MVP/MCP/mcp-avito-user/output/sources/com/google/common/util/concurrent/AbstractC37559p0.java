package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ForwardingListenableFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37559p0<V> extends AbstractFutureC37557o0<V> implements D0<V> {

    /* compiled from: ForwardingListenableFuture.java */
    /* renamed from: com.google.common.util.concurrent.p0$a */
    public static abstract class a<V> extends AbstractC37559p0<V> {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37532c f360634b;

        public a(AbstractC37532c abstractC37532c) {
            this.f360634b = abstractC37532c;
        }

        @Override // com.google.common.util.concurrent.AbstractC37559p0, com.google.common.util.concurrent.AbstractFutureC37557o0, com.google.common.collect.S0
        public final Object X() {
            return this.f360634b;
        }

        @Override // com.google.common.util.concurrent.AbstractC37559p0, com.google.common.util.concurrent.AbstractFutureC37557o0
        /* renamed from: Y */
        public final Future X() {
            return this.f360634b;
        }

        @Override // com.google.common.util.concurrent.AbstractC37559p0
        /* renamed from: Z */
        public final D0<V> X() {
            return this.f360634b;
        }
    }

    @Override // com.google.common.util.concurrent.D0
    public final void N(Runnable runnable, Executor executor) {
        X().N(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFutureC37557o0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract D0<? extends V> X();
}
