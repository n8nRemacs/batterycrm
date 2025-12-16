package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: SoloHide.java */
/* loaded from: classes8.dex */
final class H1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloHide.java */
    public static final class a<T> implements org.reactivestreams.d<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f397579b;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397579b, eVar)) {
                this.f397579b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397579b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f397579b.request(j12);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
