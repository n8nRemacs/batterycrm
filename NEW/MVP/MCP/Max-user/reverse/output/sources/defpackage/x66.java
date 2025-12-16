package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class x66 extends AtomicLong implements qsc {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final aof d;

    public x66(aof aofVar, Object[] objArr) {
        this.a = objArr;
        this.d = aofVar;
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.c = true;
    }

    @Override // defpackage.o1f
    public final void clear() {
        this.b = this.a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        r12.b = r6;
        r13 = addAndGet(-r8);
     */
    @Override // defpackage.cof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r13) {
        /*
            r12 = this;
            boolean r0 = defpackage.fof.e(r13)
            if (r0 == 0) goto L96
            long r0 = defpackage.nui.a(r12, r13)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L96
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            java.lang.String r1 = " is null"
            java.lang.String r4 = "The element at index "
            if (r0 != 0) goto L4c
            java.lang.Object[] r13 = r12.a
            int r14 = r13.length
            aof r0 = r12.d
            int r2 = r12.b
        L24:
            if (r2 == r14) goto L43
            boolean r3 = r12.c
            if (r3 == 0) goto L2c
            goto L96
        L2c:
            r3 = r13[r2]
            if (r3 != 0) goto L3d
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = defpackage.wy1.e(r2, r4, r1)
            r13.<init>(r14)
            r0.onError(r13)
            return
        L3d:
            r0.f(r3)
            int r2 = r2 + 1
            goto L24
        L43:
            boolean r13 = r12.c
            if (r13 == 0) goto L48
            goto L96
        L48:
            r0.b()
            return
        L4c:
            java.lang.Object[] r0 = r12.a
            int r5 = r0.length
            int r6 = r12.b
            aof r7 = r12.d
        L53:
            r8 = r2
        L54:
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 == 0) goto L79
            if (r6 == r5) goto L79
            boolean r10 = r12.c
            if (r10 == 0) goto L5f
            goto L96
        L5f:
            r10 = r0[r6]
            if (r10 != 0) goto L70
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = defpackage.wy1.e(r6, r4, r1)
            r13.<init>(r14)
            r7.onError(r13)
            return
        L70:
            r7.f(r10)
            r10 = 1
            long r8 = r8 + r10
            int r6 = r6 + 1
            goto L54
        L79:
            if (r6 != r5) goto L83
            boolean r13 = r12.c
            if (r13 != 0) goto L96
            r7.b()
            return
        L83:
            long r13 = r12.get()
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 != 0) goto L54
            r12.b = r6
            long r13 = -r8
            long r13 = r12.addAndGet(r13)
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 != 0) goto L53
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x66.g(long):void");
    }

    @Override // defpackage.psc
    public final int h(int i) {
        return 1;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.o1f
    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }
}
