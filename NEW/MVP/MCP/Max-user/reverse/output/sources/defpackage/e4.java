package defpackage;

/* loaded from: classes.dex */
public final class e4 {
    public static final e4 c;
    public static final e4 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (k4.d) {
            d = null;
            c = null;
        } else {
            d = new e4(null, false);
            c = new e4(null, true);
        }
    }

    public e4(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
