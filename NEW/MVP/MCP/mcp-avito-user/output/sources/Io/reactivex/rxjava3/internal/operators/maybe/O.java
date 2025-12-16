package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44193j;

/* compiled from: MaybeFromSingle.java */
/* loaded from: classes8.dex */
public final class O<T> extends io.reactivex.rxjava3.core.q<T> implements InterfaceC44193j<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f403169b;

    /* compiled from: MaybeFromSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403170b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403171c;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403170b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403171c, dVar)) {
                this.f403171c = dVar;
                this.f403170b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403171c.dispose();
            this.f403171c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403171c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f403171c = DisposableHelper.f401986b;
            this.f403170b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f403171c = DisposableHelper.f401986b;
            this.f403170b.onSuccess(t12);
        }
    }

    public O(io.reactivex.rxjava3.core.I i12) {
        this.f403169b = i12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403169b.a(new a(tVar));
    }
}
