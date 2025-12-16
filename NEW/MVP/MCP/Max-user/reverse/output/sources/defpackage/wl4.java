package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class wl4 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public wl4(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new qyg(1, false);
                break;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new qyg(0, false);
                break;
        }
    }

    public long a(hp5 hp5Var, int i) {
        hp5Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }

    public long b(ip5 ip5Var, int i) {
        ip5Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
