package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeDematerialize.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41922p<T, R> extends AbstractC41907a<T, R> {

    /* compiled from: MaybeDematerialize.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.p$a */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super R> f403299b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403300c;

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403299b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403300c, dVar)) {
                this.f403300c = dVar;
                this.f403299b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403300c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403299b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403300c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403299b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403299b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
