package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zje extends l0g {
    public List c;

    public zje(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) throws IOException {
        str.getClass();
        if (!str.equals("sessions")) {
            tm9Var.v();
            return;
        }
        int iF = efi.f(tm9Var);
        this.c = new ArrayList(iF);
        for (int i = 0; i < iF; i++) {
            List list = this.c;
            int iM = efi.m(tm9Var);
            xhe xheVar = null;
            if (iM != 0) {
                boolean zP0 = false;
                String strW0 = null;
                String strW02 = null;
                String strW03 = null;
                long jT0 = 0;
                for (int i2 = 0; i2 < iM; i2++) {
                    String strW04 = tm9Var.w0();
                    strW04.getClass();
                    switch (strW04) {
                        case "client":
                            strW0 = tm9Var.w0();
                            break;
                        case "info":
                            strW02 = tm9Var.w0();
                            break;
                        case "time":
                            jT0 = tm9Var.t0();
                            break;
                        case "current":
                            zP0 = tm9Var.p0();
                            break;
                        case "location":
                            strW03 = tm9Var.w0();
                            break;
                        default:
                            tm9Var.v();
                            break;
                    }
                }
                xheVar = new xhe(jT0, strW0, strW02, strW03, zP0);
            }
            list.add(xheVar);
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.e(zdi.a(this.c), "{sessions=", "}");
    }
}
