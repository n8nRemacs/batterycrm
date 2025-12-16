package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class l0 extends s9g {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final hze f;

    public l0(hze hzeVar) {
        this.f = hzeVar;
        this.e = hzeVar.b.length;
    }

    @Override // defpackage.s9g
    public final int a(boolean z) {
        if (this.e != 0) {
            int iW = 0;
            if (z) {
                int[] iArr = this.f.b;
                iW = iArr.length > 0 ? iArr[0] : -1;
            }
            while (y(iW).p()) {
                iW = w(iW, z);
                if (iW == -1) {
                }
            }
            return y(iW).a(z) + v(iW);
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // defpackage.s9g
    public final int c(boolean z) {
        int iX;
        int i = this.e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f.b;
                iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iX = i - 1;
            }
            while (y(iX).p()) {
                iX = x(iX, z);
                if (iX == -1) {
                }
            }
            return y(iX).c(z) + v(iX);
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final int e(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iE = y(iS).e(i - iV, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z);
        }
        if (iW != -1) {
            return y(iW).a(z) + v(iW);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        int iR = r(i);
        int iV = v(iR);
        y(iR).f(i - u(iR), m9gVar, z);
        m9gVar.c += iV;
        if (z) {
            Object objT = t(iR);
            Object obj = m9gVar.b;
            obj.getClass();
            m9gVar.b = Pair.create(objT, obj);
        }
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final m9g g(Object obj, m9g m9gVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, m9gVar);
        m9gVar.c += iV;
        m9gVar.b = obj;
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int k(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iK = y(iS).k(i - iV, i2 == 2 ? 0 : i2, z);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z);
        }
        if (iX != -1) {
            return y(iX).c(z) + v(iX);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        int iR = r(i);
        return Pair.create(t(iR), y(iR).l(i - u(iR)));
    }

    @Override // defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        int iS = s(i);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i - iV, q9gVar, j);
        Object objT = t(iS);
        if (!q9g.q.equals(q9gVar.a)) {
            objT = Pair.create(objT, q9gVar.a);
        }
        q9gVar.a = objT;
        q9gVar.n += iU;
        q9gVar.o += iU;
        return q9gVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        hze hzeVar = this.f;
        int i2 = hzeVar.c[i] + 1;
        int[] iArr = hzeVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int x(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        hze hzeVar = this.f;
        int i2 = hzeVar.c[i] - 1;
        if (i2 >= 0) {
            return hzeVar.b[i2];
        }
        return -1;
    }

    public abstract s9g y(int i);
}
