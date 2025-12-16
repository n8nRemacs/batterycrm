package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class pg4 extends l0g {
    public l16 c;
    public List d;

    public pg4(tm9 tm9Var) {
        super(tm9Var);
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String strO = efi.o(tm9Var);
            l16 l16Var = l16.o;
            if (strO != null) {
                if (strO.equals("SYNC_CONTACTS")) {
                    l16Var = l16.Y;
                } else if (strO.equals("SEND_LOG")) {
                    l16Var = l16.X;
                }
            }
            this.c = l16Var;
            return;
        }
        if (!str.equals("args")) {
            tm9Var.v();
            return;
        }
        int iF = efi.f(tm9Var);
        this.d = new ArrayList(iF);
        for (int i = 0; i < iF; i++) {
            this.d.add(efi.o(tm9Var));
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{cmd='" + this.c + "', args=" + this.d + "}";
    }
}
