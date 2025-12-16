package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* loaded from: classes8.dex */
public final class gw0 extends o70 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f385848a;

    public static void a(boolean z12) {
        f385848a = z12;
    }

    public static void a(String str, Object... objArr) {
        if (f385848a) {
            String.format(Locale.US, str, objArr);
        }
    }
}
