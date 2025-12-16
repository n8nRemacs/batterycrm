package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class af3 extends ze3 {
    public static void t(AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.addAll(Arrays.asList(objArr));
    }

    public static void u(AbstractList abstractList, zde zdeVar) {
        Iterator it = zdeVar.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static void v(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void w(ArrayList arrayList, em6 em6Var) {
        int i;
        int i2 = ve3.i(arrayList);
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            while (true) {
                Object obj = arrayList.get(i3);
                if (!((Boolean) em6Var.invoke(obj)).booleanValue()) {
                    if (i4 != i3) {
                        arrayList.set(i4, obj);
                    }
                    i4++;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
            i3 = i4;
        }
        if (i3 >= arrayList.size() || i3 > (i = ve3.i(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(i);
            if (i == i3) {
                return;
            } else {
                i--;
            }
        }
    }

    public static void x(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(ve3.i(arrayList));
    }
}
