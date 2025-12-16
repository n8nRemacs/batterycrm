package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zue implements Runnable {
    public final /* synthetic */ eve X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ArrayList o;

    public zue(eve eveVar, View view, View view2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.X = eveVar;
        this.b = view;
        this.d = view2;
        this.c = arrayList;
        this.o = arrayList2;
        this.Y = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        us usVar;
        Rect rect;
        int i = this.a;
        Object obj = this.Y;
        ArrayList arrayList = this.o;
        View view = this.d;
        View view2 = this.b;
        eve eveVar = this.X;
        ArrayList arrayList2 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj;
                shg shgVar = eveVar.u0;
                if (shgVar != null) {
                    shgVar.E(view2);
                    shg shgVar2 = eveVar.u0;
                    ArrayList arrayList3 = new ArrayList();
                    if (view != null) {
                        eve.n(arrayList3, view);
                    }
                    arrayList3.removeAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        arrayList3.add(view2);
                        vfi.a(shgVar2, arrayList3);
                    }
                    arrayList.addAll(arrayList3);
                }
                if (list != null) {
                    if (eveVar.t0 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(view2);
                        vfi.g(eveVar.t0, list, arrayList4);
                    }
                    list.clear();
                    list.add(view2);
                    break;
                }
                break;
            default:
                us usVar2 = eveVar.Y;
                View view3 = null;
                if (usVar2.isEmpty() || eveVar.v0 == null || view2 == null) {
                    usVar2.clear();
                    usVar = null;
                } else {
                    usVar = new us(0);
                    vfi.e(usVar, view2);
                    Iterator it = eveVar.s0.iterator();
                    while (it.hasNext()) {
                        dve dveVar = (dve) it.next();
                        View view4 = dveVar.a;
                        WeakHashMap weakHashMap = hfh.a;
                        usVar.put(veh.k(view4), dveVar.a);
                    }
                    usVar.l(new ArrayList(usVar2.values()));
                    for (int i2 = usVar2.c - 1; i2 >= 0; i2--) {
                        if (!usVar.containsKey((String) usVar2.i(i2))) {
                            usVar2.g(i2);
                        }
                    }
                }
                if (usVar != null) {
                    arrayList2.addAll(usVar.values());
                    arrayList2.add(view);
                }
                shg shgVar3 = eveVar.v0;
                if (shgVar3 != null) {
                    shgVar3.X.clear();
                    eveVar.v0.X.addAll(arrayList2);
                    vfi.g(eveVar.v0, arrayList, arrayList2);
                    if (eveVar.u0 != null && usVar2.c > 0 && usVar != null) {
                        view3 = (View) usVar.get(usVar2.i(0));
                    }
                    if (view3 != null && (rect = (Rect) obj) != null) {
                        int[] iArr = new int[2];
                        view3.getLocationOnScreen(iArr);
                        int i3 = iArr[0];
                        rect.set(i3, iArr[1], view3.getWidth() + i3, view3.getHeight() + iArr[1]);
                        break;
                    }
                }
                break;
        }
    }

    public zue(eve eveVar, View view, boolean z, ArrayList arrayList, View view2, ArrayList arrayList2, Rect rect) {
        this.X = eveVar;
        this.b = view;
        this.c = arrayList;
        this.d = view2;
        this.o = arrayList2;
        this.Y = rect;
    }
}
