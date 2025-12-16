package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ar2 implements Serializable {
    public final gx3 a;
    public final c8c b;
    public final long c;

    public ar2(gx3 gx3Var, c8c c8cVar, long j) {
        this.a = gx3Var;
        this.b = c8cVar;
        this.c = j;
    }

    public static ar2 a(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        gx3 gx3VarG = null;
        if (iM == 0) {
            return null;
        }
        c8c c8cVarA = null;
        long jL = 0;
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "presence":
                    c8cVarA = c8c.a(tm9Var);
                    break;
                case "readMark":
                    jL = efi.l(tm9Var, 0L);
                    break;
                case "contact":
                    gx3VarG = gx3.g(tm9Var);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new ar2(gx3VarG, c8cVarA, jL);
    }
}
