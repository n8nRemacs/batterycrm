package defpackage;

/* loaded from: classes2.dex */
public final class nef extends hz {
    public final bwf c;
    public final bwf d;
    public final qx5 e;
    public rx f;
    public final mef g;

    public nef(w10 w10Var, bwf bwfVar, bwf bwfVar2, qx5 qx5Var) {
        super(w10Var);
        this.g = new mef(this);
        this.c = bwfVar;
        this.d = bwfVar2;
        this.e = qx5Var;
    }

    @Override // defpackage.hz
    public final vqa b() {
        vqa vqaVarB = super.b();
        if (vqaVarB != null) {
            return vqaVarB;
        }
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        this.f = new rx();
        r10 r10Var = this.a.f;
        int i = r10Var.j;
        String str = r10Var.h;
        if (i == 4) {
            uca.a(r10Var.l, 1, true).e(this.g);
        } else {
            if (l8g.c(str)) {
                str = r10Var.b;
            }
            ((ye7) this.d.getValue()).a(str, new nud(2, this));
        }
        return this.f;
    }
}
