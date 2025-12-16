package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import x01.m0;

/* loaded from: classes7.dex */
public abstract class f {

    public static class a extends Exception {
    }

    public static Object a(Class cls, Class[] clsArr, Object[] objArr) throws a {
        String str;
        if (clsArr.length != objArr.length) {
            throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
        }
        try {
        } catch (NoSuchMethodException unused) {
            m0.e("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
        try {
            return cls.getMethod("get", clsArr).invoke(null, objArr);
        } catch (IllegalAccessException unused2) {
            str = "invokeStaticFun(): method invoke Exception!";
            m0.e("hmsSdk", str);
            return null;
        } catch (IllegalArgumentException unused3) {
            str = "invokeStaticFun(): Illegal Argument!";
            m0.e("hmsSdk", str);
            return null;
        } catch (InvocationTargetException unused4) {
            str = "invokeStaticFun(): Invocation Target Exception!";
            m0.e("hmsSdk", str);
            return null;
        }
    }

    public static String b() {
        if (TextUtils.isEmpty("ro.build.version.emui")) {
            return "";
        }
        String strC = c("android.os.SystemProperties", "ro.build.version.emui");
        return TextUtils.isEmpty(strC) ? c("com.huawei.android.os.SystemPropertiesEx", "ro.build.version.emui") : strC;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}
            java.lang.String r1 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r1}
            java.lang.String r2 = "hmsSdk"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: com.huawei.hms.hatool.f.a -> L17 java.lang.ClassNotFoundException -> L1d
            java.lang.Object r3 = a(r3, r0, r4)     // Catch: com.huawei.hms.hatool.f.a -> L17 java.lang.ClassNotFoundException -> L1d
            goto L21
        L17:
            java.lang.String r3 = "invokeStaticFun(): Static function call Exception "
        L19:
            x01.m0.e(r2, r3)
            goto L20
        L1d:
            java.lang.String r3 = "invokeStaticFun() Not found class!"
            goto L19
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto L26
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.f.c(java.lang.String, java.lang.String):java.lang.String");
    }
}
