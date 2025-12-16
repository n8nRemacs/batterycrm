package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: CompletableOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class J<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: CompletableOnErrorReturn.java */
    public static final class a<T> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402165b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402165b, dVar)) {
                this.f402165b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402165b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402165b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        throw null;
    }
}
