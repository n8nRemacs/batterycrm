package defpackage;

/* loaded from: classes.dex */
public final class od {
    public static final od b = new od();
    public static final int c;
    public static final int d;
    public final ex4 a = new ex4(3);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
