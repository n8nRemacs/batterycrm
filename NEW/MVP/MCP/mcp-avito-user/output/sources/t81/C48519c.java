package t81;

import org.objenesis.ObjenesisException;

/* compiled from: PlatformDescription.java */
/* renamed from: t81.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C48519c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f439160a = System.getProperty("java.specification.version");

    /* renamed from: b, reason: collision with root package name */
    public static final String f439161b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f439162c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f439163d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f439164e;

    static {
        String property;
        System.getProperty("java.runtime.version");
        System.getProperty("java.vm.info");
        System.getProperty("java.vm.version");
        System.getProperty("java.vm.vendor");
        f439161b = System.getProperty("java.vm.name");
        f439162c = a();
        boolean z12 = false;
        if (a() != 0 && (property = System.getProperty("java.boot.class.path")) != null && property.toLowerCase().contains("core-oj.jar")) {
            z12 = true;
        }
        f439163d = z12;
        f439164e = System.getProperty("com.google.appengine.runtime.version");
    }

    public static int a() throws ClassNotFoundException {
        if (!f439161b.startsWith("Dalvik")) {
            return 0;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            try {
                try {
                    try {
                        return ((Integer) cls.getField("SDK_INT").get(null)).intValue();
                    } catch (IllegalAccessException e12) {
                        throw new RuntimeException(e12);
                    }
                } catch (NoSuchFieldException unused) {
                    try {
                        return Integer.parseInt((String) cls.getField("SDK").get(null));
                    } catch (IllegalAccessException e13) {
                        throw new RuntimeException(e13);
                    }
                }
            } catch (NoSuchFieldException e14) {
                throw new ObjenesisException((Throwable) e14);
            }
        } catch (ClassNotFoundException e15) {
            throw new ObjenesisException((Throwable) e15);
        }
    }
}
