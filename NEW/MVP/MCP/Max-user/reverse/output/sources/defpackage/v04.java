package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class v04 {
    public final g2f a;
    public final f8c b;
    public final qv3 c;
    public final ve2 d;
    public final lv4 e;
    public final oje f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public v04(z7c z7cVar, f8c f8cVar, qv3 qv3Var, ve2 ve2Var, lv4 lv4Var, oje ojeVar, j0e j0eVar) {
        g2f g2fVar = new g2f(new wk3(2, new i62(18, z7cVar)).m(j0eVar));
        this.a = g2fVar;
        g2fVar.k(new rr8(1, new df3(6)));
        this.b = f8cVar;
        this.c = qv3Var;
        this.d = ve2Var;
        this.e = lv4Var;
        this.f = ojeVar;
    }

    public static int a(ku3 ku3Var, ku3 ku3Var2, Collator collator) {
        CollationKey collationKey = ku3Var.o;
        if (collationKey == null) {
            collationKey = collator.getCollationKey(ku3Var.e().toLowerCase());
            ku3Var.o = collationKey;
        }
        CollationKey collationKey2 = ku3Var2.o;
        if (collationKey2 == null) {
            collationKey2 = collator.getCollationKey(ku3Var2.e().toLowerCase());
            ku3Var2.o = collationKey2;
        }
        boolean z = false;
        boolean z2 = !l8g.c(ku3Var.e()) && Character.isLetter(ku3Var.e().charAt(0));
        if (!l8g.c(ku3Var2.e()) && Character.isLetter(ku3Var2.e().charAt(0))) {
            z = true;
        }
        return (!(z2 && z) && (z2 || z)) ? z2 ? -1 : 1 : collationKey.compareTo(collationKey2);
    }

    public final void b(List list) {
        eh9 eh9Var;
        synchronized (this) {
            try {
                if (this.e.d() && this.f.k == 3) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.g.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.c.i(((Long) it.next()).longValue(), true));
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ku3 ku3Var = (ku3) it2.next();
                        if (!this.g.containsKey(Long.valueOf(ku3Var.p()))) {
                            arrayList.add(ku3Var);
                        }
                    }
                    Collections.sort(arrayList, new u04(this, this.b.d(), (Collator) this.a.e(), 1));
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.g.put(Long.valueOf(((ku3) arrayList.get(i)).p()), Integer.valueOf(i));
                    }
                }
            } finally {
            }
        }
        l8a l8aVar = new l8a();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ku3 ku3Var2 = (ku3) it3.next();
            pb2 pb2VarP = this.d.P(ku3Var2.p());
            long jO = (pb2VarP == null || (eh9Var = pb2VarP.c) == null || eh9Var.a.D()) ? 0L : pb2VarP.o();
            if (jO != 0) {
                l8aVar.e(ku3Var2.p(), -jO);
            } else {
                l8aVar.e(ku3Var2.p(), ((Integer) this.g.get(Long.valueOf(ku3Var2.p()))) != null ? r3.intValue() : 0L);
            }
        }
        list.sort(new dj3(2, l8aVar));
    }

    public final void c(ArrayList arrayList, em6 em6Var) {
        Collections.sort(arrayList, new u04(this, em6Var, new HashMap(), 0));
    }
}
