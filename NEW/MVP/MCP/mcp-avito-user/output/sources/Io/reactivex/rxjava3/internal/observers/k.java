package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingObserver.java */
/* loaded from: classes8.dex */
public final class k<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f402112c = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f402113b;

    public k(LinkedBlockingQueue linkedBlockingQueue) {
        this.f402113b = linkedBlockingQueue;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (DisposableHelper.a(this)) {
            this.f402113b.offer(f402112c);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        this.f402113b.offer(NotificationLite.f404825b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        this.f402113b.offer(NotificationLite.e(th2));
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        this.f402113b.offer(t12);
    }
}
