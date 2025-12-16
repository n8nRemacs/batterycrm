package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47199b;

/* compiled from: InnerQueuedObserver.java */
/* loaded from: classes8.dex */
public final class w<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: b, reason: collision with root package name */
    public q41.g<T> f402131b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f402132c;

    /* renamed from: d, reason: collision with root package name */
    public int f402133d;

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.e(this, dVar)) {
            if (dVar instanceof InterfaceC47199b) {
                InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                int iV2 = interfaceC47199b.v(3);
                if (iV2 == 1) {
                    this.f402133d = iV2;
                    this.f402131b = interfaceC47199b;
                    this.f402132c = true;
                    throw null;
                }
                if (iV2 == 2) {
                    this.f402133d = iV2;
                    this.f402131b = interfaceC47199b;
                    return;
                }
            }
            this.f402131b = new q41.h(0);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return DisposableHelper.b(get());
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        if (this.f402133d != 0) {
            throw null;
        }
        throw null;
    }
}
