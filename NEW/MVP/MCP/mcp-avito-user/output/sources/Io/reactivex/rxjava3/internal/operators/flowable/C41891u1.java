package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableSequenceEqual.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41891u1<T> extends AbstractC41777j<Boolean> {

    /* compiled from: FlowableSequenceEqual.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u1$a */
    public static final class a<T> extends o41.f<Boolean> implements b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: d, reason: collision with root package name */
        public final c<T> f403029d;

        /* renamed from: e, reason: collision with root package name */
        public final c<T> f403030e;

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403031f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f403032g;

        /* renamed from: h, reason: collision with root package name */
        public T f403033h;

        /* renamed from: i, reason: collision with root package name */
        public T f403034i;

        public a(InterfaceC41782o interfaceC41782o) {
            super(interfaceC41782o);
            this.f403032g = new AtomicInteger();
            this.f403029d = new c<>(this);
            this.f403030e = new c<>(this);
            this.f403031f = new io.reactivex.rxjava3.internal.util.b();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41891u1.b
        public final void a(Throwable th2) {
            if (this.f403031f.b(th2)) {
                c();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41891u1.b
        public final void c() {
            if (this.f403032g.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                q41.g<T> gVar = this.f403029d.f403036c;
                q41.g<T> gVar2 = this.f403030e.f403036c;
                if (gVar == null || gVar2 == null) {
                    if (m()) {
                        this.f403029d.a();
                        this.f403030e.a();
                        return;
                    } else if (this.f403031f.get() != null) {
                        n();
                        this.f403031f.g(this.f419376b);
                        return;
                    }
                } else {
                    if (m()) {
                        this.f403029d.a();
                        this.f403030e.a();
                        return;
                    }
                    if (this.f403031f.get() != null) {
                        n();
                        this.f403031f.g(this.f419376b);
                        return;
                    }
                    boolean z12 = this.f403029d.f403037d;
                    T tPoll = this.f403033h;
                    if (tPoll == null) {
                        try {
                            tPoll = gVar.poll();
                            this.f403033h = tPoll;
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            n();
                            this.f403031f.b(th2);
                            this.f403031f.g(this.f419376b);
                            return;
                        }
                    }
                    boolean z13 = tPoll == null;
                    boolean z14 = this.f403030e.f403037d;
                    T tPoll2 = this.f403034i;
                    if (tPoll2 == null) {
                        try {
                            tPoll2 = gVar2.poll();
                            this.f403034i = tPoll2;
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.a(th3);
                            n();
                            this.f403031f.b(th3);
                            this.f403031f.g(this.f419376b);
                            return;
                        }
                    }
                    boolean z15 = tPoll2 == null;
                    if (z12 && z14 && z13 && z15) {
                        l(Boolean.TRUE);
                        return;
                    }
                    if (z12 && z14 && z13 != z15) {
                        n();
                        l(Boolean.FALSE);
                        return;
                    } else if (!z13 && !z15) {
                        try {
                            throw null;
                        } catch (Throwable th4) {
                            io.reactivex.rxjava3.exceptions.a.a(th4);
                            n();
                            this.f403031f.b(th4);
                            this.f403031f.g(this.f419376b);
                            return;
                        }
                    }
                }
                iAddAndGet = this.f403032g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            c<T> cVar = this.f403029d;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            c<T> cVar2 = this.f403030e;
            cVar2.getClass();
            SubscriptionHelper.a(cVar2);
            this.f403031f.c();
            if (this.f403032g.getAndIncrement() == 0) {
                cVar.a();
                cVar2.a();
            }
        }

        public final void n() {
            c<T> cVar = this.f403029d;
            cVar.getClass();
            SubscriptionHelper.a(cVar);
            cVar.a();
            c<T> cVar2 = this.f403030e;
            cVar2.getClass();
            SubscriptionHelper.a(cVar2);
            cVar2.a();
        }
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u1$b */
    public interface b {
        void a(Throwable th2);

        void c();
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u1$c */
    public static final class c<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = 4804128302091633067L;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f403035b;

        /* renamed from: c, reason: collision with root package name */
        public volatile q41.g<T> f403036c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f403037d;

        /* renamed from: e, reason: collision with root package name */
        public int f403038e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(b bVar) {
            this.f403035b = (AtomicInteger) bVar;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [io.reactivex.rxjava3.internal.operators.flowable.u1$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(3);
                    if (iV2 == 1) {
                        this.f403038e = iV2;
                        this.f403036c = dVar;
                        this.f403037d = true;
                        this.f403035b.c();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f403038e = iV2;
                        this.f403036c = dVar;
                        eVar.request(0);
                        return;
                    }
                }
                this.f403036c = new q41.h(0);
                eVar.request(0);
            }
        }

        public final void a() {
            q41.g<T> gVar = this.f403036c;
            if (gVar != null) {
                gVar.clear();
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.internal.operators.flowable.u1$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void e() {
            this.f403037d = true;
            this.f403035b.c();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.flowable.u1$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403035b.a(th2);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.rxjava3.internal.operators.flowable.u1$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403038e != 0 || this.f403036c.offer(t12)) {
                this.f403035b.c();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Boolean> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
