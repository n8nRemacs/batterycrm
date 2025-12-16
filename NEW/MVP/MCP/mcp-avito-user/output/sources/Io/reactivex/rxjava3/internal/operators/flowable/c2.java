package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableWindowBoundarySelector.java */
/* loaded from: classes8.dex */
public final class c2<T, B, V> extends AbstractC41833b<T, AbstractC41777j<T>> {

    /* compiled from: FlowableWindowBoundarySelector.java */
    public static final class a<T, B, V> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402697b;

        /* renamed from: j, reason: collision with root package name */
        public long f402705j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f402706k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f402707l;

        /* renamed from: m, reason: collision with root package name */
        public volatile boolean f402708m;

        /* renamed from: o, reason: collision with root package name */
        public org.reactivestreams.e f402710o;

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a f402701f = new io.reactivex.rxjava3.internal.queue.a();

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402698c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f402700e = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f402702g = new AtomicLong(1);

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f402703h = new AtomicBoolean();

        /* renamed from: n, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402709n = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final c<B> f402699d = new c<>(this);

        /* renamed from: i, reason: collision with root package name */
        public final AtomicLong f402704i = new AtomicLong();

        /* compiled from: FlowableWindowBoundarySelector.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c2$a$a, reason: collision with other inner class name */
        public static final class C11460a<T, V> extends AbstractC41777j<T> implements InterfaceC41782o<V>, io.reactivex.rxjava3.disposables.d {
            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(null, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                SubscriptionHelper.a(null);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (!getF318621e()) {
                    throw null;
                }
                C47998a.b(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(V v12) {
                if (SubscriptionHelper.a(null)) {
                    throw null;
                }
            }

            @Override // io.reactivex.rxjava3.core.AbstractC41777j
            public final void u(org.reactivestreams.d<? super T> dVar) {
                throw null;
            }
        }

        /* compiled from: FlowableWindowBoundarySelector.java */
        public static final class b<B> {

            /* renamed from: a, reason: collision with root package name */
            public final B f402711a;

            public b(B b12) {
                this.f402711a = b12;
            }
        }

        /* compiled from: FlowableWindowBoundarySelector.java */
        public static final class c<B> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<B> {
            private static final long serialVersionUID = -3326496781427702834L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, B, ?> f402712b;

            public c(a<?, B, ?> aVar) {
                this.f402712b = aVar;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a<?, B, ?> aVar = this.f402712b;
                aVar.f402708m = true;
                aVar.a();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a<?, B, ?> aVar = this.f402712b;
                aVar.f402710o.cancel();
                aVar.f402698c.dispose();
                if (aVar.f402709n.b(th2)) {
                    aVar.f402707l = true;
                    aVar.a();
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(B b12) {
                a<?, B, ?> aVar = this.f402712b;
                aVar.f402701f.offer(new b(b12));
                aVar.a();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402697b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402710o, eVar)) {
                this.f402710o = eVar;
                this.f402697b.K(this);
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402697b;
            io.reactivex.rxjava3.internal.queue.a aVar = this.f402701f;
            ArrayList arrayList = this.f402700e;
            int iAddAndGet = 1;
            while (true) {
                if (this.f402706k) {
                    aVar.clear();
                    arrayList.clear();
                } else {
                    boolean z12 = this.f402707l;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && (z13 || this.f402709n.get() != null)) {
                        b(interfaceC41782o);
                        this.f402706k = true;
                    } else if (z13) {
                        if (this.f402708m && arrayList.size() == 0) {
                            this.f402710o.cancel();
                            c<B> cVar = this.f402699d;
                            cVar.getClass();
                            SubscriptionHelper.a(cVar);
                            this.f402698c.dispose();
                            b(interfaceC41782o);
                            this.f402706k = true;
                        }
                    } else if (objPoll instanceof b) {
                        if (this.f402703h.get()) {
                            continue;
                        } else {
                            long j12 = this.f402705j;
                            if (this.f402704i.get() == j12) {
                                this.f402710o.cancel();
                                c<B> cVar2 = this.f402699d;
                                cVar2.getClass();
                                SubscriptionHelper.a(cVar2);
                                this.f402698c.dispose();
                                this.f402709n.b(new MissingBackpressureException(e2.z(j12)));
                                this.f402707l = true;
                            } else {
                                this.f402705j = j12 + 1;
                                B b12 = ((b) objPoll).f402711a;
                                try {
                                    throw null;
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    this.f402710o.cancel();
                                    c<B> cVar3 = this.f402699d;
                                    cVar3.getClass();
                                    SubscriptionHelper.a(cVar3);
                                    this.f402698c.dispose();
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    this.f402709n.b(th2);
                                    this.f402707l = true;
                                }
                            }
                        }
                    } else {
                        if (objPoll instanceof C11460a) {
                            ((C11460a) objPoll).getClass();
                            arrayList.remove((Object) null);
                            this.f402698c.c((io.reactivex.rxjava3.disposables.d) objPoll);
                            throw null;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((io.reactivex.rxjava3.processors.h) it.next()).onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final void b(InterfaceC41782o interfaceC41782o) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f402709n;
            bVar.getClass();
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
            ArrayList arrayList = this.f402700e;
            if (thD == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((io.reactivex.rxjava3.processors.h) it.next()).e();
                }
                interfaceC41782o.e();
                return;
            }
            if (thD != io.reactivex.rxjava3.internal.util.h.f404834a) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((io.reactivex.rxjava3.processors.h) it2.next()).onError(thD);
                }
                interfaceC41782o.onError(thD);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402703h.compareAndSet(false, true)) {
                if (this.f402702g.decrementAndGet() != 0) {
                    c<B> cVar = this.f402699d;
                    cVar.getClass();
                    SubscriptionHelper.a(cVar);
                    return;
                }
                this.f402710o.cancel();
                c<B> cVar2 = this.f402699d;
                cVar2.getClass();
                SubscriptionHelper.a(cVar2);
                this.f402698c.dispose();
                this.f402709n.c();
                this.f402706k = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            c<B> cVar = this.f402699d;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            this.f402698c.dispose();
            this.f402707l = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            c<B> cVar = this.f402699d;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            this.f402698c.dispose();
            if (this.f402709n.b(th2)) {
                this.f402707l = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402701f.offer(t12);
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402704i, j12);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f402702g.decrementAndGet() == 0) {
                this.f402710o.cancel();
                c<B> cVar = this.f402699d;
                cVar.getClass();
                SubscriptionHelper.a(cVar);
                this.f402698c.dispose();
                this.f402709n.c();
                this.f402706k = true;
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC41777j<T>> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
