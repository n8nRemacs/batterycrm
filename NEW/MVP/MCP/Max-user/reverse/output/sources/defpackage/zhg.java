package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zhg {
    public static final b90 a = new b90();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, shg shgVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (shgVar == null) {
            shgVar = a;
        }
        shg shgVarClone = shgVar.clone();
        ArrayList arrayList2 = (ArrayList) c().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((shg) it.next()).B(viewGroup);
            }
        }
        shgVarClone.i(viewGroup, true);
        if (viewGroup.getTag(sxc.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(sxc.transition_current_scene, null);
        yhg yhgVar = new yhg();
        yhgVar.a = shgVarClone;
        yhgVar.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(yhgVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(yhgVar);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((shg) arrayList2.get(size)).q(viewGroup);
        }
    }

    public static us c() {
        us usVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (usVar = (us) weakReference.get()) != null) {
            return usVar;
        }
        us usVar2 = new us(0);
        threadLocal.set(new WeakReference(usVar2));
        return usVar2;
    }
}
