package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class bu extends RuntimeException {
    public bu(int i12) {
        super(a(i12));
    }

    private static String a(int i12) {
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
