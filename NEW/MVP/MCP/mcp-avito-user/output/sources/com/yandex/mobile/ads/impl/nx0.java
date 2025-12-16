package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class nx0 {
    @j.P
    public static <T> T a(@j.N Class<T> cls, @j.N Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i12 = 0; i12 < objArr.length; i12++) {
            clsArr[i12] = objArr[i12].getClass();
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            boolean zIsAccessible = declaredConstructor.isAccessible();
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(true);
            }
            T tNewInstance = declaredConstructor.newInstance(objArr);
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return tNewInstance;
        } catch (Throwable unused) {
            Arrays.toString(objArr);
            return null;
        }
    }

    @j.P
    private static Object a(@j.P Object obj, @j.N Class<?> cls, @j.N String str, @j.N Class<?>[] clsArr, @j.N Object... objArr) {
        Object objInvoke;
        Method method;
        loop0: while (true) {
            objInvoke = null;
            if (cls == null) {
                method = null;
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                for (int i12 = 0; i12 < length; i12++) {
                    method = declaredMethods[i12];
                    if (str.equals(method.getName()) && a(method, clsArr)) {
                        break loop0;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Throwable unused) {
                return objInvoke;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        objInvoke = method.invoke(obj, objArr);
        method.setAccessible(false);
        return objInvoke;
    }

    private static boolean a(@j.N Method method, @j.N Class<?>[] clsArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < parameterTypes.length; i12++) {
            if (!parameterTypes[i12].isAssignableFrom(clsArr[i12])) {
                return false;
            }
        }
        return true;
    }

    @j.P
    public static Object a(@j.N Object obj, @j.N String str, @j.N Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i12 = 0; i12 < objArr.length; i12++) {
            clsArr[i12] = objArr[i12].getClass();
        }
        return a(obj, obj.getClass(), str, clsArr, objArr);
    }

    @j.P
    public static Object a(@j.N Class cls, @j.N String str, @j.N Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i12 = 0; i12 < objArr.length; i12++) {
            clsArr[i12] = objArr[i12].getClass();
        }
        return a(null, cls, str, clsArr, objArr);
    }
}
