package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableIntervalBackpressure.java */
/* renamed from: hu.akarnokd.rxjava3.operators.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41163w extends AbstractC41777j<Long> {

    /* compiled from: FlowableIntervalBackpressure.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.w$a */
    public static final class a extends AtomicInteger implements org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -3871976901922172519L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398162b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f398163c = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f398164d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f398165e = new AtomicLong(-1);

        /* renamed from: f, reason: collision with root package name */
        public long f398166f;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398162b = interfaceC41782o;
        }

        public final void a() {
            m41.d dVar;
            if (getAndIncrement() == 0) {
                AtomicLong atomicLong = this.f398165e;
                long j12 = this.f398166f;
                int iAddAndGet = 1;
                do {
                    long j13 = this.f398164d.get();
                    while (true) {
                        dVar = this.f398163c;
                        if (j12 != j13) {
                            if (!dVar.getF318621e()) {
                                if (atomicLong.get() < j12) {
                                    break;
                                }
                                this.f398162b.onNext(Long.valueOf(j12));
                                j12++;
                            } else {
                                return;
                            }
                        } else {
                            break;
                        }
                    }
                    if (dVar.getF318621e()) {
                        return;
                    }
                    this.f398166f = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            m41.d dVar = this.f398163c;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398164d, j12);
                a();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f398165e.getAndIncrement();
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
