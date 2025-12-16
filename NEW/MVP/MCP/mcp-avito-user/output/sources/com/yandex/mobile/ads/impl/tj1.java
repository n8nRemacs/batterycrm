package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class tj1 {

    public interface a {
        boolean b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@j.N View view) {
        return ((a) view).b() && view.hasWindowFocus() && !rj1.d(view);
    }
}
