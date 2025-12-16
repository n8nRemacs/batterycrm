package com.google.protobuf;

/* compiled from: Android.java */
/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37675g {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f362875a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f362876b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f362875a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f362876b = cls2 != null;
    }

    public static boolean a() {
        return (f362875a == null || f362876b) ? false : true;
    }
}
