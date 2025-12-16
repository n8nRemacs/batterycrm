package defpackage;

import android.content.Context;
import android.view.View;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class u73 implements vta {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object o;

    public u73() {
        this.c = new HashMap();
        this.d = new HashSet();
    }

    public boolean a(tq8 tq8Var) {
        int id = tq8Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        tq8 tq8Var2 = (tq8) ((HashMap) this.c).get(Integer.valueOf(e()));
        if (tq8Var2 != null) {
            h(tq8Var2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!tq8Var.isChecked()) {
            tq8Var.setChecked(true);
        }
        return zAdd;
    }

    @Override // defpackage.vta
    public void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a = true;
        ((vta) this.c).b();
    }

    @Override // defpackage.vta
    public void c(py4 py4Var) {
        n42 n42Var = (n42) this.o;
        n42Var.getClass();
        ty4.d(n42Var, py4Var);
    }

    public ArrayList d(n83 n83Var) {
        HashSet hashSet = new HashSet((HashSet) this.d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < n83Var.getChildCount(); i++) {
            View childAt = n83Var.getChildAt(i);
            if ((childAt instanceof tq8) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int e() {
        HashSet hashSet = (HashSet) this.d;
        if (!this.a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        if (this.b) {
            return;
        }
        ((vta) this.c).f(obj);
    }

    public void g() {
        h08 h08Var = (h08) this.o;
        if (h08Var != null) {
            new HashSet((HashSet) this.d);
            a2b a2bVar = (a2b) h08Var.b;
            l83 l83Var = a2bVar.t0;
            if (l83Var != null) {
                a2bVar.u0.d(a2bVar);
                n83 n83Var = (n83) ((a3b) l83Var).b;
                if (n83Var.u0.a) {
                    int checkedChipId = n83Var.getCheckedChipId();
                    for (int i = 0; i < a2bVar.getChildCount(); i++) {
                        View childAt = a2bVar.getChildAt(i);
                        childAt.setClickable(childAt.getId() != checkedChipId);
                    }
                }
            }
        }
    }

    public boolean h(tq8 tq8Var, boolean z) {
        int id = tq8Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            tq8Var.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (tq8Var.isChecked()) {
            tq8Var.setChecked(false);
        }
        return zRemove;
    }

    @Override // defpackage.vta
    public void onError(Throwable th) {
        vta vtaVar = (vta) this.c;
        if (this.a) {
            if (this.b) {
                t8j.a(th);
                return;
            } else {
                vtaVar.onError(th);
                return;
            }
        }
        this.a = true;
        try {
            ((lta) ((sr5) this.d).apply(th)).a(this);
        } catch (Throwable th2) {
            raj.c(th2);
            vtaVar.onError(new CompositeException(th, th2));
        }
    }

    public u73(vta vtaVar, sr5 sr5Var) {
        this.c = vtaVar;
        this.d = sr5Var;
        this.o = new n42(2);
    }

    public u73(Context context, String str, ggg gggVar, boolean z, boolean z2) {
        this.c = context;
        this.d = str;
        this.o = gggVar;
        this.a = z;
        this.b = z2;
    }
}
