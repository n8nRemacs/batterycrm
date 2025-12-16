package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class pv0 implements n92 {
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(pv0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(pv0.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(pv0.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(pv0.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(pv0.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(pv0.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(pv0.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s0 = AtomicReferenceFieldUpdater.newUpdater(pv0.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t0 = AtomicReferenceFieldUpdater.newUpdater(pv0.class, Object.class, "closeHandler$volatile");

    public pv0(int i) {
        this.a = i;
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        oa2 oa2Var = rv0.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : BuildConfig.MAX_TIME_TO_UPLOAD : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        oa2 oa2Var2 = new oa2(0L, null, this, 3);
        this.sendSegment$volatile = oa2Var2;
        this.receiveSegment$volatile = oa2Var2;
        this.bufferEndSegment$volatile = y() ? rv0.a : oa2Var2;
        this._closeCause$volatile = rv0.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object B(defpackage.pv0 r13, defpackage.q44 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.nv0
            if (r0 == 0) goto L14
            r0 = r14
            nv0 r0 = (defpackage.nv0) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.X = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            nv0 r0 = new nv0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.d
            int r0 = r6.X
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            defpackage.g8j.b(r14)
            na2 r14 = (defpackage.na2) r14
            java.lang.Object r13 = r14.a
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.g8j.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.pv0.Y
            java.lang.Object r14 = r14.get(r13)
            oa2 r14 = (defpackage.oa2) r14
        L3e:
            boolean r0 = r13.v()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.p()
            la2 r14 = new la2
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.pv0.c
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.rv0.b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.id
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            oa2 r0 = r13.o(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.G(r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r14 = defpackage.rv0.m
            if (r13 == r14) goto La0
            kotlinx.coroutines.internal.Symbol r14 = defpackage.rv0.o
            if (r13 != r14) goto L8b
            long r13 = r7.s()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.cleanPrev()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            kotlinx.coroutines.internal.Symbol r14 = defpackage.rv0.n
            if (r13 != r14) goto L9c
            r6.X = r1
            r1 = r7
            java.lang.Object r13 = r1.C(r2, r3, r4, r6)
            g84 r14 = defpackage.g84.a
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.cleanPrev()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.B(pv0, q44):java.lang.Object");
    }

    public static final oa2 c(pv0 pv0Var, long j, oa2 oa2Var) {
        Object objFindSegmentInternal;
        pv0 pv0Var2;
        oa2 oa2Var2 = rv0.a;
        qv0 qv0Var = qv0.a;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(oa2Var, j, qv0Var);
            if (!SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM19getSegmentimpl = SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(pv0Var);
                    if (segment.id >= segmentM19getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM19getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(pv0Var, segment, segmentM19getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(pv0Var) != segment) {
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
        boolean zM21isClosedimpl = SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zM21isClosedimpl) {
            pv0Var.w();
            if (oa2Var.id * rv0.b < atomicLongFieldUpdater.get(pv0Var)) {
                oa2Var.cleanPrev();
                return null;
            }
        } else {
            oa2 oa2Var3 = (oa2) SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
            long j2 = oa2Var3.id;
            if (j2 <= j) {
                return oa2Var3;
            }
            long j3 = j2 * rv0.b;
            while (true) {
                long j4 = b.get(pv0Var);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    pv0Var2 = pv0Var;
                    break;
                }
                pv0Var2 = pv0Var;
                if (b.compareAndSet(pv0Var2, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                pv0Var = pv0Var2;
            }
            if (oa2Var3.id * rv0.b < atomicLongFieldUpdater.get(pv0Var2)) {
                oa2Var3.cleanPrev();
            }
        }
        return null;
    }

    public static final void d(pv0 pv0Var, Object obj, l42 l42Var) {
        l42Var.resumeWith(new ipd(pv0Var.r()));
    }

    public static final int e(pv0 pv0Var, oa2 oa2Var, int i, Object obj, long j, Object obj2, boolean z) {
        oa2Var.e(i, obj);
        if (z) {
            return pv0Var.H(oa2Var, i, obj, j, obj2, z);
        }
        Object objC = oa2Var.c(i);
        if (objC == null) {
            if (pv0Var.f(j)) {
                if (oa2Var.a(null, i, rv0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oa2Var.a(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objC instanceof ojh) {
            oa2Var.e(i, null);
            if (pv0Var.E(objC, obj)) {
                oa2Var.f(i, rv0.i);
                return 0;
            }
            Symbol symbol = rv0.k;
            if (oa2Var.b.getAndSet((i * 2) + 1, symbol) == symbol) {
                return 5;
            }
            oa2Var.d(i, true);
            return 5;
        }
        return pv0Var.H(oa2Var, i, obj, j, obj2, z);
    }

    public static void t(pv0 pv0Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if ((atomicLongFieldUpdater.addAndGet(pv0Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(pv0Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(Object obj, Continuation continuation) {
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        l42Var.resumeWith(new ipd(r()));
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.oa2 r14, int r15, long r16, defpackage.q44 r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.C(oa2, int, long, q44):java.lang.Object");
    }

    public final void D(ojh ojhVar, boolean z) {
        if (ojhVar instanceof k42) {
            ((Continuation) ojhVar).resumeWith(new ipd(z ? q() : r()));
            return;
        }
        if (ojhVar instanceof bcd) {
            ((bcd) ojhVar).a.resumeWith(new na2(new la2(p())));
            return;
        }
        if (!(ojhVar instanceof kv0)) {
            if (ojhVar instanceof nbe) {
                ((mbe) ((nbe) ojhVar)).g(this, rv0.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + ojhVar).toString());
            }
        }
        kv0 kv0Var = (kv0) ojhVar;
        l42 l42Var = kv0Var.b;
        kv0Var.b = null;
        kv0Var.a = rv0.l;
        Throwable thP = kv0Var.c.p();
        if (thP == null) {
            l42Var.resumeWith(Boolean.FALSE);
        } else {
            l42Var.resumeWith(new ipd(thP));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof nbe) {
            return ((mbe) ((nbe) obj)).g(this, obj2);
        }
        if (obj instanceof bcd) {
            return rv0.a(((bcd) obj).a, new na2(obj2), null);
        }
        if (!(obj instanceof kv0)) {
            if (obj instanceof k42) {
                return rv0.a((k42) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kv0 kv0Var = (kv0) obj;
        l42 l42Var = kv0Var.b;
        kv0Var.b = null;
        kv0Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        kv0Var.c.getClass();
        return rv0.a(l42Var, bool, null);
    }

    public final boolean F(Object obj, oa2 oa2Var, int i) {
        char c2;
        boolean z = obj instanceof k42;
        qqg qqgVar = qqg.a;
        if (z) {
            return rv0.a((k42) obj, qqgVar, null);
        }
        if (!(obj instanceof nbe)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iH = ((mbe) obj).h(this, qqgVar);
        Symbol symbol = pbe.a;
        if (iH == 0) {
            c2 = 1;
        } else if (iH != 1) {
            c2 = 3;
            if (iH != 2) {
                if (iH != 3) {
                    throw new IllegalStateException(("Unexpected internal result: " + iH).toString());
                }
                c2 = 4;
            }
        } else {
            c2 = 2;
        }
        if (c2 == 2) {
            oa2Var.e(i, null);
        }
        return c2 == 1;
    }

    public final Object G(oa2 oa2Var, int i, long j, Object obj) {
        Object objC = oa2Var.c(i);
        AtomicReferenceArray atomicReferenceArray = oa2Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objC == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return rv0.n;
                }
                if (oa2Var.a(objC, i, obj)) {
                    n();
                    return rv0.m;
                }
            }
        } else if (objC == rv0.d && oa2Var.a(objC, i, rv0.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i * 2);
            oa2Var.e(i, null);
            return obj2;
        }
        while (true) {
            Object objC2 = oa2Var.c(i);
            if (objC2 == null || objC2 == rv0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (oa2Var.a(objC2, i, rv0.h)) {
                        n();
                        return rv0.o;
                    }
                } else {
                    if (obj == null) {
                        return rv0.n;
                    }
                    if (oa2Var.a(objC2, i, obj)) {
                        n();
                        return rv0.m;
                    }
                }
            } else {
                if (objC2 != rv0.d) {
                    Symbol symbol = rv0.j;
                    if (objC2 != symbol && objC2 != rv0.h) {
                        if (objC2 == rv0.l) {
                            n();
                            return rv0.o;
                        }
                        if (objC2 != rv0.g && oa2Var.a(objC2, i, rv0.f)) {
                            boolean z = objC2 instanceof pjh;
                            if (z) {
                                objC2 = ((pjh) objC2).a;
                            }
                            if (F(objC2, oa2Var, i)) {
                                oa2Var.f(i, rv0.i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                oa2Var.e(i, null);
                                return obj3;
                            }
                            oa2Var.f(i, symbol);
                            oa2Var.onSlotCleaned();
                            if (z) {
                                n();
                            }
                            return rv0.o;
                        }
                    }
                    return rv0.o;
                }
                if (oa2Var.a(objC2, i, rv0.i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    oa2Var.e(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int H(oa2 oa2Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objC = oa2Var.c(i);
            if (objC == null) {
                if (!f(j) || z) {
                    if (z) {
                        if (oa2Var.a(null, i, rv0.j)) {
                            oa2Var.onSlotCleaned();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (oa2Var.a(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (oa2Var.a(null, i, rv0.d)) {
                    break;
                }
            } else {
                if (objC != rv0.e) {
                    Symbol symbol = rv0.k;
                    if (objC == symbol) {
                        oa2Var.e(i, null);
                        return 5;
                    }
                    if (objC == rv0.h) {
                        oa2Var.e(i, null);
                        return 5;
                    }
                    if (objC == rv0.l) {
                        oa2Var.e(i, null);
                        w();
                        return 4;
                    }
                    oa2Var.e(i, null);
                    if (objC instanceof pjh) {
                        objC = ((pjh) objC).a;
                    }
                    if (E(objC, obj)) {
                        oa2Var.f(i, rv0.i);
                        return 0;
                    }
                    if (oa2Var.b.getAndSet((i * 2) + 1, symbol) != symbol) {
                        oa2Var.d(i, true);
                    }
                    return 5;
                }
                if (oa2Var.a(objC, i, rv0.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        pv0 pv0Var = this;
        if (pv0Var.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(pv0Var) > j) {
                break;
            } else {
                pv0Var = this;
            }
        }
        int i = rv0.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = o;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(pv0Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(pv0Var)) && j2 == atomicLongFieldUpdater.get(pv0Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(pv0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(pv0Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        pv0Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(pv0Var);
                    long j5 = atomicLongFieldUpdater2.get(pv0Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(pv0Var)) {
                        break;
                    }
                    if (z) {
                        pv0Var = this;
                    } else {
                        pv0Var = this;
                        atomicLongFieldUpdater2.compareAndSet(pv0Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(pv0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(pv0Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        pv0Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.ccd
    public final ibe a() {
        lv0 lv0Var = lv0.a;
        uog.d(3, lv0Var);
        mv0 mv0Var = mv0.a;
        uog.d(3, mv0Var);
        return new zva(this, lv0Var, mv0Var, (jv0) null);
    }

    @Override // defpackage.ccd
    public final Object b() {
        oa2 oa2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = b.get(this);
        if (u(j2, true)) {
            return new la2(p());
        }
        long j3 = j2 & 1152921504606846975L;
        ma2 ma2Var = na2.b;
        if (j >= j3) {
            return ma2Var;
        }
        Object obj = rv0.k;
        oa2 oa2Var2 = (oa2) Y.get(this);
        while (!v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = rv0.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (oa2Var2.id != j5) {
                oa2 oa2VarO = o(j5, oa2Var2);
                if (oa2VarO == null) {
                    continue;
                } else {
                    oa2Var = oa2VarO;
                }
            } else {
                oa2Var = oa2Var2;
            }
            Object objG = G(oa2Var, i, andIncrement, obj);
            oa2 oa2Var3 = oa2Var;
            if (objG == rv0.m) {
                ojh ojhVar = obj instanceof ojh ? (ojh) obj : null;
                if (ojhVar != null) {
                    ojhVar.a(oa2Var3, i);
                }
                I(andIncrement);
                oa2Var3.onSlotCleaned();
                return ma2Var;
            }
            if (objG != rv0.o) {
                if (objG == rv0.n) {
                    throw new IllegalStateException("unexpected");
                }
                oa2Var3.cleanPrev();
                return objG;
            }
            if (andIncrement < s()) {
                oa2Var3.cleanPrev();
            }
            oa2Var2 = oa2Var3;
        }
        return new la2(p());
    }

    @Override // defpackage.ccd
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    public final boolean f(long j) {
        return j < d.get(this) || j < c.get(this) + ((long) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // defpackage.cde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.pv0.b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.u(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            ma2 r13 = defpackage.na2.b
            if (r1 == 0) goto L20
            return r13
        L20:
            kotlinx.coroutines.internal.Symbol r6 = defpackage.rv0.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.pv0.X
            java.lang.Object r1 = r1.get(r15)
            oa2 r1 = (defpackage.oa2) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.u(r2, r9)
            int r14 = defpackage.rv0.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.id
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            oa2 r3 = c(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            qqg r3 = defpackage.qqg.a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.cleanPrev()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.pv0.c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.cleanPrev()
        L8a:
            java.lang.Throwable r1 = r15.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.onSlotCleaned()
            java.lang.Throwable r1 = r15.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof defpackage.ojh
            if (r3 == 0) goto Lb2
            ojh r6 = (defpackage.ojh) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.onSlotCleaned()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.cleanPrev()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // defpackage.cde
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.Object r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.h(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean i(Throwable th) {
        return j(th, false);
    }

    @Override // defpackage.ccd
    public final kv0 iterator() {
        return new kv0(this);
    }

    public final boolean j(Throwable th, boolean z) {
        pv0 pv0Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (!z) {
            pv0Var = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                pv0Var = this;
                break;
            }
            oa2 oa2Var = rv0.a;
            pv0Var = this;
        } while (!atomicLongFieldUpdater.compareAndSet(pv0Var, j5, (j5 & 1152921504606846975L) + (1 << 60)));
        Symbol symbol = rv0.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(pv0Var, j4, (3 << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(pv0Var, j, (j3 << 60) + j2));
        }
        w();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = t0;
                obj = atomicReferenceFieldUpdater2.get(this);
                Symbol symbol2 = obj == null ? rv0.q : rv0.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                uog.d(1, obj);
                ((em6) obj).invoke(p());
                return z2;
            }
        }
        return z2;
    }

    @Override // defpackage.ccd
    public final Object k(wf3 wf3Var) {
        return B(this, wf3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r1 = (defpackage.oa2) r1.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oa2 l(long r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.l(long):oa2");
    }

    public final void m(long j) {
        oa2 oa2Var = (oa2) Y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.a + j2, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = rv0.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (oa2Var.id != j4) {
                    oa2 oa2VarO = o(j4, oa2Var);
                    if (oa2VarO != null) {
                        oa2Var = oa2VarO;
                    }
                }
                oa2 oa2Var2 = oa2Var;
                if (G(oa2Var2, i, j2, null) != rv0.o || j2 < s()) {
                    oa2Var2.cleanPrev();
                }
                oa2Var = oa2Var2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0192, code lost:
    
        t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.n():void");
    }

    public final oa2 o(long j, oa2 oa2Var) {
        Object objFindSegmentInternal;
        long j2;
        oa2 oa2Var2 = rv0.a;
        qv0 qv0Var = qv0.a;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(oa2Var, j, qv0Var);
            if (!SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM19getSegmentimpl = SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
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
        if (SegmentOrClosed.m21isClosedimpl(objFindSegmentInternal)) {
            w();
            if (oa2Var.id * rv0.b < s()) {
                oa2Var.cleanPrev();
                return null;
            }
        } else {
            oa2 oa2Var3 = (oa2) SegmentOrClosed.m19getSegmentimpl(objFindSegmentInternal);
            if (!y() && j <= d.get(this) / rv0.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Z;
                    Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                    if (segment2.id >= oa2Var3.id || !oa2Var3.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, oa2Var3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                            if (oa2Var3.decPointers$kotlinx_coroutines_core()) {
                                oa2Var3.remove();
                            }
                        }
                    }
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                }
            }
            long j3 = oa2Var3.id;
            if (j3 <= j) {
                return oa2Var3;
            }
            long j4 = j3 * rv0.b;
            do {
                j2 = c.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!c.compareAndSet(this, j2, j4));
            if (oa2Var3.id * rv0.b < s()) {
                oa2Var3.cleanPrev();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) s0.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new ClosedReceiveChannelException("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new ClosedSendChannelException("Channel was closed") : thP;
    }

    public final long s() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        r16 = r7;
        r3 = (defpackage.oa2) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
    
        r0 = (defpackage.oa2) r0.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.u(long, boolean):boolean");
    }

    public final boolean v() {
        return u(b.get(this), true);
    }

    public final boolean w() {
        return u(b.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j = d.get(this);
        return j == 0 || j == BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r5, defpackage.oa2 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r7.getNext()
            oa2 r0 = (defpackage.oa2) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r7.getNext()
            oa2 r5 = (defpackage.oa2) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.pv0.Z
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L49
            r6.remove()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L22
            r7.remove()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv0.z(long, oa2):void");
    }
}
