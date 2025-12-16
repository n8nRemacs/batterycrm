package io.reactivex.rxjava3.internal.observers;

import s41.C47998a;

/* compiled from: SafeMaybeObserver.java */
/* loaded from: classes8.dex */
public final class F<T> implements io.reactivex.rxjava3.core.t<T> {
    @Override // io.reactivex.rxjava3.core.t
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.dispose();
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(@j41.e Throwable th2) {
        C47998a.b(th2);
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(@j41.e T t12) {
    }
}
