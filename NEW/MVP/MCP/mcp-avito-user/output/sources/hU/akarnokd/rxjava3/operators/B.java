package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s41.C47998a;

/* compiled from: FlowablePartialCollect.java */
/* loaded from: classes8.dex */
final class B<T, I, A, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowablePartialCollect.java */
    public static final class a<T, I, A, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, o0<T, I, A, R> {
        private static final long serialVersionUID = -2029240720070492688L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397900b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397901c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<T> f397902d = new AtomicReferenceArray<>(io.reactivex.rxjava3.internal.util.n.a(0));

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f397903e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f397904f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public long f397905g;

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f397906h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f397907i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f397908j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f397909k;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397900b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397906h, eVar)) {
                this.f397906h = eVar;
                this.f397900b.K(this);
                eVar.request(0);
            }
        }

        public final void a() {
            long j12 = this.f397905g;
            long j13 = this.f397903e.get();
            AtomicReferenceArray<T> atomicReferenceArray = this.f397902d;
            int length = atomicReferenceArray.length() - 1;
            while (j13 != j12) {
                int i12 = ((int) j12) & length;
                atomicReferenceArray.get(i12);
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                    atomicReferenceArray.lazySet(i12, null);
                    j12++;
                }
            }
            this.f397905g = j12;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                if (!this.f397907i) {
                    while (true) {
                        if (this.f397908j && this.f397901c.get() != null) {
                            this.f397901c.g(this.f397900b);
                            a();
                            this.f397907i = true;
                            break;
                        } else if (this.f397909k) {
                            this.f397901c.g(this.f397900b);
                            a();
                            this.f397907i = true;
                            break;
                        } else {
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f397906h.cancel();
                                this.f397901c.b(th2);
                                this.f397909k = true;
                            }
                        }
                    }
                } else {
                    a();
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397907i = true;
            this.f397906h.cancel();
            this.f397901c.c();
            b();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397908j = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397901c.b(th2)) {
                this.f397908j = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            AtomicReferenceArray<T> atomicReferenceArray = this.f397902d;
            int length = atomicReferenceArray.length() - 1;
            AtomicLong atomicLong = this.f397903e;
            long j12 = atomicLong.get();
            atomicReferenceArray.lazySet(length & ((int) j12), t12);
            atomicLong.lazySet(j12 + 1);
            b();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f397904f, j12);
            b();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
