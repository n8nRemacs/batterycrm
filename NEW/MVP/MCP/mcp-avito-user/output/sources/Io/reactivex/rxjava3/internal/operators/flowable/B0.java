package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.C41893v0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableJoin.java */
/* loaded from: classes8.dex */
public final class B0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC41833b<TLeft, R> {

    /* compiled from: FlowableJoin.java */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.e, C41893v0.b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402281b;

        /* renamed from: j, reason: collision with root package name */
        public int f402289j;

        /* renamed from: k, reason: collision with root package name */
        public int f402290k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f402291l;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402282c = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402284e = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public final q41.i<Object> f402283d = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashMap f402285f = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        public final LinkedHashMap f402286g = new LinkedHashMap();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<Throwable> f402287h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicInteger f402288i = new AtomicInteger(2);

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402281b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void a(Throwable th2) {
            if (!io.reactivex.rxjava3.internal.util.h.a(this.f402287h, th2)) {
                C47998a.b(th2);
            } else {
                this.f402288i.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void b(Throwable th2) {
            if (io.reactivex.rxjava3.internal.util.h.a(this.f402287h, th2)) {
                g();
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void c(Object obj, boolean z12) {
            synchronized (this) {
                this.f402283d.a(z12 ? 1 : 2, obj);
            }
            g();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402291l) {
                return;
            }
            this.f402291l = true;
            f();
            if (getAndIncrement() == 0) {
                this.f402283d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void d(boolean z12, C41893v0.c cVar) {
            synchronized (this) {
                this.f402283d.a(z12 ? 3 : 4, cVar);
            }
            g();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void e(C41893v0.d dVar) {
            this.f402284e.c(dVar);
            this.f402288i.decrementAndGet();
            g();
        }

        public final void f() {
            this.f402284e.dispose();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<Object> iVar = this.f402283d;
            InterfaceC41782o interfaceC41782o = this.f402281b;
            int iAddAndGet = 1;
            while (!this.f402291l) {
                if (this.f402287h.get() != null) {
                    iVar.clear();
                    f();
                    h(interfaceC41782o);
                    return;
                }
                boolean z12 = this.f402288i.get() == 0;
                Integer num = (Integer) iVar.poll();
                boolean z13 = num == null;
                if (z12 && z13) {
                    this.f402285f.clear();
                    this.f402286g.clear();
                    this.f402284e.dispose();
                    interfaceC41782o.e();
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = iVar.poll();
                    if (num == 1) {
                        int i12 = this.f402289j;
                        this.f402289j = i12 + 1;
                        this.f402285f.put(Integer.valueOf(i12), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            i(th2, interfaceC41782o, iVar);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i13 = this.f402290k;
                        this.f402290k = i13 + 1;
                        this.f402286g.put(Integer.valueOf(i13), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            i(th3, interfaceC41782o, iVar);
                            return;
                        }
                    }
                    if (num == 3) {
                        C41893v0.c cVar = (C41893v0.c) objPoll;
                        LinkedHashMap linkedHashMap = this.f402285f;
                        cVar.getClass();
                        linkedHashMap.remove(0);
                        this.f402284e.a(cVar);
                    } else {
                        C41893v0.c cVar2 = (C41893v0.c) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f402286g;
                        cVar2.getClass();
                        linkedHashMap2.remove(0);
                        this.f402284e.a(cVar2);
                    }
                }
            }
            iVar.clear();
        }

        public final void h(InterfaceC41782o interfaceC41782o) {
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f402287h);
            this.f402285f.clear();
            this.f402286g.clear();
            interfaceC41782o.onError(thD);
        }

        public final void i(Throwable th2, InterfaceC41782o interfaceC41782o, q41.g gVar) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            io.reactivex.rxjava3.internal.util.h.a(this.f402287h, th2);
            gVar.clear();
            f();
            h(interfaceC41782o);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402282c, j12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        C41893v0.d dVar2 = new C41893v0.d(aVar, true);
        io.reactivex.rxjava3.disposables.c cVar = aVar.f402284e;
        cVar.b(dVar2);
        cVar.b(new C41893v0.d(aVar, false));
        this.f402624c.q(dVar2);
        throw null;
    }
}
