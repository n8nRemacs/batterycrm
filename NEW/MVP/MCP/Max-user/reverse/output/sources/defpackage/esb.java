package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class esb implements ui8 {
    public boolean X;
    public final o92 Y;
    public final rt5 a;
    public final pb3 b;
    public final k18 c;
    public final pv0 d;
    public x9f o;

    public esb(rt5 rt5Var, pb3 pb3Var, k18 k18Var) {
        this.a = rt5Var;
        this.b = pb3Var;
        this.c = k18Var;
        pv0 pv0VarA = gzi.a(1, 0, 6);
        this.d = pv0VarA;
        this.Y = new o92(pv0VarA);
    }

    public final void a(boolean z) {
        x9f x9fVar = this.o;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        String name = esb.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, xc0.f("Start permission timer on restart; requested: ", z), null);
            }
        }
        this.o = svi.e((nxg) this.c.getValue(), null, null, new dsb(z, this, null), 3);
    }

    @Override // defpackage.ui8
    public final void c() {
        this.o = null;
        pe8 pe8Var = (pe8) this.b;
        pe8Var.N0.O(pe8Var, pe8.U0[27], -1L);
    }
}
