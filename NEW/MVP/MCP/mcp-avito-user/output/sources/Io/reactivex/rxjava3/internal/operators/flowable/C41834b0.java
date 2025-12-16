package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableFlatMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41834b0<T, U> extends AbstractC41833b<T, U> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends org.reactivestreams.c<? extends U>> f402625d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402626e;

    /* renamed from: f, reason: collision with root package name */
    public final int f402627f;

    /* compiled from: FlowableFlatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b0$a */
    public static final class a<T, U> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<U>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b, reason: collision with root package name */
        public final long f402628b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T, U> f402629c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402630d;

        /* renamed from: e, reason: collision with root package name */
        public final int f402631e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402632f;

        /* renamed from: g, reason: collision with root package name */
        public volatile q41.g<U> f402633g;

        /* renamed from: h, reason: collision with root package name */
        public long f402634h;

        /* renamed from: i, reason: collision with root package name */
        public int f402635i;

        public a(b<T, U> bVar, int i12, long j12) {
            this.f402628b = j12;
            this.f402629c = bVar;
            this.f402631e = i12;
            this.f402630d = i12 >> 2;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402635i = iV2;
                        this.f402633g = dVar;
                        this.f402632f = true;
                        this.f402629c.b();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402635i = iV2;
                        this.f402633g = dVar;
                    }
                }
                eVar.request(this.f402631e);
            }
        }

        public final void a(long j12) {
            if (this.f402635i != 1) {
                long j13 = this.f402634h + j12;
                if (j13 < this.f402630d) {
                    this.f402634h = j13;
                } else {
                    this.f402634h = 0L;
                    get().request(j13);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402632f = true;
            this.f402629c.b();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            lazySet(SubscriptionHelper.f404813b);
            b<T, U> bVar = this.f402629c;
            if (bVar.f402644h.b(th2)) {
                this.f402632f = true;
                bVar.f402648l.cancel();
                for (a<?, ?> aVar : bVar.f402646j.getAndSet(b.f402637s)) {
                    aVar.getClass();
                    SubscriptionHelper.a(aVar);
                }
                bVar.b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(U u12) {
            if (this.f402635i == 2) {
                this.f402629c.b();
                return;
            }
            b<T, U> bVar = this.f402629c;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                long j12 = bVar.f402647k.get();
                q41.g hVar = this.f402633g;
                if (j12 == 0 || !(hVar == null || hVar.isEmpty())) {
                    if (hVar == null) {
                        hVar = new q41.h(bVar.f402641e);
                        this.f402633g = hVar;
                    }
                    if (!hVar.offer(u12)) {
                        bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    bVar.f402638b.onNext(u12);
                    if (j12 != Long.MAX_VALUE) {
                        bVar.f402647k.decrementAndGet();
                    }
                    a(1L);
                }
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.g hVar2 = this.f402633g;
                if (hVar2 == null) {
                    hVar2 = new q41.h(bVar.f402641e);
                    this.f402633g = hVar2;
                }
                if (!hVar2.offer(u12)) {
                    bVar.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.c();
        }
    }

    /* compiled from: FlowableFlatMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.b0$b */
    public static final class b<T, U> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: r, reason: collision with root package name */
        public static final a<?, ?>[] f402636r = new a[0];

        /* renamed from: s, reason: collision with root package name */
        public static final a<?, ?>[] f402637s = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super U> f402638b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends org.reactivestreams.c<? extends U>> f402639c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402640d;

        /* renamed from: e, reason: collision with root package name */
        public final int f402641e;

        /* renamed from: f, reason: collision with root package name */
        public volatile q41.f<U> f402642f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402643g;

        /* renamed from: h, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402644h = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402645i;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f402646j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicLong f402647k;

        /* renamed from: l, reason: collision with root package name */
        public org.reactivestreams.e f402648l;

        /* renamed from: m, reason: collision with root package name */
        public long f402649m;

        /* renamed from: n, reason: collision with root package name */
        public long f402650n;

        /* renamed from: o, reason: collision with root package name */
        public int f402651o;

        /* renamed from: p, reason: collision with root package name */
        public int f402652p;

        /* renamed from: q, reason: collision with root package name */
        public final int f402653q;

        public b(org.reactivestreams.d dVar, l41.o oVar, int i12, int i13) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f402646j = atomicReference;
            this.f402647k = new AtomicLong();
            this.f402638b = dVar;
            this.f402639c = oVar;
            this.f402640d = i12;
            this.f402641e = i13;
            this.f402653q = Math.max(1, i12 >> 1);
            atomicReference.lazySet(f402636r);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402648l, eVar)) {
                this.f402648l = eVar;
                this.f402638b.K(this);
                if (this.f402645i) {
                    return;
                }
                int i12 = this.f402640d;
                if (i12 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i12);
                }
            }
        }

        public final boolean a() {
            if (this.f402645i) {
                q41.f<U> fVar = this.f402642f;
                if (fVar != null) {
                    fVar.clear();
                }
                return true;
            }
            if (this.f402644h.get() == null) {
                return false;
            }
            q41.f<U> fVar2 = this.f402642f;
            if (fVar2 != null) {
                fVar2.clear();
            }
            this.f402644h.g(this.f402638b);
            return true;
        }

        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            long j12;
            long j13;
            long j14;
            boolean z12;
            int i12;
            int i13;
            long j15;
            long j16;
            org.reactivestreams.d<? super U> dVar = this.f402638b;
            int iAddAndGet = 1;
            while (!a()) {
                q41.f<U> fVar = this.f402642f;
                long jAddAndGet = this.f402647k.get();
                boolean z13 = jAddAndGet == Long.MAX_VALUE;
                long j17 = 0;
                if (fVar != null) {
                    long j18 = 0;
                    j12 = 0;
                    while (jAddAndGet != 0) {
                        U uPoll = fVar.poll();
                        if (a()) {
                            return;
                        }
                        if (uPoll == null) {
                            break;
                        }
                        dVar.onNext(uPoll);
                        j12++;
                        j18++;
                        jAddAndGet--;
                    }
                    if (j18 != 0) {
                        jAddAndGet = z13 ? Long.MAX_VALUE : this.f402647k.addAndGet(-j18);
                    }
                } else {
                    j12 = 0;
                }
                boolean z14 = this.f402643g;
                q41.f<U> fVar2 = this.f402642f;
                a<?, ?>[] aVarArr = this.f402646j.get();
                int length = aVarArr.length;
                if (z14 && ((fVar2 == null || fVar2.isEmpty()) && length == 0)) {
                    this.f402644h.g(this.f402638b);
                    return;
                }
                int i14 = iAddAndGet;
                if (length != 0) {
                    long j19 = this.f402650n;
                    int i15 = this.f402651o;
                    if (length <= i15 || aVarArr[i15].f402628b != j19) {
                        if (length <= i15) {
                            i15 = 0;
                        }
                        for (int i16 = 0; i16 < length && aVarArr[i15].f402628b != j19; i16++) {
                            i15++;
                            if (i15 == length) {
                                i15 = 0;
                            }
                        }
                        this.f402651o = i15;
                        this.f402650n = aVarArr[i15].f402628b;
                    }
                    int i17 = i15;
                    boolean z15 = false;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            z12 = z15;
                            break;
                        }
                        if (a()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i17];
                        Object obj = null;
                        while (true) {
                            q41.g<U> gVar = aVar.f402633g;
                            if (gVar == null) {
                                i12 = length;
                                break;
                            }
                            i12 = length;
                            Object obj2 = obj;
                            long j22 = j17;
                            while (true) {
                                if (jAddAndGet == j17) {
                                    j15 = j17;
                                    break;
                                }
                                if (a()) {
                                    return;
                                }
                                try {
                                    U uPoll2 = gVar.poll();
                                    if (uPoll2 == null) {
                                        obj2 = uPoll2;
                                        j15 = 0;
                                        break;
                                    } else {
                                        dVar.onNext(uPoll2);
                                        jAddAndGet--;
                                        j22++;
                                        obj2 = uPoll2;
                                        j17 = 0;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    SubscriptionHelper.a(aVar);
                                    this.f402644h.b(th2);
                                    this.f402648l.cancel();
                                    if (a()) {
                                        return;
                                    }
                                    f(aVar);
                                    i18++;
                                    i13 = i12;
                                    z15 = true;
                                }
                            }
                            if (j22 != j15) {
                                jAddAndGet = !z13 ? this.f402647k.addAndGet(-j22) : Long.MAX_VALUE;
                                aVar.a(j22);
                                j16 = 0;
                            } else {
                                j16 = j15;
                            }
                            if (jAddAndGet == j16 || obj2 == null) {
                                break;
                            }
                            length = i12;
                            obj = obj2;
                            j17 = 0;
                        }
                        boolean z16 = aVar.f402632f;
                        q41.g<U> gVar2 = aVar.f402633g;
                        if (z16 && (gVar2 == null || gVar2.isEmpty())) {
                            f(aVar);
                            if (a()) {
                                return;
                            }
                            j12++;
                            z15 = true;
                        }
                        if (jAddAndGet == 0) {
                            z12 = z15;
                            break;
                        }
                        i17++;
                        i13 = i12;
                        if (i17 == i13) {
                            i17 = 0;
                        }
                        i18++;
                        length = i13;
                        j17 = 0;
                    }
                    this.f402651o = i17;
                    this.f402650n = aVarArr[i17].f402628b;
                    j14 = j12;
                    j13 = 0;
                } else {
                    j13 = 0;
                    j14 = j12;
                    z12 = false;
                }
                if (j14 != j13 && !this.f402645i) {
                    this.f402648l.request(j14);
                }
                if (z12) {
                    iAddAndGet = i14;
                } else {
                    iAddAndGet = addAndGet(-i14);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            q41.f<U> fVar;
            if (this.f402645i) {
                return;
            }
            this.f402645i = true;
            this.f402648l.cancel();
            AtomicReference<a<?, ?>[]> atomicReference = this.f402646j;
            a<?, ?>[] aVarArr = f402637s;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    SubscriptionHelper.a(aVar);
                }
                this.f402644h.c();
            }
            if (getAndIncrement() != 0 || (fVar = this.f402642f) == null) {
                return;
            }
            fVar.clear();
        }

        public final q41.f d() {
            q41.f<U> iVar = this.f402642f;
            if (iVar == null) {
                iVar = this.f402640d == Integer.MAX_VALUE ? new q41.i<>(this.f402641e) : new q41.h<>(this.f402640d);
                this.f402642f = iVar;
            }
            return iVar;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402643g) {
                return;
            }
            this.f402643g = true;
            b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void f(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f402646j;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (aVarArr2[i12] == aVar) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f402636r;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i12);
                    System.arraycopy(aVarArr2, i12 + 1, aVarArr3, i12, (length - i12) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402643g) {
                C47998a.b(th2);
                return;
            }
            if (this.f402644h.b(th2)) {
                this.f402643g = true;
                for (a<?, ?> aVar : this.f402646j.getAndSet(f402637s)) {
                    aVar.getClass();
                    SubscriptionHelper.a(aVar);
                }
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402643g) {
                return;
            }
            try {
                org.reactivestreams.c<? extends U> cVarApply = this.f402639c.apply(t12);
                Objects.requireNonNull(cVarApply, "The mapper returned a null Publisher");
                org.reactivestreams.c<? extends U> cVar = cVarApply;
                if (!(cVar instanceof l41.s)) {
                    int i12 = this.f402641e;
                    long j12 = this.f402649m;
                    this.f402649m = 1 + j12;
                    a<?, ?> aVar = new a<>(this, i12, j12);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f402646j;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == f402637s) {
                            SubscriptionHelper.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        cVar.d(aVar);
                        return;
                    }
                }
                try {
                    Object obj = ((l41.s) cVar).get();
                    if (obj == null) {
                        if (this.f402640d == Integer.MAX_VALUE || this.f402645i) {
                            return;
                        }
                        int i13 = this.f402652p + 1;
                        this.f402652p = i13;
                        int i14 = this.f402653q;
                        if (i13 == i14) {
                            this.f402652p = 0;
                            this.f402648l.request(i14);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j13 = this.f402647k.get();
                        q41.f<U> fVar = this.f402642f;
                        if (j13 == 0 || !(fVar == 0 || fVar.isEmpty())) {
                            if (fVar == 0) {
                                fVar = (q41.f<U>) d();
                            }
                            if (!fVar.offer(obj)) {
                                onError(new MissingBackpressureException("Scalar queue full?!"));
                            }
                        } else {
                            this.f402638b.onNext(obj);
                            if (j13 != Long.MAX_VALUE) {
                                this.f402647k.decrementAndGet();
                            }
                            if (this.f402640d != Integer.MAX_VALUE && !this.f402645i) {
                                int i15 = this.f402652p + 1;
                                this.f402652p = i15;
                                int i16 = this.f402653q;
                                if (i15 == i16) {
                                    this.f402652p = 0;
                                    this.f402648l.request(i16);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!d().offer(obj)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    c();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f402644h.b(th2);
                    b();
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f402648l.cancel();
                onError(th3);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402647k, j12);
                b();
            }
        }
    }

    public C41834b0(AbstractC41777j abstractC41777j, l41.o oVar, int i12, int i13) {
        super(abstractC41777j);
        this.f402625d = oVar;
        this.f402626e = i12;
        this.f402627f = i13;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        l41.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar = this.f402625d;
        if (C41882r1.b(abstractC41777j, (InterfaceC41782o) dVar, oVar)) {
            return;
        }
        abstractC41777j.q(new b(dVar, oVar, this.f402626e, this.f402627f));
    }
}
