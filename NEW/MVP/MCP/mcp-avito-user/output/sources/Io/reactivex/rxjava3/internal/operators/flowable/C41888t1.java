package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableScanSeed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41888t1<T, R> extends AbstractC41833b<T, R> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.c<R, ? super T, R> f402982d;

    /* renamed from: e, reason: collision with root package name */
    public final l41.s<R> f402983e;

    /* compiled from: FlowableScanSeed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.t1$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -1776795561228106469L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402984b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.c<R, ? super T, R> f402985c;

        /* renamed from: d, reason: collision with root package name */
        public final q41.h f402986d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402987e;

        /* renamed from: f, reason: collision with root package name */
        public final int f402988f;

        /* renamed from: g, reason: collision with root package name */
        public final int f402989g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402990h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402991i;

        /* renamed from: j, reason: collision with root package name */
        public Throwable f402992j;

        /* renamed from: k, reason: collision with root package name */
        public org.reactivestreams.e f402993k;

        /* renamed from: l, reason: collision with root package name */
        public R f402994l;

        /* renamed from: m, reason: collision with root package name */
        public int f402995m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC41782o interfaceC41782o, l41.c cVar, Object obj, int i12) {
            this.f402984b = interfaceC41782o;
            this.f402985c = cVar;
            this.f402994l = obj;
            this.f402988f = i12;
            this.f402989g = i12 - (i12 >> 2);
            q41.h hVar = new q41.h(i12);
            this.f402986d = hVar;
            hVar.offer(obj);
            this.f402987e = new AtomicLong();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402993k, eVar)) {
                this.f402993k = eVar;
                this.f402984b.K(this);
                eVar.request(this.f402988f - 1);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402984b;
            q41.h hVar = this.f402986d;
            int i12 = this.f402989g;
            int i13 = this.f402995m;
            int iAddAndGet = 1;
            do {
                long j12 = this.f402987e.get();
                long j13 = 0;
                while (j13 != j12) {
                    if (this.f402990h) {
                        hVar.clear();
                        return;
                    }
                    boolean z12 = this.f402991i;
                    if (z12 && (th2 = this.f402992j) != null) {
                        hVar.clear();
                        interfaceC41782o.onError(th2);
                        return;
                    }
                    Object objPoll = hVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && z13) {
                        interfaceC41782o.e();
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    interfaceC41782o.onNext(objPoll);
                    j13++;
                    i13++;
                    if (i13 == i12) {
                        this.f402993k.request(i12);
                        i13 = 0;
                    }
                }
                if (j13 == j12 && this.f402991i) {
                    Throwable th3 = this.f402992j;
                    if (th3 != null) {
                        hVar.clear();
                        interfaceC41782o.onError(th3);
                        return;
                    } else if (hVar.isEmpty()) {
                        interfaceC41782o.e();
                        return;
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this.f402987e, j13);
                }
                this.f402995m = i13;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402990h = true;
            this.f402993k.cancel();
            if (getAndIncrement() == 0) {
                this.f402986d.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402991i) {
                return;
            }
            this.f402991i = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402991i) {
                C47998a.b(th2);
                return;
            }
            this.f402992j = th2;
            this.f402991i = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402991i) {
                return;
            }
            try {
                R rApply = this.f402985c.apply(this.f402994l, t12);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f402994l = rApply;
                this.f402986d.offer(rApply);
                a();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402993k.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402987e, j12);
                a();
            }
        }
    }

    public C41888t1(G0 g02, l41.s sVar, l41.c cVar) {
        super(g02);
        this.f402982d = cVar;
        this.f402983e = sVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        try {
            R r12 = this.f402983e.get();
            Objects.requireNonNull(r12, "The seed supplied is null");
            this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402982d, r12, AbstractC41777j.f401972b));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
