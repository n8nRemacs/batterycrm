package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: SortedIterables.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37327e4 {
    public static boolean a(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C37392p3.f359948d;
            }
        } else {
            if (!(collection instanceof InterfaceC37321d4)) {
                return false;
            }
            objComparator = ((InterfaceC37321d4) collection).comparator();
        }
        return comparator.equals(objComparator);
    }
}
