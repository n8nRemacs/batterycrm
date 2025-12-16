package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.vp0;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class v {
    public static boolean a(List<?> list, @I41.a Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i12 = 0; i12 < size; i12++) {
                if (!vp0.a(list.get(i12), list2.get(i12))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<?> it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !vp0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
