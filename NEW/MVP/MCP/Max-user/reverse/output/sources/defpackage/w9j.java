package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class w9j {
    public static final double a(double d, y65 y65Var, y65 y65Var2) {
        long jConvert = y65Var2.a.convert(1L, y65Var.a);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static dke c(Set set, l7c l7cVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof dke)) {
                set.getClass();
                return new dke(set, l7cVar);
            }
            dke dkeVar = (dke) set;
            l7c l7cVar2 = dkeVar.b;
            l7cVar2.getClass();
            return new dke(dkeVar.a, new p7c(Arrays.asList(l7cVar2, l7cVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof dke)) {
            set2.getClass();
            return new eke(set2, l7cVar);
        }
        dke dkeVar2 = (dke) set2;
        l7c l7cVar3 = dkeVar2.b;
        l7cVar3.getClass();
        return new eke((SortedSet) dkeVar2.a, new p7c(Arrays.asList(l7cVar3, l7cVar)));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static cke e(Set set, hh7 hh7Var) {
        u5j.e(set, "set1");
        u5j.e(hh7Var, "set2");
        return new cke(set, hh7Var);
    }

    public static final String f(y65 y65Var) {
        switch (y65Var.ordinal()) {
            case 0:
                return "ns";
            case 1:
                return "us";
            case 2:
                return "ms";
            case 3:
                return "s";
            case 4:
                return "m";
            case 5:
                return "h";
            case 6:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + y65Var).toString());
        }
    }
}
