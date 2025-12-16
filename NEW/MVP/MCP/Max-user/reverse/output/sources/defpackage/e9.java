package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e9 extends dl0 {
    public final dh0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final wg7 o;
    public final mwf p;
    public float q;
    public int r;
    public int s;
    public long t;
    public aw8 u;

    public e9(lfg lfgVar, int[] iArr, dh0 dh0Var, long j, long j2, long j3, List list) {
        super(lfgVar, iArr);
        if (j3 < j) {
            a8i.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = dh0Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = wg7.j(list);
        this.p = mwf.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            tg7 tg7Var = (tg7) arrayList.get(i);
            if (tg7Var != null) {
                tg7Var.a(new c9(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            aw8 aw8Var = (aw8) uni.c(list);
            long j = aw8Var.Y;
            if (j != -9223372036854775807L) {
                long j2 = aw8Var.Z;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.bn5
    public int b() {
        return this.r;
    }

    @Override // defpackage.dl0, defpackage.bn5
    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.dl0, defpackage.bn5
    public int g(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!y(jElapsedRealtime, list)) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (aw8) uni.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jG = zxg.G(this.q, ((aw8) list.get(size - 1)).Y - j);
        long j2 = this.j;
        if (jG >= j2) {
            hf6 hf6Var = this.d[w(jElapsedRealtime, x(list))];
            for (int i3 = 0; i3 < size; i3++) {
                aw8 aw8Var = (aw8) list.get(i3);
                hf6 hf6Var2 = aw8Var.d;
                if (zxg.G(this.q, aw8Var.Y - j) >= j2 && hf6Var2.j < hf6Var.j && (i = hf6Var2.v) != -1 && i <= this.l && (i2 = hf6Var2.u) != -1 && i2 <= this.k && i < hf6Var.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.dl0, defpackage.bn5
    public final void h() {
        this.u = null;
    }

    @Override // defpackage.bn5
    public int k() {
        return this.s;
    }

    @Override // defpackage.dl0, defpackage.bn5
    public void l(float f) {
        this.q = f;
    }

    @Override // defpackage.bn5
    public final Object m() {
        return null;
    }

    @Override // defpackage.bn5
    public void r(long j, long j2, long j3, List list, cw8[] cw8VarArr) {
        long jX;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= cw8VarArr.length || !cw8VarArr[i].next()) {
            int length = cw8VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jX = x(list);
                    break;
                }
                cw8 cw8Var = cw8VarArr[i2];
                if (cw8Var.next()) {
                    jX = cw8Var.b() - cw8Var.a();
                    break;
                }
                i2++;
            }
        } else {
            cw8 cw8Var2 = cw8VarArr[this.r];
            jX = cw8Var2.b() - cw8Var2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = w(jElapsedRealtime, jX);
            return;
        }
        int i4 = this.r;
        int iS = list.isEmpty() ? -1 : s(((aw8) uni.c(list)).d);
        if (iS != -1) {
            i3 = ((aw8) uni.c(list)).o;
            i4 = iS;
        }
        int iW = w(jElapsedRealtime, jX);
        if (iW != i4 && !q(i4, jElapsedRealtime)) {
            hf6[] hf6VarArr = this.d;
            hf6 hf6Var = hf6VarArr[i4];
            hf6 hf6Var2 = hf6VarArr[iW];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j3 - jX : j3) * this.n), jMin);
            }
            int i5 = hf6Var2.j;
            int i6 = hf6Var.j;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.i)) {
                iW = i4;
            }
        }
        if (iW != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = iW;
    }

    public final int w(long j, long j2) {
        long jMax;
        dh0 dh0Var = this.g;
        long jF = (long) (dh0Var.f() * this.m);
        long jB = dh0Var.b();
        if (jB == -9223372036854775807L || j2 == -9223372036854775807L) {
            jMax = (long) (jF / this.q);
        } else {
            float f = j2;
            jMax = (long) ((jF * Math.max((f / this.q) - jB, 0.0f)) / f);
        }
        wg7 wg7Var = this.o;
        if (!wg7Var.isEmpty()) {
            int i = 1;
            while (i < wg7Var.size() - 1 && ((c9) wg7Var.get(i)).a < jMax) {
                i++;
            }
            c9 c9Var = (c9) wg7Var.get(i - 1);
            c9 c9Var2 = (c9) wg7Var.get(i);
            long j3 = c9Var.a;
            long j4 = c9Var.b;
            jMax = ((long) (((jMax - j3) / (c9Var2.a - j3)) * (c9Var2.b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !q(i3, j)) {
                if (this.d[i3].j <= jMax) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public final boolean y(long j, List list) {
        long j2 = this.t;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((aw8) uni.c(list)).equals(this.u)) ? false : true;
    }
}
