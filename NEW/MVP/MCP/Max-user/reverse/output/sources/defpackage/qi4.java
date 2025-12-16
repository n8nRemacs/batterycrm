package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qi4 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public yc[] f = new yc[100];

    public final synchronized void a(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, xxg.f(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}
