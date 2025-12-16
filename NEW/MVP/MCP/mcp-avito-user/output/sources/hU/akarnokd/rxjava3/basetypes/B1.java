package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloFlatMapPublisher.java */
/* loaded from: classes8.dex */
final class B1<T, R> extends AbstractC41777j<R> {
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }

    /* compiled from: SoloFlatMapPublisher.java */
    public static final class a<T, R> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3958458353930920644L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397551b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, R>.C11286a f397552c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397553d;

        /* compiled from: SoloFlatMapPublisher.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.B1$a$a, reason: collision with other inner class name */
        public final class C11286a extends AtomicLong implements org.reactivestreams.d<R> {
            private static final long serialVersionUID = 2003600104149898338L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f397554b;

            public C11286a(InterfaceC41782o interfaceC41782o) {
                this.f397554b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                a aVar = a.this;
                SubscriptionHelper.c(aVar, aVar.f397552c, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397554b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f397554b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f397554b.onNext(r12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397551b = interfaceC41782o;
            this.f397552c = new C11286a(interfaceC41782o);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397553d, eVar)) {
                this.f397553d = eVar;
                this.f397551b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397553d.cancel();
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397551b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397551b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, this.f397552c, j12);
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
