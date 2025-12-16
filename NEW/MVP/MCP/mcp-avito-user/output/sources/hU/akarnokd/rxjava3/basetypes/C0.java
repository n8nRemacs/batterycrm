package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PerhapsFlatMapPublisher.java */
/* loaded from: classes8.dex */
final class C0<T, R> extends AbstractC41777j<R> {

    /* compiled from: PerhapsFlatMapPublisher.java */
    public static final class a<T, R> extends AtomicLong implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 1417117475410404413L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397556b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, R>.C11287a f397557c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397558d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f397559e;

        /* compiled from: PerhapsFlatMapPublisher.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.C0$a$a, reason: collision with other inner class name */
        public final class C11287a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<R> {
            private static final long serialVersionUID = -7407027791505806997L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f397560b;

            public C11287a(InterfaceC41782o interfaceC41782o) {
                this.f397560b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this, a.this, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397560b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f397560b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f397560b.onNext(r12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397556b = interfaceC41782o;
            this.f397557c = new C11287a(interfaceC41782o);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397558d, eVar)) {
                this.f397558d = eVar;
                this.f397556b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397558d.cancel();
            SubscriptionHelper.a(this.f397557c);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397559e) {
                return;
            }
            this.f397556b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397556b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397559e = true;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397556b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f397557c, this, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
