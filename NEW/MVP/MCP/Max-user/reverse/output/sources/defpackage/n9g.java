package defpackage;

/* loaded from: classes.dex */
public final class n9g extends s9g {
    public final wg7 e;
    public final wg7 f;
    public final int[] g;
    public final int[] h;

    public n9g(zjd zjdVar, zjd zjdVar2, int[] iArr) {
        hsi.b(zjdVar.d == iArr.length);
        this.e = zjdVar;
        this.f = zjdVar2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.s9g
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s9g
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        wg7 wg7Var = this.e;
        if (!z) {
            return wg7Var.size() - 1;
        }
        return this.g[wg7Var.size() - 1];
    }

    @Override // defpackage.s9g
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        m9g m9gVar2 = (m9g) this.f.get(i);
        m9gVar.i(m9gVar2.a, m9gVar2.b, m9gVar2.c, m9gVar2.d, m9gVar2.e, m9gVar2.g, m9gVar2.f);
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.s9g
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s9g
    public final q9g m(int i, q9g q9gVar, long j) {
        q9g q9gVar2 = (q9g) this.e.get(i);
        q9gVar.b(q9gVar2.a, q9gVar2.c, q9gVar2.d, q9gVar2.e, q9gVar2.f, q9gVar2.g, q9gVar2.h, q9gVar2.i, q9gVar2.j, q9gVar2.l, q9gVar2.m, q9gVar2.n, q9gVar2.o, q9gVar2.p);
        q9gVar.k = q9gVar2.k;
        return q9gVar;
    }

    @Override // defpackage.s9g
    public final int o() {
        return this.e.size();
    }
}
