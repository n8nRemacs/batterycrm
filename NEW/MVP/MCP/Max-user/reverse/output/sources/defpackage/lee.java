package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lee extends mee {
    public static int e(zde zdeVar) {
        Iterator it = zdeVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                ve3.o();
                throw null;
            }
        }
        return i;
    }

    public static zde f(zde zdeVar, int i) {
        if (i >= 0) {
            return i == 0 ? zdeVar : zdeVar instanceof b65 ? ((b65) zdeVar).b(i) : new a65(zdeVar, i, 0);
        }
        throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
    }

    public static oz5 g(zde zdeVar, em6 em6Var) {
        return new oz5(zdeVar, true, em6Var);
    }

    public static oz5 h(zde zdeVar, em6 em6Var) {
        return new oz5(zdeVar, false, em6Var);
    }

    public static Object i(zde zdeVar) {
        Iterator it = zdeVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final b26 j(zde zdeVar, em6 em6Var) {
        if (!(zdeVar instanceof nhg)) {
            return new b26(zdeVar, (em6) zx0.D0, em6Var);
        }
        nhg nhgVar = (nhg) zdeVar;
        return new b26(nhgVar.a, nhgVar.b, em6Var);
    }

    public static oz5 k(zde zdeVar, em6 em6Var) {
        return h(new nhg(zdeVar, em6Var), zx0.E0);
    }

    public static nhg l(zde zdeVar, em6 em6Var) {
        return new nhg(zdeVar, new i0(10, em6Var));
    }

    public static zde m(zde zdeVar, int i) {
        if (i >= 0) {
            return i == 0 ? qd5.a : zdeVar instanceof b65 ? ((b65) zdeVar).a(i) : new a65(zdeVar, i, 1);
        }
        throw new IllegalArgumentException(wy1.e(i, "Requested element count ", " is less than zero.").toString());
    }

    public static void n(zde zdeVar, Collection collection) {
        Iterator it = zdeVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static List o(zde zdeVar) {
        Iterator it = zdeVar.iterator();
        if (!it.hasNext()) {
            return hd5.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
