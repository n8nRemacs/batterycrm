package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class tk1 extends xfh {
    public final k18 X;
    public final tcf Y;
    public final tcf Z;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List o;
    public final hbd s0;
    public final tcf t0;
    public final hbd u0;
    public final tcf v0;
    public final hbd w0;
    public final hbd x0;
    public final ci5 y0;
    public boolean z0;

    public tk1(String str, boolean z, boolean z2, List list) {
        k18 k18VarC = fm1.c();
        this.b = str;
        this.c = z;
        this.d = z2;
        this.o = list;
        this.X = k18VarC;
        tcf tcfVarA = ucf.a(new rk1(null, vo7.a));
        this.Y = tcfVarA;
        tcf tcfVarA2 = ucf.a(new n5g(m0b.B0));
        this.Z = tcfVarA2;
        this.s0 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(t());
        this.t0 = tcfVarA3;
        this.u0 = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(hd5.a);
        this.v0 = tcfVarA4;
        this.w0 = new hbd(tcfVarA4);
        yh0 yh0Var = new yh0(tcfVarA, 1);
        Boolean bool = Boolean.FALSE;
        this.x0 = gw0.C(yh0Var, this.a, yve.a, bool);
        this.y0 = new ci5(0);
    }

    public final List t() {
        Integer num = ((rk1) this.Y.getValue()).a;
        boolean z = false;
        boolean z2 = num == null;
        int i = j0b.C0;
        int i2 = j0b.B0;
        v7d v7dVar = new v7d(i, Integer.valueOf(kwc.ic_thumbs_up), z2 || (num != null && num.intValue() == i));
        Integer numValueOf = Integer.valueOf(kwc.ic_thumbs_down);
        if (z2 || (num != null && num.intValue() == i2)) {
            z = true;
        }
        return ve3.j(v7dVar, new v7d(i2, numValueOf, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r25) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk1.u(boolean):void");
    }
}
