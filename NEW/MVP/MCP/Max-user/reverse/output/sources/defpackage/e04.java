package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e04 extends l0g {
    public Map c;
    public long d;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (!str.equals("presence")) {
            if (str.equals("time")) {
                this.d = tm9Var.t0();
                return;
            } else {
                tm9Var.v();
                return;
            }
        }
        this.c = new HashMap();
        int iM = efi.m(tm9Var);
        for (int i = 0; i < iM; i++) {
            this.c.put(Long.valueOf(tm9Var.t0()), c8c.a(tm9Var));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sbM = u45.m(zdi.d(this.c), this.d, "{presence=", ", time=");
        sbM.append("}");
        return sbM.toString();
    }
}
