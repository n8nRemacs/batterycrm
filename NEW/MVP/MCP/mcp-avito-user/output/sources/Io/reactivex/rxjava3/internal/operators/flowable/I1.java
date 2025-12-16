package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableTake.java */
/* loaded from: classes8.dex */
public final class I1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final long f402378d;

    /* compiled from: FlowableTake.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 2288246011222124525L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402379b;

        /* renamed from: c, reason: collision with root package name */
        public long f402380c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402381d;

        public a(InterfaceC41782o interfaceC41782o, long j12) {
            this.f402379b = interfaceC41782o;
            this.f402380c = j12;
            lazySet(j12);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402381d, eVar)) {
                long j12 = this.f402380c;
                InterfaceC41782o interfaceC41782o = this.f402379b;
                if (j12 == 0) {
                    eVar.cancel();
                    EmptySubscription.a(interfaceC41782o);
                } else {
                    this.f402381d = eVar;
                    interfaceC41782o.K(this);
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402381d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402380c > 0) {
                this.f402380c = 0L;
                this.f402379b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402380c <= 0) {
                C47998a.b(th2);
            } else {
                this.f402380c = 0L;
                this.f402379b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f402380c;
            if (j12 > 0) {
                long j13 = j12 - 1;
                this.f402380c = j13;
                InterfaceC41782o interfaceC41782o = this.f402379b;
                interfaceC41782o.onNext(t12);
                if (j13 == 0) {
                    this.f402381d.cancel();
                    interfaceC41782o.e();
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            long j13;
            long jMin;
            if (SubscriptionHelper.h(j12)) {
                do {
                    j13 = get();
                    if (j13 == 0) {
                        return;
                    } else {
                        jMin = Math.min(j13, j12);
                    }
                } while (!compareAndSet(j13, j13 - jMin));
                this.f402381d.request(jMin);
            }
        }
    }

    public I1(AbstractC41777j<T> abstractC41777j, long j12) {
        super(abstractC41777j);
        this.f402378d = j12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402378d));
    }
}
