package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableWindowSubscribeIntercept.java */
/* loaded from: classes8.dex */
final class N1<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.subjects.j f403753b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f403754c = new AtomicBoolean();

    public N1(io.reactivex.rxjava3.subjects.j jVar) {
        this.f403753b = jVar;
    }

    public final boolean M0() {
        AtomicBoolean atomicBoolean = this.f403754c;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403753b.c(g12);
        this.f403754c.set(true);
    }
}
