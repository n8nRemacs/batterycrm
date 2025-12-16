package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SerialDisposable.java */
/* loaded from: classes8.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<d> f401980b;

    public i() {
        this.f401980b = new AtomicReference<>();
    }

    public final void a(@j41.f d dVar) {
        DisposableHelper.d(this.f401980b, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this.f401980b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return DisposableHelper.b(this.f401980b.get());
    }

    public i(int i12) {
        this.f401980b = new AtomicReference<>(null);
    }
}
