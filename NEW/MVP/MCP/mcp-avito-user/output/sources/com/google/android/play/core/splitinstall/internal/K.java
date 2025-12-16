package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class K {
    public static I a(Object obj, Class cls, String str) {
        return new I(obj, d(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object b(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(e(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e12) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e12);
        }
    }

    public static Object c(Object obj, String str, Class cls, List list, File file, Class cls2, List list2) {
        try {
            return Object[].class.cast(e(obj.getClass(), str, cls, File.class, cls2).invoke(obj, list, file, list2));
        } catch (Exception e12) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e12);
        }
    }

    public static Field d(Object obj, String str) throws NoSuchFieldException, SecurityException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(androidx.compose.ui.graphics.colorspace.e.n("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static Method e(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
