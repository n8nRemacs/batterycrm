package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ald {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public ald(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
    }

    public static void a(ald aldVar, long j) {
        pb2 pb2VarR;
        ve2 ve2Var = (ve2) aldVar.a.getValue();
        k18 k18Var = ve2Var.B;
        wy1.q(j, "removeChatInternal, chatId = ", "ve2");
        pb2 pb2VarM = ve2Var.M(j);
        pb2 pb2Var = null;
        if (pb2VarM == null) {
            pb2VarR = null;
        } else {
            rf2 rf2Var = pb2VarM.b;
            dkb dkbVar = (dkb) ve2Var.w.get();
            long j2 = rf2Var.a;
            dkbVar.getClass();
            dkb.a(j2);
            of2 of2Var = (pb2VarM.M() || !pb2VarM.X()) ? of2.o : of2.c;
            ((c6i) ve2Var.x.get()).b(new nge(j, rf2Var.k));
            pb2VarR = ve2Var.r(j, false, new ee2(ve2Var, of2Var));
        }
        if (pb2VarR != null) {
            ve2Var.n.c(new n73(Collections.singletonList(Long.valueOf(j)), true));
            List listSingletonList = Collections.singletonList(Long.valueOf(j));
            ue2 ue2Var = ve2Var.G;
            if (ue2Var != null) {
                ue2Var.b(listSingletonList);
            }
            if (k18Var.getValue() != null) {
                va4 va4Var = (va4) k18Var.getValue();
                long j3 = pb2VarR.b.a;
                va4Var.getClass();
            }
            pb2Var = pb2VarR;
        }
        if (pb2Var != null) {
            eka ekaVar = (eka) aldVar.d.getValue();
            y7b y7bVar = (y7b) aldVar.c.getValue();
            ekaVar.getClass();
            eka.a(pb2Var, y7bVar);
        }
    }
}
