package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w29 {
    public final nj4 c;
    public final wwf d;
    public final wo4 e;
    public long f;
    public int g;
    public boolean h;
    public r29 i;
    public r29 j;
    public r29 k;
    public r29 l;
    public r29 m;
    public int n;
    public Object o;
    public long p;
    public final m9g a = new m9g();
    public final q9g b = new q9g();
    public ArrayList q = new ArrayList();

    public w29(nj4 nj4Var, wwf wwfVar, wo4 wo4Var) {
        this.c = nj4Var;
        this.d = wwfVar;
        this.e = wo4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d99 p(defpackage.s9g r14, java.lang.Object r15, long r16, long r18, defpackage.q9g r20, defpackage.m9g r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.g(r15, r4)
            int r5 = r4.c
            r14.n(r5, r2)
            int r5 = r14.b(r15)
            r7 = r15
        L13:
            v8 r3 = r4.g
            int r3 = r3.a
            r6 = -1
            if (r3 == 0) goto L6d
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.g(r9)
            if (r10 != 0) goto L6d
        L24:
            v8 r10 = r4.g
            int r10 = r10.d
            boolean r10 = r4.h(r10)
            if (r10 == 0) goto L6d
            r10 = 0
            int r12 = r4.c(r10)
            if (r12 == r6) goto L37
            goto L6d
        L37:
            long r12 = r4.d
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L5e
        L3e:
            int r12 = r3 + (-1)
            boolean r12 = r4.g(r12)
            if (r12 == 0) goto L48
            r12 = 2
            goto L49
        L48:
            r12 = r8
        L49:
            int r3 = r3 - r12
        L4a:
            if (r9 > r3) goto L58
            v8 r12 = r4.g
            t8 r12 = r12.a(r9)
            long r12 = r12.i
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L4a
        L58:
            long r12 = r4.d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6d
        L5e:
            int r3 = r2.o
            if (r5 > r3) goto L6d
            r14.f(r5, r4, r8)
            java.lang.Object r7 = r4.b
            r7.getClass()
            int r5 = r5 + 1
            goto L13
        L6d:
            r14.g(r7, r4)
            int r8 = r4.c(r0)
            if (r8 != r6) goto L82
            int r14 = r4.b(r0)
            d99 r0 = new d99
            r10 = r18
            r0.<init>(r7, r10, r14)
            return r0
        L82:
            r10 = r18
            int r9 = r4.f(r8)
            d99 r6 = new d99
            r12 = -1
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w29.p(s9g, java.lang.Object, long, long, q9g, m9g):d99");
    }

    public final r29 a() {
        r29 r29Var = this.i;
        if (r29Var == null) {
            return null;
        }
        if (r29Var == this.j) {
            this.j = r29Var.m;
        }
        if (r29Var == this.k) {
            this.k = r29Var.m;
        }
        r29Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            r29 r29Var2 = this.i;
            this.o = r29Var2.b;
            this.p = r29Var2.g.a.d;
        }
        this.i = this.i.m;
        m();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        r29 r29Var = this.i;
        hsi.h(r29Var);
        this.o = r29Var.b;
        this.p = r29Var.g.a.d;
        while (r29Var != null) {
            r29Var.i();
            r29Var = r29Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u29 c(defpackage.s9g r19, defpackage.r29 r20, long r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w29.c(s9g, r29, long):u29");
    }

    public final u29 d(s9g s9gVar, r29 r29Var, long j) {
        m9g m9gVar;
        s9g s9gVar2;
        u29 u29Var = r29Var.g;
        long j2 = (r29Var.p + u29Var.e) - j;
        if (u29Var.h) {
            return c(s9gVar, r29Var, j2);
        }
        d99 d99Var = u29Var.a;
        Object obj = d99Var.a;
        int i = d99Var.e;
        m9g m9gVar2 = this.a;
        s9gVar.g(obj, m9gVar2);
        boolean z = u29Var.g;
        if (!d99Var.b()) {
            if (i != -1 && m9gVar2.g(i)) {
                return c(s9gVar, r29Var, j2);
            }
            int iF = m9gVar2.f(i);
            boolean z2 = m9gVar2.h(i) && m9gVar2.e(i, iF) == 3;
            if (iF != m9gVar2.g.a(i).b && !z2) {
                return f(s9gVar, d99Var.a, d99Var.e, iF, u29Var.e, d99Var.d, z);
            }
            s9gVar.g(obj, m9gVar2);
            long jD = m9gVar2.d(i);
            return g(s9gVar, d99Var.a, jD == Long.MIN_VALUE ? m9gVar2.d : m9gVar2.g.a(i).i + jD, u29Var.e, d99Var.d, false);
        }
        int i2 = d99Var.b;
        int i3 = m9gVar2.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = m9gVar2.g.a(i2).a(d99Var.c);
        if (iA < i3) {
            return f(s9gVar, d99Var.a, i2, iA, u29Var.c, d99Var.d, z);
        }
        long jLongValue = u29Var.c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = s9gVar.j(this.b, m9gVar2, m9gVar2.c, -9223372036854775807L, Math.max(0L, j2));
            m9gVar = m9gVar2;
            s9gVar2 = s9gVar;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            m9gVar = m9gVar2;
            s9gVar2 = s9gVar;
        }
        int i4 = d99Var.b;
        s9gVar2.g(obj, m9gVar);
        long jD2 = m9gVar.d(i4);
        return g(s9gVar, d99Var.a, Math.max(jD2 == Long.MIN_VALUE ? m9gVar.d : m9gVar.g.a(i4).i + jD2, jLongValue), u29Var.c, d99Var.d, z);
    }

    public final u29 e(s9g s9gVar, d99 d99Var, long j, long j2) {
        s9gVar.g(d99Var.a, this.a);
        return d99Var.b() ? f(s9gVar, d99Var.a, d99Var.b, d99Var.c, j, d99Var.d, false) : g(s9gVar, d99Var.a, j2, j, d99Var.d, false);
    }

    public final u29 f(s9g s9gVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        d99 d99Var = new d99(obj, i, i2, j2, -1);
        m9g m9gVar = this.a;
        long jA = s9gVar.g(obj, m9gVar).a(i, i2);
        long jMax = i2 == m9gVar.f(i) ? m9gVar.g.b : 0L;
        boolean zH = m9gVar.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new u29(d99Var, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u29 g(defpackage.s9g r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w29.g(s9g, java.lang.Object, long, long, long, boolean):u29");
    }

    public final r29 h() {
        return this.k;
    }

    public final u29 i(s9g s9gVar, u29 u29Var) {
        d99 d99Var = u29Var.a;
        boolean zB = d99Var.b();
        int i = d99Var.e;
        boolean zH = false;
        boolean z = !zB && i == -1;
        int i2 = d99Var.b;
        boolean zK = k(s9gVar, d99Var);
        boolean zJ = j(s9gVar, d99Var, z);
        Object obj = d99Var.a;
        m9g m9gVar = this.a;
        s9gVar.g(obj, m9gVar);
        long jD = (d99Var.b() || i == -1) ? -9223372036854775807L : m9gVar.d(i);
        long jA = d99Var.b() ? m9gVar.a(i2, d99Var.c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? m9gVar.d : jD;
        if (d99Var.b()) {
            zH = m9gVar.h(i2);
        } else if (i != -1 && m9gVar.h(i)) {
            zH = true;
        }
        return new u29(d99Var, u29Var.b, u29Var.c, jD, jA, u29Var.f, zH, z, zK, zJ);
    }

    public final boolean j(s9g s9gVar, d99 d99Var, boolean z) {
        int iB = s9gVar.b(d99Var.a);
        if (!s9gVar.m(s9gVar.f(iB, this.a, false).c, this.b, 0L).i) {
            if (s9gVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(s9g s9gVar, d99 d99Var) {
        boolean z = !d99Var.b() && d99Var.e == -1;
        Object obj = d99Var.a;
        if (z) {
            if (s9gVar.m(s9gVar.g(obj, this.a).c, this.b, 0L).o == s9gVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        r29 r29Var = this.m;
        if (r29Var == null || r29Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                r29 r29Var2 = (r29) this.q.get(i);
                if (!r29Var2.h()) {
                    this.m = r29Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        tg7 tg7VarI = wg7.i();
        for (r29 r29Var = this.i; r29Var != null; r29Var = r29Var.m) {
            tg7VarI.a(r29Var.g.a);
        }
        r29 r29Var2 = this.j;
        this.d.d(new se5(this, tg7VarI, r29Var2 == null ? null : r29Var2.g.a, 19));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jee] */
    public final void n(long j) {
        r29 r29Var = this.l;
        if (r29Var != null) {
            hsi.g(r29Var.m == null);
            if (r29Var.e) {
                r29Var.a.p(j - r29Var.p);
            }
        }
    }

    public final int o(r29 r29Var) {
        hsi.h(r29Var);
        int i = 0;
        if (r29Var.equals(this.l)) {
            return 0;
        }
        this.l = r29Var;
        while (true) {
            r29Var = r29Var.m;
            if (r29Var == null) {
                break;
            }
            if (r29Var == this.j) {
                r29 r29Var2 = this.i;
                this.j = r29Var2;
                this.k = r29Var2;
                i = 3;
            }
            if (r29Var == this.k) {
                this.k = this.j;
                i |= 2;
            }
            r29Var.i();
            this.n--;
        }
        r29 r29Var3 = this.l;
        r29Var3.getClass();
        if (r29Var3.m != null) {
            r29Var3.b();
            r29Var3.m = null;
            r29Var3.c();
        }
        m();
        return i;
    }

    public final d99 q(s9g s9gVar, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        m9g m9gVar = this.a;
        int i = s9gVar.g(obj2, m9gVar).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = s9gVar.b(obj3)) == -1 || s9gVar.f(iB, m9gVar, false).c != i) {
            r29 r29Var = this.i;
            while (true) {
                if (r29Var == null) {
                    r29 r29Var2 = this.i;
                    while (true) {
                        if (r29Var2 != null) {
                            int iB2 = s9gVar.b(r29Var2.b);
                            if (iB2 != -1 && s9gVar.f(iB2, m9gVar, false).c == i) {
                                jR = r29Var2.g.a.d;
                                break;
                            }
                            r29Var2 = r29Var2.m;
                        } else {
                            jR = r(obj2);
                            if (jR == -1) {
                                jR = this.f;
                                this.f = 1 + jR;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = jR;
                                }
                            }
                        }
                    }
                } else {
                    if (r29Var.b.equals(obj2)) {
                        jR = r29Var.g.a.d;
                        break;
                    }
                    r29Var = r29Var.m;
                }
            }
        } else {
            jR = this.p;
        }
        s9gVar.g(obj2, m9gVar);
        int i2 = m9gVar.c;
        q9g q9gVar = this.b;
        s9gVar.n(i2, q9gVar);
        boolean z = false;
        for (int iB3 = s9gVar.b(obj); iB3 >= q9gVar.n; iB3--) {
            s9gVar.f(iB3, m9gVar, true);
            boolean z2 = m9gVar.g.a > 0;
            z |= z2;
            if (m9gVar.c(m9gVar.d) != -1) {
                obj2 = m9gVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || m9gVar.d != 0)) {
                break;
            }
        }
        return p(s9gVar, obj2, j, jR, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            r29 r29Var = (r29) this.q.get(i);
            if (r29Var.b.equals(obj)) {
                return r29Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(s9g s9gVar) {
        s9g s9gVar2;
        r29 r29Var;
        r29 r29Var2 = this.i;
        if (r29Var2 == null) {
            return 0;
        }
        int iB = s9gVar.b(r29Var2.b);
        while (true) {
            s9gVar2 = s9gVar;
            iB = s9gVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                r29Var2.getClass();
                r29Var = r29Var2.m;
                if (r29Var == null || r29Var2.g.h) {
                    break;
                }
                r29Var2 = r29Var;
            }
            if (iB == -1 || r29Var == null || s9gVar2.b(r29Var.b) != iB) {
                break;
            }
            r29Var2 = r29Var;
            s9gVar = s9gVar2;
        }
        int iO = o(r29Var2);
        r29Var2.g = i(s9gVar2, r29Var2.g);
        return iO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        return o(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(defpackage.s9g r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r29 r2 = r0.i
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            u29 r5 = r2.g
            if (r3 != 0) goto L15
            u29 r3 = r0.i(r1, r5)
            r6 = r19
            goto L30
        L15:
            r6 = r19
            u29 r8 = r0.d(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.b
            long r11 = r8.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lb0
            d99 r9 = r5.a
            d99 r10 = r8.a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.e
            long r10 = r5.c
            long r12 = r5.e
            u29 r10 = r3.a(r10)
            r2.g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L55
        L52:
            long r10 = r2.p
            long r8 = r8 + r10
        L55:
            r29 r1 = r0.j
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6c
            u29 r1 = r2.g
            boolean r1 = r1.g
            if (r1 != 0) goto L6c
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = r10
            goto L6d
        L6c:
            r1 = r4
        L6d:
            r29 r11 = r0.k
            if (r2 != r11) goto L7b
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L79
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
        L79:
            r8 = r10
            goto L7c
        L7b:
            r8 = r4
        L7c:
            int r2 = r0.o(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L99
            long r11 = r5.d
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L99
            long r11 = r3.d
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L99
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L99
            r3 = r10
            goto L9a
        L99:
            r3 = r4
        L9a:
            if (r1 == 0) goto La1
            if (r2 != 0) goto La0
            if (r3 == 0) goto La1
        La0:
            r4 = r10
        La1:
            if (r8 == 0) goto La6
            r1 = r4 | 2
            return r1
        La6:
            return r4
        La7:
            r29 r3 = r2.m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb0:
            int r1 = r0.o(r3)
            return r1
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w29.t(s9g, long, long, long):int");
    }
}
