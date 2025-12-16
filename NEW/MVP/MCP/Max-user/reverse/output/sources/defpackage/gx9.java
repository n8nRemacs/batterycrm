package defpackage;

/* loaded from: classes2.dex */
public final class gx9 {
    public final bsd a;
    public final bwf b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public gx9(bsd bsdVar, bwf bwfVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = bsdVar;
        this.b = bwfVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
    }

    public final Object a(long j, fh9 fh9Var, q44 q44Var) {
        return i8j.a(this.a.a.l(), new cx9(this, j, fh9Var, null), q44Var);
    }

    public final Object b(long j, xl9 xl9Var, long j2, q44 q44Var) {
        Object objI = svi.i(((q2b) ((lzf) this.e.getValue())).b(), new ex9(this, j, xl9Var, j2, null), q44Var);
        return objI == g84.a ? objI : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r15, long r17, long r19, boolean r21, int r22, defpackage.rs4 r23, defpackage.q44 r24) {
        /*
            r14 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.fx9
            if (r1 == 0) goto L15
            r1 = r0
            fx9 r1 = (defpackage.fx9) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            fx9 r1 = new fx9
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.o
            int r2 = r1.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r1 = r1.d
            defpackage.g8j.b(r0)
            goto L62
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            defpackage.g8j.b(r0)
            r12 = r21
            r1.d = r12
            r1.Y = r3
            bsd r4 = r14.a
            sl7 r0 = r4.c
            java.lang.Object r0 = r0.a
            lzf r0 = (defpackage.lzf) r0
            q2b r0 = (defpackage.q2b) r0
            z74 r0 = r0.b()
            xrd r2 = new xrd
            r13 = 0
            r5 = r15
            r7 = r17
            r9 = r19
            r11 = r22
            r3 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r12, r13)
            java.lang.Object r0 = defpackage.svi.i(r0, r2, r1)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L60
            return r1
        L60:
            r1 = r21
        L62:
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r1 == 0) goto L6a
            defpackage.ue3.V(r2)
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx9.c(long, long, long, boolean, int, rs4, q44):java.lang.Object");
    }
}
