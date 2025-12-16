package defpackage;

/* loaded from: classes.dex */
public abstract class ah8 {
    public static final boolean a;

    static {
        String property = System.getProperty("tech.kwik.agent15.debug");
        if (property == null || !property.equals("true")) {
            return;
        }
        a = true;
    }

    public static void a(String str) {
        if (a) {
            System.out.println(str);
        }
    }
}
