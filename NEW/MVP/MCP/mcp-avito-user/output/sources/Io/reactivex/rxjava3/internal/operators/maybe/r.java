package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: MaybeDoAfterSuccess.java */
/* loaded from: classes8.dex */
public final class r<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super T> f403309c;

    /* compiled from: MaybeDoAfterSuccess.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403310b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.g<? super T> f403311c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403312d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, l41.g<? super T> gVar) {
            this.f403310b = tVar;
            this.f403311c = gVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403312d, dVar)) {
                this.f403312d = dVar;
                this.f403310b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403312d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403310b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403312d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403310b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403310b.onSuccess(t12);
            try {
                this.f403311c.accept(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }

    public r(B b12, l41.g gVar) {
        super(b12);
        this.f403309c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403309c));
    }
}
