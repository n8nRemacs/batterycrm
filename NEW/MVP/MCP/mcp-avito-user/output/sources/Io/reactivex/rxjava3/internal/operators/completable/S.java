package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.C41951g0;

/* compiled from: CompletableToObservable.java */
/* loaded from: classes8.dex */
public final class S<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402206b;

    public S(AbstractC41768a abstractC41768a) {
        this.f402206b = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f402206b.a(new C41951g0.a(g12));
    }
}
