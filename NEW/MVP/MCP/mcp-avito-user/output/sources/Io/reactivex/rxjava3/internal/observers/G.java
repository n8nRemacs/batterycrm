package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.L;
import s41.C47998a;

/* compiled from: SafeSingleObserver.java */
/* loaded from: classes8.dex */
public final class G<T> implements L<T> {
    @Override // io.reactivex.rxjava3.core.L
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.dispose();
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(@j41.e Throwable th2) {
        C47998a.b(th2);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(@j41.e T t12) {
    }
}
