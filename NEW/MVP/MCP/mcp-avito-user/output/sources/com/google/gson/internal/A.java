package com.google.gson.internal;

/* compiled from: Primitives.java */
/* loaded from: classes6.dex */
public final class A {
    public static boolean a(Class cls) {
        return cls != null && cls.isPrimitive();
    }

    public static <T> Class<T> b(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
