package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l2e {
    public final m81 a;
    public final y8g b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();

    public l2e(m81 m81Var, y8g y8gVar) {
        this.a = m81Var;
        this.b = y8gVar;
    }

    public final void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nt1 nt1Var = ((u61) it.next()).a;
            if (nt1Var.a == cdh.b) {
                linkedHashSet.add(nt1Var.b);
            }
        }
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            ti1 ti1Var = (ti1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(ti1Var)) {
                this.d.add(ti1Var);
                it2.remove();
            }
        }
    }
}
