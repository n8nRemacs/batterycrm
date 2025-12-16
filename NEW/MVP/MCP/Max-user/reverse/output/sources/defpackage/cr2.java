package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class cr2 extends l0g {
    public ArrayList c;
    public long d;

    public cr2(tm9 tm9Var) {
        super(tm9Var);
        this.d = -1L;
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.d = tm9Var.t0();
            return;
        }
        if (!str.equals("members")) {
            tm9Var.v();
            return;
        }
        int iF = efi.f(tm9Var);
        this.c = new ArrayList();
        for (int i = 0; i < iF; i++) {
            this.c.add(ar2.a(tm9Var));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sbM = u45.m(zdi.a(this.c), this.d, "{members=", ", marker=");
        sbM.append("}");
        return sbM.toString();
    }
}
