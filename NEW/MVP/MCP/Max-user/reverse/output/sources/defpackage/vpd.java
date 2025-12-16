package defpackage;

/* loaded from: classes.dex */
public final class vpd {
    public static final vpd d = new vpd(0, false, false);
    public static final vpd e = new vpd(500, true, false);
    public static final vpd f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new vpd(100L, true, false);
        f = new vpd(0L, false, true);
    }

    public vpd(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            z5j.a("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
