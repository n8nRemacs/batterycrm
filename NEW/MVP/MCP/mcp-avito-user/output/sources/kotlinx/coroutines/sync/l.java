package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.H1;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.internal.C43235e;
import kotlinx.coroutines.internal.X;
import kotlinx.coroutines.internal.Y;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.selects.r;

/* compiled from: Semaphore.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004R\u0011\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/sync/l;", "Lkotlinx/coroutines/sync/k;", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/q;", "head", "tail", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class l implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412269c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412270d = AtomicLongFieldUpdater.newUpdater(l.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412271e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412272f = AtomicLongFieldUpdater.newUpdater(l.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412273g = AtomicIntegerFieldUpdater.newUpdater(l.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f412274a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Throwable, G0> f412275b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: Semaphore.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.p<Long, q, q> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f412276b = new a();

        public a() {
            super(2, p.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // Y41.p
        public final q invoke(Long l12, q qVar) {
            int i12 = p.f412281a;
            return new q(l12.longValue(), qVar, 0);
        }
    }

    public l(int i12) {
        this.f412274a = i12;
        if (i12 <= 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "The number of acquired permits should be in 0..").toString());
        }
        q qVar = new q(0L, null, 2);
        this.head$volatile = qVar;
        this.tail$volatile = qVar;
        this._availablePermits$volatile = i12;
        this.f412275b = new m(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r1.C(r4.f412275b, kotlin.G0.f406611a);
     */
    @Override // kotlinx.coroutines.sync.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.l.f412273g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f412274a
            if (r1 > r2) goto L0
            if (r1 <= 0) goto Lf
            kotlin.G0 r5 = kotlin.G0.f406611a
            goto L56
        Lf:
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.r r1 = kotlinx.coroutines.C43302t.b(r1)
            boolean r3 = r4.e(r1)     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L36
        L1d:
            int r3 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L34
            if (r3 > r2) goto L1d
            if (r3 <= 0) goto L2d
            kotlin.G0 r0 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L34
            Y41.l<java.lang.Throwable, kotlin.G0> r2 = r4.f412275b     // Catch: java.lang.Throwable -> L34
            r1.C(r2, r0)     // Catch: java.lang.Throwable -> L34
            goto L36
        L2d:
            boolean r3 = r4.e(r1)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L1d
            goto L36
        L34:
            r5 = move-exception
            goto L57
        L36:
            java.lang.Object r0 = r1.o()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L43
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L43:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L4b
            r5 = r0
            goto L4d
        L4b:
            kotlin.G0 r5 = kotlin.G0.f406611a
        L4d:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L54
            goto L56
        L54:
            kotlin.G0 r5 = kotlin.G0.f406611a
        L56:
            return r5
        L57:
            r1.z()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.l.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean e(H1 h12) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412271e;
        q qVar = (q) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f412272f.getAndIncrement(this);
        a aVar = a.f412276b;
        long j12 = andIncrement / p.f412286f;
        loop0: while (true) {
            objA = C43235e.a(qVar, j12, aVar);
            if (!Y.b(objA)) {
                X xA2 = Y.a(objA);
                while (true) {
                    X x12 = (X) atomicReferenceFieldUpdater.get(this);
                    if (x12.f411887d >= xA2.f411887d) {
                        break loop0;
                    }
                    if (!xA2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, x12, xA2)) {
                        if (atomicReferenceFieldUpdater.get(this) != x12) {
                            if (xA2.f()) {
                                xA2.e();
                            }
                        }
                    }
                    if (x12.f()) {
                        x12.e();
                    }
                }
            } else {
                break;
            }
        }
        q qVar2 = (q) Y.a(objA);
        int i12 = (int) (andIncrement % p.f412286f);
        AtomicReferenceArray atomicReferenceArray = qVar2.f412287f;
        while (!atomicReferenceArray.compareAndSet(i12, null, h12)) {
            if (atomicReferenceArray.get(i12) != null) {
                a0 a0Var = p.f412282b;
                a0 a0Var2 = p.f412283c;
                while (!atomicReferenceArray.compareAndSet(i12, a0Var, a0Var2)) {
                    if (atomicReferenceArray.get(i12) != a0Var) {
                        return false;
                    }
                }
                if (h12 instanceof InterfaceC43271q) {
                    ((InterfaceC43271q) h12).C(this.f412275b, G0.f406611a);
                } else {
                    if (!(h12 instanceof r)) {
                        throw new IllegalStateException(("unexpected: " + h12).toString());
                    }
                    ((r) h12).d(G0.f406611a);
                }
                return true;
            }
        }
        h12.c(qVar2, i12);
        return true;
    }

    @Override // kotlinx.coroutines.sync.k
    public final void release() {
        int i12;
        Object objA;
        boolean zE2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f412273g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i13 = this.f412274a;
            if (andIncrement >= i13) {
                do {
                    i12 = atomicIntegerFieldUpdater.get(this);
                    if (i12 <= i13) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, i13));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i13).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412269c;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f412270d.getAndIncrement(this);
            long j12 = andIncrement2 / p.f412286f;
            n nVar = n.f412278b;
            while (true) {
                objA = C43235e.a(qVar, j12, nVar);
                if (Y.b(objA)) {
                    break;
                }
                X xA2 = Y.a(objA);
                while (true) {
                    X x12 = (X) atomicReferenceFieldUpdater.get(this);
                    if (x12.f411887d >= xA2.f411887d) {
                        break;
                    }
                    if (!xA2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, x12, xA2)) {
                        if (atomicReferenceFieldUpdater.get(this) != x12) {
                            if (xA2.f()) {
                                xA2.e();
                            }
                        }
                    }
                    if (x12.f()) {
                        x12.e();
                    }
                }
            }
            q qVar2 = (q) Y.a(objA);
            qVar2.b();
            zE2 = false;
            if (qVar2.f411887d <= j12) {
                int i14 = (int) (andIncrement2 % p.f412286f);
                a0 a0Var = p.f412282b;
                AtomicReferenceArray atomicReferenceArray = qVar2.f412287f;
                Object andSet = atomicReferenceArray.getAndSet(i14, a0Var);
                if (andSet == null) {
                    int i15 = p.f412281a;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (atomicReferenceArray.get(i14) == p.f412283c) {
                            zE2 = true;
                            break;
                        }
                    }
                    a0 a0Var2 = p.f412282b;
                    a0 a0Var3 = p.f412284d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i14, a0Var2, a0Var3)) {
                            if (atomicReferenceArray.get(i14) != a0Var2) {
                                break;
                            }
                        } else {
                            zE2 = true;
                            break;
                        }
                    }
                    zE2 = !zE2;
                } else if (andSet != p.f412285e) {
                    if (andSet instanceof InterfaceC43271q) {
                        InterfaceC43271q interfaceC43271q = (InterfaceC43271q) andSet;
                        a0 a0VarT = interfaceC43271q.t(this.f412275b, G0.f406611a);
                        if (a0VarT != null) {
                            interfaceC43271q.I(a0VarT);
                            zE2 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof r)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zE2 = ((r) andSet).e(this, G0.f406611a);
                    }
                }
            }
        } while (!zE2);
    }
}
