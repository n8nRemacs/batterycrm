package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSingle.java */
/* loaded from: classes8.dex */
public final class H<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403153b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f403154c;

    /* compiled from: MaybeFlatMapSingle.java */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4827726964688405508L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403155b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f403156c;

        public a(io.reactivex.rxjava3.core.t<? super R> tVar, l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> oVar) {
            this.f403155b = tVar;
            this.f403156c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403155b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403155b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403155b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                io.reactivex.rxjava3.core.O<? extends R> oApply = this.f403156c.apply(t12);
                Objects.requireNonNull(oApply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.O<? extends R> o12 = oApply;
                if (getF318621e()) {
                    return;
                }
                o12.a(new b(this.f403155b, this));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }
    }

    /* compiled from: MaybeFlatMapSingle.java */
    public static final class b<R> implements io.reactivex.rxjava3.core.L<R> {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403157b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403158c;

        public b(io.reactivex.rxjava3.core.t tVar, AtomicReference atomicReference) {
            this.f403157b = atomicReference;
            this.f403158c = tVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f403157b, dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f403158c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(R r12) {
            this.f403158c.onSuccess(r12);
        }
    }

    public H(io.reactivex.rxjava3.core.q qVar, l41.o oVar) {
        this.f403153b = qVar;
        this.f403154c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403153b.a(new a(tVar, this.f403154c));
    }
}
