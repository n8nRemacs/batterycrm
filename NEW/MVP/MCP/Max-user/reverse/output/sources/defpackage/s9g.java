package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class s9g {
    public static final k9g a = new k9g();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = zxg.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

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

    public final int d(int i, m9g m9gVar, q9g q9gVar, int i2, boolean z) {
        int i3 = f(i, m9gVar, false).c;
        if (m(i3, q9gVar, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, q9gVar, 0L).n;
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

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof s9g) {
                s9g s9gVar = (s9g) obj;
                if (s9gVar.o() == o() && s9gVar.h() == h()) {
                    q9g q9gVar = new q9g();
                    m9g m9gVar = new m9g();
                    q9g q9gVar2 = new q9g();
                    m9g m9gVar2 = new m9g();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == s9gVar.a(true) && (iC = c(true)) == s9gVar.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == s9gVar.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, m9gVar, true).equals(s9gVar.f(i2, m9gVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, q9gVar, 0L).equals(s9gVar.m(i, q9gVar2, 0L))) {
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

    public abstract m9g f(int i, m9g m9gVar, boolean z);

    public m9g g(Object obj, m9g m9gVar) {
        return f(b(obj), m9gVar, true);
    }

    public abstract int h();

    public int hashCode() {
        q9g q9gVar = new q9g();
        m9g m9gVar = new m9g();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, q9gVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, m9gVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(q9g q9gVar, m9g m9gVar, int i, long j) {
        Pair pairJ = j(q9gVar, m9gVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(q9g q9gVar, m9g m9gVar, int i, long j, long j2) {
        hsi.c(i, o());
        m(i, q9gVar, j2);
        if (j == -9223372036854775807L) {
            j = q9gVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = q9gVar.n;
        f(i2, m9gVar, false);
        while (i2 < q9gVar.o && m9gVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, m9gVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, m9gVar, true);
        long jMin = j - m9gVar.e;
        long j3 = m9gVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = m9gVar.b;
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

    public abstract q9g m(int i, q9g q9gVar, long j);

    public final void n(int i, q9g q9gVar) {
        m(i, q9gVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
