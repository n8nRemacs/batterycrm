package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rvf extends l0g {
    public List c;
    public Map d;

    public rvf(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
        if (this.d == null) {
            this.d = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (!str.equals("phones")) {
            if (str.equals("contacts")) {
                this.c = sz.c(tm9Var);
                return;
            } else {
                tm9Var.v();
                return;
            }
        }
        this.d = new HashMap();
        int iM = efi.m(tm9Var);
        for (int i = 0; i < iM; i++) {
            this.d.put(tm9Var.w0(), Long.valueOf(tm9Var.t0()));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.g("{contacts=", zdi.a(this.c), ", phones=", zdi.d(this.d), "}");
    }
}
