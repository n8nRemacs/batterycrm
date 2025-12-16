package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class v29 {
    public final l9g a = new l9g();
    public final p9g b = new p9g();
    public final mj4 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public q29 h;
    public q29 i;
    public q29 j;
    public int k;
    public Object l;
    public long m;

    public v29(mj4 mj4Var, Handler handler) {
        this.c = mj4Var;
        this.d = handler;
    }

    public static c99 l(r9g r9gVar, Object obj, long j, long j2, p9g p9gVar, l9g l9gVar) {
        r9gVar.g(obj, l9gVar);
        r9gVar.n(l9gVar.c, p9gVar);
        int iB = r9gVar.b(obj);
        while (l9gVar.d == 0) {
            u8 u8Var = l9gVar.Y;
            if (u8Var.a <= 0 || !l9gVar.f(u8Var.d) || l9gVar.c(0L) != -1) {
                break;
            }
            int i = iB + 1;
            if (iB >= p9gVar.z0) {
                break;
            }
            r9gVar.f(i, l9gVar, true);
            obj = l9gVar.b;
            obj.getClass();
            iB = i;
        }
        r9gVar.g(obj, l9gVar);
        int iC = l9gVar.c(j);
        return iC == -1 ? new c99(obj, j2, l9gVar.b(j)) : new c99(obj, iC, l9gVar.e(iC), j2, -1);
    }

    public final q29 a() {
        q29 q29Var = this.h;
        if (q29Var == null) {
            return null;
        }
        if (q29Var == this.i) {
            this.i = q29Var.l;
        }
        q29Var.f();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            q29 q29Var2 = this.h;
            this.l = q29Var2.b;
            this.m = q29Var2.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        q29 q29Var = this.h;
        fsi.e(q29Var);
        this.l = q29Var.b;
        this.m = q29Var.f.a.d;
        while (q29Var != null) {
            q29Var.f();
            q29Var = q29Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t29 c(defpackage.r9g r26, defpackage.q29 r27, long r28) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v29.c(r9g, q29, long):t29");
    }

    public final t29 d(r9g r9gVar, c99 c99Var, long j, long j2) {
        r9gVar.g(c99Var.a, this.a);
        return c99Var.a() ? e(r9gVar, c99Var.a, c99Var.b, c99Var.c, j, c99Var.d) : f(r9gVar, c99Var.a, j2, j, c99Var.d);
    }

    public final t29 e(r9g r9gVar, Object obj, int i, int i2, long j, long j2) {
        c99 c99Var = new c99(obj, i, i2, j2, -1);
        l9g l9gVar = this.a;
        long jA = r9gVar.g(obj, l9gVar).a(i, i2);
        long jMax = i2 == l9gVar.e(i) ? l9gVar.Y.b : 0L;
        boolean zF = l9gVar.f(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new t29(c99Var, jMax, j, -9223372036854775807L, jA, zF, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t29 f(defpackage.r9g r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            l9g r5 = r0.a
            r1.g(r2, r5)
            int r6 = r5.b(r3)
            r7 = 1
            r8 = 0
            r9 = -1
            if (r6 != r9) goto L26
            u8 r10 = r5.Y
            int r11 = r10.a
            if (r11 <= 0) goto L57
            int r10 = r10.d
            boolean r10 = r5.f(r10)
            if (r10 == 0) goto L57
            r10 = r7
            goto L58
        L26:
            boolean r10 = r5.f(r6)
            if (r10 == 0) goto L57
            u8 r10 = r5.Y
            s8 r10 = r10.a(r6)
            long r10 = r10.a
            long r12 = r5.d
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L57
            u8 r10 = r5.Y
            s8 r10 = r10.a(r6)
            int r11 = r10.b
            if (r11 != r9) goto L45
            goto L57
        L45:
            r12 = r8
        L46:
            if (r12 >= r11) goto L54
            int[] r13 = r10.d
            r13 = r13[r12]
            if (r13 == 0) goto L57
            if (r13 != r7) goto L51
            goto L57
        L51:
            int r12 = r12 + 1
            goto L46
        L54:
            r10 = r7
            r6 = r9
            goto L58
        L57:
            r10 = r8
        L58:
            c99 r12 = new c99
            r13 = r32
            r12.<init>(r2, r13, r6)
            boolean r2 = r12.a()
            if (r2 != 0) goto L69
            if (r6 != r9) goto L69
            r2 = r7
            goto L6a
        L69:
            r2 = r8
        L6a:
            boolean r23 = r0.i(r1, r12)
            boolean r24 = r0.h(r1, r12, r2)
            if (r6 == r9) goto L7d
            boolean r1 = r5.f(r6)
            if (r1 == 0) goto L7d
            r21 = r7
            goto L7f
        L7d:
            r21 = r8
        L7f:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L91
            u8 r1 = r5.Y
            s8 r1 = r1.a(r6)
            long r9 = r1.a
        L8e:
            r17 = r9
            goto L98
        L91:
            if (r10 == 0) goto L96
            long r9 = r5.d
            goto L8e
        L96:
            r17 = r7
        L98:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto La6
            r9 = -9223372036854775808
            int r1 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r1 != 0) goto La3
            goto La6
        La3:
            r19 = r17
            goto Laa
        La6:
            long r5 = r5.d
            r19 = r5
        Laa:
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto Lbc
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto Lbc
            r3 = 1
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lbc:
            r13 = r3
            t29 r11 = new t29
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v29.f(r9g, java.lang.Object, long, long, long):t29");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t29 g(defpackage.r9g r20, defpackage.t29 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            c99 r3 = r2.a
            boolean r4 = r3.a()
            int r5 = r3.e
            r8 = -1
            if (r4 != 0) goto L15
            if (r5 != r8) goto L15
            r12 = 1
            goto L16
        L15:
            r12 = 0
        L16:
            int r4 = r3.b
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r9 = r3.a
            l9g r10 = r0.a
            r1.g(r9, r10)
            boolean r1 = r3.a()
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3e
            if (r5 != r8) goto L35
            goto L3e
        L35:
            u8 r1 = r10.Y
            s8 r1 = r1.a(r5)
            long r6 = r1.a
            goto L3f
        L3e:
            r6 = r15
        L3f:
            boolean r1 = r3.a()
            if (r1 == 0) goto L4d
            int r1 = r3.c
            long r15 = r10.a(r4, r1)
        L4b:
            r1 = r12
            goto L5e
        L4d:
            int r1 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r1 == 0) goto L57
            r15 = -9223372036854775808
            int r1 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r1 != 0) goto L59
        L57:
            r1 = r12
            goto L5b
        L59:
            r15 = r6
            goto L4b
        L5b:
            long r11 = r10.d
            r15 = r11
        L5e:
            boolean r11 = r3.a()
            if (r11 == 0) goto L6b
            boolean r4 = r10.f(r4)
            r12 = r1
            r11 = r4
            goto L78
        L6b:
            if (r5 == r8) goto L76
            boolean r4 = r10.f(r5)
            if (r4 == 0) goto L76
            r12 = r1
            r11 = 1
            goto L78
        L76:
            r12 = r1
            r11 = 0
        L78:
            t29 r1 = new t29
            r5 = r3
            long r3 = r2.b
            long r8 = r2.c
            r2 = r5
            r17 = r8
            r7 = r6
            r5 = r17
            r9 = r15
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v29.g(r9g, t29):t29");
    }

    public final boolean h(r9g r9gVar, c99 c99Var, boolean z) {
        int iB = r9gVar.b(c99Var.a);
        if (!r9gVar.m(r9gVar.f(iB, this.a, false).c, this.b, 0L).s0) {
            if (r9gVar.d(iB, this.a, this.b, this.f, this.g) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(r9g r9gVar, c99 c99Var) {
        boolean z = !c99Var.a() && c99Var.e == -1;
        Object obj = c99Var.a;
        if (z) {
            if (r9gVar.m(r9gVar.g(obj, this.a).c, this.b, 0L).z0 == r9gVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        tg7 tg7VarI = wg7.i();
        for (q29 q29Var = this.h; q29Var != null; q29Var = q29Var.l) {
            tg7VarI.a(q29Var.f.a);
        }
        q29 q29Var2 = this.i;
        this.d.post(new se5(this, tg7VarI, q29Var2 == null ? null : q29Var2.f.a, 18));
    }

    public final boolean k(q29 q29Var) {
        boolean z = false;
        fsi.d(q29Var != null);
        if (q29Var.equals(this.j)) {
            return false;
        }
        this.j = q29Var;
        while (true) {
            q29Var = q29Var.l;
            if (q29Var == null) {
                break;
            }
            if (q29Var == this.i) {
                this.i = this.h;
                z = true;
            }
            q29Var.f();
            this.k--;
        }
        q29 q29Var2 = this.j;
        if (q29Var2.l != null) {
            q29Var2.b();
            q29Var2.l = null;
            q29Var2.c();
        }
        j();
        return z;
    }

    public final c99 m(r9g r9gVar, Object obj, long j) {
        long j2;
        int iB;
        Object obj2 = obj;
        l9g l9gVar = this.a;
        int i = r9gVar.g(obj2, l9gVar).c;
        Object obj3 = this.l;
        if (obj3 == null || (iB = r9gVar.b(obj3)) == -1 || r9gVar.f(iB, l9gVar, false).c != i) {
            q29 q29Var = this.h;
            while (true) {
                if (q29Var == null) {
                    q29 q29Var2 = this.h;
                    while (true) {
                        if (q29Var2 != null) {
                            int iB2 = r9gVar.b(q29Var2.b);
                            if (iB2 != -1 && r9gVar.f(iB2, l9gVar, false).c == i) {
                                j2 = q29Var2.f.a.d;
                                break;
                            }
                            q29Var2 = q29Var2.l;
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (q29Var.b.equals(obj2)) {
                        j2 = q29Var.f.a.d;
                        break;
                    }
                    q29Var = q29Var.l;
                }
            }
        } else {
            j2 = this.m;
        }
        r9gVar.g(obj2, l9gVar);
        int i2 = l9gVar.c;
        p9g p9gVar = this.b;
        r9gVar.n(i2, p9gVar);
        boolean z = false;
        for (int iB3 = r9gVar.b(obj); iB3 >= p9gVar.y0; iB3--) {
            r9gVar.f(iB3, l9gVar, true);
            boolean z2 = l9gVar.Y.a > 0;
            z |= z2;
            if (l9gVar.c(l9gVar.d) != -1) {
                obj2 = l9gVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || l9gVar.d != 0)) {
                break;
            }
        }
        return l(r9gVar, obj2, j, j2, this.b, this.a);
    }

    public final boolean n(r9g r9gVar) {
        r9g r9gVar2;
        q29 q29Var;
        q29 q29Var2 = this.h;
        if (q29Var2 == null) {
            return true;
        }
        int iB = r9gVar.b(q29Var2.b);
        while (true) {
            r9gVar2 = r9gVar;
            iB = r9gVar2.d(iB, this.a, this.b, this.f, this.g);
            while (true) {
                q29Var = q29Var2.l;
                if (q29Var == null || q29Var2.f.g) {
                    break;
                }
                q29Var2 = q29Var;
            }
            if (iB == -1 || q29Var == null || r9gVar2.b(q29Var.b) != iB) {
                break;
            }
            q29Var2 = q29Var;
            r9gVar = r9gVar2;
        }
        boolean zK = k(q29Var2);
        q29Var2.f = g(r9gVar2, q29Var2.f);
        return !zK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        return !r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        r14 = k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.r9g r14, long r15, long r17) {
        /*
            r13 = this;
            q29 r0 = r13.h
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L87
            t29 r3 = r0.f
            if (r1 != 0) goto L10
            t29 r1 = r13.g(r14, r3)
            r4 = r15
            goto L30
        L10:
            r4 = r15
            t29 r6 = r13.c(r14, r1, r4)
            if (r6 != 0) goto L1d
            boolean r14 = r13.k(r1)
        L1b:
            r14 = r14 ^ r2
            return r14
        L1d:
            long r7 = r3.b
            long r9 = r6.b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L82
            c99 r7 = r3.a
            c99 r8 = r6.a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L82
            r1 = r6
        L30:
            long r6 = r1.e
            long r8 = r3.c
            t29 r1 = r1.a(r8)
            r0.f = r1
            long r8 = r3.e
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 == 0) goto L7c
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L4a
            goto L7c
        L4a:
            r0.h()
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 != 0) goto L57
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5a
        L57:
            long r3 = r0.o
            long r3 = r3 + r6
        L5a:
            q29 r14 = r13.i
            r1 = 0
            if (r0 != r14) goto L71
            t29 r14 = r0.f
            boolean r14 = r14.f
            if (r14 != 0) goto L71
            r5 = -9223372036854775808
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 == 0) goto L6f
            int r14 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r14 < 0) goto L71
        L6f:
            r14 = r2
            goto L72
        L71:
            r14 = r1
        L72:
            boolean r0 = r13.k(r0)
            if (r0 != 0) goto L7b
            if (r14 != 0) goto L7b
            goto L87
        L7b:
            return r1
        L7c:
            q29 r1 = r0.l
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L82:
            boolean r14 = r13.k(r1)
            goto L1b
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v29.o(r9g, long, long):boolean");
    }
}
