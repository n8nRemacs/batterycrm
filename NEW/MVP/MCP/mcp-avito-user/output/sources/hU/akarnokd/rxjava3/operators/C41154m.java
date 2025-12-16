package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableCoalesce.java */
/* renamed from: hu.akarnokd.rxjava3.operators.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41154m<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableCoalesce.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.m$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -6157179110480235565L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398073b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f398074c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public volatile SimplePlainQueue<T> f398075d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f398076e;

        /* renamed from: f, reason: collision with root package name */
        public R f398077f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398078g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398079h;

        /* renamed from: i, reason: collision with root package name */
        public Throwable f398080i;

        /* renamed from: j, reason: collision with root package name */
        public long f398081j;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f398073b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398076e, eVar)) {
                this.f398076e = eVar;
                this.f398073b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            long j12 = this.f398081j;
            R r12 = this.f398077f;
            InterfaceC41782o interfaceC41782o = this.f398073b;
            int iAddAndGet = 1;
            while (!this.f398079h) {
                boolean z12 = this.f398078g;
                SimplePlainQueue<T> simplePlainQueue = this.f398075d;
                if (simplePlainQueue != null && !simplePlainQueue.isEmpty()) {
                    if (r12 == null) {
                        throw null;
                    }
                    try {
                        if (simplePlainQueue.poll() != null) {
                            throw null;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f398077f = null;
                        interfaceC41782o.onError(th2);
                        return;
                    }
                }
                if (r12 != null && j12 != this.f398074c.get()) {
                    interfaceC41782o.onNext(r12);
                    this.f398077f = null;
                    j12++;
                    r12 = null;
                }
                if (z12 && r12 == null) {
                    Throwable th3 = this.f398080i;
                    this.f398077f = null;
                    if (th3 != null) {
                        interfaceC41782o.onError(th3);
                        return;
                    } else {
                        interfaceC41782o.e();
                        return;
                    }
                }
                this.f398081j = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f398077f = null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398079h = true;
            this.f398076e.cancel();
            if (getAndIncrement() == 0) {
                this.f398077f = null;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398078g = true;
            if (getAndIncrement() != 0) {
                return;
            }
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398080i = th2;
            this.f398078g = true;
            if (getAndIncrement() != 0) {
                return;
            }
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (get() == 0 && compareAndSet(0, 1)) {
                SimplePlainQueue<T> simplePlainQueue = this.f398075d;
                if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                    try {
                        if (this.f398077f != null) {
                            throw null;
                        }
                        throw null;
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f398076e.cancel();
                        this.f398077f = null;
                        this.f398073b.onError(th2);
                        return;
                    }
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f398075d;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(0);
                    this.f398075d = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t12);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398074c, j12);
                if (getAndIncrement() != 0) {
                    return;
                }
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
