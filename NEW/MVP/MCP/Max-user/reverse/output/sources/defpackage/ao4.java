package defpackage;

/* loaded from: classes.dex */
public final class ao4 {
    public final qi4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public int h;
    public boolean i;

    public ao4(qi4 qi4Var, int i, int i2, int i3, int i4) {
        a("bufferForPlaybackMs", i3, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
        a("minBufferMs", i, i3, "bufferForPlaybackMs");
        a("minBufferMs", i, i4, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i2, i, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.a = qi4Var;
        this.b = xxg.B(i);
        this.c = xxg.B(i2);
        this.d = xxg.B(i3);
        this.e = xxg.B(i4);
        this.f = -1;
        this.h = 13107200;
        this.g = xxg.B(0);
    }

    public static void a(String str, int i, int i2, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        fsi.a(sb.toString(), z);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.h = i;
        this.i = false;
        if (z) {
            qi4 qi4Var = this.a;
            synchronized (qi4Var) {
                if (qi4Var.a) {
                    qi4Var.a(0);
                }
            }
        }
    }
}
