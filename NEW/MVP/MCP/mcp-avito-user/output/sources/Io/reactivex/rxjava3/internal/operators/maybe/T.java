package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44187d;

/* compiled from: MaybeIgnoreElementCompletable.java */
/* loaded from: classes8.dex */
public final class T<T> extends AbstractC41768a implements InterfaceC44187d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403176b;

    /* compiled from: MaybeIgnoreElementCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403177b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403178c;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f403177b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403178c, dVar)) {
                this.f403178c = dVar;
                this.f403177b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403178c.dispose();
            this.f403178c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403178c = DisposableHelper.f401986b;
            this.f403177b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403178c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403178c = DisposableHelper.f401986b;
            this.f403177b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403178c = DisposableHelper.f401986b;
            this.f403177b.e();
        }
    }

    public T(io.reactivex.rxjava3.core.q qVar) {
        this.f403176b = qVar;
    }

    @Override // n41.InterfaceC44187d
    public final io.reactivex.rxjava3.core.q<T> c() {
        return new S(this.f403176b);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f403176b.a(new a(interfaceC41771d));
    }
}
