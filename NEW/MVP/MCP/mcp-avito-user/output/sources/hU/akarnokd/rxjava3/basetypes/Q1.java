package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: SoloOnErrorReturnItem.java */
/* loaded from: classes8.dex */
final class Q1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloOnErrorReturnItem.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -7631998337002592538L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397609d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397609d, eVar)) {
                this.f397609d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397609d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            l(this.f419377c);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            l(null);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
