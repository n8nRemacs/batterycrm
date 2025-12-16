package defpackage;

/* loaded from: classes.dex */
public final class of6 {
    public final k18 a;

    public of6(w5 w5Var) {
        this.a = w5Var.d(574);
    }

    public static sn9 c(vg6 vg6Var, boolean z, boolean z2) {
        s5g s5gVar = vg6Var.a;
        boolean z3 = vg6Var.b;
        az azVar = vg6Var.c;
        Integer numValueOf = null;
        if (!z) {
            if (z2) {
                numValueOf = Integer.valueOf(yud.G1);
            } else if (!z2) {
                numValueOf = Integer.valueOf(yud.F1);
            }
        }
        return new sn9(3, s5gVar, z3, azVar, z2, numValueOf, vg6Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.si9 r5, java.lang.Long r6, boolean r7, boolean r8, defpackage.q44 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.mf6
            if (r0 == 0) goto L13
            r0 = r9
            mf6 r0 = (defpackage.mf6) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            mf6 r0 = new mf6
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.Y
            int r1 = r0.s0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            boolean r8 = r0.o
            boolean r7 = r0.d
            of6 r5 = r0.X
            defpackage.g8j.b(r9)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r9)
            k18 r9 = r4.a
            java.lang.Object r9 = r9.getValue()
            yg6 r9 = (defpackage.yg6) r9
            r0.X = r4
            r0.d = r7
            r0.o = r8
            r0.s0 = r2
            java.lang.Object r9 = r9.a(r5, r6, r0)
            g84 r5 = defpackage.g84.a
            if (r9 != r5) goto L4f
            return r5
        L4f:
            r5 = r4
        L50:
            vg6 r9 = (defpackage.vg6) r9
            r5.getClass()
            sn9 r5 = c(r9, r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.a(si9, java.lang.Long, boolean, boolean, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, defpackage.q44 r7, java.util.List r8, boolean r9) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.nf6
            if (r0 == 0) goto L13
            r0 = r7
            nf6 r0 = (defpackage.nf6) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            nf6 r0 = new nf6
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            boolean r9 = r0.d
            of6 r5 = r0.o
            defpackage.g8j.b(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r7)
            k18 r7 = r4.a
            java.lang.Object r7 = r7.getValue()
            yg6 r7 = (defpackage.yg6) r7
            r0.o = r4
            r0.d = r9
            r0.Z = r2
            java.lang.Object r7 = r7.b(r5, r0, r8)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L4b
            return r5
        L4b:
            r5 = r4
        L4c:
            vg6 r7 = (defpackage.vg6) r7
            r5.getClass()
            r5 = 0
            sn9 r5 = c(r7, r5, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.b(long, q44, java.util.List, boolean):java.lang.Object");
    }
}
