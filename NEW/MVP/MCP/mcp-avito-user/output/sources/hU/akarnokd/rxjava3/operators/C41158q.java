package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableExpand.java */
/* renamed from: hu.akarnokd.rxjava3.operators.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41158q<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableExpand.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.q$a */
    public static final class a<T> extends o41.h implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -8200116117441115256L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41782o f398103j;

        /* renamed from: k, reason: collision with root package name */
        public final SimplePlainQueue<org.reactivestreams.c<? extends T>> f398104k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicInteger f398105l;

        /* renamed from: m, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398106m;

        /* renamed from: n, reason: collision with root package name */
        public volatile boolean f398107n;

        /* renamed from: o, reason: collision with root package name */
        public long f398108o;

        public a(InterfaceC41782o interfaceC41782o) {
            super(false);
            this.f398103j = interfaceC41782o;
            this.f398105l = new AtomicInteger();
            this.f398104k = new SpscLinkedArrayQueue(0);
            this.f398106m = new io.reactivex.rxjava3.internal.util.b();
        }

        @Override // o41.h, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f398106m.c();
            h();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398107n = false;
            h();
        }

        public final void h() {
            if (this.f398105l.getAndIncrement() == 0) {
                do {
                    SimplePlainQueue<org.reactivestreams.c<? extends T>> simplePlainQueue = this.f398104k;
                    if (d()) {
                        simplePlainQueue.clear();
                    } else if (!this.f398107n) {
                        if (simplePlainQueue.isEmpty()) {
                            g(SubscriptionHelper.f404813b);
                            super.cancel();
                            this.f398106m.g(this.f398103j);
                        } else {
                            org.reactivestreams.c cVar = (org.reactivestreams.c) simplePlainQueue.poll();
                            long j12 = this.f398108o;
                            if (j12 != 0) {
                                this.f398108o = 0L;
                                f(j12);
                            }
                            this.f398107n = true;
                            cVar.d(this);
                        }
                    }
                } while (this.f398105l.decrementAndGet() != 0);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            g(SubscriptionHelper.f404813b);
            super.cancel();
            this.f398103j.onError(th2);
            h();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f398108o++;
            InterfaceC41782o interfaceC41782o = this.f398103j;
            interfaceC41782o.onNext(t12);
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                super.cancel();
                interfaceC41782o.onError(th2);
                h();
            }
        }
    }

    /* compiled from: FlowableExpand.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.q$b */
    public static final class b<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = -2126738751597075165L;

        /* renamed from: b, reason: collision with root package name */
        public ArrayDeque<b<T>.a> f398109b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398110c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.c<? extends T> f398111d;

        /* renamed from: e, reason: collision with root package name */
        public long f398112e;

        /* compiled from: FlowableExpand.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.q$b$a */
        public final class a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
            private static final long serialVersionUID = 4198645419772153739L;

            /* renamed from: b, reason: collision with root package name */
            public volatile boolean f398113b;

            /* renamed from: c, reason: collision with root package name */
            public volatile T f398114c;

            public a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(1L);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (SubscriptionHelper.f404813b != get()) {
                    b bVar = b.this;
                    bVar.getClass();
                    this.f398113b = true;
                    bVar.a();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (SubscriptionHelper.f404813b == get()) {
                    return;
                }
                b.this.getClass();
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                if (SubscriptionHelper.f404813b != get()) {
                    this.f398114c = t12;
                    b.this.a();
                }
            }
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        public final boolean b(b<T>.a aVar) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            ArrayDeque<b<T>.a> arrayDeque;
            if (this.f398110c) {
                return;
            }
            this.f398110c = true;
            synchronized (this) {
                arrayDeque = this.f398109b;
                this.f398109b = null;
            }
            if (arrayDeque != null) {
                while (!arrayDeque.isEmpty()) {
                    b<T>.a aVarPoll = arrayDeque.poll();
                    aVarPoll.getClass();
                    SubscriptionHelper.a(aVarPoll);
                }
            }
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        aVar.f398104k.offer((Object) null);
        dVar.K(aVar);
        aVar.h();
    }
}
