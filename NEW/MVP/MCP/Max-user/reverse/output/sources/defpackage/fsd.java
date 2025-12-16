package defpackage;

/* loaded from: classes2.dex */
public final class fsd implements aef {
    public final q9b a;
    public final bwf b = new bwf(new prd(2, this));

    public fsd(q9b q9bVar) {
        this.a = q9bVar;
    }

    public final Object a(eg8 eg8Var) {
        xdf xdfVar = (xdf) this.b.getValue();
        xdfVar.getClass();
        dsd dsdVarC = dsd.c(1, "\n            SELECT * FROM stat_events\n            ORDER BY id ASC\n            LIMIT ?\n        ");
        return k7j.a(xdfVar.a, xrf.m(dsdVarC, 1, 50), new jad(xdfVar, 10, dsdVarC), eg8Var);
    }
}
