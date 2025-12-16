package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableGroupJoin.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41893v0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC41833b<TLeft, R> {

    /* compiled from: FlowableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0$a */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements org.reactivestreams.e, b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403045b;

        /* renamed from: j, reason: collision with root package name */
        public int f403053j;

        /* renamed from: k, reason: collision with root package name */
        public int f403054k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403055l;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f403046c = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403048e = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public final q41.i<Object> f403047d = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashMap f403049f = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        public final LinkedHashMap f403050g = new LinkedHashMap();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<Throwable> f403051h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicInteger f403052i = new AtomicInteger(2);

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403045b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void a(Throwable th2) {
            if (!io.reactivex.rxjava3.internal.util.h.a(this.f403051h, th2)) {
                C47998a.b(th2);
            } else {
                this.f403052i.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void b(Throwable th2) {
            if (io.reactivex.rxjava3.internal.util.h.a(this.f403051h, th2)) {
                f();
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void c(Object obj, boolean z12) {
            synchronized (this) {
                this.f403047d.a(z12 ? 1 : 2, obj);
            }
            f();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403055l) {
                return;
            }
            this.f403055l = true;
            this.f403048e.dispose();
            if (getAndIncrement() == 0) {
                this.f403047d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void d(boolean z12, c cVar) {
            synchronized (this) {
                this.f403047d.a(z12 ? 3 : 4, cVar);
            }
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41893v0.b
        public final void e(d dVar) {
            this.f403048e.c(dVar);
            this.f403052i.decrementAndGet();
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<Object> iVar = this.f403047d;
            InterfaceC41782o interfaceC41782o = this.f403045b;
            int iAddAndGet = 1;
            while (!this.f403055l) {
                if (this.f403051h.get() != null) {
                    iVar.clear();
                    this.f403048e.dispose();
                    g(interfaceC41782o);
                    return;
                }
                boolean z12 = this.f403052i.get() == 0;
                Integer num = (Integer) iVar.poll();
                boolean z13 = num == null;
                if (z12 && z13) {
                    Iterator it = this.f403049f.values().iterator();
                    while (it.hasNext()) {
                        ((io.reactivex.rxjava3.processors.h) it.next()).e();
                    }
                    this.f403049f.clear();
                    this.f403050g.clear();
                    this.f403048e.dispose();
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
                        io.reactivex.rxjava3.processors.h hVar = new io.reactivex.rxjava3.processors.h(AbstractC41777j.f401972b, null);
                        int i12 = this.f403053j;
                        this.f403053j = i12 + 1;
                        this.f403049f.put(Integer.valueOf(i12), hVar);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            h(th2, interfaceC41782o, iVar);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i13 = this.f403054k;
                        this.f403054k = i13 + 1;
                        this.f403050g.put(Integer.valueOf(i13), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            h(th3, interfaceC41782o, iVar);
                            return;
                        }
                    }
                    if (num == 3) {
                        c cVar = (c) objPoll;
                        LinkedHashMap linkedHashMap = this.f403049f;
                        cVar.getClass();
                        io.reactivex.rxjava3.processors.h hVar2 = (io.reactivex.rxjava3.processors.h) linkedHashMap.remove(0);
                        this.f403048e.a(cVar);
                        if (hVar2 != null) {
                            hVar2.e();
                        }
                    } else {
                        c cVar2 = (c) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f403050g;
                        cVar2.getClass();
                        linkedHashMap2.remove(0);
                        this.f403048e.a(cVar2);
                    }
                }
            }
            iVar.clear();
        }

        public final void g(InterfaceC41782o interfaceC41782o) {
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f403051h);
            LinkedHashMap linkedHashMap = this.f403049f;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((io.reactivex.rxjava3.processors.h) it.next()).onError(thD);
            }
            linkedHashMap.clear();
            this.f403050g.clear();
            interfaceC41782o.onError(thD);
        }

        public final void h(Throwable th2, InterfaceC41782o interfaceC41782o, q41.g gVar) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            io.reactivex.rxjava3.internal.util.h.a(this.f403051h, th2);
            gVar.clear();
            this.f403048e.dispose();
            g(interfaceC41782o);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f403046c, j12);
            }
        }
    }

    /* compiled from: FlowableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0$b */
    public interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(Object obj, boolean z12);

        void d(boolean z12, c cVar);

        void e(d dVar);
    }

    /* compiled from: FlowableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0$c */
    public static final class c extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1883890389173668373L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (SubscriptionHelper.a(this)) {
                throw null;
            }
        }
    }

    /* compiled from: FlowableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v0$d */
    public static final class d extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f403056b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f403057c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b bVar, boolean z12) {
            this.f403056b = (AtomicInteger) bVar;
            this.f403057c = z12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.v0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void e() {
            this.f403056b.e(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.v0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403056b.a(th2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.v0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            this.f403056b.c(obj, this.f403057c);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        d dVar2 = new d(aVar, true);
        io.reactivex.rxjava3.disposables.c cVar = aVar.f403048e;
        cVar.b(dVar2);
        cVar.b(new d(aVar, false));
        this.f402624c.q(dVar2);
        throw null;
    }
}
