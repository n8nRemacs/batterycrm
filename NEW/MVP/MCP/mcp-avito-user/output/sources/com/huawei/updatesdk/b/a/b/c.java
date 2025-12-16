package com.huawei.updatesdk.b.a.b;

import android.util.ArrayMap;
import android.util.ArraySet;
import java.io.File;
import java.security.PublicKey;

/* loaded from: classes7.dex */
class c {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ArrayMap<String, ArraySet<PublicKey>> f363816a = null;

        /* renamed from: b, reason: collision with root package name */
        ArraySet<String> f363817b = null;
    }

    public static a a(File file) {
        a aVar = new a();
        Object objB = b(file);
        if (objB != null) {
            Object objA = a(objB, "mKeySetMapping");
            if (objA instanceof ArrayMap) {
                aVar.f363816a = (ArrayMap) objA;
            }
            Object objA2 = a(objB, "mUpgradeKeySets");
            if (objA2 instanceof ArraySet) {
                aVar.f363817b = (ArraySet) objA2;
            }
        }
        return aVar;
    }

    private static Object b(File file) {
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            return cls.getDeclaredMethod("parsePackage", File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("KeySetsUtils", "can not get PackageParser: " + th2.toString());
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        try {
            return Class.forName("android.content.pm.PackageParser$Package").getDeclaredField(str).get(obj);
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("KeySetsUtils", "can not find class: " + th2.toString());
            return null;
        }
    }
}
