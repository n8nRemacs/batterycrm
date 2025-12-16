package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchOnFirst.java */
/* loaded from: classes8.dex */
final class M<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableSwitchOnFirst.java */
    public static final class a<T> extends AtomicBoolean implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3008387388867141204L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397964b;

        /* renamed from: c, reason: collision with root package name */
        public final C11323a<T> f397965c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f397966d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f397967e;

        /* compiled from: FlowableSwitchOnFirst.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.M$a$a, reason: collision with other inner class name */
        public static final class C11323a<T> extends AtomicLong implements InterfaceC41782o<T> {
            private static final long serialVersionUID = 6866823891735850338L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f397968b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicReference<org.reactivestreams.e> f397969c = new AtomicReference<>();

            public C11323a(InterfaceC41782o interfaceC41782o) {
                this.f397968b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.c(this.f397969c, this, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                this.f397968b.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                this.f397968b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                this.f397968b.onNext(t12);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397964b = interfaceC41782o;
            this.f397965c = new C11323a<>(interfaceC41782o);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397966d, eVar)) {
                this.f397966d = eVar;
                this.f397964b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397966d.cancel();
            SubscriptionHelper.a(this.f397965c.f397969c);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397967e) {
                return;
            }
            this.f397964b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397967e) {
                C47998a.b(th2);
            } else {
                this.f397964b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            boolean z12 = this.f397967e;
            InterfaceC41782o interfaceC41782o = this.f397964b;
            if (z12) {
                return;
            }
            this.f397967e = true;
            try {
                throw null;
            } catch (Throwable th2) {
                this.f397966d.cancel();
                interfaceC41782o.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (compareAndSet(false, true)) {
                j12--;
                this.f397966d.request(1L);
                if (j12 == 0) {
                    return;
                }
            }
            C11323a<T> c11323a = this.f397965c;
            if (c11323a.f397969c.get() == null) {
                this.f397966d.request(j12);
            }
            SubscriptionHelper.b(c11323a.f397969c, c11323a, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
