package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: PerhapsFromMaybe.java */
/* loaded from: classes8.dex */
final class I0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsFromMaybe.java */
    public static final class a<T> extends o41.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 1184208074074285424L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397582d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397582d, dVar)) {
                this.f397582d = dVar;
                this.f419376b.K(this);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397582d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f419376b.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
