package io.reactivex.rxjava3.internal.operators.observable;

import l41.InterfaceC43543a;

/* compiled from: ObservableDoOnLifecycle.java */
/* loaded from: classes8.dex */
public final class P<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f403786c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43543a f403787d;

    public P(io.reactivex.rxjava3.core.z<T> zVar, l41.g<? super io.reactivex.rxjava3.disposables.d> gVar, InterfaceC43543a interfaceC43543a) {
        super(zVar);
        this.f403786c = gVar;
        this.f403787d = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new io.reactivex.rxjava3.internal.observers.r(g12, this.f403786c, this.f403787d));
    }
}
