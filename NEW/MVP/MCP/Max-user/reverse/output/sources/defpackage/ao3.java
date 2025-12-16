package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface ao3 {
    static void p(x8a x8aVar, ao3 ao3Var, ao3 ao3Var2, s90 s90Var) {
        if (!Objects.equals(s90Var, bf7.H)) {
            x8aVar.m(s90Var, ao3Var2.j(s90Var), ao3Var2.f(s90Var));
            return;
        }
        aod aodVar = (aod) ao3Var2.d(s90Var, null);
        aod aodVar2 = (aod) ao3Var.d(s90Var, null);
        zn3 zn3VarJ = ao3Var2.j(s90Var);
        if (aodVar == null) {
            aodVar = aodVar2;
        } else if (aodVar2 != null) {
            hc8 hc8VarC = hc8.C(aodVar2);
            l16 l16Var = aodVar.a;
            if (l16Var != null) {
                hc8VarC.b = l16Var;
            }
            bod bodVar = aodVar.b;
            if (bodVar != null) {
                hc8VarC.c = bodVar;
            }
            sl6 sl6Var = aodVar.c;
            if (sl6Var != null) {
                hc8VarC.d = sl6Var;
            }
            aodVar = new aod((l16) hc8VarC.b, (bod) hc8VarC.c, (sl6) hc8VarC.d);
        }
        x8aVar.m(s90Var, zn3VarJ, aodVar);
    }

    static fjb s(ao3 ao3Var, ao3 ao3Var2) {
        if (ao3Var == null && ao3Var2 == null) {
            return fjb.c;
        }
        x8a x8aVarK = ao3Var2 != null ? x8a.k(ao3Var2) : x8a.b();
        if (ao3Var != null) {
            Iterator it = ao3Var.e().iterator();
            while (it.hasNext()) {
                p(x8aVarK, ao3Var2, ao3Var, (s90) it.next());
            }
        }
        return fjb.a(x8aVarK);
    }

    void c(i00 i00Var);

    Object d(s90 s90Var, Object obj);

    Set e();

    Object f(s90 s90Var);

    Set g(s90 s90Var);

    Object h(s90 s90Var, zn3 zn3Var);

    boolean i(s90 s90Var);

    zn3 j(s90 s90Var);
}
