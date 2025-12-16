package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleDematerialize.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42013k<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* compiled from: SingleDematerialize.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.k$a */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404606b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404606b, dVar)) {
                this.f404606b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404606b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404606b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        throw null;
    }
}
