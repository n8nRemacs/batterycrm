package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: DisposableLambdaObserver.java */
/* loaded from: classes8.dex */
public final class r<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.G<? super T> f402121b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super io.reactivex.rxjava3.disposables.d> f402122c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43543a f402123d;

    /* renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f402124e;

    public r(io.reactivex.rxjava3.core.G<? super T> g12, l41.g<? super io.reactivex.rxjava3.disposables.d> gVar, InterfaceC43543a interfaceC43543a) {
        this.f402121b = g12;
        this.f402122c = gVar;
        this.f402123d = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.core.G<? super T> g12 = this.f402121b;
        try {
            this.f402122c.accept(dVar);
            if (DisposableHelper.f(this.f402124e, dVar)) {
                this.f402124e = dVar;
                g12.b(this);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.dispose();
            this.f402124e = DisposableHelper.f401986b;
            EmptyDisposable.d(th2, g12);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        io.reactivex.rxjava3.disposables.d dVar = this.f402124e;
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar != disposableHelper) {
            this.f402124e = disposableHelper;
            try {
                this.f402123d.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        io.reactivex.rxjava3.disposables.d dVar = this.f402124e;
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar != disposableHelper) {
            this.f402124e = disposableHelper;
            this.f402121b.e();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f402124e.getF318621e();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.disposables.d dVar = this.f402124e;
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar == disposableHelper) {
            C47998a.b(th2);
        } else {
            this.f402124e = disposableHelper;
            this.f402121b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        this.f402121b.onNext(t12);
    }
}
