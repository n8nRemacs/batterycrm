package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class at1 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public at1(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var3;
        this.b = k18Var2;
        this.c = k18Var;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable a(defpackage.at1 r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ys1
            if (r0 == 0) goto L13
            r0 = r6
            ys1 r0 = (defpackage.ys1) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ys1 r0 = new ys1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            goto L51
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r6)
            k18 r6 = r5.e
            java.lang.Object r6 = r6.getValue()
            klc r6 = (defpackage.klc) r6
            k18 r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            pb3 r5 = (defpackage.pb3) r5
            w4e r5 = (defpackage.w4e) r5
            long r3 = r5.s()
            r0.X = r2
            java.lang.Object r6 = r6.a(r3, r0)
            g84 r5 = defpackage.g84.a
            if (r6 != r5) goto L51
            return r5
        L51:
            xac r6 = (defpackage.xac) r6
            ku3 r5 = r6.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.a(at1, q44):java.lang.Comparable");
    }

    public final Object b(Set set, q44 q44Var) {
        return svi.i(((q2b) ((lzf) this.c.getValue())).b(), new ws1(set, this, null), q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.zs1
            if (r0 == 0) goto L13
            r0 = r7
            zs1 r0 = (defpackage.zs1) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            zs1 r0 = new zs1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            goto L43
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            k18 r7 = r4.b
            java.lang.Object r7 = r7.getValue()
            l24 r7 = (defpackage.l24) r7
            r0.X = r2
            java.lang.Comparable r7 = r7.b(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L43
            return r5
        L43:
            ku3 r7 = (defpackage.ku3) r7
            if (r7 == 0) goto L4b
            boolean r2 = r7.B()
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.c(long, q44):java.lang.Object");
    }

    public final Object d(Set set, dtf dtfVar) {
        if (!set.isEmpty()) {
            k1a k1aVar = (k1a) this.d.getValue();
            n8a n8aVarI = dsi.i(set);
            int i = s65.d;
            Object objT = k1aVar.t(n8aVarI, v9j.h(30, y65.SECONDS), dtfVar);
            if (objT == g84.a) {
                return objT;
            }
        }
        return qqg.a;
    }
}
