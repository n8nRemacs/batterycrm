package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class ht3 {
    public final vt3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public Object d;
    public jkc e;

    public ht3(vt3 vt3Var) {
        this.a = vt3Var;
    }

    public abstract boolean a(r5i r5iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object obj : iterable) {
            if (a((r5i) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((r5i) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.n(this);
        } else {
            vt3 vt3Var = this.a;
            synchronized (vt3Var.c) {
                try {
                    if (((LinkedHashSet) vt3Var.e).add(this)) {
                        if (((LinkedHashSet) vt3Var.e).size() == 1) {
                            vt3Var.d = vt3Var.i();
                            cei.g().c(wt3.a, vt3Var.getClass().getSimpleName() + ": initial state = " + vt3Var.d);
                            vt3Var.r();
                        }
                        Object obj2 = vt3Var.d;
                        this.d = obj2;
                        d(this.e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(jkc jkcVar, Object obj) {
        if (this.b.isEmpty() || jkcVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.b;
            synchronized (jkcVar.c) {
                n4i n4iVar = (n4i) jkcVar.a;
                if (n4iVar != null) {
                    n4iVar.d(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.b;
        synchronized (jkcVar.c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (jkcVar.l(((r5i) next).a)) {
                        arrayList3.add(next);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    r5i r5iVar = (r5i) it2.next();
                    cei.g().c(o4i.a, "Constraints met for " + r5iVar);
                }
                n4i n4iVar2 = (n4i) jkcVar.a;
                if (n4iVar2 != null) {
                    n4iVar2.f(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
