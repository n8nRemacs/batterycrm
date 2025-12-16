package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableLastMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42000y0<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: ObservableLastMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.y0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404410b;

        /* renamed from: c, reason: collision with root package name */
        public T f404411c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404410b, dVar)) {
                this.f404410b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404410b.dispose();
            this.f404410b = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404410b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404410b == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404410b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404411c = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        throw null;
    }
}
