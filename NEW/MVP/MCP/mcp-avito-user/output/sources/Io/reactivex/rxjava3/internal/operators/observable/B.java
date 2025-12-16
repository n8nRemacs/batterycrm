package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44188e;

/* compiled from: ObservableCountSingle.java */
/* loaded from: classes8.dex */
public final class B<T> extends io.reactivex.rxjava3.core.I<Long> implements InterfaceC44188e<Long> {

    /* compiled from: ObservableCountSingle.java */
    public static final class a implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403508b;

        /* renamed from: c, reason: collision with root package name */
        public long f403509c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403508b, dVar)) {
                this.f403508b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403508b.dispose();
            this.f403508b = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403508b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403508b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403508b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f403509c++;
        }
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<Long> d() {
        return new A(null);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Long> l12) {
        throw null;
    }
}
