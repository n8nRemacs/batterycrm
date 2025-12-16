package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: MaybeCallbackObserver.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41910d<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: b, reason: collision with root package name */
    public final l41.g<? super T> f403203b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super Throwable> f403204c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43543a f403205d;

    public C41910d(l41.g<? super T> gVar, l41.g<? super Throwable> gVar2, InterfaceC43543a interfaceC43543a) {
        this.f403203b = gVar;
        this.f403204c = gVar2;
        this.f403205d = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        lazySet(DisposableHelper.f401986b);
        try {
            this.f403205d.run();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return DisposableHelper.b(get());
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(Throwable th2) {
        lazySet(DisposableHelper.f401986b);
        try {
            this.f403204c.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(T t12) {
        lazySet(DisposableHelper.f401986b);
        try {
            this.f403203b.accept(t12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }
}
