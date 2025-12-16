package com.avito.security;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
class p {
    public static <T> List<T> a(T t12) {
        List<T> listSingletonList = Collections.singletonList(t12);
        y0.a((Object) listSingletonList, "java.util.Collections.singletonList(element)");
        return listSingletonList;
    }
}
