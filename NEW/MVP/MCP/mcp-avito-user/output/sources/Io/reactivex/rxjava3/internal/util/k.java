package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MergerBiFunction.java */
/* loaded from: classes8.dex */
public final class k<T> implements l41.c<List<T>, List<T>, List<T>> {
    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        int size = list2.size() + list.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        Object next = it.hasNext() ? it.next() : null;
        Object next2 = it2.hasNext() ? it2.next() : null;
        if (next != null && next2 != null) {
            throw null;
        }
        if (next != null) {
            arrayList.add(next);
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList.add(next2);
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }
}
