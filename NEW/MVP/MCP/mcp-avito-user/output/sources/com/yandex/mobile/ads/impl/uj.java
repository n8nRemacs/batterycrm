package com.yandex.mobile.ads.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public final class uj {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final Method f390574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final Method f390575b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final Method f390576c;

    public static final class a {
        @Y61.k
        public static uj a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new uj(method, method3, method2);
        }
    }

    public uj(@Y61.l Method method, @Y61.l Method method2, @Y61.l Method method3) {
        this.f390574a = method;
        this.f390575b = method2;
        this.f390576c = method3;
    }

    @Y61.l
    public final Object a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f390574a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                this.f390575b.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(@Y61.l Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return false;
        }
        try {
            this.f390576c.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
