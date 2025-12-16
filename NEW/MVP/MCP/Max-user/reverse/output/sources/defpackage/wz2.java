package defpackage;

/* loaded from: classes2.dex */
public final class wz2 {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public wz2(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public final qqg a(long j, long j2) {
        wz2 wz2Var = this;
        ((dd) wz2Var.a.getValue()).e("ACTION_MSG_UNPIN");
        hwa hwaVar = (hwa) wz2Var.b.getValue();
        if (hwaVar.j(j)) {
            hwa.r(hwaVar, new yz2(hwaVar.t().a.k(), j, j2, 0, null, false, null, null, null, null, null, -1L, false, 0L));
            wz2Var = this;
        }
        ve2 ve2VarI = ((w63) wz2Var.c.getValue()).i();
        Long l = new Long(j);
        ve2VarI.getClass();
        ve2VarI.n(l.longValue(), bf2.d);
        ve2VarI.r(l.longValue(), false, new de2(0));
        return qqg.a;
    }
}
