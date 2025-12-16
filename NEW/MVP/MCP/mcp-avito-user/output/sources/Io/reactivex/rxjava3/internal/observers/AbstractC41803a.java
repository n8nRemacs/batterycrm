package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: AbstractDisposableAutoRelease.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC41803a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = 8924480688481408726L;

    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
        throw null;
    }

    public final void e() {
        io.reactivex.rxjava3.disposables.d dVar = get();
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar == disposableHelper) {
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return DisposableHelper.b(get());
    }

    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.disposables.d dVar = get();
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar == disposableHelper) {
            C47998a.b(th2);
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
            throw null;
        }
    }
}
