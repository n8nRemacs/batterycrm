package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import l41.InterfaceC43544b;

/* compiled from: MaybeDoOnEvent.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41925t<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43544b<? super T, ? super Throwable> f403322c;

    /* compiled from: MaybeDoOnEvent.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.t$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403323b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC43544b<? super T, ? super Throwable> f403324c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403325d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, InterfaceC43544b<? super T, ? super Throwable> interfaceC43544b) {
            this.f403323b = tVar;
            this.f403324c = interfaceC43544b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403325d, dVar)) {
                this.f403325d = dVar;
                this.f403323b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403325d.dispose();
            this.f403325d = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403323b;
            this.f403325d = DisposableHelper.f401986b;
            try {
                this.f403324c.accept(null, null);
                tVar.e();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403325d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403325d = DisposableHelper.f401986b;
            try {
                this.f403324c.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f403323b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403323b;
            this.f403325d = DisposableHelper.f401986b;
            try {
                this.f403324c.accept(t12, null);
                tVar.onSuccess(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }
    }

    public C41925t(io.reactivex.rxjava3.core.q qVar, InterfaceC43544b interfaceC43544b) {
        super(qVar);
        this.f403322c = interfaceC43544b;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403322c));
    }
}
