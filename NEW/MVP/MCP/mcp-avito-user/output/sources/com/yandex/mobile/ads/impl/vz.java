package com.yandex.mobile.ads.impl;

import kotlin.text.C43059p;

/* loaded from: classes8.dex */
public final class vz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final C43059p f391231a = new C43059p("(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]");

    public static boolean a(@Y61.l String str) {
        if (str != null) {
            return f391231a.e(str);
        }
        return false;
    }
}
