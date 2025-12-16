package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleMapOptional.java */
/* loaded from: classes8.dex */
public final class H<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* compiled from: SingleMapOptional.java */
    public static final class a<T, R> implements L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402030b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402030b, dVar)) {
                this.f402030b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f402030b;
            this.f402030b = DisposableHelper.f401986b;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402030b.getF318621e();
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
