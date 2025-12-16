package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingFluentFuture.java */
@InterfaceC37531b0
@XY0.b
/* renamed from: com.google.common.util.concurrent.n0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37555n0<V> extends AbstractC37545i0<V> {

    /* renamed from: j, reason: collision with root package name */
    public final D0<V> f360626j;

    public C37555n0(D0<V> d02) {
        d02.getClass();
        this.f360626j = d02;
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, com.google.common.util.concurrent.D0
    public final void N(Runnable runnable, Executor executor) {
        this.f360626j.N(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        return this.f360626j.cancel(z12);
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    @T0
    public final V get() {
        return this.f360626j.get();
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f360626j.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f360626j.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c
    public final String toString() {
        return this.f360626j.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    @T0
    public final V get(long j12, TimeUnit timeUnit) {
        return this.f360626j.get(j12, timeUnit);
    }
}
