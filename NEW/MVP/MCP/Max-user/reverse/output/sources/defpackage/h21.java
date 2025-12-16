package defpackage;

import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class h21 extends xfh implements iq1 {
    public final k18 X;
    public final tcf Y;
    public final hbd Z;
    public final qv1 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final ci5 s0;

    public h21(qv1 qv1Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.b = qv1Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var;
        this.X = k18Var4;
        tcf tcfVarA = ucf.a(hd5.a);
        this.Y = tcfVarA;
        this.Z = new hbd(tcfVarA);
        this.s0 = new ci5(0);
        z01 z01Var = (z01) k18Var2.getValue();
        z01Var.getClass();
        u((ca) ((v11) z01Var).F0.getValue());
        gw0.w(new g56(((v11) ((z01) k18Var2.getValue())).D0, new f21(this, null), 1), this.a);
        gw0.w(new g56(((v11) ((z01) k18Var2.getValue())).F0, new g21(this, null), 1), this.a);
        ((hw1) ((tv1) k18Var.getValue())).e(this);
    }

    @Override // defpackage.iq1
    public final void l() {
        xfh.r(this.s0, hm1.D);
    }

    public final z01 t() {
        return (z01) this.c.getValue();
    }

    public final void u(ca caVar) {
        tcf tcfVar;
        Object value;
        o98 o98VarD;
        do {
            tcfVar = this.Y;
            value = tcfVar.getValue();
            o98VarD = ve3.d();
            n5g n5gVar = new n5g(m0b.t);
            int i = k0b.u;
            o98VarD.add(new c21(0, n5gVar));
            o98VarD.add(new b21(1, new n5g(m0b.f), 0, j0b.a, null, new doe(caVar.b, true), Integer.valueOf(i0b.i), HttpStatus.SC_NOT_MODIFIED));
            o98VarD.add(new b21(2, new n5g(m0b.h), 0, j0b.h, null, new doe(caVar.c, true), Integer.valueOf(i0b.l), HttpStatus.SC_NOT_MODIFIED));
            o98VarD.add(new b21(2, new n5g(m0b.y), 0, j0b.j, null, new doe(caVar.d, true), Integer.valueOf(i0b.v), HttpStatus.SC_NOT_MODIFIED));
            k18 k18Var = this.d;
            gu5 gu5Var = (gu5) ((rt5) k18Var.getValue());
            gu5Var.getClass();
            if (gu5Var.j(PmsKey.grse, false)) {
                o98VarD.add(new b21(3, new n5g(m0b.w), 0, j0b.i, null, new doe(caVar.e, true), Integer.valueOf(i0b.m), HttpStatus.SC_NOT_MODIFIED));
            }
            o98VarD.add(new d21(new n5g(m0b.u)));
            gu5 gu5Var2 = (gu5) ((rt5) k18Var.getValue());
            gu5Var2.getClass();
            if (gu5Var2.j(PmsKey.gcwre, false)) {
                o98VarD.add(new c21(1, new n5g(m0b.j)));
                o98VarD.add(new b21(4, new n5g(m0b.A), 1, j0b.k, new n5g(m0b.B), new doe(caVar.g, true), Integer.valueOf(i0b.y0), 272));
            }
        } while (!tcfVar.c(value, ve3.a(o98VarD)));
    }
}
