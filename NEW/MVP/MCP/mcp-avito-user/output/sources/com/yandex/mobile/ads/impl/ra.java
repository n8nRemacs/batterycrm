package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;

/* loaded from: classes8.dex */
public final class ra {
    @Y61.l
    public static String a() {
        try {
            return YandexMetrica.getLibraryVersion();
        } catch (Exception unused) {
            return null;
        }
    }
}
