package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class i93 {
    public final je0 a;
    public final sfg b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public i93(int i, je0 je0Var, sfg sfgVar) {
        int i2 = je0Var.d;
        this.a = je0Var;
        int iA = je0Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        hsi.b(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = je0Var.b * 1000000;
        long j2 = je0Var.c;
        String str = zxg.a;
        this.e = zxg.e0(i2, j, j2, RoundingMode.DOWN);
        this.b = sfgVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final m9e a(int i) {
        return new m9e(((this.e * 1) / this.f) * this.n[i], this.m[i]);
    }

    public final g9e b(long j) {
        if (this.k == 0) {
            m9e m9eVar = new m9e(0L, this.l);
            return new g9e(m9eVar, m9eVar);
        }
        int i = (int) (j / ((this.e * 1) / this.f));
        int iD = zxg.d(this.n, i, true, true);
        if (this.n[iD] == i) {
            m9e m9eVarA = a(iD);
            return new g9e(m9eVarA, m9eVarA);
        }
        m9e m9eVarA2 = a(iD);
        int i2 = iD + 1;
        return i2 < this.m.length ? new g9e(m9eVarA2, a(i2)) : new g9e(m9eVarA2, m9eVarA2);
    }
}
