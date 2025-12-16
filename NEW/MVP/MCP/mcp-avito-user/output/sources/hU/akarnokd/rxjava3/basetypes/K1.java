package hu.akarnokd.rxjava3.basetypes;

/* compiled from: SoloMap.java */
/* loaded from: classes8.dex */
final class K1<T, R> extends AbstractC41073l1<R> {

    /* compiled from: SoloMap.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.b<T, R> {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404777e) {
                return;
            }
            if (this.f404778f != 0) {
                this.f404774b.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        public final R poll() {
            if (this.qs.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }
}
