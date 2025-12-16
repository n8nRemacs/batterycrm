package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleTimeInterval.java */
/* loaded from: classes8.dex */
public final class Y<T> extends io.reactivex.rxjava3.core.I<io.reactivex.rxjava3.schedulers.d<T>> {

    /* compiled from: SingleTimeInterval.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404542b;

        @Override // io.reactivex.rxjava3.core.L
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404542b, dVar)) {
                this.f404542b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404542b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404542b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(@j41.e Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(@j41.e T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(@j41.e io.reactivex.rxjava3.core.L<? super io.reactivex.rxjava3.schedulers.d<T>> l12) {
        throw null;
    }
}
