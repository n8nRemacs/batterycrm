package hu.akarnokd.rxjava3.debug;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeOnAssembly.java */
/* loaded from: classes8.dex */
final class h<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f397830b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397831c = new RxJavaAssemblyException();

    /* compiled from: MaybeOnAssembly.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f397832b;

        /* renamed from: c, reason: collision with root package name */
        public final RxJavaAssemblyException f397833c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397834d;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, RxJavaAssemblyException rxJavaAssemblyException) {
            this.f397832b = tVar;
            this.f397833c = rxJavaAssemblyException;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397834d, dVar)) {
                this.f397834d = dVar;
                this.f397832b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397834d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f397832b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397834d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f397833c.a(th2);
            this.f397832b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f397832b.onSuccess(t12);
        }
    }

    public h(io.reactivex.rxjava3.core.q qVar) {
        this.f397830b = qVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f397830b.a(new a(tVar, this.f397831c));
    }
}
