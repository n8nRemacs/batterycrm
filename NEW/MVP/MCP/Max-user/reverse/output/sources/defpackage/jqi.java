package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jqi {
    public static boolean a(Iterable iterable, m7c m7cVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            try {
                if (m7cVar.test(it.next())) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public static ArrayList b(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static long[] c(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    public static List d(Iterable iterable, m7c m7cVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            try {
                if (m7cVar.test(obj)) {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static final at e(View view) {
        return new at(new rfh(view, null));
    }

    public static boolean f(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static ArrayList g(List list, tm6 tm6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(tm6Var.apply(it.next()));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public static final void h(ViewGroup viewGroup, View view, View view2, w6 w6Var, float f) {
        if (view2 != null) {
            view2.setTranslationY(viewGroup.getContext().getResources().getDisplayMetrics().heightPixels * f);
        }
        if (w6Var != null) {
            w6Var.setAlpha(1.0f - Math.abs(f));
        }
        float fAbs = Math.abs(f) * 3;
        if (fAbs > 1.0f) {
            fAbs = 1.0f;
        }
        if (view != null) {
            view.setPivotX(view.getWidth() / 2.0f);
        }
        if (view != null) {
            view.setPivotY(view.getHeight() / 2.0f);
        }
        if (view != null) {
            view.setScaleX(((1 - fAbs) * 0.1f) + 1.0f);
        }
        if (view != null) {
            view.setScaleY(((1 - fAbs) * 0.1f) + 1.0f);
        }
    }

    public static void i(List list) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        list.clear();
        list.addAll(linkedHashSet);
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0 && arrayList.size() <= 1000) {
            arrayList2.add(arrayList);
            return arrayList2;
        }
        while (arrayList.size() != 0) {
            List listSubList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
            ArrayList arrayList3 = new ArrayList(listSubList.size());
            arrayList3.addAll(listSubList);
            listSubList.clear();
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }
}
