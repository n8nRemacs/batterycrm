package com.avito.security;

import java.util.List;

/* loaded from: classes5.dex */
class q extends p {
    public static <T> List<T> a() {
        return g0.f338589a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> a(List<? extends T> list) {
        y0.b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : p.a(list.get(0)) : a();
    }
}
