package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SoloFromSingle.java */
/* loaded from: classes8.dex */
final class G1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloFromSingle.java */
    public static final class a<T> extends o41.f<T> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = 1184208074074285424L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397578d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397578d, dVar)) {
                this.f397578d = dVar;
                this.f419376b.K(this);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397578d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
