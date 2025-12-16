package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public final class qg {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private static Method f389159a;

    @j.P
    public static IBinder a(Bundle bundle, @j.P String str) throws NoSuchMethodException, SecurityException {
        if (pc1.f388768a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f389159a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f389159a = method2;
                method2.setAccessible(true);
                method = f389159a;
            } catch (NoSuchMethodException e12) {
                ka0.a("Failed to retrieve getIBinder method", (Exception) e12);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e13) {
            ka0.a("Failed to invoke getIBinder via reflection", e13);
            return null;
        }
    }
}
