package com.yandex.mobile.ads.embedded.guava.collect;

import aZ0.InterfaceC19845a;

/* loaded from: classes8.dex */
final class h {
    @InterfaceC19845a
    public static int a(int i12, String str) {
        if (i12 >= 0) {
            return i12;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i12);
    }
}
