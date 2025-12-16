package com.google.android.gms.internal.mlkit_common;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzo {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f351673a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f351674b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f351675c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f351676d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f351677e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f351678f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f351679g;

    static {
        Field field;
        Object obj;
        Method declaredMethod;
        Method declaredMethod2;
        Field field2;
        Field field3;
        Object obj2;
        Method method = null;
        Field field4 = null;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            Method declaredMethod3 = cls3.getDeclaredMethod("S_ISLNK", Integer.TYPE);
            try {
                declaredMethod3.setAccessible(true);
                declaredMethod2 = cls4.getDeclaredMethod("lstat", String.class);
                try {
                    declaredMethod = cls4.getDeclaredMethod("fstat", FileDescriptor.class);
                    try {
                        Field declaredField = cls.getDeclaredField("os");
                        declaredField.setAccessible(true);
                        obj2 = declaredField.get(cls);
                        try {
                            field2 = cls2.getField("st_dev");
                        } catch (Throwable unused) {
                            field2 = null;
                            field3 = null;
                        }
                    } catch (Throwable unused2) {
                        field = null;
                        obj = null;
                        field2 = null;
                        field3 = field2;
                        method = declaredMethod3;
                        f351673a = method;
                        f351674b = declaredMethod2;
                        f351675c = declaredMethod;
                        f351676d = field2;
                        f351677e = field3;
                        f351678f = field;
                        f351679g = obj;
                    }
                } catch (Throwable unused3) {
                    field = null;
                    obj = null;
                    declaredMethod = null;
                    field2 = null;
                }
                try {
                    field3 = cls2.getField("st_ino");
                    try {
                        field4 = cls2.getField("st_mode");
                        field2.setAccessible(true);
                        field3.setAccessible(true);
                        field4.setAccessible(true);
                        f351673a = declaredMethod3;
                        f351674b = declaredMethod2;
                        f351675c = declaredMethod;
                        f351676d = field2;
                        f351677e = field3;
                        f351678f = field4;
                        f351679g = obj2;
                    } catch (Throwable unused4) {
                        obj = obj2;
                        field = field4;
                        method = declaredMethod3;
                        f351673a = method;
                        f351674b = declaredMethod2;
                        f351675c = declaredMethod;
                        f351676d = field2;
                        f351677e = field3;
                        f351678f = field;
                        f351679g = obj;
                    }
                } catch (Throwable unused5) {
                    field3 = null;
                    obj = obj2;
                    field = field3;
                    method = declaredMethod3;
                    f351673a = method;
                    f351674b = declaredMethod2;
                    f351675c = declaredMethod;
                    f351676d = field2;
                    f351677e = field3;
                    f351678f = field;
                    f351679g = obj;
                }
            } catch (Throwable unused6) {
                field = null;
                obj = null;
                declaredMethod = null;
                declaredMethod2 = null;
                field2 = null;
            }
        } catch (Throwable unused7) {
            field = null;
            obj = null;
            declaredMethod = null;
            declaredMethod2 = null;
            field2 = null;
            field3 = null;
        }
    }

    public static zzq a(Object obj) {
        long jLongValue = ((Long) f351676d.get(obj)).longValue();
        long jLongValue2 = ((Long) f351677e.get(obj)).longValue();
        Integer num = (Integer) f351678f.get(obj);
        num.intValue();
        return new zzq(jLongValue, jLongValue2, ((Boolean) f351673a.invoke(null, num)).booleanValue(), null);
    }
}
