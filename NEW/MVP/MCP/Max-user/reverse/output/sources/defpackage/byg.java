package defpackage;

import java.nio.ByteOrder;

/* loaded from: classes.dex */
public enum byg {
    ;

    public static final ByteOrder a = ByteOrder.nativeOrder();
    public static final boolean b;

    static {
        String property = System.getProperty("os.arch");
        b = property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le");
    }

    public static byg valueOf(String str) {
        u45.r(Enum.valueOf(byg.class, str));
        throw null;
    }
}
