package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableSwitchIfEmptyManyArray.java */
/* loaded from: classes8.dex */
final class L<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableSwitchIfEmptyManyArray.java */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -174718617614474267L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397959b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f397960c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397961d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public boolean f397962e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f397963f;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397959b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.d(this.f397961d, eVar)) {
                long j12 = this.f397960c.get();
                if (j12 != 0) {
                    eVar.request(j12);
                }
            }
        }

        public final void a(org.reactivestreams.c<? extends T> cVar) {
            if (getAndIncrement() == 0) {
                while (SubscriptionHelper.f404813b != this.f397961d.get()) {
                    if (!this.f397963f) {
                        cVar.getClass();
                        this.f397963f = true;
                        ((AbstractC41777j) cVar).d(this);
                        cVar = null;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f397961d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f397962e) {
                this.f397959b.e();
            } else {
                this.f397963f = false;
                a(null);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397959b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f397962e) {
                this.f397962e = true;
            }
            this.f397959b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f397960c, j12);
                org.reactivestreams.e eVar = this.f397961d.get();
                if (eVar != null) {
                    eVar.request(j12);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        aVar.a(null);
    }
}
