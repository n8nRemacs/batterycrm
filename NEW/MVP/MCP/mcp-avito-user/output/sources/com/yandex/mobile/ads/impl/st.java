package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* loaded from: classes8.dex */
public final class st {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f390024a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f390025b = "goog.exo.core";

    public static synchronized String a() {
        return f390025b;
    }

    public static synchronized void a(String str) {
        if (f390024a.add(str)) {
            f390025b += ", " + str;
        }
    }
}
