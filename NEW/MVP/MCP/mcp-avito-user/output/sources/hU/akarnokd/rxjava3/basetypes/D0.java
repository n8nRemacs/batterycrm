package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsFlatMapSignal.java */
/* loaded from: classes8.dex */
final class D0<T, R> extends AbstractC41069k0<R> {

    /* compiled from: PerhapsFlatMapSignal.java */
    public static final class a<T, R> extends o41.f<R> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = 1417117475410404413L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T, R>.C11289a f397568d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397569e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f397570f;

        /* compiled from: PerhapsFlatMapSignal.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.D0$a$a, reason: collision with other inner class name */
        public final class C11289a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<R> {
            private static final long serialVersionUID = -7349825169192389387L;

            public C11289a() {
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

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                a.this.f419377c = r12;
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397568d = new C11289a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397569e, eVar)) {
                this.f397569e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397569e.cancel();
            SubscriptionHelper.a(this.f397568d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397570f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f419376b.onError(th3);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397570f = true;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f419376b.onError(th2);
            }
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super R> dVar) {
        new a(dVar);
        throw null;
    }
}
