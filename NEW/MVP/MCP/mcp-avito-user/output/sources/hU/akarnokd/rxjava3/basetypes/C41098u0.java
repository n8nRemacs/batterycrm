package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsDelaySubscription.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41098u0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsDelaySubscription.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.u0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<Object> {
        private static final long serialVersionUID = -9119999967998769573L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11314a f397782d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397783e;

        /* compiled from: PerhapsDelaySubscription.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.u0$a$a, reason: collision with other inner class name */
        public final class C11314a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = -6651374802328276829L;

            public C11314a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                T t12 = aVar.f419377c;
                if (t12 != null) {
                    aVar.l(t12);
                } else {
                    aVar.f419376b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a.this.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                a.this.f419377c = t12;
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397782d = new C11314a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397783e, eVar)) {
                this.f397783e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397783e.cancel();
            SubscriptionHelper.a(this.f397782d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            org.reactivestreams.e eVar = this.f397783e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            this.f397783e = subscriptionHelper;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397783e == SubscriptionHelper.f404813b) {
                C47998a.b(th2);
            } else {
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            org.reactivestreams.e eVar = this.f397783e;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            eVar.cancel();
            this.f397783e = subscriptionHelper;
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
