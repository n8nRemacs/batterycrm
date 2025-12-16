package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ConsumerSingleObserver.java */
/* loaded from: classes8.dex */
public final class m<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements L<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: b, reason: collision with root package name */
    public final l41.g<? super T> f402116b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super Throwable> f402117c;

    public m(l41.g<? super T> gVar, l41.g<? super Throwable> gVar2) {
        this.f402116b = gVar;
        this.f402117c = gVar2;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        lazySet(DisposableHelper.f401986b);
        try {
            this.f402117c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        lazySet(DisposableHelper.f401986b);
        try {
            this.f402116b.accept(t12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }
}
