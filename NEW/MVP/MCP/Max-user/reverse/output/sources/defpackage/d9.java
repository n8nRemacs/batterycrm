package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d9 extends cl0 {
    public final ch0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final wg7 o;
    public final kwf p;
    public float q;
    public int r;
    public int s;
    public long t;
    public zv8 u;

    public d9(kfg kfgVar, int[] iArr, ch0 ch0Var, long j, long j2, long j3, wg7 wg7Var) {
        super(kfgVar, iArr);
        if (j3 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = ch0Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = wg7.j(wg7Var);
        this.p = kwf.a;
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
                tg7Var.a(new b9(j, jArr[i]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            zv8 zv8Var = (zv8) uni.c(list);
            long j = zv8Var.Y;
            if (j != -9223372036854775807L) {
                long j2 = zv8Var.Z;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.an5
    public final int b() {
        return this.r;
    }

    @Override // defpackage.cl0, defpackage.an5
    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.cl0, defpackage.an5
    public final int g(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((zv8) uni.c(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (zv8) uni.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jV = xxg.v(this.q, ((zv8) list.get(size - 1)).Y - j);
        long j3 = this.j;
        if (jV >= j3) {
            x(list);
            gf6 gf6Var = this.d[w(jElapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                zv8 zv8Var = (zv8) list.get(i3);
                gf6 gf6Var2 = zv8Var.d;
                if (xxg.v(this.q, zv8Var.Y - j) >= j3 && gf6Var2.Z < gf6Var.Z && (i = gf6Var2.B0) != -1 && i <= this.l && (i2 = gf6Var2.A0) != -1 && i2 <= this.k && i < gf6Var.B0) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.cl0, defpackage.an5
    public final void h() {
        this.u = null;
    }

    @Override // defpackage.an5
    public final int k() {
        return this.s;
    }

    @Override // defpackage.cl0, defpackage.an5
    public final void l(float f) {
        this.q = f;
    }

    @Override // defpackage.an5
    public final Object m() {
        return null;
    }

    @Override // defpackage.an5
    public final void t(long j, long j2, long j3, List list, bw8[] bw8VarArr) {
        long jX;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= bw8VarArr.length || !bw8VarArr[i].next()) {
            int length = bw8VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jX = x(list);
                    break;
                }
                bw8 bw8Var = bw8VarArr[i2];
                if (bw8Var.next()) {
                    jX = bw8Var.b() - bw8Var.a();
                    break;
                }
                i2++;
            }
        } else {
            bw8 bw8Var2 = bw8VarArr[this.r];
            jX = bw8Var2.b() - bw8Var2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = w(jElapsedRealtime);
            return;
        }
        int i4 = this.r;
        int iQ = list.isEmpty() ? -1 : q(((zv8) uni.c(list)).d);
        if (iQ != -1) {
            i3 = ((zv8) uni.c(list)).o;
            i4 = iQ;
        }
        int iW = w(jElapsedRealtime);
        if (!s(i4, jElapsedRealtime)) {
            gf6[] gf6VarArr = this.d;
            gf6 gf6Var = gf6VarArr[i4];
            gf6 gf6Var2 = gf6VarArr[iW];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j3 - jX : j3) * this.n), jMin);
            }
            int i5 = gf6Var2.Z;
            int i6 = gf6Var.Z;
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

    public final int w(long j) {
        long j2;
        dk4 dk4Var = (dk4) this.g;
        synchronized (dk4Var) {
            j2 = dk4Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((b9) this.o.get(i)).a < j4) {
                i++;
            }
            b9 b9Var = (b9) this.o.get(i - 1);
            b9 b9Var2 = (b9) this.o.get(i);
            long j5 = b9Var.a;
            long j6 = b9Var.b;
            j4 = j6 + ((long) (((j4 - j5) / (b9Var2.a - j5)) * (b9Var2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !s(i3, j)) {
                if (this.d[i3].Z <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
