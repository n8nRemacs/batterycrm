package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingBaseObserver.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41808f<T> extends CountDownLatch implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public T f402102b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f402103c;

    /* renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f402104d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f402105e;

    public AbstractC41808f() {
        super(1);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        this.f402104d = dVar;
        if (this.f402105e) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f402105e = true;
        io.reactivex.rxjava3.disposables.d dVar = this.f402104d;
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f402105e;
    }
}
