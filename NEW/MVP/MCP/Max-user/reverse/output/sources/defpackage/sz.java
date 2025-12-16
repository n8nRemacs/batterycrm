package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class sz extends ArrayList {
    public static final /* synthetic */ int a = 0;

    public static sz a(tm9 tm9Var) {
        sz szVar = new sz();
        int iN0 = tm9Var.n0();
        for (int i = 0; i < iN0; i++) {
            szVar.add(xy.b(tm9Var));
        }
        return szVar;
    }

    public static sz b(tm9 tm9Var) {
        int iN0 = tm9Var.n0();
        sz szVar = new sz(iN0);
        for (int i = 0; i < iN0; i++) {
            szVar.add(qb2.a(tm9Var));
        }
        return szVar;
    }

    public static sz c(tm9 tm9Var) {
        int iF = efi.f(tm9Var);
        sz szVar = new sz(iF);
        for (int i = 0; i < iF; i++) {
            gx3 gx3VarG = gx3.g(tm9Var);
            ex3 ex3Var = ex3.z0;
            if (gx3VarG == null) {
                Objects.requireNonNull(ex3Var, "defaultObj");
                gx3VarG = ex3Var;
            }
            szVar.add(gx3VarG);
        }
        return szVar;
    }

    public static sz d(tm9 tm9Var) {
        int iF = efi.f(tm9Var);
        sz szVar = new sz(iF);
        for (int i = 0; i < iF; i++) {
            szVar.add(Long.valueOf(efi.l(tm9Var, 0L)));
        }
        return szVar;
    }

    public static sz e(tm9 tm9Var) {
        sz szVar = new sz();
        int iF = efi.f(tm9Var);
        for (int i = 0; i < iF; i++) {
            szVar.add(ovi.a(tm9Var));
        }
        return szVar;
    }

    public static sz f(tm9 tm9Var) throws IOException {
        int iF = efi.f(tm9Var);
        sz szVar = new sz(iF);
        for (int i = 0; i < iF; i++) {
            int iM = efi.m(tm9Var);
            String strW0 = null;
            ArrayList arrayList = null;
            fh9 fh9VarA = null;
            long jT0 = 0;
            for (int i2 = 0; i2 < iM; i2++) {
                String strW02 = tm9Var.w0();
                strW02.getClass();
                switch (strW02) {
                    case "chatId":
                        jT0 = tm9Var.t0();
                        break;
                    case "feedback":
                        strW0 = tm9Var.w0();
                        break;
                    case "highlights":
                        int iF2 = efi.f(tm9Var);
                        ArrayList arrayList2 = new ArrayList(iF2);
                        for (int i3 = 0; i3 < iF2; i3++) {
                            arrayList2.add(tm9Var.w0());
                        }
                        arrayList = arrayList2;
                        break;
                    case "message":
                        fh9VarA = ovi.a(tm9Var);
                        break;
                    default:
                        tm9Var.v();
                        break;
                }
            }
            gm9 gm9Var = new gm9(strW0, arrayList, jT0, fh9VarA);
            if (fh9VarA != null) {
                szVar.add(gm9Var);
            }
        }
        return szVar;
    }

    public static sz g(tm9 tm9Var) {
        int iF = efi.f(tm9Var);
        sz szVar = new sz(iF);
        for (int i = 0; i < iF; i++) {
            szVar.add(efi.o(tm9Var));
        }
        return szVar;
    }
}
