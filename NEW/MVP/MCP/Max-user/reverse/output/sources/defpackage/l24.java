package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l24 {
    public final qv3 a;
    public final bwf b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final String g = l24.class.getName();

    public l24(qv3 qv3Var, bwf bwfVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = qv3Var;
        this.b = bwfVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        qv3Var.n = this;
    }

    public final ku3 a(long j) {
        return ku3.c(j, ((z7c) this.d.getValue()).a.r(), (f7b) this.c.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable b(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.h24
            if (r0 == 0) goto L13
            r0 = r7
            h24 r0 = (defpackage.h24) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            h24 r0 = new h24
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L63
            goto L60
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            qv3 r7 = r4.a
            java.util.concurrent.ConcurrentHashMap r1 = r7.a
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r1 = r1.get(r3)
            ku3 r1 = (defpackage.ku3) r1
            if (r1 == 0) goto L41
            return r1
        L41:
            ny1 r1 = new ny1     // Catch: java.lang.Throwable -> L63
            r3 = 2
            r1.<init>(r7, r5, r3)     // Catch: java.lang.Throwable -> L63
            wk3 r5 = new wk3     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L63
            j0e r6 = defpackage.u0e.b()     // Catch: java.lang.Throwable -> L63
            u2f r5 = r5.m(r6)     // Catch: java.lang.Throwable -> L63
            r0.X = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = defpackage.n8j.b(r5, r0)     // Catch: java.lang.Throwable -> L63
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L60
            return r5
        L60:
            ku3 r7 = (defpackage.ku3) r7     // Catch: java.lang.Throwable -> L63
            return r7
        L63:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l24.b(long, q44):java.lang.Comparable");
    }

    public final hbd c(long j) {
        return new hbd((f9a) this.f.computeIfAbsent(Long.valueOf(j), new ni(10, new k03(this, j, 1))));
    }

    public final Integer d() {
        Set set = qv3.p;
        qv3 qv3Var = this.a;
        int i = 0;
        ku3 ku3VarI = qv3Var.i(qv3Var.g.a.s(), false);
        Collection<ku3> collectionValues = qv3Var.a.values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            for (ku3 ku3Var : collectionValues) {
                try {
                    if (ku3Var != ku3VarI && set.contains(ku3Var.a.b.k)) {
                        i++;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return new Integer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(defpackage.gx3 r22, java.util.ArrayList r23, defpackage.q44 r24) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l24.e(gx3, java.util.ArrayList, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r5, defpackage.yv3 r6, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.j24
            if (r0 == 0) goto L13
            r0 = r7
            j24 r0 = (defpackage.j24) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            j24 r0 = new j24
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            return r7
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            k18 r7 = r4.e
            java.lang.Object r7 = r7.getValue()
            lzf r7 = (defpackage.lzf) r7
            q2b r7 = (defpackage.q2b) r7
            z74 r7 = r7.b()
            k24 r1 = new k24
            r3 = 0
            r1.<init>(r4, r5, r6, r3)
            r0.X = r2
            java.lang.Object r5 = defpackage.svi.i(r7, r1, r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4f
            return r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l24.f(java.util.List, yv3, q44):java.lang.Object");
    }
}
