package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeFilter.java */
/* loaded from: classes8.dex */
public final class A<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f403125c;

    /* compiled from: MaybeFilter.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403126b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f403127c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403128d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, l41.r<? super T> rVar) {
            this.f403126b = tVar;
            this.f403127c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403128d, dVar)) {
                this.f403128d = dVar;
                this.f403126b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403128d;
            this.f403128d = DisposableHelper.f401986b;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403126b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403128d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403126b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403126b;
            try {
                if (this.f403127c.test(t12)) {
                    tVar.onSuccess(t12);
                } else {
                    tVar.e();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                tVar.onError(th2);
            }
        }
    }

    public A(io.reactivex.rxjava3.core.q qVar, l41.r rVar) {
        super(qVar);
        this.f403125c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403125c));
    }
}
