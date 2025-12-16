package com.google.common.util.concurrent;

import aZ0.InterfaceC19845a;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractFutureC37557o0<V> extends com.google.common.collect.S0 implements Future<V> {

    /* compiled from: ForwardingFuture.java */
    /* renamed from: com.google.common.util.concurrent.o0$a */
    public static abstract class a<V> extends AbstractFutureC37557o0<V> {
        @Override // com.google.common.util.concurrent.AbstractFutureC37557o0, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.util.concurrent.AbstractFutureC37557o0
        /* renamed from: Y */
        public final Future<V> X() {
            return null;
        }
    }

    @Override // com.google.common.collect.S0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> X();

    @InterfaceC19845a
    public boolean cancel(boolean z12) {
        return X().cancel(z12);
    }

    @Override // java.util.concurrent.Future
    @InterfaceC19845a
    @T0
    public final V get() {
        return X().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return X().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return X().isDone();
    }

    @Override // java.util.concurrent.Future
    @InterfaceC19845a
    @T0
    public final V get(long j12, TimeUnit timeUnit) {
        return X().get(j12, timeUnit);
    }
}
