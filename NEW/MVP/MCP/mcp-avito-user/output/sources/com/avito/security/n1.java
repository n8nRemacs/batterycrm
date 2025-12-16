package com.avito.security;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class n1 {

    final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f338612a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f338613b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f338614c = new a();

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            y0.a((Object) methods, "throwableMethods");
            int length = methods.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                method = null;
                if (i13 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i13];
                y0.a((Object) method2, "it");
                if (y0.a((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    y0.a((Object) parameterTypes, "it.parameterTypes");
                    if (y0.a((Class) f.c(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i13++;
            }
            f338612a = method2;
            int length2 = methods.length;
            while (true) {
                if (i12 >= length2) {
                    break;
                }
                Method method3 = methods[i12];
                y0.a((Object) method3, "it");
                if (y0.a((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i12++;
            }
            f338613b = method;
        }

        private a() {
        }
    }

    public void a(Throwable th2, Throwable th3) {
        y0.b(th2, "cause");
        y0.b(th3, "exception");
        Method method = a.f338612a;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }
}
