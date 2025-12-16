package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingDisposableMultiObserver.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41809g<T> extends CountDownLatch implements io.reactivex.rxjava3.core.t<T>, L<T>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public T f402106b;

    /* renamed from: c, reason: collision with root package name */
    public final m41.d f402107c;

    public C41809g() {
        super(1);
        this.f402107c = new m41.d();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this.f402107c, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        m41.d dVar = this.f402107c;
        dVar.getClass();
        DisposableHelper.a(dVar);
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        this.f402107c.lazySet(EmptyDisposable.f401988b);
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f402107c.getF318621e();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(@j41.e Throwable th2) {
        this.f402107c.lazySet(EmptyDisposable.f401988b);
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(@j41.e T t12) {
        this.f402106b = t12;
        this.f402107c.lazySet(EmptyDisposable.f401988b);
        countDown();
    }
}
