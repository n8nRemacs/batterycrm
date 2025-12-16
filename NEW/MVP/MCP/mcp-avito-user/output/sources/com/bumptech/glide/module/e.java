package com.bumptech.glide.module;

import androidx.camera.view.k;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes5.dex */
public final class e {
    public static c a(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof c) {
                    return (c) objNewInstance;
                }
                throw new RuntimeException(k.a(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e12) {
                b(cls, e12);
                throw null;
            } catch (InstantiationException e13) {
                b(cls, e13);
                throw null;
            } catch (NoSuchMethodException e14) {
                b(cls, e14);
                throw null;
            } catch (InvocationTargetException e15) {
                b(cls, e15);
                throw null;
            }
        } catch (ClassNotFoundException e16) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e16);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
