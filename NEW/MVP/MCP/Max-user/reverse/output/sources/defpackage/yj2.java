package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yj2 implements g37 {
    public final long b;
    public final long c;
    public final long d;
    public final Set e;
    public final String f = yj2.class.getName();
    public final k18 g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final AtomicReference j;

    public yj2(long j, long j2, long j3, k18 k18Var, Set set) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = set;
        this.g = k18Var;
        hd5 hd5Var = hd5.a;
        this.h = new AtomicReference(hd5Var);
        this.i = new AtomicReference(hd5Var);
        this.j = new AtomicReference(hd5Var);
    }

    @Override // defpackage.g37
    public final long g() {
        return ((df2) svi.g(bd5.a, new xj2(this, null))).c;
    }

    @Override // defpackage.g37
    public final long h() {
        xj2 xj2Var = new xj2(this, null);
        bd5 bd5Var = bd5.a;
        df2 df2Var = (df2) svi.g(bd5Var, xj2Var);
        if (df2Var.d == 0) {
            long j = ((pb2) svi.g(bd5Var, new wj2(this, null))).b.j;
            long j2 = this.c;
            if (j == j2) {
                return j2;
            }
        }
        return df2Var.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r2 = r8.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r10 >= r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (defpackage.k4j.c((defpackage.d93) r8.get(r10), (defpackage.d93) r1.get(r10)) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        r2 = (java.util.List) r3.get();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // defpackage.g37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j() {
        /*
            r14 = this;
            xj2 r0 = new xj2
            r1 = 0
            r0.<init>(r14, r1)
            bd5 r2 = defpackage.bd5.a
            java.lang.Object r0 = defpackage.svi.g(r2, r0)
            df2 r0 = (defpackage.df2) r0
            wj2 r3 = new wj2
            r3.<init>(r14, r1)
            java.lang.Object r1 = defpackage.svi.g(r2, r3)
            pb2 r1 = (defpackage.pb2) r1
            rf2 r1 = r1.b
            kf2 r1 = r1.n
            rs4 r2 = defpackage.rs4.REGULAR
            java.util.ArrayList r1 = r1.d(r2)
            java.util.List r2 = r0.e
            java.util.concurrent.atomic.AtomicReference r3 = r14.j
            java.lang.Object r4 = r3.get()
            java.util.List r4 = (java.util.List) r4
            java.lang.String r5 = r14.f
            java.util.concurrent.atomic.AtomicReference r6 = r14.i
            java.util.concurrent.atomic.AtomicReference r7 = r14.h
            if (r4 == 0) goto La5
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3d
            goto La5
        L3d:
            java.lang.Object r4 = r7.get()
            java.util.List r4 = (java.util.List) r4
            int r8 = r4.size()
            int r9 = r2.size()
            if (r8 == r9) goto L4e
            goto La5
        L4e:
            java.lang.Object r8 = r6.get()
            java.util.List r8 = (java.util.List) r8
            int r9 = r8.size()
            int r10 = r1.size()
            if (r9 == r10) goto L5f
            goto La5
        L5f:
            int r9 = r4.size()     // Catch: java.lang.IndexOutOfBoundsException -> La0
            r10 = 0
            r11 = r10
        L65:
            if (r11 >= r9) goto L7d
            java.lang.Object r12 = r4.get(r11)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            d93 r12 = (defpackage.d93) r12     // Catch: java.lang.IndexOutOfBoundsException -> La0
            java.lang.Object r13 = r2.get(r11)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            d93 r13 = (defpackage.d93) r13     // Catch: java.lang.IndexOutOfBoundsException -> La0
            boolean r12 = defpackage.k4j.c(r12, r13)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            if (r12 != 0) goto L7a
            goto La5
        L7a:
            int r11 = r11 + 1
            goto L65
        L7d:
            int r2 = r8.size()     // Catch: java.lang.IndexOutOfBoundsException -> La0
        L81:
            if (r10 >= r2) goto L99
            java.lang.Object r4 = r8.get(r10)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            d93 r4 = (defpackage.d93) r4     // Catch: java.lang.IndexOutOfBoundsException -> La0
            java.lang.Object r9 = r1.get(r10)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            d93 r9 = (defpackage.d93) r9     // Catch: java.lang.IndexOutOfBoundsException -> La0
            boolean r4 = defpackage.k4j.c(r4, r9)     // Catch: java.lang.IndexOutOfBoundsException -> La0
            if (r4 != 0) goto L96
            goto La5
        L96:
            int r10 = r10 + 1
            goto L81
        L99:
            java.lang.Object r2 = r3.get()
            java.util.List r2 = (java.util.List) r2
            goto Lcb
        La0:
            java.lang.String r2 = "shouldMerge: Can't compare chunks because indexes changed"
            defpackage.wqi.r(r5, r2)
        La5:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r4 = r0.e
            r2.<init>(r4)
            r2.addAll(r1)
            java.lang.String r4 = "getChunks: merge media chunks"
            defpackage.wqi.d(r5, r4)
            defpackage.p4j.j(r2)
            long r4 = r14.d
            imb r8 = defpackage.p4j.e(r4, r2)
            java.lang.Object r8 = r8.b
            jf2 r8 = (defpackage.jf2) r8
            if (r8 != 0) goto Lcb
            jf2 r8 = new jf2
            r8.<init>(r4, r4)
            r2.add(r8)
        Lcb:
            k11 r4 = new k11
            r5 = 2
            r4.<init>(r5, r0)
            r7.updateAndGet(r4)
            d11 r0 = new d11
            r4 = 1
            r0.<init>(r4, r1)
            r6.updateAndGet(r0)
            d11 r0 = new d11
            r1 = 2
            r0.<init>(r1, r2)
            r3.updateAndGet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj2.j():java.util.List");
    }
}
