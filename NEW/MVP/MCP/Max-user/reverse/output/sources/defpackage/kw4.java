package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class kw4 {
    public static final ife f;
    public final y6d a;
    public final pqg b;
    public List c = Collections.EMPTY_LIST;
    public Map d = Collections.EMPTY_MAP;
    public boolean e = false;

    static {
        ife ifeVar = new ife();
        f = ifeVar;
        ifeVar.a = true;
    }

    public kw4(y6d y6dVar, pqg pqgVar) {
        this.a = y6dVar;
        this.b = pqgVar;
    }

    public final void a(List list) {
        List<u61> list2 = this.e ? Collections.EMPTY_LIST : this.c;
        HashMap map = new HashMap();
        for (u61 u61Var : list2) {
            map.put(u61Var.a, u61Var);
        }
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u61 u61Var2 = (u61) it.next();
            map2.put(u61Var2.a, u61Var2);
        }
        ArrayList arrayList = new ArrayList();
        for (nt1 nt1Var : map2.keySet()) {
            u61 u61Var3 = (u61) map.get(nt1Var);
            u61 u61Var4 = (u61) map2.get(nt1Var);
            if (u61Var4 != null && (u61Var3 == null || !u61Var3.b.equals(u61Var4.b))) {
                nt1 nt1Var2 = u61Var4.a;
                d3h d3hVar = u61Var4.b;
                ife ifeVar = new ife();
                ifeVar.d = d3hVar.c != 1 ? 2 : 1;
                ifeVar.b = d3hVar.a;
                ifeVar.c = d3hVar.b;
                ifeVar.a = false;
                arrayList.add(new jfe(nt1Var2, ifeVar));
            }
        }
        for (nt1 nt1Var3 : map.keySet()) {
            u61 u61Var5 = (u61) map.get(nt1Var3);
            if (u61Var5 != null && !map2.containsKey(nt1Var3)) {
                arrayList.add(new jfe(u61Var5.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            atg atgVar = new atg(arrayList, z);
            jud judVarA = this.b.r.A();
            jw4 jw4Var = new jw4(this, 0);
            jw4 jw4Var2 = new jw4(this, 1);
            hud hudVar = new hud(atgVar);
            hudVar.c = jw4Var;
            hudVar.d = jw4Var2;
            judVarA.d(new hud(hudVar));
        }
        this.c = list;
        HashMap map3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            u61 u61Var6 = (u61) it2.next();
            ti1 ti1Var = u61Var6.a.b;
            Set hashSet = (Set) map3.get(ti1Var);
            if (hashSet == null) {
                hashSet = new HashSet();
                map3.put(ti1Var, hashSet);
            }
            hashSet.add(u61Var6.a);
        }
        this.d = map3;
        this.e = false;
    }
}
