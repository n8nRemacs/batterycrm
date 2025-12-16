package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableRequestSample.java */
/* loaded from: classes8.dex */
final class G<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableRequestSample.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397925b;

        /* renamed from: i, reason: collision with root package name */
        public long f397932i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f397933j;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f397926c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f397927d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397928e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public final C11321a f397929f = new C11321a(this);

        /* renamed from: h, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397931h = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f397930g = new AtomicInteger();

        /* compiled from: FlowableRequestSample.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.G$a$a, reason: collision with other inner class name */
        public static final class C11321a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
            private static final long serialVersionUID = -9069889200779269650L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f397934b;

            public C11321a(a<?> aVar) {
                this.f397934b = aVar;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a<?> aVar = this.f397934b;
                SubscriptionHelper.a(aVar.f397928e);
                io.reactivex.rxjava3.internal.util.i.b(aVar.f397925b, aVar.f397930g, aVar.f397931h);
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f397934b;
                SubscriptionHelper.a(aVar.f397928e);
                io.reactivex.rxjava3.internal.util.i.d(aVar.f397925b, th2, aVar.f397930g, aVar.f397931h);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                a<?> aVar = this.f397934b;
                SubscriptionHelper.b(aVar.f397928e, aVar.f397927d, 1L);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397925b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f397928e, this.f397927d, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f397928e);
            C11321a c11321a = this.f397929f;
            c11321a.getClass();
            SubscriptionHelper.a(c11321a);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397933j) {
                return;
            }
            this.f397933j = true;
            C11321a c11321a = this.f397929f;
            c11321a.getClass();
            SubscriptionHelper.a(c11321a);
            io.reactivex.rxjava3.internal.util.i.b(this.f397925b, this.f397930g, this.f397931h);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397933j) {
                C47998a.b(th2);
                return;
            }
            this.f397933j = true;
            C11321a c11321a = this.f397929f;
            c11321a.getClass();
            SubscriptionHelper.a(c11321a);
            io.reactivex.rxjava3.internal.util.i.d(this.f397925b, th2, this.f397930g, this.f397931h);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397933j) {
                return;
            }
            long j12 = this.f397932i;
            long j13 = this.f397926c.get();
            AtomicInteger atomicInteger = this.f397930g;
            io.reactivex.rxjava3.internal.util.b bVar = this.f397931h;
            InterfaceC41782o interfaceC41782o = this.f397925b;
            if (j13 != j12) {
                this.f397932i = j12 + 1;
                io.reactivex.rxjava3.internal.util.i.f(interfaceC41782o, t12, atomicInteger, bVar);
            } else {
                this.f397933j = true;
                cancel();
                io.reactivex.rxjava3.internal.util.i.d(interfaceC41782o, new MissingBackpressureException("Downstream is not ready to receive the next upstream item."), atomicInteger, bVar);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f397926c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
