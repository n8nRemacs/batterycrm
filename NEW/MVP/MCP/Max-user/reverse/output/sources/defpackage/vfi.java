package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class vfi {
    public static void a(shg shgVar, ArrayList arrayList) {
        if (shgVar == null) {
            return;
        }
        int i = 0;
        if (shgVar instanceof big) {
            big bigVar = (big) shgVar;
            int size = bigVar.Q0.size();
            while (i < size) {
                a(bigVar.S(i), arrayList);
                i++;
            }
            return;
        }
        ArrayList arrayList2 = shgVar.o;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ArrayList arrayList3 = shgVar.X;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                int size2 = arrayList.size();
                while (i < size2) {
                    shgVar.b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public static View d(View view, String str) {
        WeakHashMap weakHashMap = hfh.a;
        if (str.equals(veh.k(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewD = d(viewGroup.getChildAt(i), str);
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static void e(us usVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = hfh.a;
            String strK = veh.k(view);
            if (strK != null) {
                usVar.put(strK, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    e(usVar, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static big f(int i, shg... shgVarArr) {
        big bigVar = new big();
        for (shg shgVar : shgVarArr) {
            if (shgVar != null) {
                bigVar.R(shgVar);
            }
        }
        bigVar.U(i);
        return bigVar;
    }

    public static void g(shg shgVar, List list, List list2) {
        ArrayList arrayList;
        int i = 0;
        if (shgVar instanceof big) {
            big bigVar = (big) shgVar;
            int size = bigVar.Q0.size();
            while (i < size) {
                g(bigVar.S(i), list, list2);
                i++;
            }
            return;
        }
        ArrayList arrayList2 = shgVar.o;
        if ((arrayList2 == null || arrayList2.isEmpty()) && (arrayList = shgVar.X) != null && arrayList.size() == list.size() && arrayList.containsAll(list)) {
            int size2 = list2 == null ? 0 : list2.size();
            while (i < size2) {
                shgVar.b((View) list2.get(i));
                i++;
            }
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                shgVar.E((View) list.get(size3));
            }
        }
    }

    public static final void h(esg esgVar) {
        esgVar.d(456, new zv6(1));
        esgVar.d(457, new qu4(26));
        esgVar.d(458, new zv6(2));
        esgVar.b(1, new qu4(25));
        esgVar.d(459, new yv6(1));
    }

    public abstract long b();

    public abstract ua9 c();

    public abstract void i(vv0 vv0Var);
}
