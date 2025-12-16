package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class qx7 implements ox7 {
    public static void a(k02 k02Var, ArrayList arrayList) {
        if (k02Var instanceof l02) {
            Iterator it = ((l02) k02Var).a.iterator();
            while (it.hasNext()) {
                a((k02) it.next(), arrayList);
            }
        } else if (k02Var instanceof g52) {
            arrayList.add(((g52) k02Var).a);
        } else {
            arrayList.add(new iz1(k02Var));
        }
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xx7Var.p();
        while (xx7Var.hasNext()) {
            linkedHashMap.put(xx7Var.name(), xx7Var.B());
        }
        xx7Var.n();
        return linkedHashMap;
    }
}
