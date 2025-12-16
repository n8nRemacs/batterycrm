package io.reactivex.rxjava3.internal.operators.observable;

import n41.C44185b;
import s41.C47998a;

/* compiled from: ObservableFromRunnable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41963k0<T> extends io.reactivex.rxjava3.core.z<T> implements l41.s<T> {
    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        C44185b c44185b = new C44185b();
        g12.b(c44185b);
        if (c44185b.f414901b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (c44185b.f414901b) {
                C47998a.b(th2);
            } else {
                g12.onError(th2);
            }
        }
    }
}
