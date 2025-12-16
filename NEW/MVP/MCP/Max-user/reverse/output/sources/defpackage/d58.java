package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d58 {
    public static boolean p = false;
    public static int q = 1000;
    public final n9c c;
    public ws[] f;
    public final te8 l;
    public ws o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public m6f[] m = new m6f[q];
    public int n = 0;

    public d58() {
        this.f = null;
        this.f = new ws[32];
        s();
        te8 te8Var = new te8();
        te8Var.a = new d6c();
        te8Var.b = new d6c();
        te8Var.c = new m6f[32];
        this.l = te8Var;
        n9c n9cVar = new n9c(te8Var);
        n9cVar.f = new m6f[128];
        n9cVar.g = new m6f[128];
        n9cVar.h = 0;
        n9cVar.i = new xpb(n9cVar);
        this.c = n9cVar;
        this.o = new ws(te8Var);
    }

    public static int n(Object obj) {
        m6f m6fVar = ((ft3) obj).i;
        if (m6fVar != null) {
            return (int) (m6fVar.o + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final m6f a(int i) {
        d6c d6cVar = (d6c) this.l.b;
        int i2 = d6cVar.b;
        m6f m6fVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = d6cVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            d6cVar.b = i3;
            m6fVar = r4;
        }
        m6f m6fVar2 = m6fVar;
        if (m6fVar2 == null) {
            m6fVar2 = new m6f(i);
            m6fVar2.v0 = i;
        } else {
            m6fVar2.d();
            m6fVar2.v0 = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (m6f[]) Arrays.copyOf(this.m, i6);
        }
        m6f[] m6fVarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        m6fVarArr[i7] = m6fVar2;
        return m6fVar2;
    }

    public final void b(m6f m6fVar, m6f m6fVar2, int i, float f, m6f m6fVar3, m6f m6fVar4, int i2, int i3) {
        ws wsVarL = l();
        if (m6fVar2 == m6fVar3) {
            wsVarL.d.g(m6fVar, 1.0f);
            wsVarL.d.g(m6fVar4, 1.0f);
            wsVarL.d.g(m6fVar2, -2.0f);
        } else if (f == 0.5f) {
            wsVarL.d.g(m6fVar, 1.0f);
            wsVarL.d.g(m6fVar2, -1.0f);
            wsVarL.d.g(m6fVar3, -1.0f);
            wsVarL.d.g(m6fVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                wsVarL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            wsVarL.d.g(m6fVar, -1.0f);
            wsVarL.d.g(m6fVar2, 1.0f);
            wsVarL.b = i;
        } else if (f >= 1.0f) {
            wsVarL.d.g(m6fVar4, -1.0f);
            wsVarL.d.g(m6fVar3, 1.0f);
            wsVarL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            wsVarL.d.g(m6fVar, f2 * 1.0f);
            wsVarL.d.g(m6fVar2, f2 * (-1.0f));
            wsVarL.d.g(m6fVar3, (-1.0f) * f);
            wsVarL.d.g(m6fVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                wsVarL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            wsVarL.a(this, i3);
        }
        c(wsVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ws r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d58.c(ws):void");
    }

    public final void d(m6f m6fVar, int i) {
        int i2 = m6fVar.c;
        if (i2 == -1) {
            m6fVar.e(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                m6f m6fVar2 = ((m6f[]) this.l.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            ws wsVarL = l();
            wsVarL.a = m6fVar;
            float f = i;
            m6fVar.o = f;
            wsVarL.b = f;
            wsVarL.e = true;
            c(wsVarL);
            return;
        }
        ws wsVar = this.f[i2];
        if (wsVar.e) {
            wsVar.b = i;
            return;
        }
        if (wsVar.d.d() == 0) {
            wsVar.e = true;
            wsVar.b = i;
            return;
        }
        ws wsVarL2 = l();
        if (i < 0) {
            wsVarL2.b = i * (-1);
            wsVarL2.d.g(m6fVar, 1.0f);
        } else {
            wsVarL2.b = i;
            wsVarL2.d.g(m6fVar, -1.0f);
        }
        c(wsVarL2);
    }

    public final void e(m6f m6fVar, m6f m6fVar2, int i, int i2) {
        if (i2 == 8 && m6fVar2.X && m6fVar.c == -1) {
            m6fVar.e(this, m6fVar2.o + i);
            return;
        }
        ws wsVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            wsVarL.b = i;
        }
        if (z) {
            wsVarL.d.g(m6fVar, 1.0f);
            wsVarL.d.g(m6fVar2, -1.0f);
        } else {
            wsVarL.d.g(m6fVar, -1.0f);
            wsVarL.d.g(m6fVar2, 1.0f);
        }
        if (i2 != 8) {
            wsVarL.a(this, i2);
        }
        c(wsVarL);
    }

    public final void f(m6f m6fVar, m6f m6fVar2, int i, int i2) {
        ws wsVarL = l();
        m6f m6fVarM = m();
        m6fVarM.d = 0;
        wsVarL.b(m6fVar, m6fVar2, m6fVarM, i);
        if (i2 != 8) {
            wsVarL.d.g(j(i2), (int) (wsVarL.d.c(m6fVarM) * (-1.0f)));
        }
        c(wsVarL);
    }

    public final void g(m6f m6fVar, m6f m6fVar2, int i, int i2) {
        ws wsVarL = l();
        m6f m6fVarM = m();
        m6fVarM.d = 0;
        wsVarL.c(m6fVar, m6fVar2, m6fVarM, i);
        if (i2 != 8) {
            wsVarL.d.g(j(i2), (int) (wsVarL.d.c(m6fVarM) * (-1.0f)));
        }
        c(wsVarL);
    }

    public final void h(ws wsVar) {
        int i;
        if (wsVar.e) {
            wsVar.a.e(this, wsVar.b);
        } else {
            ws[] wsVarArr = this.f;
            int i2 = this.j;
            wsVarArr[i2] = wsVar;
            m6f m6fVar = wsVar.a;
            m6fVar.c = i2;
            this.j = i2 + 1;
            m6fVar.g(this, wsVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                ws wsVar2 = this.f[i3];
                if (wsVar2 != null && wsVar2.e) {
                    wsVar2.a.e(this, wsVar2.b);
                    ((d6c) this.l.a).c(wsVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        ws[] wsVarArr2 = this.f;
                        int i6 = i4 - 1;
                        ws wsVar3 = wsVarArr2[i4];
                        wsVarArr2[i6] = wsVar3;
                        m6f m6fVar2 = wsVar3.a;
                        if (m6fVar2.c == i4) {
                            m6fVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            ws wsVar = this.f[i];
            wsVar.a.o = wsVar.b;
        }
    }

    public final m6f j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        m6f m6fVarA = a(4);
        float[] fArr = m6fVarA.Z;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        m6fVarA.b = i2;
        m6fVarA.d = i;
        ((m6f[]) this.l.c)[i2] = m6fVarA;
        n9c n9cVar = this.c;
        n9cVar.i.b = m6fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[m6fVarA.d] = 1.0f;
        n9cVar.j(m6fVarA);
        return m6fVarA;
    }

    public final m6f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof ft3)) {
            return null;
        }
        ft3 ft3Var = (ft3) obj;
        m6f m6fVar = ft3Var.i;
        if (m6fVar == null) {
            ft3Var.k();
            m6fVar = ft3Var.i;
        }
        int i = m6fVar.b;
        te8 te8Var = this.l;
        if (i != -1 && i <= this.b && ((m6f[]) te8Var.c)[i] != null) {
            return m6fVar;
        }
        if (i != -1) {
            m6fVar.d();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        m6fVar.b = i2;
        m6fVar.v0 = 1;
        ((m6f[]) te8Var.c)[i2] = m6fVar;
        return m6fVar;
    }

    public final ws l() {
        Object obj;
        te8 te8Var = this.l;
        d6c d6cVar = (d6c) te8Var.a;
        int i = d6cVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = d6cVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            d6cVar.b = i2;
        } else {
            obj = null;
        }
        ws wsVar = (ws) obj;
        if (wsVar == null) {
            return new ws(te8Var);
        }
        wsVar.a = null;
        wsVar.d.b();
        wsVar.b = 0.0f;
        wsVar.e = false;
        return wsVar;
    }

    public final m6f m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        m6f m6fVarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        m6fVarA.b = i;
        ((m6f[]) this.l.c)[i] = m6fVarA;
        return m6fVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (ws[]) Arrays.copyOf(this.f, i);
        te8 te8Var = this.l;
        te8Var.c = (m6f[]) Arrays.copyOf((m6f[]) te8Var.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        n9c n9cVar = this.c;
        if (n9cVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(n9cVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(n9cVar);
                return;
            }
        }
        i();
    }

    public final void q(n9c n9cVar) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            ws wsVar = this.f[i];
            int i2 = 1;
            if (wsVar.a.v0 != 1) {
                float f = 0.0f;
                if (wsVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            ws wsVar2 = this.f[i6];
                            if (wsVar2.a.v0 != i2 && !wsVar2.e && wsVar2.b < f) {
                                int iD = wsVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    m6f m6fVarE = wsVar2.d.e(i8);
                                    float fC = wsVar2.d.c(m6fVarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = m6fVarE.Y[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = m6fVarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            ws wsVar3 = this.f[i4];
                            wsVar3.a.c = -1;
                            wsVar3.g(((m6f[]) this.l.c)[i5]);
                            m6f m6fVar = wsVar3.a;
                            m6fVar.c = i4;
                            m6fVar.g(this, wsVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(n9cVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.ws r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d58.r(ws):void");
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            ws wsVar = this.f[i];
            if (wsVar != null) {
                ((d6c) this.l.a).c(wsVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        te8 te8Var;
        int i = 0;
        while (true) {
            te8Var = this.l;
            m6f[] m6fVarArr = (m6f[]) te8Var.c;
            if (i >= m6fVarArr.length) {
                break;
            }
            m6f m6fVar = m6fVarArr[i];
            if (m6fVar != null) {
                m6fVar.d();
            }
            i++;
        }
        d6c d6cVar = (d6c) te8Var.b;
        m6f[] m6fVarArr2 = this.m;
        int length = this.n;
        d6cVar.getClass();
        if (length > m6fVarArr2.length) {
            length = m6fVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            m6f m6fVar2 = m6fVarArr2[i2];
            int i3 = d6cVar.b;
            Object[] objArr = d6cVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = m6fVar2;
                d6cVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((m6f[]) te8Var.c, (Object) null);
        this.b = 0;
        n9c n9cVar = this.c;
        n9cVar.h = 0;
        n9cVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            ws wsVar = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new ws(te8Var);
    }
}
