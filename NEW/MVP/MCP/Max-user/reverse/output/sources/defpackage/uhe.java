package defpackage;

/* loaded from: classes2.dex */
public final class uhe extends hge {
    public final long b;
    public final long c;
    public final long d;
    public final boolean o;

    public uhe(long j, long j2, boolean z, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = z;
    }

    @Override // defpackage.hge
    public final void u() {
        qi9 qi9VarL = l();
        qi9VarL.getClass();
        long j = this.d;
        Long lValueOf = Long.valueOf(j);
        boolean z = this.o;
        wqi.c("qi9", "updateDelayedAttrs %d, %b", lValueOf, Boolean.valueOf(z));
        bsd bsdVar = qi9VarL.a.c;
        Long lValueOf2 = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(z);
        long j2 = this.c;
        bsdVar.v(j2, lValueOf2, boolValueOf);
        qi9VarL.e.c.remove(Long.valueOf(j2));
        l().t(l().m(j2), xi9.d);
        dtg dtgVar = new dtg(((w4e) i()).k(), this.b, this.c, this.d, this.o);
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        ((m1g) igeVar.h.getValue()).c(dtgVar, true, 0L, (12 & 8) != 0 ? 0 : 1);
        ige igeVar2 = this.a;
        ((tw0) (igeVar2 != null ? igeVar2 : null).c.getValue()).c(new itg(this.b, this.c, false));
    }
}
