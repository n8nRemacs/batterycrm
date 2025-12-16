package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jyg {
    public final c47 a;
    public final rs4 b;

    public jyg(c47 c47Var, rs4 rs4Var) {
        this.a = c47Var;
        this.b = rs4Var;
    }

    public final List a(List list, em6 em6Var, em6 em6Var2, u7g u7gVar, iu3 iu3Var, yw ywVar) {
        c47 c47Var = this.a;
        if (!c47Var.e()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            boolean zC = c47Var.C(((Number) em6Var.invoke(obj)).longValue());
            if (!zC && u7gVar != null && this.b.a() && ((si9) obj).t0 != jm9.DELAYED_FIRE_ERROR) {
                arrayList.add(em6Var2.invoke(obj));
            }
            if (ywVar != null) {
                ywVar.invoke(obj);
            }
            if (zC) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            wqi.c("jyg", "items for delete not empty, count = " + arrayList.size(), new Object[0]);
            iu3Var.accept(arrayList);
        }
        return arrayList2;
    }
}
