package defpackage;

/* loaded from: classes2.dex */
public final class sxd {
    public final d1e a;
    public final z74 b;
    public final vob c;

    public sxd(d1e d1eVar, z74 z74Var, vob vobVar) {
        this.a = d1eVar;
        this.b = z74Var;
        this.c = vobVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable a(defpackage.sxd r17, java.lang.String r18, boolean r19, boolean r20, defpackage.q44 r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.a(sxd, java.lang.String, boolean, boolean, q44):java.lang.Comparable");
    }

    public static Object c(sxd sxdVar, String str, boolean z, q44 q44Var) {
        return svi.i(sxdVar.b, new pxd(sxdVar, str, z, null), q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, boolean r11, defpackage.q44 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.oxd
            if (r0 == 0) goto L13
            r0 = r12
            oxd r0 = (defpackage.oxd) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            oxd r0 = new oxd
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.X
            r6 = 0
            r8 = 1
            if (r1 == 0) goto L2e
            if (r1 != r8) goto L26
            defpackage.g8j.b(r12)
            goto L4d
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            defpackage.g8j.b(r12)
            r0.X = r8
            bia r12 = defpackage.bia.a
            z74 r1 = r9.b
            x74 r12 = r12.plus(r1)
            qxd r2 = new qxd
            r7 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r12 = defpackage.svi.i(r12, r2, r0)
            g84 r10 = defpackage.g84.a
            if (r12 != r10) goto L4d
            return r10
        L4d:
            if (r12 == 0) goto L50
            r6 = r8
        L50:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.b(java.lang.String, boolean, q44):java.lang.Object");
    }

    public final Object d(rf7 rf7Var, boolean z, boolean z2, nxd nxdVar) {
        l42 l42Var = new l42(1, hni.f(nxdVar));
        l42Var.o();
        try {
            pe4 pe4VarB = zk6.e().b(rf7Var, null);
            ((r0) pe4VarB).l(new rxd(pe4VarB, l42Var, this, z2, z), yu1.a);
        } catch (Throwable th) {
            wqi.e("sxd", "onNewResultImpl: failed to save image", th);
            l42Var.resumeWith(null);
        }
        return l42Var.n();
    }
}
