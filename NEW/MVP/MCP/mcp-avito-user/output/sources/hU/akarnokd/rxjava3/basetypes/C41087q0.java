package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: PerhapsDefaultIfEmpty.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41087q0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsDefaultIfEmpty.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.q0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 4223622176096519295L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397757d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397757d, eVar)) {
                this.f397757d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 != null) {
                l(t12);
            } else {
                l(null);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
