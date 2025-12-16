package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableEmpty.java */
/* loaded from: classes8.dex */
public final class U extends io.reactivex.rxjava3.core.z<Object> implements q41.e<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final U f403867b = new U();

    @Override // l41.s
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Object> g12) {
        EmptyDisposable.a(g12);
    }
}
