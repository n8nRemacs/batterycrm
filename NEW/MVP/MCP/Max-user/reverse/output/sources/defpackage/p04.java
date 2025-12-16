package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class p04 extends l0g {
    public List c;
    public int d;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (!str.equals("result")) {
            if (str.equals("total")) {
                this.d = tm9Var.s0();
                return;
            } else {
                tm9Var.v();
                return;
            }
        }
        int i = sz.a;
        int iF = efi.f(tm9Var);
        sz szVar = new sz(iF);
        for (int i2 = 0; i2 < iF; i2++) {
            szVar.add(r04.a(tm9Var));
        }
        this.c = szVar;
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.g("{contacts=", zdi.a(this.c), ", total=", this.d, "}");
    }
}
