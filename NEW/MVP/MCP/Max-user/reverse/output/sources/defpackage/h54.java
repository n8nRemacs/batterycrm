package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h54 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public h54() {
        getClass().getConstructor(null);
    }

    public static final void c(e54 e54Var) {
        View view;
        c54 c54Var = e54Var.a;
        c54 c54Var2 = e54Var.b;
        boolean z = e54Var.c;
        ViewGroup viewGroup = e54Var.d;
        h54 h54VarB = e54Var.e;
        ArrayList arrayList = e54Var.f;
        if (viewGroup == null) {
            return;
        }
        if (h54VarB == null) {
            h54VarB = new c2f(true);
        } else if (h54VarB.b && !h54VarB.e()) {
            h54VarB = h54VarB.b();
        }
        h54 h54Var = h54VarB;
        h54Var.b = true;
        HashMap map = c;
        if (c54Var2 != null) {
            if (z) {
                j6j.a(c54Var2.getInstanceId());
            } else {
                d54 d54Var = (d54) map.get(c54Var2.getInstanceId());
                if (d54Var != null) {
                    h54 h54Var2 = d54Var.a;
                    if (d54Var.b) {
                        h54Var2.f(h54Var, c54Var);
                    } else {
                        h54Var2.a();
                    }
                }
            }
        }
        if (c54Var != null) {
            map.put(c54Var.getInstanceId(), new d54(h54Var, z));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g54) it.next()).a(c54Var, c54Var2, z);
        }
        i54 i54Var = z ? i54.PUSH_ENTER : i54.POP_ENTER;
        i54 i54Var2 = z ? i54.PUSH_EXIT : i54.POP_EXIT;
        View view2 = null;
        if (c54Var != null) {
            View viewInflate = c54Var.inflate(viewGroup);
            c54Var.changeStarted(h54Var, i54Var);
            view = viewInflate;
        } else {
            view = null;
        }
        if (c54Var2 != null) {
            view2 = c54Var2.getView();
            c54Var2.changeStarted(h54Var, i54Var2);
        }
        View view3 = view2;
        h54Var.g(viewGroup, view3, view, z, new f54(c54Var2, h54Var, i54Var2, c54Var, arrayList, view3, i54Var, z, viewGroup));
    }

    public void a() {
    }

    public h54 b() {
        return j6j.b(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f(h54 h54Var, c54 c54Var) {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, f54 f54Var);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
