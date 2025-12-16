package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i1c {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, h1c h1cVar) {
        LinkedHashMap linkedHashMap = this.b;
        Object arrayList = linkedHashMap.get(h1cVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(h1cVar, arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(viewGroup)) {
            return;
        }
        list.add(viewGroup);
        if (viewGroup.getMeasuredWidth() == 0 || viewGroup.getMeasuredHeight() == 0) {
            return;
        }
        c();
    }

    public final List b(h1c h1cVar) {
        ArrayList arrayList;
        List list = (List) this.b.get(h1cVar);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                View view = (View) obj;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? hd5.a : arrayList;
    }

    public final void c() {
        Iterator it = b(h1c.a).iterator();
        int height = 0;
        int height2 = 0;
        while (it.hasNext()) {
            height2 += ((View) it.next()).getHeight();
        }
        Iterator it2 = b(h1c.b).iterator();
        while (it2.hasNext()) {
            height += ((View) it2.next()).getHeight();
        }
        j1c j1cVar = new j1c(height2, height);
        Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            ((vq1) ((g1c) it3.next())).C(j1cVar);
        }
    }
}
