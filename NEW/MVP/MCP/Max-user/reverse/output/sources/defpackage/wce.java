package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class wce {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(wce.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(wce.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(wce.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(wce.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(wce.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final js0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public wce(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(ho7.f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "The number of acquired permits should be in 0..").toString());
        }
        yce yceVar = new yce(0L, null, 2);
        this.head$volatile = yceVar;
        this.tail$volatile = yceVar;
        this._availablePermits$volatile = i;
        this.b = new js0(4, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.f(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q44 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.wce.g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            qqg r3 = defpackage.qqg.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            kotlin.coroutines.Continuation r5 = defpackage.hni.f(r5)
            l42 r5 = defpackage.nyi.a(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            js0 r0 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.f(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.n()
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.v()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wce.a(q44):java.lang.Object");
    }

    public final boolean b(ojh ojhVar) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        yce yceVar = (yce) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        uce uceVar = uce.a;
        long j = andIncrement / xce.f;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(yceVar, j, uceVar);
            if (!SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM19getSegmentimpl = SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM19getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM19getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM19getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM19getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM19getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        yce yceVar2 = (yce) SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % xce.f);
        AtomicReferenceArray atomicReferenceArray = yceVar2.a;
        while (!atomicReferenceArray.compareAndSet(i, null, ojhVar)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = xce.b;
                Symbol symbol2 = xce.c;
                AtomicReferenceArray atomicReferenceArray2 = yceVar2.a;
                while (!atomicReferenceArray2.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray2.get(i) != symbol) {
                        return false;
                    }
                }
                ((k42) ojhVar).f(qqg.a, this.b);
                return true;
            }
        }
        ojhVar.a(yceVar2, i);
        return true;
    }

    public final void c() {
        int i;
        Object objFindSegmentInternal;
        boolean zG;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            yce yceVar = (yce) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / xce.f;
            vce vceVar = vce.a;
            while (true) {
                objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(yceVar, j, vceVar);
                if (SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal)) {
                    break;
                }
                Segment segmentM19getSegmentimpl = SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM19getSegmentimpl.id) {
                        break;
                    }
                    if (!segmentM19getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM19getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM19getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM19getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
            yce yceVar2 = (yce) SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
            yceVar2.cleanPrev();
            AtomicReferenceArray atomicReferenceArray = yceVar2.a;
            zG = false;
            if (yceVar2.id <= j) {
                int i3 = (int) (andIncrement2 % xce.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, xce.b);
                if (andSet == null) {
                    int i4 = xce.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == xce.c) {
                            zG = true;
                            break;
                        }
                    }
                    Symbol symbol = xce.b;
                    Symbol symbol2 = xce.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, symbol, symbol2)) {
                            if (atomicReferenceArray.get(i3) != symbol) {
                                break;
                            }
                        } else {
                            zG = true;
                            break;
                        }
                    }
                    zG = !zG;
                } else if (andSet != xce.e) {
                    boolean z = andSet instanceof k42;
                    qqg qqgVar = qqg.a;
                    if (z) {
                        k42 k42Var = (k42) andSet;
                        Symbol symbolJ = k42Var.j(qqgVar, this.b);
                        if (symbolJ != null) {
                            k42Var.m(symbolJ);
                            zG = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof nbe)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zG = ((mbe) ((nbe) andSet)).g(this, qqgVar);
                    }
                }
            }
        } while (!zG);
    }
}
