package io.reactivex.rxjava3.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureDisposable.java */
/* loaded from: classes8.dex */
final class f extends AtomicReference<Future<?>> implements d {
    private static final long serialVersionUID = 6545242830671168775L;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401979b;

    public f(Future future) {
        super(future);
        this.f401979b = true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f401979b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
