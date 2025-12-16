package com.yandex.mobile.ads.impl;

import aZ0.InterfaceC19845a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class e80 {
    public static boolean a(Collection collection, ju0 ju0Var) {
        Iterator it = collection.iterator();
        if (ju0Var == null) {
            throw new NullPointerException("predicate");
        }
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (ju0Var.apply(it.next())) {
                break;
            }
            i12++;
        }
        return i12 != -1;
    }

    @InterfaceC19845a
    public static void b(Collection collection, ju0 ju0Var) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            com.yandex.mobile.ads.embedded.guava.collect.u.a(collection.iterator(), ju0Var);
            return;
        }
        List list = (List) collection;
        ju0Var.getClass();
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            Object obj = list.get(i13);
            if (!ju0Var.apply(obj)) {
                if (i13 > i12) {
                    try {
                        list.set(i12, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i13; size--) {
                            if (ju0Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i14 = i13 - 1; i14 >= i12; i14--) {
                            list.remove(i14);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i13; size2--) {
                            if (ju0Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i15 = i13 - 1; i15 >= i12; i15--) {
                            list.remove(i15);
                        }
                        return;
                    }
                }
                i12++;
            }
        }
        list.subList(i12, list.size()).clear();
    }
}
