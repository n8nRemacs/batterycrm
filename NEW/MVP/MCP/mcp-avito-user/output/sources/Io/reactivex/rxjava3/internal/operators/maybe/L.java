package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44189f;

/* compiled from: MaybeFromCompletable.java */
/* loaded from: classes8.dex */
public final class L<T> extends io.reactivex.rxjava3.core.q<T> implements InterfaceC44189f {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f403165b;

    /* compiled from: MaybeFromCompletable.java */
    public static final class a<T> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403166b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403167c;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403166b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403167c, dVar)) {
                this.f403167c = dVar;
                this.f403166b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403167c.dispose();
            this.f403167c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f403167c = DisposableHelper.f401986b;
            this.f403166b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403167c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f403167c = DisposableHelper.f401986b;
            this.f403166b.onError(th2);
        }
    }

    public L(AbstractC41768a abstractC41768a) {
        this.f403165b = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403165b.a(new a(tVar));
    }
}
