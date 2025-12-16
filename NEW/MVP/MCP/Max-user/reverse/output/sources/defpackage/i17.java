package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i17 {
    public final ArrayList a;

    public i17(List list) {
        this.a = new ArrayList(list);
    }

    public static String i(i17 i17Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i17Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((cuc) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public void a(String str, String str2) {
        a8i.c(str);
        a8i.d(str2, str);
        b(str, str2);
    }

    public void b(String str, String str2) {
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(vmf.c0(str2).toString());
    }

    public j17 c() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new j17((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean d(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((cuc) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public cuc e(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            cuc cucVar = (cuc) it.next();
            if (cucVar.getClass() == cls) {
                return cucVar;
            }
        }
        return null;
    }

    public ArrayList f(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            cuc cucVar = (cuc) it.next();
            if (cls.isAssignableFrom(cucVar.getClass())) {
                arrayList.add(cucVar);
            }
        }
        return arrayList;
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void h(String str, String str2) {
        a8i.c(str);
        a8i.d(str2, str);
        g(str);
        b(str, str2);
    }

    public i17() {
        this.a = new ArrayList(20);
    }
}
