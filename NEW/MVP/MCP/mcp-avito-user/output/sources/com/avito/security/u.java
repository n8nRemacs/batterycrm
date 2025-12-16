package com.avito.security;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes5.dex */
class u extends t {
    public static final <T> void a(List<T> list, Comparator<? super T> comparator) {
        y0.b(list, "$this$sortWith");
        y0.b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
