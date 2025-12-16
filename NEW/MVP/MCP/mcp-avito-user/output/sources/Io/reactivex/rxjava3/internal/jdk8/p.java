package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeMapOptional.java */
/* loaded from: classes8.dex */
public final class p<T, R> extends io.reactivex.rxjava3.core.q<R> {

    /* compiled from: MaybeMapOptional.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402074b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402074b, dVar)) {
                this.f402074b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f402074b;
            this.f402074b = DisposableHelper.f401986b;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402074b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        throw null;
    }
}
