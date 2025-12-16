package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloDelaySubscription.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41099u1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloDelaySubscription.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.u1$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 2365899367123544974L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11315a f397785d;

        /* compiled from: SoloDelaySubscription.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.u1$a$a, reason: collision with other inner class name */
        public final class C11315a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -4157815870217815859L;

            /* renamed from: b, reason: collision with root package name */
            public boolean f397786b;

            public C11315a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f397786b) {
                    return;
                }
                this.f397786b = true;
                a.this.getClass();
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a.this.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                if (this.f397786b) {
                    return;
                }
                this.f397786b = true;
                get().cancel();
                a.this.getClass();
                throw null;
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397785d = new C11315a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(this.f397785d, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 == null) {
                this.f419376b.e();
            } else {
                l(t12);
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

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
