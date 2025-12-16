package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.MobileAds;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39330h0 {
    @Y61.l
    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader());
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            return (String) declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Y61.l
    @j.X
    public static String b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, MobileAds.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
