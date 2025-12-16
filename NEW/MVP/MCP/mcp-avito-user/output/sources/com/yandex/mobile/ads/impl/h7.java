package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import j.InterfaceC42155k;

/* loaded from: classes8.dex */
public final class h7 {
    @InterfaceC42155k
    public static boolean a(int i12) {
        return Build.VERSION.SDK_INT >= i12;
    }

    public static boolean a(@j.P Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
