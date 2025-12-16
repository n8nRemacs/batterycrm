package com.avito.security;

/* loaded from: classes5.dex */
class a0 {
    public static <T extends Comparable<?>> int a(T t12, T t13) {
        if (t12 == t13) {
            return 0;
        }
        if (t12 == null) {
            return -1;
        }
        if (t13 == null) {
            return 1;
        }
        return t12.compareTo(t13);
    }
}
