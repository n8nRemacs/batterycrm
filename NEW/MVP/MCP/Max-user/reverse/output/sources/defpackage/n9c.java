package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n9c extends ws {
    public m6f[] f;
    public m6f[] g;
    public int h;
    public xpb i;

    @Override // defpackage.ws
    public final m6f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            m6f[] m6fVarArr = this.f;
            m6f m6fVar = m6fVarArr[i2];
            if (!zArr[m6fVar.b]) {
                xpb xpbVar = this.i;
                xpbVar.b = m6fVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((m6f) xpbVar.b).Z[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    m6f m6fVar2 = m6fVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = m6fVar2.Z[i3];
                            float f3 = ((m6f) xpbVar.b).Z[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.ws
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.ws
    public final void i(d58 d58Var, ws wsVar, boolean z) {
        m6f m6fVar = wsVar.a;
        if (m6fVar == null) {
            return;
        }
        float[] fArr = m6fVar.Z;
        ls lsVar = wsVar.d;
        int iD = lsVar.d();
        for (int i = 0; i < iD; i++) {
            m6f m6fVarE = lsVar.e(i);
            float f = lsVar.f(i);
            xpb xpbVar = this.i;
            xpbVar.b = m6fVarE;
            if (m6fVarE.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((m6f) xpbVar.b).Z;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((m6f) xpbVar.b).Z[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((n9c) xpbVar.c).k((m6f) xpbVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((m6f) xpbVar.b).Z[i3] = f4;
                    } else {
                        ((m6f) xpbVar.b).Z[i3] = 0.0f;
                    }
                }
                j(m6fVarE);
            }
            this.b = (wsVar.b * f) + this.b;
        }
        k(m6fVar);
    }

    public final void j(m6f m6fVar) {
        int i;
        int i2 = this.h + 1;
        m6f[] m6fVarArr = this.f;
        if (i2 > m6fVarArr.length) {
            m6f[] m6fVarArr2 = (m6f[]) Arrays.copyOf(m6fVarArr, m6fVarArr.length * 2);
            this.f = m6fVarArr2;
            this.g = (m6f[]) Arrays.copyOf(m6fVarArr2, m6fVarArr2.length * 2);
        }
        m6f[] m6fVarArr3 = this.f;
        int i3 = this.h;
        m6fVarArr3[i3] = m6fVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && m6fVarArr3[i3].b > m6fVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new vs6(18));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        m6fVar.a = true;
        m6fVar.a(this);
    }

    public final void k(m6f m6fVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == m6fVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        m6fVar.a = false;
                        return;
                    } else {
                        m6f[] m6fVarArr = this.f;
                        int i3 = i + 1;
                        m6fVarArr[i] = m6fVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ws
    public final String toString() {
        xpb xpbVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            xpbVar.b = this.f[i];
            str = str + xpbVar + " ";
        }
        return str;
    }
}
