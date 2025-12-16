package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class cl0 implements an5 {
    public final kfg a;
    public final int b;
    public final int[] c;
    public final gf6[] d;
    public final long[] e;
    public int f;

    public cl0(kfg kfgVar, int[] iArr) {
        int i = 0;
        fsi.d(iArr.length > 0);
        kfgVar.getClass();
        this.a = kfgVar;
        int length = iArr.length;
        this.b = length;
        this.d = new gf6[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = kfgVar.c[iArr[i2]];
        }
        Arrays.sort(this.d, new o00(1));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = kfgVar.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.an5
    public final kfg a() {
        return this.a;
    }

    @Override // defpackage.an5
    public final gf6 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.an5
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cl0 cl0Var = (cl0) obj;
            if (this.a == cl0Var.a && Arrays.equals(this.c, cl0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.an5
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.an5
    public int g(long j, List list) {
        return list.size();
    }

    @Override // defpackage.an5
    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.an5
    public final int i() {
        return this.c[b()];
    }

    @Override // defpackage.an5
    public final gf6 j() {
        return this.d[b()];
    }

    @Override // defpackage.an5
    public void l(float f) {
    }

    @Override // defpackage.an5
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.an5
    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.an5
    public final int q(gf6 gf6Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == gf6Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.an5
    public final boolean r(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zS = s(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zS) {
            zS = (i2 == i || s(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zS) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = xxg.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.an5
    public final boolean s(int i, long j) {
        return this.e[i] > j;
    }
}
