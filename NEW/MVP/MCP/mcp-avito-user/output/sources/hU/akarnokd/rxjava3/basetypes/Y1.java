package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SoloTimeout.java */
/* loaded from: classes8.dex */
final class Y1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloTimeout.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -2613153829201889588L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397667d;

        /* renamed from: e, reason: collision with root package name */
        public final a<T>.b f397668e;

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11298a f397669f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f397670g;

        /* compiled from: SoloTimeout.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.Y1$a$a, reason: collision with other inner class name */
        public final class C11298a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = -1360947483517311225L;

            /* renamed from: b, reason: collision with root package name */
            public T f397671b;

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397671b = null;
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                this.f397671b = t12;
            }
        }

        /* compiled from: SoloTimeout.java */
        public final class b extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -8725214806550415150L;

            /* renamed from: b, reason: collision with root package name */
            public boolean f397672b;

            public b() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f397672b) {
                    return;
                }
                this.f397672b = true;
                a.this.n();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f397672b) {
                    C47998a.b(th2);
                    return;
                }
                this.f397672b = true;
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f397667d);
                if (aVar.f397670g.compareAndSet(false, true)) {
                    aVar.f419376b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                if (this.f397672b) {
                    return;
                }
                this.f397672b = true;
                get().cancel();
                a.this.n();
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397667d = new AtomicReference<>();
            this.f397670g = new AtomicBoolean();
            this.f397668e = new b();
            this.f397669f = null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f397667d, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397667d);
            SubscriptionHelper.a(this.f397668e);
            a<T>.C11298a c11298a = this.f397669f;
            if (c11298a != null) {
                SubscriptionHelper.a(c11298a);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f397668e);
            if (this.f397670g.compareAndSet(false, true)) {
                l(this.f419377c);
            }
        }

        public final void n() {
            SubscriptionHelper.a(this.f397667d);
            if (this.f397670g.compareAndSet(false, true)) {
                this.f419376b.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f397668e);
            if (this.f397670g.compareAndSet(false, true)) {
                this.f419376b.onError(th2);
            } else {
                C47998a.b(th2);
            }
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
