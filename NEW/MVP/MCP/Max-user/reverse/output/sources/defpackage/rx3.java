package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rx3 extends l0g {
    public List c;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("contacts")) {
            this.c = sz.c(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.e(zdi.a(this.c), "{contactInfos=", "}");
    }
}
