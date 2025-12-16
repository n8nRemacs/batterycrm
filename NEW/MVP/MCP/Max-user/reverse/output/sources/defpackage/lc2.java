package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class lc2 extends l0g {
    public List c;
    public HashMap d;

    public lc2(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) throws IOException {
        str.getClass();
        if (str.equals("commands")) {
            this.c = efi.s(tm9Var, new jbe(14));
            return;
        }
        if (!str.equals("contacts")) {
            tm9Var.v();
            return;
        }
        this.d = new HashMap();
        int iM = efi.m(tm9Var);
        for (int i = 0; i < iM; i++) {
            long jT0 = tm9Var.t0();
            this.d.put(Long.valueOf(jT0), gx3.g(tm9Var));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.g("{commands=", zdi.a(this.c), ", contacts=", zdi.d(this.d), "}");
    }
}
