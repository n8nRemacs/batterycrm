package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: FlowableFlattenIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41855i0<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableFlattenIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i0$a */
    public static final class a<T, R> extends AbstractC44583c<R> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super R> f402820b;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402823e;

        /* renamed from: f, reason: collision with root package name */
        public q41.g<T> f402824f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402825g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402826h;

        /* renamed from: j, reason: collision with root package name */
        public Iterator<? extends R> f402828j;

        /* renamed from: k, reason: collision with root package name */
        public int f402829k;

        /* renamed from: l, reason: collision with root package name */
        public int f402830l;

        /* renamed from: c, reason: collision with root package name */
        public final int f402821c = 0;

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<Throwable> f402827i = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402822d = new AtomicLong();

        public a(org.reactivestreams.d dVar) {
            this.f402820b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402823e, eVar)) {
                this.f402823e = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(3);
                    if (iV2 == 1) {
                        this.f402830l = iV2;
                        this.f402824f = dVar;
                        this.f402825g = true;
                        this.f402820b.K(this);
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402830l = iV2;
                        this.f402824f = dVar;
                        this.f402820b.K(this);
                        eVar.request(0);
                        return;
                    }
                }
                this.f402824f = new q41.h(0);
                this.f402820b.K(this);
                eVar.request(0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:72:0x011e A[PHI: r6
  0x011e: PHI (r6v2 java.util.Iterator<? extends R>) = (r6v1 java.util.Iterator<? extends R>), (r6v4 java.util.Iterator<? extends R>) binds: [B:29:0x0069, B:70:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41855i0.a.c():void");
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402826h) {
                return;
            }
            this.f402826h = true;
            this.f402823e.cancel();
            if (getAndIncrement() == 0) {
                this.f402824f.clear();
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f402828j = null;
            this.f402824f.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402825g) {
                return;
            }
            this.f402825g = true;
            c();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402828j == null && this.f402824f.isEmpty();
        }

        public final boolean l(boolean z12, boolean z13, org.reactivestreams.d<?> dVar, q41.g<?> gVar) {
            if (this.f402826h) {
                this.f402828j = null;
                gVar.clear();
                return true;
            }
            if (!z12) {
                return false;
            }
            if (this.f402827i.get() == null) {
                if (!z13) {
                    return false;
                }
                dVar.e();
                return true;
            }
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f402827i);
            this.f402828j = null;
            gVar.clear();
            dVar.onError(thD);
            return true;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402825g || !io.reactivex.rxjava3.internal.util.h.a(this.f402827i, th2)) {
                C47998a.b(th2);
            } else {
                this.f402825g = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402825g) {
                return;
            }
            if (this.f402830l != 0 || this.f402824f.offer(t12)) {
                c();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f402828j;
            if (it == null) {
                if (this.f402824f.poll() == null) {
                    return null;
                }
                throw null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f402828j = null;
            }
            return next;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402822d, j12);
                c();
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return ((i12 & 1) == 0 || this.f402830l != 1) ? 0 : 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (!(abstractC41777j instanceof l41.s)) {
            abstractC41777j.q(new a(dVar));
            return;
        }
        try {
            if (((l41.s) abstractC41777j).get() == null) {
                EmptySubscription.a(dVar);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptySubscription.b(th2, dVar);
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            EmptySubscription.b(th3, dVar);
        }
    }
}
