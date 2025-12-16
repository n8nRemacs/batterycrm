package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableTakeLastTimed.java */
/* loaded from: classes8.dex */
public final class L1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTakeLastTimed.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402420b;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402422d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402424f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402425g;

        /* renamed from: h, reason: collision with root package name */
        public Throwable f402426h;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402423e = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<Object> f402421c = new q41.i<>(0);

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402420b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402422d, eVar)) {
                this.f402422d = eVar;
                this.f402420b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final boolean a(InterfaceC41782o interfaceC41782o, boolean z12) {
            if (this.f402424f) {
                this.f402421c.clear();
                return true;
            }
            Throwable th2 = this.f402426h;
            if (th2 != null) {
                this.f402421c.clear();
                interfaceC41782o.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            interfaceC41782o.e();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402420b;
            q41.i<Object> iVar = this.f402421c;
            int iAddAndGet = 1;
            do {
                if (this.f402425g) {
                    if (a(interfaceC41782o, iVar.isEmpty())) {
                        return;
                    }
                    long j12 = this.f402423e.get();
                    long j13 = 0;
                    while (true) {
                        if (a(interfaceC41782o, iVar.b() == null)) {
                            return;
                        }
                        if (j12 != j13) {
                            iVar.poll();
                            interfaceC41782o.onNext(iVar.poll());
                            j13++;
                        } else if (j13 != 0) {
                            io.reactivex.rxjava3.internal.util.c.e(this.f402423e, j13);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402424f) {
                return;
            }
            this.f402424f = true;
            this.f402422d.cancel();
            if (getAndIncrement() == 0) {
                this.f402421c.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402426h = th2;
            this.f402425g = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402423e, j12);
                b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
