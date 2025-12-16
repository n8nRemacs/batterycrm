package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zr2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public zr2(cs2 cs2Var, k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar, a84 a84Var) {
        this.a = cs2Var;
        this.b = lzfVar;
        this.c = d7j.a(((q2b) lzfVar).c().getImmediate().plus(a84Var));
        this.d = k18Var;
        this.e = k18Var2;
        this.f = k18Var3;
        tcf tcfVarA = ucf.a(d7e.a);
        this.g = tcfVarA;
        this.i = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.h = tcfVarA2;
        this.j = new hbd(tcfVarA2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zr2 r4, defpackage.fh9 r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.wr2
            if (r0 == 0) goto L13
            r0 = r6
            wr2 r0 = (defpackage.wr2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            wr2 r0 = new wr2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)
            return r6
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r4.b
            lzf r6 = (defpackage.lzf) r6
            q2b r6 = (defpackage.q2b) r6
            z74 r6 = r6.b()
            xr2 r1 = new xr2
            r3 = 0
            r1.<init>(r4, r5, r3)
            r0.X = r2
            java.lang.Object r4 = defpackage.svi.i(r6, r1, r0)
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L4b
            return r5
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr2.a(zr2, fh9, q44):java.lang.Object");
    }

    public void b(int i, int i2) {
        Object value;
        boolean z;
        boolean z2;
        tcf tcfVar = (tcf) this.g;
        do {
            value = tcfVar.getValue();
            g7e g7eVar = (g7e) value;
            c7e c7eVar = g7eVar instanceof c7e ? (c7e) g7eVar : c7e.e;
            z = i2 != i;
            z2 = 1 != i;
            c7eVar.getClass();
        } while (!tcfVar.c(value, new c7e(i2, i, z, z2)));
    }

    public void c(gm9 gm9Var) {
        svi.e((ContextScope) this.c, null, null, new yr2(this, gm9Var.b, gm9Var, null), 3);
    }

    public void d() {
        Object value;
        Object value2;
        tcf tcfVar = (tcf) this.h;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, null));
        tcf tcfVar2 = (tcf) this.g;
        do {
            value2 = tcfVar2.getValue();
            g7e g7eVar = (g7e) value2;
            (g7eVar instanceof c7e ? (c7e) g7eVar : c7e.e).getClass();
        } while (!tcfVar2.c(value2, new c7e(0, 0, false, false)));
    }

    public zr2() {
        this.b = guf.g();
        this.a = guf.g();
        this.e = guf.g();
        this.f = guf.g();
        this.c = guf.g();
        this.d = guf.g();
        this.g = guf.g();
        this.h = guf.g();
        this.i = guf.g();
    }
}
