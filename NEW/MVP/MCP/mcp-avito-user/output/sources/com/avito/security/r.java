package com.avito.security;

import java.util.Collection;

/* loaded from: classes5.dex */
class r extends q {
    public static <T> int a(Iterable<? extends T> iterable, int i12) {
        y0.b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i12;
    }
}
