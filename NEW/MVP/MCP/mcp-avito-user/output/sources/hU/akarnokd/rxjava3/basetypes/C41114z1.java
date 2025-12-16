package hu.akarnokd.rxjava3.basetypes;

/* compiled from: SoloFilter.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41114z1<T> extends AbstractC41069k0<T> {

    /* compiled from: SoloFilter.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.z1$a */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(null);
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
            if (this.qs.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
