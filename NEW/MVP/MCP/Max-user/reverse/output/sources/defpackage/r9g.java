package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class r9g implements lw0 {
    public static final j9g a = new j9g();

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, l9g l9gVar, p9g p9gVar, int i2, boolean z) {
        int i3 = f(i, l9gVar, false).c;
        if (m(i3, p9gVar, 0L).z0 != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, p9gVar, 0L).y0;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r9g) {
                r9g r9gVar = (r9g) obj;
                if (r9gVar.o() == o() && r9gVar.h() == h()) {
                    p9g p9gVar = new p9g();
                    l9g l9gVar = new l9g();
                    p9g p9gVar2 = new p9g();
                    l9g l9gVar2 = new l9g();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            for (int i2 = 0; i2 < h(); i2++) {
                                if (f(i2, l9gVar, true).equals(r9gVar.f(i2, l9gVar2, true))) {
                                }
                            }
                        } else {
                            if (!m(i, p9gVar, 0L).equals(r9gVar.m(i, p9gVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract l9g f(int i, l9g l9gVar, boolean z);

    public l9g g(Object obj, l9g l9gVar) {
        return f(b(obj), l9gVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        p9g p9gVar = new p9g();
        l9g l9gVar = new l9g();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, p9gVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, l9gVar, true).hashCode();
        }
        return iH;
    }

    public final Pair i(p9g p9gVar, l9g l9gVar, int i, long j) {
        Pair pairJ = j(p9gVar, l9gVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(p9g p9gVar, l9g l9gVar, int i, long j, long j2) {
        fsi.c(i, o());
        m(i, p9gVar, j2);
        if (j == -9223372036854775807L) {
            j = p9gVar.w0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = p9gVar.y0;
        f(i2, l9gVar, false);
        while (i2 < p9gVar.z0 && l9gVar.o != j) {
            int i3 = i2 + 1;
            if (f(i3, l9gVar, false).o > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, l9gVar, true);
        long jMin = j - l9gVar.o;
        long j3 = l9gVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = l9gVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract p9g m(int i, p9g p9gVar, long j);

    public final void n(int i, p9g p9gVar) {
        m(i, p9gVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
