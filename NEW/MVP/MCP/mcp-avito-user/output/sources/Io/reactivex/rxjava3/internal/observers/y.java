package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: LambdaObserver.java */
/* loaded from: classes8.dex */
public final class y<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b, reason: collision with root package name */
    public final l41.g<? super T> f402134b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super Throwable> f402135c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43543a f402136d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f402137e;

    public y(l41.g<? super T> gVar, l41.g<? super Throwable> gVar2, InterfaceC43543a interfaceC43543a, l41.g<? super io.reactivex.rxjava3.disposables.d> gVar3) {
        this.f402134b = gVar;
        this.f402135c = gVar2;
        this.f402136d = interfaceC43543a;
        this.f402137e = gVar3;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.e(this, dVar)) {
            try {
                this.f402137e.accept(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dVar.dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (i()) {
            return;
        }
        lazySet(DisposableHelper.f401986b);
        try {
            this.f402136d.run();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        if (i()) {
            C47998a.b(th2);
            return;
        }
        lazySet(DisposableHelper.f401986b);
        try {
            this.f402135c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        if (i()) {
            return;
        }
        try {
            this.f402134b.accept(t12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            get().dispose();
            onError(th2);
        }
    }
}
