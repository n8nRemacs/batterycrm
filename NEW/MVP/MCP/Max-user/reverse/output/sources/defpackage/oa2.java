package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class oa2 extends Segment {
    public final pv0 a;
    public final /* synthetic */ AtomicReferenceArray b;

    public oa2(long j, oa2 oa2Var, pv0 pv0Var, int i) {
        super(j, oa2Var, i);
        this.a = pv0Var;
        this.b = new AtomicReferenceArray(rv0.b * 2);
    }

    public final boolean a(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.b;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object c(int i) {
        return this.b.get((i * 2) + 1);
    }

    public final void d(int i, boolean z) {
        if (z) {
            this.a.I((this.id * rv0.b) + i);
        }
        onSlotCleaned();
    }

    public final void e(int i, Object obj) {
        this.b.set(i * 2, obj);
    }

    public final void f(int i, Object obj) {
        this.b.set((i * 2) + 1, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return rv0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        e(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r6 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCancellation(int r4, java.lang.Throwable r5, defpackage.x74 r6) {
        /*
            r3 = this;
            int r5 = defpackage.rv0.b
            if (r4 < r5) goto L6
            r6 = 1
            goto L7
        L6:
            r6 = 0
        L7:
            if (r6 == 0) goto La
            int r4 = r4 - r5
        La:
            int r5 = r4 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.b
            r0.get(r5)
        L11:
            java.lang.Object r5 = r3.c(r4)
            boolean r0 = r5 instanceof defpackage.ojh
            pv0 r1 = r3.a
            r2 = 0
            if (r0 != 0) goto L62
            boolean r0 = r5 instanceof defpackage.pjh
            if (r0 == 0) goto L21
            goto L62
        L21:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.j
            if (r5 == r0) goto L59
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.k
            if (r5 != r0) goto L2a
            goto L59
        L2a:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.g
            if (r5 == r0) goto L11
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.f
            if (r5 != r0) goto L33
            goto L11
        L33:
            kotlinx.coroutines.internal.Symbol r4 = defpackage.rv0.i
            if (r5 == r4) goto L7c
            kotlinx.coroutines.internal.Symbol r4 = defpackage.rv0.d
            if (r5 != r4) goto L3c
            goto L7c
        L3c:
            kotlinx.coroutines.internal.Symbol r4 = defpackage.rv0.l
            if (r5 != r4) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L59:
            r3.e(r4, r2)
            if (r6 == 0) goto L7c
            r1.getClass()
            return
        L62:
            if (r6 == 0) goto L67
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.j
            goto L69
        L67:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.rv0.k
        L69:
            boolean r5 = r3.a(r5, r4, r0)
            if (r5 == 0) goto L11
            r3.e(r4, r2)
            r5 = r6 ^ 1
            r3.d(r4, r5)
            if (r6 == 0) goto L7c
            r1.getClass()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa2.onCancellation(int, java.lang.Throwable, x74):void");
    }
}
