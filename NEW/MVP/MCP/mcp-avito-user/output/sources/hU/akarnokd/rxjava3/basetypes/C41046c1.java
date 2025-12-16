package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsTimeout.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41046c1<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsTimeout.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.c1$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -2613153829201889588L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397688d;

        /* renamed from: e, reason: collision with root package name */
        public final a<T>.b f397689e;

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11301a f397690f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f397691g;

        /* compiled from: PerhapsTimeout.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.c1$a$a, reason: collision with other inner class name */
        public final class C11301a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = -1360947483517311225L;

            /* renamed from: b, reason: collision with root package name */
            public T f397692b;

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                T t12 = this.f397692b;
                this.f397692b = null;
                t12.getClass();
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                this.f397692b = t12;
            }
        }

        /* compiled from: PerhapsTimeout.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.c1$a$b */
        public final class b extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -8725214806550415150L;

            /* renamed from: b, reason: collision with root package name */
            public boolean f397693b;

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
                if (this.f397693b) {
                    return;
                }
                this.f397693b = true;
                a.this.n();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f397693b) {
                    C47998a.b(th2);
                    return;
                }
                this.f397693b = true;
                a aVar = a.this;
                if (!aVar.f397691g.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    SubscriptionHelper.a(aVar.f397688d);
                    aVar.f419376b.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                if (this.f397693b) {
                    return;
                }
                this.f397693b = true;
                get().cancel();
                a.this.n();
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397688d = new AtomicReference<>();
            this.f397691g = new AtomicBoolean();
            this.f397689e = new b();
            this.f397690f = null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f397688d, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397688d);
            SubscriptionHelper.a(this.f397689e);
            a<T>.C11301a c11301a = this.f397690f;
            if (c11301a != null) {
                SubscriptionHelper.a(c11301a);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397691g.compareAndSet(false, true)) {
                SubscriptionHelper.a(this.f397689e);
                T t12 = this.f419377c;
                if (t12 != null) {
                    l(t12);
                } else {
                    this.f419376b.e();
                }
            }
        }

        public final void n() {
            SubscriptionHelper.a(this.f397688d);
            if (this.f397691g.compareAndSet(false, true)) {
                this.f419376b.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f397691g.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                SubscriptionHelper.a(this.f397689e);
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
