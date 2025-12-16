package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.h70;
import com.yandex.mobile.ads.impl.oa0;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.zg0;
import j.N;

/* loaded from: classes8.dex */
public final class MobileAds {
    public static void enableDebugErrorIndicator(boolean z12) {
        q21.b().a(z12);
    }

    public static void enableLogging(boolean z12) {
        gw0.a(z12);
        h70.a(z12);
    }

    public static String getLibraryVersion() {
        return "6.0.1";
    }

    public static void initialize(@N Context context, @N InitializationListener initializationListener) {
        if (new ed().a()) {
            return;
        }
        new oa0(context).a();
        zg0.b().a(context, initializationListener);
    }

    public static void setAgeRestrictedUser(boolean z12) {
        q21.b().b(z12);
    }

    public static void setLocationConsent(boolean z12) {
        q21.b().c(z12);
    }

    public static void setUserConsent(boolean z12) {
        q21.b().d(z12);
    }

    public static void setVideoPoolSize(int i12) {
        q21.b().a(i12);
    }
}
