package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class dl0 implements bn5 {
    public final lfg a;
    public final int b;
    public final int[] c;
    public final hf6[] d;
    public final long[] e;
    public int f;

    public dl0(lfg lfgVar, int[] iArr) {
        int i = 0;
        hsi.g(iArr.length > 0);
        lfgVar.getClass();
        this.a = lfgVar;
        int length = iArr.length;
        this.b = length;
        this.d = new hf6[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = lfgVar.d[iArr[i2]];
        }
        Arrays.sort(this.d, new o00(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = lfgVar.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.bn5
    public final lfg a() {
        return this.a;
    }

    @Override // defpackage.bn5
    public final void c(boolean z) {
    }

    @Override // defpackage.bn5
    public final hf6 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.bn5
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dl0 dl0Var = (dl0) obj;
            if (this.a.equals(dl0Var.a) && Arrays.equals(this.c, dl0Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bn5
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.bn5
    public int g(long j, List list) {
        return list.size();
    }

    @Override // defpackage.bn5
    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.bn5
    public final int i() {
        return this.c[b()];
    }

    @Override // defpackage.bn5
    public final hf6 j() {
        return this.d[b()];
    }

    @Override // defpackage.bn5
    public void l(float f) {
    }

    @Override // defpackage.bn5
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.bn5
    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bn5
    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.bn5
    public final int s(hf6 hf6Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == hf6Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.bn5
    public final boolean u(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zQ = q(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zQ) {
            zQ = (i2 == i || q(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zQ) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        String str = zxg.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }
}
