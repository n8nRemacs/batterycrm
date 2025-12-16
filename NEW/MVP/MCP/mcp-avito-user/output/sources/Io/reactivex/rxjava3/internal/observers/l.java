package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: CallbackCompletableObserver.java */
/* loaded from: classes8.dex */
public final class l extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: b, reason: collision with root package name */
    public final l41.g<? super Throwable> f402114b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f402115c;

    public l(InterfaceC43543a interfaceC43543a, l41.g gVar) {
        this.f402114b = gVar;
        this.f402115c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        try {
            this.f402115c.run();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
        lazySet(DisposableHelper.f401986b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void onError(Throwable th2) {
        try {
            this.f402114b.accept(th2);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(th3);
        }
        lazySet(DisposableHelper.f401986b);
    }
}
