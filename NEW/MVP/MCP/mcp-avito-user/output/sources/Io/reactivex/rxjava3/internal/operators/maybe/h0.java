package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSubscribeOn.java */
/* loaded from: classes8.dex */
public final class h0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403240c;

    /* compiled from: MaybeSubscribeOn.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b, reason: collision with root package name */
        public final m41.d f403241b = new m41.d();

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403242c;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403242c = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            m41.d dVar = this.f403241b;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403242c.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403242c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403242c.onSuccess(t12);
        }
    }

    /* compiled from: MaybeSubscribeOn.java */
    public static final class b<T> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403243b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.w<T> f403244c;

        public b(io.reactivex.rxjava3.core.t<? super T> tVar, io.reactivex.rxjava3.core.w<T> wVar) {
            this.f403243b = tVar;
            this.f403244c = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f403244c.a(this.f403243b);
        }
    }

    public h0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.H h12) {
        super(qVar);
        this.f403240c = h12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        a aVar = new a(tVar);
        tVar.b(aVar);
        io.reactivex.rxjava3.disposables.d dVarD = this.f403240c.d(new b(aVar, this.f403189b));
        m41.d dVar = aVar.f403241b;
        dVar.getClass();
        DisposableHelper.c(dVar, dVarD);
    }
}
