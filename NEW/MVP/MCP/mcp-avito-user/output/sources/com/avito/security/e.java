package com.avito.security;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
class e extends d {
    public static <T> List<T> a(T[] tArr) {
        y0.b(tArr, "$this$asList");
        List<T> listA = g.a(tArr);
        y0.a((Object) listA, "ArraysUtilJVM.asList(this)");
        return listA;
    }

    public static final <T> void b(T[] tArr) {
        y0.b(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void a(T[] tArr, Comparator<? super T> comparator) {
        y0.b(tArr, "$this$sortWith");
        y0.b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
