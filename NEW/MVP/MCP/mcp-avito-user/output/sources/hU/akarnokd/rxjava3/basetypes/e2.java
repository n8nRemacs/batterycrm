package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: SoloUsing.java */
/* loaded from: classes8.dex */
final class e2<T, R> extends AbstractC41073l1<T> {

    /* compiled from: SoloUsing.java */
    public static final class a<T, R> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 5500674592438910341L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397707d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397707d, eVar)) {
                this.f397707d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 == null) {
                this.f419376b.e();
            } else {
                l(t12);
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
