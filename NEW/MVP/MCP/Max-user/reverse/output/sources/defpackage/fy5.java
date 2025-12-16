package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class fy5 extends l0g {
    public List c;

    public fy5(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [gy5] */
    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) throws IOException {
        str.getClass();
        if (!str.equals("info")) {
            tm9Var.v();
            return;
        }
        int iF = efi.f(tm9Var);
        this.c = new ArrayList(iF);
        for (int i = 0; i < iF; i++) {
            List list = this.c;
            int iM = efi.m(tm9Var);
            String gy5Var = null;
            if (iM != 0) {
                String strO = null;
                long jL = 0;
                for (int i2 = 0; i2 < iM; i2++) {
                    String strW0 = tm9Var.w0();
                    strW0.getClass();
                    switch (strW0) {
                        case "fileId":
                            jL = efi.l(tm9Var, 0L);
                            break;
                        case "url":
                            strO = efi.o(tm9Var);
                            break;
                        case "token":
                            gy5Var = efi.o(tm9Var);
                            break;
                        default:
                            tm9Var.v();
                            break;
                    }
                }
                gy5Var = new gy5(jL, gy5Var, strO);
            }
            list.add(gy5Var);
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{info=" + this.c + "}";
    }
}
