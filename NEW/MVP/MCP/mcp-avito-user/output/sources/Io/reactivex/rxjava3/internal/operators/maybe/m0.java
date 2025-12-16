package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeTimeInterval.java */
/* loaded from: classes8.dex */
public final class m0<T> extends io.reactivex.rxjava3.core.q<io.reactivex.rxjava3.schedulers.d<T>> {

    /* compiled from: MaybeTimeInterval.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403280b;

        @Override // io.reactivex.rxjava3.core.t
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403280b, dVar)) {
                this.f403280b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403280b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403280b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(@j41.e Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(@j41.e T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(@j41.e io.reactivex.rxjava3.core.t<? super io.reactivex.rxjava3.schedulers.d<T>> tVar) {
        throw null;
    }
}
