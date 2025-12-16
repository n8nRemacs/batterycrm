package defpackage;

/* loaded from: classes.dex */
public final class u67 extends z2i {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.wt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.wt4 r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u67.a(wt4):void");
    }

    @Override // defpackage.z2i
    public final void d() {
        yt3 yt3Var;
        yt3 yt3Var2;
        int i;
        yt3 yt3Var3;
        yt3 yt3Var4;
        int i2;
        yt3 yt3Var5 = this.b;
        boolean z = yt3Var5.a;
        uw4 uw4Var = this.e;
        if (z) {
            uw4Var.d(yt3Var5.q());
        }
        boolean z2 = uw4Var.j;
        zt4 zt4Var = this.i;
        zt4 zt4Var2 = this.h;
        if (!z2) {
            yt3 yt3Var6 = this.b;
            int i3 = yt3Var6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (yt3Var4 = yt3Var6.T) != null && ((i2 = yt3Var4.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (yt3Var4.q() - this.b.I.e()) - this.b.K.e();
                    z2i.b(zt4Var2, yt3Var4.d.h, this.b.I.e());
                    z2i.b(zt4Var, yt3Var4.d.i, -this.b.K.e());
                    uw4Var.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    uw4Var.d(yt3Var6.q());
                }
            }
        } else if (this.d == 4 && (yt3Var2 = (yt3Var = this.b).T) != null && ((i = yt3Var2.p0[0]) == 1 || i == 4)) {
            z2i.b(zt4Var2, yt3Var2.d.h, yt3Var.I.e());
            z2i.b(zt4Var, yt3Var2.d.i, -this.b.K.e());
            return;
        }
        if (uw4Var.j) {
            yt3 yt3Var7 = this.b;
            if (yt3Var7.a) {
                ft3[] ft3VarArr = yt3Var7.Q;
                ft3 ft3Var = ft3VarArr[0];
                ft3 ft3Var2 = ft3Var.f;
                if (ft3Var2 != null && ft3VarArr[1].f != null) {
                    if (yt3Var7.x()) {
                        zt4Var2.f = this.b.Q[0].e();
                        zt4Var.f = -this.b.Q[1].e();
                        return;
                    }
                    zt4 zt4VarH = z2i.h(this.b.Q[0]);
                    if (zt4VarH != null) {
                        z2i.b(zt4Var2, zt4VarH, this.b.Q[0].e());
                    }
                    zt4 zt4VarH2 = z2i.h(this.b.Q[1]);
                    if (zt4VarH2 != null) {
                        z2i.b(zt4Var, zt4VarH2, -this.b.Q[1].e());
                    }
                    zt4Var2.b = true;
                    zt4Var.b = true;
                    return;
                }
                if (ft3Var2 != null) {
                    zt4 zt4VarH3 = z2i.h(ft3Var);
                    if (zt4VarH3 != null) {
                        z2i.b(zt4Var2, zt4VarH3, this.b.Q[0].e());
                        z2i.b(zt4Var, zt4Var2, uw4Var.g);
                        return;
                    }
                    return;
                }
                ft3 ft3Var3 = ft3VarArr[1];
                if (ft3Var3.f != null) {
                    zt4 zt4VarH4 = z2i.h(ft3Var3);
                    if (zt4VarH4 != null) {
                        z2i.b(zt4Var, zt4VarH4, -this.b.Q[1].e());
                        z2i.b(zt4Var2, zt4Var, -uw4Var.g);
                        return;
                    }
                    return;
                }
                if ((yt3Var7 instanceof e27) || yt3Var7.T == null || yt3Var7.i(7).f != null) {
                    return;
                }
                yt3 yt3Var8 = this.b;
                z2i.b(zt4Var2, yt3Var8.T.d.h, yt3Var8.r());
                z2i.b(zt4Var, zt4Var2, uw4Var.g);
                return;
            }
        }
        if (this.d == 3) {
            yt3 yt3Var9 = this.b;
            int i4 = yt3Var9.r;
            if (i4 == 2) {
                yt3 yt3Var10 = yt3Var9.T;
                if (yt3Var10 != null) {
                    uw4 uw4Var2 = yt3Var10.e.e;
                    uw4Var.l.add(uw4Var2);
                    uw4Var2.k.add(uw4Var);
                    uw4Var.b = true;
                    uw4Var.k.add(zt4Var2);
                    uw4Var.k.add(zt4Var);
                }
            } else if (i4 == 3) {
                if (yt3Var9.s == 3) {
                    zt4Var2.a = this;
                    zt4Var.a = this;
                    i0h i0hVar = yt3Var9.e;
                    i0hVar.h.a = this;
                    i0hVar.i.a = this;
                    uw4Var.a = this;
                    if (yt3Var9.y()) {
                        uw4Var.l.add(this.b.e.e);
                        this.b.e.e.k.add(uw4Var);
                        i0h i0hVar2 = this.b.e;
                        i0hVar2.e.a = this;
                        uw4Var.l.add(i0hVar2.h);
                        uw4Var.l.add(this.b.e.i);
                        this.b.e.h.k.add(uw4Var);
                        this.b.e.i.k.add(uw4Var);
                    } else if (this.b.x()) {
                        this.b.e.e.l.add(uw4Var);
                        uw4Var.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(uw4Var);
                    }
                } else {
                    uw4 uw4Var3 = yt3Var9.e.e;
                    uw4Var.l.add(uw4Var3);
                    uw4Var3.k.add(uw4Var);
                    this.b.e.h.k.add(uw4Var);
                    this.b.e.i.k.add(uw4Var);
                    uw4Var.b = true;
                    uw4Var.k.add(zt4Var2);
                    uw4Var.k.add(zt4Var);
                    zt4Var2.l.add(uw4Var);
                    zt4Var.l.add(uw4Var);
                }
            }
        }
        yt3 yt3Var11 = this.b;
        ft3[] ft3VarArr2 = yt3Var11.Q;
        ft3 ft3Var4 = ft3VarArr2[0];
        ft3 ft3Var5 = ft3Var4.f;
        if (ft3Var5 != null && ft3VarArr2[1].f != null) {
            if (yt3Var11.x()) {
                zt4Var2.f = this.b.Q[0].e();
                zt4Var.f = -this.b.Q[1].e();
                return;
            }
            zt4 zt4VarH5 = z2i.h(this.b.Q[0]);
            zt4 zt4VarH6 = z2i.h(this.b.Q[1]);
            if (zt4VarH5 != null) {
                zt4VarH5.b(this);
            }
            if (zt4VarH6 != null) {
                zt4VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (ft3Var5 != null) {
            zt4 zt4VarH7 = z2i.h(ft3Var4);
            if (zt4VarH7 != null) {
                z2i.b(zt4Var2, zt4VarH7, this.b.Q[0].e());
                c(zt4Var, zt4Var2, 1, uw4Var);
                return;
            }
            return;
        }
        ft3 ft3Var6 = ft3VarArr2[1];
        if (ft3Var6.f != null) {
            zt4 zt4VarH8 = z2i.h(ft3Var6);
            if (zt4VarH8 != null) {
                z2i.b(zt4Var, zt4VarH8, -this.b.Q[1].e());
                c(zt4Var2, zt4Var, -1, uw4Var);
                return;
            }
            return;
        }
        if ((yt3Var11 instanceof e27) || (yt3Var3 = yt3Var11.T) == null) {
            return;
        }
        z2i.b(zt4Var2, yt3Var3.d.h, yt3Var11.r());
        c(zt4Var, zt4Var2, 1, uw4Var);
    }

    @Override // defpackage.z2i
    public final void e() {
        zt4 zt4Var = this.h;
        if (zt4Var.j) {
            this.b.Y = zt4Var.g;
        }
    }

    @Override // defpackage.z2i
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.z2i
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        zt4 zt4Var = this.h;
        zt4Var.c();
        zt4Var.j = false;
        zt4 zt4Var2 = this.i;
        zt4Var2.c();
        zt4Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
