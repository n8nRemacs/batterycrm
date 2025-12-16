package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class x18 implements ny0 {
    public final LinkedHashMap a;

    public x18(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(to8.i(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new w18(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    public static l09 e(String str) {
        Object next;
        Integer numH;
        String queryParameter = Uri.parse(str).getQueryParameter("MediaItemType");
        int iIntValue = (queryParameter == null || (numH = cnf.h(queryParameter)) == null) ? -1 : numH.intValue();
        f2 f2Var = new f2(0, l09.X);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((l09) next).ordinal() == iIntValue) {
                break;
            }
        }
        l09 l09Var = (l09) next;
        return l09Var == null ? l09.a : l09Var;
    }

    @Override // defpackage.ny0
    public final void a(b1f b1fVar, e1f e1fVar) {
        w18 w18Var = (w18) this.a.get(e(e1fVar.a));
        if (w18Var != null) {
            w18Var.a(b1fVar, e1fVar);
        }
    }

    @Override // defpackage.ny0
    public final void b(ey0 ey0Var, String str, long j, long j2) {
        w18 w18Var = (w18) this.a.get(e(str));
        if (w18Var != null) {
            w18Var.b(ey0Var, str, j, j2);
        }
    }

    @Override // defpackage.ny0
    public final void c(b1f b1fVar, e1f e1fVar, e1f e1fVar2) {
        d(b1fVar, e1fVar);
        a(b1fVar, e1fVar2);
    }

    @Override // defpackage.ny0
    public final void d(b1f b1fVar, xy0 xy0Var) {
        w18 w18Var = (w18) this.a.get(e(xy0Var.a));
        if (w18Var != null) {
            w18Var.d(b1fVar, xy0Var);
        }
    }
}
