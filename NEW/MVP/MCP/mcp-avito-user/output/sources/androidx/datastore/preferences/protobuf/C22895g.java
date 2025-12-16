package androidx.datastore.preferences.protobuf;

/* compiled from: Android.java */
/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22895g {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f45838a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f45839b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f45838a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f45839b = cls2 != null;
    }

    public static boolean a() {
        return (f45838a == null || f45839b) ? false : true;
    }
}
