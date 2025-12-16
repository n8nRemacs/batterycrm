package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xah extends l0g {
    public Map c;
    public boolean d;
    public long o;

    public xah(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("startTime")) {
            this.o = efi.l(tm9Var, 0L);
            return;
        }
        if (str.equals("live")) {
            this.d = efi.g(tm9Var);
            return;
        }
        String strO = efi.o(tm9Var);
        if (l8g.c(strO)) {
            return;
        }
        if (this.c == null) {
            this.c = new us(0);
        }
        this.c.put(str, strO);
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iD = zdi.d(this.c);
        boolean z = this.d;
        long j = this.o;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(iD);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        return ho7.k(sb, j, "}");
    }
}
