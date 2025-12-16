package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Arrays;

/* loaded from: classes8.dex */
final class e0 {
    public static <T> T[] a(Object[] objArr, int i12, int i13, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i12, i13, tArr.getClass());
    }
}
