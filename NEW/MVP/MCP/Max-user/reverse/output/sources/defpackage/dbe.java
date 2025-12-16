package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dbe extends xfh {
    public final tcf X;
    public final hbd Y;
    public final hbd Z;
    public final de8 b;
    public final sae c;
    public final ci5 d = new ci5(0);
    public final ci5 o = new ci5(0);

    public dbe(de8 de8Var, sae saeVar) {
        this.b = de8Var;
        this.c = saeVar;
        mwd mwdVar = new mwd(new cbe(new uxb(((bj7) de8Var).v0, this, 14), null, this));
        tcf tcfVarA = ucf.a(null);
        this.X = tcfVarA;
        hbd hbdVar = new hbd(tcfVarA);
        this.Y = hbdVar;
        int i = 3;
        this.Z = gw0.C(new uxb(new z41(mwdVar, hbdVar, new kga(i, (Continuation) null, 21), i), this, 15), this.a, yve.a, hd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xae
            if (r0 == 0) goto L13
            r0 = r5
            xae r0 = (defpackage.xae) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            xae r0 = new xae
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r5)
            goto L44
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.g8j.b(r5)
            r0.X = r2
            de8 r5 = r4.b
            r5.getClass()
            bj7 r5 = (defpackage.bj7) r5
            y83 r5 = r5.v0
            java.lang.Object r5 = defpackage.gw0.p(r5, r0)
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L44
            return r0
        L44:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L56
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L56
        L54:
            r2 = r1
            goto L6a
        L56:
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r5.next()
            vo6 r0 = (defpackage.vo6) r0
            int r0 = r0.b
            if (r0 <= 0) goto L5a
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbe.t(q44):java.lang.Object");
    }
}
