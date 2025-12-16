package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class xp1 {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(to1 to1Var) {
        if (!to1Var.g()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (to1Var.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
