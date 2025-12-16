package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.operators.observable.C41943d1;

/* compiled from: ObservableJust.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41998x0<T> extends io.reactivex.rxjava3.core.z<T> implements q41.e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f404401b;

    public C41998x0(T t12) {
        this.f404401b = t12;
    }

    @Override // l41.s
    public final T get() {
        return this.f404401b;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        C41943d1.a aVar = new C41943d1.a(g12, this.f404401b);
        g12.b(aVar);
        aVar.run();
    }
}
