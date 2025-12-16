package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsTakeUntil.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41043b1<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsTakeUntil.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.b1$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 8414575379623209938L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f397680d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397681e;

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11300a f397682f;

        /* compiled from: PerhapsTakeUntil.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.b1$a$a, reason: collision with other inner class name */
        public final class C11300a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = 8999579172944042558L;

            public C11300a() {
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
                if (aVar.f397680d.compareAndSet(false, true)) {
                    SubscriptionHelper.a(aVar.f397681e);
                    aVar.f419376b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                if (!aVar.f397680d.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    SubscriptionHelper.a(aVar.f397681e);
                    aVar.f419376b.onError(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                get().cancel();
                a aVar = a.this;
                if (aVar.f397680d.compareAndSet(false, true)) {
                    SubscriptionHelper.a(aVar.f397681e);
                    aVar.f419376b.e();
                }
            }
        }

        public a(org.reactivestreams.d<? super T> dVar) {
            super(dVar);
            this.f397682f = new C11300a();
            this.f397681e = new AtomicReference<>();
            this.f397680d = new AtomicBoolean();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f397681e, eVar)) {
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397681e);
            SubscriptionHelper.a(this.f397682f);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            AtomicBoolean atomicBoolean = this.f397680d;
            if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                return;
            }
            SubscriptionHelper.a(this.f397682f);
            this.f419376b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f397680d.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                SubscriptionHelper.a(this.f397682f);
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397680d.compareAndSet(false, true)) {
                SubscriptionHelper.a(this.f397682f);
                l(t12);
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a(dVar));
        throw null;
    }
}
