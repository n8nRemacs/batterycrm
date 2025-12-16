package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableIgnoreElements.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41983r0<T> extends AbstractC41932a<T, T> {
    public C41983r0() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }

    /* compiled from: ObservableIgnoreElements.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.r0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404258b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404259c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404258b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404259c = dVar;
            this.f404258b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404259c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404258b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404259c.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404258b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
        }
    }
}
