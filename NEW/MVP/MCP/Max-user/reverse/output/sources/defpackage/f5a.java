package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f5a extends l0g {
    public Map c;

    public f5a(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (!str.equals("stats")) {
            tm9Var.v();
            return;
        }
        this.c = new HashMap();
        int iM = efi.m(tm9Var);
        for (int i = 0; i < iM; i++) {
            this.c.put(Long.valueOf(tm9Var.t0()), im9.a(tm9Var));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.e(zdi.d(this.c), "{stats=", "}");
    }
}
