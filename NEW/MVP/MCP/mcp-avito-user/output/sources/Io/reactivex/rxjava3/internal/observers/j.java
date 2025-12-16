package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingMultiObserver.java */
/* loaded from: classes8.dex */
public final class j<T> extends CountDownLatch implements L<T>, InterfaceC41771d, io.reactivex.rxjava3.core.t<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f402108b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f402109c;

    /* renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f402110d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f402111e;

    public j() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e12) {
                this.f402111e = true;
                io.reactivex.rxjava3.disposables.d dVar = this.f402110d;
                if (dVar != null) {
                    dVar.dispose();
                }
                throw io.reactivex.rxjava3.internal.util.h.f(e12);
            }
        }
        Throwable th2 = this.f402109c;
        if (th2 == null) {
            return this.f402108b;
        }
        throw io.reactivex.rxjava3.internal.util.h.f(th2);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        this.f402110d = dVar;
        if (this.f402111e) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        this.f402109c = th2;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        this.f402108b = t12;
        countDown();
    }
}
