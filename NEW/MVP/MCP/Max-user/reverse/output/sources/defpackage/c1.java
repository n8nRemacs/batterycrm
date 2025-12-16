package defpackage;

/* loaded from: classes.dex */
public final class c1 {
    public static final c1 c;
    public static final c1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (y1.d) {
            d = null;
            c = null;
        } else {
            d = new c1(null, false);
            c = new c1(null, true);
        }
    }

    public c1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
