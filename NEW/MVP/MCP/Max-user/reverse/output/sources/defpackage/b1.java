package defpackage;

/* loaded from: classes.dex */
public final class b1 {
    public static final b1 c;
    public static final b1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (x1.d) {
            d = null;
            c = null;
        } else {
            d = new b1(null, false);
            c = new b1(null, true);
        }
    }

    public b1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
