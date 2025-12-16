package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeFilterSingle.java */
/* loaded from: classes8.dex */
public final class B<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f403129b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f403130c;

    /* compiled from: MaybeFilterSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403131b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f403132c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403133d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, l41.r<? super T> rVar) {
            this.f403131b = tVar;
            this.f403132c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403133d, dVar)) {
                this.f403133d = dVar;
                this.f403131b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403133d;
            this.f403133d = DisposableHelper.f401986b;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403133d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f403131b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403131b;
            try {
                if (this.f403132c.test(t12)) {
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

    public B(io.reactivex.rxjava3.core.I i12, l41.r rVar) {
        this.f403129b = i12;
        this.f403130c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403129b.a(new a(tVar, this.f403130c));
    }
}
