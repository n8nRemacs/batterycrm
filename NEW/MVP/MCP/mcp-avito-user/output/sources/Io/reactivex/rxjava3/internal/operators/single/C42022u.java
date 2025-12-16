package io.reactivex.rxjava3.internal.operators.single;

/* compiled from: SingleDoOnSuccess.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42022u<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404642b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super T> f404643c;

    /* compiled from: SingleDoOnSuccess.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.u$a */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404644b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404644b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404644b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404644b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404644b;
            try {
                C42022u.this.f404643c.accept(t12);
                l12.onSuccess(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                l12.onError(th2);
            }
        }
    }

    public C42022u(io.reactivex.rxjava3.core.I i12, l41.g gVar) {
        this.f404642b = i12;
        this.f404643c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404642b.a(new a(l12));
    }
}
