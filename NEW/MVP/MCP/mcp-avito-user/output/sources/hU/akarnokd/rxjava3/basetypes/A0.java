package hu.akarnokd.rxjava3.basetypes;

/* compiled from: PerhapsFilter.java */
/* loaded from: classes8.dex */
final class A0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsFilter.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404778f != 0) {
                this.f404774b.onNext(t12);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        public final T poll() {
            T t12 = (T) this.qs.poll();
            if (t12 == null) {
                return t12;
            }
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
