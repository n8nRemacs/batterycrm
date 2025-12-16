package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ws {
    public final ls d;
    public m6f a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public ws(te8 te8Var) {
        this.d = new ls(this, te8Var);
    }

    public final void a(d58 d58Var, int i) {
        this.d.g(d58Var.j(i), 1.0f);
        this.d.g(d58Var.j(i), -1.0f);
    }

    public final void b(m6f m6fVar, m6f m6fVar2, m6f m6fVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(m6fVar, 1.0f);
            this.d.g(m6fVar2, -1.0f);
            this.d.g(m6fVar3, -1.0f);
        } else {
            this.d.g(m6fVar, -1.0f);
            this.d.g(m6fVar2, 1.0f);
            this.d.g(m6fVar3, 1.0f);
        }
    }

    public final void c(m6f m6fVar, m6f m6fVar2, m6f m6fVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.g(m6fVar, 1.0f);
            this.d.g(m6fVar2, -1.0f);
            this.d.g(m6fVar3, 1.0f);
        } else {
            this.d.g(m6fVar, -1.0f);
            this.d.g(m6fVar2, 1.0f);
            this.d.g(m6fVar3, -1.0f);
        }
    }

    public m6f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final m6f f(boolean[] zArr, m6f m6fVar) {
        int i;
        int iD = this.d.d();
        m6f m6fVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = this.d.f(i2);
            if (f2 < 0.0f) {
                m6f m6fVarE = this.d.e(i2);
                if ((zArr == null || !zArr[m6fVarE.b]) && m6fVarE != m6fVar && (((i = m6fVarE.v0) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    m6fVar2 = m6fVarE;
                }
            }
        }
        return m6fVar2;
    }

    public final void g(m6f m6fVar) {
        m6f m6fVar2 = this.a;
        if (m6fVar2 != null) {
            this.d.g(m6fVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = this.d.h(m6fVar, true) * (-1.0f);
        this.a = m6fVar;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        ls lsVar = this.d;
        int i = lsVar.h;
        for (int i2 = 0; i != -1 && i2 < lsVar.a; i2++) {
            float[] fArr = lsVar.g;
            fArr[i] = fArr[i] / fH;
            i = lsVar.f[i];
        }
    }

    public final void h(d58 d58Var, m6f m6fVar, boolean z) {
        if (m6fVar.X) {
            float fC = this.d.c(m6fVar);
            this.b = (m6fVar.o * fC) + this.b;
            this.d.h(m6fVar, z);
            if (z) {
                m6fVar.c(this);
            }
            if (this.d.d() == 0) {
                this.e = true;
                d58Var.a = true;
            }
        }
    }

    public void i(d58 d58Var, ws wsVar, boolean z) {
        ls lsVar = this.d;
        lsVar.getClass();
        float fC = lsVar.c(wsVar.a);
        lsVar.h(wsVar.a, z);
        ls lsVar2 = wsVar.d;
        int iD = lsVar2.d();
        for (int i = 0; i < iD; i++) {
            m6f m6fVarE = lsVar2.e(i);
            lsVar.a(m6fVarE, lsVar2.c(m6fVarE) * fC, z);
        }
        this.b = (wsVar.b * fC) + this.b;
        if (z) {
            wsVar.a.c(this);
        }
        if (this.a == null || this.d.d() != 0) {
            return;
        }
        this.e = true;
        d58Var.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            m6f r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            m6f r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.az1.i(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.az1.m(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            ls r5 = r10.d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            ls r6 = r10.d
            m6f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            ls r7 = r10.d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.az1.i(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.az1.i(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.az1.i(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = defpackage.az1.i(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.az1.i(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.toString():java.lang.String");
    }
}
