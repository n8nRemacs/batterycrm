package defpackage;

/* loaded from: classes.dex */
public abstract class fv0 {
    public static final enb a;
    public static final ThreadLocal b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        a = zEquals ? q7g.a : null;
        b = new ThreadLocal();
    }
}
