package defpackage;

/* loaded from: classes.dex */
public final class i0h extends z2i {
    public zt4 k;
    public sl0 l;

    @Override // defpackage.wt4
    public final void a(wt4 wt4Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (az1.v(this.j) == 3) {
            yt3 yt3Var = this.b;
            l(yt3Var.J, yt3Var.L, 1);
            return;
        }
        uw4 uw4Var = this.e;
        if (uw4Var.c && !uw4Var.j && this.d == 3) {
            yt3 yt3Var2 = this.b;
            int i2 = yt3Var2.s;
            if (i2 == 2) {
                yt3 yt3Var3 = yt3Var2.T;
                if (yt3Var3 != null) {
                    if (yt3Var3.e.e.j) {
                        uw4Var.d((int) ((r5.g * yt3Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                uw4 uw4Var2 = yt3Var2.d.e;
                if (uw4Var2.j) {
                    int i3 = yt3Var2.X;
                    if (i3 == -1) {
                        f = uw4Var2.g;
                        f2 = yt3Var2.W;
                    } else if (i3 == 0) {
                        f3 = uw4Var2.g * yt3Var2.W;
                        i = (int) (f3 + 0.5f);
                        uw4Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        uw4Var.d(i);
                    } else {
                        f = uw4Var2.g;
                        f2 = yt3Var2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    uw4Var.d(i);
                }
            }
        }
        zt4 zt4Var = this.h;
        if (zt4Var.c) {
            zt4 zt4Var2 = this.i;
            if (zt4Var2.c) {
                if (zt4Var.j && zt4Var2.j && uw4Var.j) {
                    return;
                }
                if (!uw4Var.j && this.d == 3) {
                    yt3 yt3Var4 = this.b;
                    if (yt3Var4.r == 0 && !yt3Var4.y()) {
                        zt4 zt4Var3 = (zt4) zt4Var.l.get(0);
                        zt4 zt4Var4 = (zt4) zt4Var2.l.get(0);
                        int i4 = zt4Var3.g + zt4Var.f;
                        int i5 = zt4Var4.g + zt4Var2.f;
                        zt4Var.d(i4);
                        zt4Var2.d(i5);
                        uw4Var.d(i5 - i4);
                        return;
                    }
                }
                if (!uw4Var.j && this.d == 3 && this.a == 1 && zt4Var.l.size() > 0 && zt4Var2.l.size() > 0) {
                    zt4 zt4Var5 = (zt4) zt4Var.l.get(0);
                    int i6 = (((zt4) zt4Var2.l.get(0)).g + zt4Var2.f) - (zt4Var5.g + zt4Var.f);
                    int i7 = uw4Var.m;
                    if (i6 < i7) {
                        uw4Var.d(i6);
                    } else {
                        uw4Var.d(i7);
                    }
                }
                if (uw4Var.j && zt4Var.l.size() > 0 && zt4Var2.l.size() > 0) {
                    zt4 zt4Var6 = (zt4) zt4Var.l.get(0);
                    zt4 zt4Var7 = (zt4) zt4Var2.l.get(0);
                    int i8 = zt4Var6.g;
                    int i9 = zt4Var.f + i8;
                    int i10 = zt4Var7.g;
                    int i11 = zt4Var2.f + i10;
                    float f4 = this.b.e0;
                    if (zt4Var6 == zt4Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    zt4Var.d((int) ((((i10 - i8) - uw4Var.g) * f4) + i8 + 0.5f));
                    zt4Var2.d(zt4Var.g + uw4Var.g);
                }
            }
        }
    }

    @Override // defpackage.z2i
    public final void d() {
        yt3 yt3Var;
        yt3 yt3Var2;
        yt3 yt3Var3;
        yt3 yt3Var4;
        zt4 zt4Var = this.k;
        yt3 yt3Var5 = this.b;
        boolean z = yt3Var5.a;
        uw4 uw4Var = this.e;
        if (z) {
            uw4Var.d(yt3Var5.k());
        }
        boolean z2 = uw4Var.j;
        zt4 zt4Var2 = this.i;
        zt4 zt4Var3 = this.h;
        if (!z2) {
            yt3 yt3Var6 = this.b;
            this.d = yt3Var6.p0[1];
            if (yt3Var6.E) {
                this.l = new sl0(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (yt3Var4 = this.b.T) != null && yt3Var4.p0[1] == 1) {
                    int iK = (yt3Var4.k() - this.b.J.e()) - this.b.L.e();
                    z2i.b(zt4Var3, yt3Var4.e.h, this.b.J.e());
                    z2i.b(zt4Var2, yt3Var4.e.i, -this.b.L.e());
                    uw4Var.d(iK);
                    return;
                }
                if (i == 1) {
                    uw4Var.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (yt3Var2 = (yt3Var = this.b).T) != null && yt3Var2.p0[1] == 1) {
            z2i.b(zt4Var3, yt3Var2.e.h, yt3Var.J.e());
            z2i.b(zt4Var2, yt3Var2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = uw4Var.j;
        if (z3) {
            yt3 yt3Var7 = this.b;
            if (yt3Var7.a) {
                ft3[] ft3VarArr = yt3Var7.Q;
                ft3 ft3Var = ft3VarArr[2];
                ft3 ft3Var2 = ft3Var.f;
                if (ft3Var2 != null && ft3VarArr[3].f != null) {
                    if (yt3Var7.y()) {
                        zt4Var3.f = this.b.Q[2].e();
                        zt4Var2.f = -this.b.Q[3].e();
                    } else {
                        zt4 zt4VarH = z2i.h(this.b.Q[2]);
                        if (zt4VarH != null) {
                            z2i.b(zt4Var3, zt4VarH, this.b.Q[2].e());
                        }
                        zt4 zt4VarH2 = z2i.h(this.b.Q[3]);
                        if (zt4VarH2 != null) {
                            z2i.b(zt4Var2, zt4VarH2, -this.b.Q[3].e());
                        }
                        zt4Var3.b = true;
                        zt4Var2.b = true;
                    }
                    yt3 yt3Var8 = this.b;
                    if (yt3Var8.E) {
                        z2i.b(zt4Var, zt4Var3, yt3Var8.a0);
                        return;
                    }
                    return;
                }
                if (ft3Var2 != null) {
                    zt4 zt4VarH3 = z2i.h(ft3Var);
                    if (zt4VarH3 != null) {
                        z2i.b(zt4Var3, zt4VarH3, this.b.Q[2].e());
                        z2i.b(zt4Var2, zt4Var3, uw4Var.g);
                        yt3 yt3Var9 = this.b;
                        if (yt3Var9.E) {
                            z2i.b(zt4Var, zt4Var3, yt3Var9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ft3 ft3Var3 = ft3VarArr[3];
                if (ft3Var3.f != null) {
                    zt4 zt4VarH4 = z2i.h(ft3Var3);
                    if (zt4VarH4 != null) {
                        z2i.b(zt4Var2, zt4VarH4, -this.b.Q[3].e());
                        z2i.b(zt4Var3, zt4Var2, -uw4Var.g);
                    }
                    yt3 yt3Var10 = this.b;
                    if (yt3Var10.E) {
                        z2i.b(zt4Var, zt4Var3, yt3Var10.a0);
                        return;
                    }
                    return;
                }
                ft3 ft3Var4 = ft3VarArr[4];
                if (ft3Var4.f != null) {
                    zt4 zt4VarH5 = z2i.h(ft3Var4);
                    if (zt4VarH5 != null) {
                        z2i.b(zt4Var, zt4VarH5, 0);
                        z2i.b(zt4Var3, zt4Var, -this.b.a0);
                        z2i.b(zt4Var2, zt4Var3, uw4Var.g);
                        return;
                    }
                    return;
                }
                if ((yt3Var7 instanceof e27) || yt3Var7.T == null || yt3Var7.i(7).f != null) {
                    return;
                }
                yt3 yt3Var11 = this.b;
                z2i.b(zt4Var3, yt3Var11.T.e.h, yt3Var11.s());
                z2i.b(zt4Var2, zt4Var3, uw4Var.g);
                yt3 yt3Var12 = this.b;
                if (yt3Var12.E) {
                    z2i.b(zt4Var, zt4Var3, yt3Var12.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            uw4Var.b(this);
        } else {
            yt3 yt3Var13 = this.b;
            int i2 = yt3Var13.s;
            if (i2 == 2) {
                yt3 yt3Var14 = yt3Var13.T;
                if (yt3Var14 != null) {
                    uw4 uw4Var2 = yt3Var14.e.e;
                    uw4Var.l.add(uw4Var2);
                    uw4Var2.k.add(uw4Var);
                    uw4Var.b = true;
                    uw4Var.k.add(zt4Var3);
                    uw4Var.k.add(zt4Var2);
                }
            } else if (i2 == 3 && !yt3Var13.y()) {
                yt3 yt3Var15 = this.b;
                if (yt3Var15.r != 3) {
                    uw4 uw4Var3 = yt3Var15.d.e;
                    uw4Var.l.add(uw4Var3);
                    uw4Var3.k.add(uw4Var);
                    uw4Var.b = true;
                    uw4Var.k.add(zt4Var3);
                    uw4Var.k.add(zt4Var2);
                }
            }
        }
        yt3 yt3Var16 = this.b;
        ft3[] ft3VarArr2 = yt3Var16.Q;
        ft3 ft3Var5 = ft3VarArr2[2];
        ft3 ft3Var6 = ft3Var5.f;
        if (ft3Var6 != null && ft3VarArr2[3].f != null) {
            if (yt3Var16.y()) {
                zt4Var3.f = this.b.Q[2].e();
                zt4Var2.f = -this.b.Q[3].e();
            } else {
                zt4 zt4VarH6 = z2i.h(this.b.Q[2]);
                zt4 zt4VarH7 = z2i.h(this.b.Q[3]);
                if (zt4VarH6 != null) {
                    zt4VarH6.b(this);
                }
                if (zt4VarH7 != null) {
                    zt4VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(zt4Var, zt4Var3, 1, this.l);
            }
        } else if (ft3Var6 != null) {
            zt4 zt4VarH8 = z2i.h(ft3Var5);
            if (zt4VarH8 != null) {
                z2i.b(zt4Var3, zt4VarH8, this.b.Q[2].e());
                c(zt4Var2, zt4Var3, 1, uw4Var);
                if (this.b.E) {
                    c(zt4Var, zt4Var3, 1, this.l);
                }
                if (this.d == 3) {
                    yt3 yt3Var17 = this.b;
                    if (yt3Var17.W > 0.0f) {
                        u67 u67Var = yt3Var17.d;
                        if (u67Var.d == 3) {
                            u67Var.e.k.add(uw4Var);
                            uw4Var.l.add(this.b.d.e);
                            uw4Var.a = this;
                        }
                    }
                }
            }
        } else {
            ft3 ft3Var7 = ft3VarArr2[3];
            if (ft3Var7.f != null) {
                zt4 zt4VarH9 = z2i.h(ft3Var7);
                if (zt4VarH9 != null) {
                    z2i.b(zt4Var2, zt4VarH9, -this.b.Q[3].e());
                    c(zt4Var3, zt4Var2, -1, uw4Var);
                    if (this.b.E) {
                        c(zt4Var, zt4Var3, 1, this.l);
                    }
                }
            } else {
                ft3 ft3Var8 = ft3VarArr2[4];
                if (ft3Var8.f != null) {
                    zt4 zt4VarH10 = z2i.h(ft3Var8);
                    if (zt4VarH10 != null) {
                        z2i.b(zt4Var, zt4VarH10, 0);
                        c(zt4Var3, zt4Var, -1, this.l);
                        c(zt4Var2, zt4Var3, 1, uw4Var);
                    }
                } else if (!(yt3Var16 instanceof e27) && (yt3Var3 = yt3Var16.T) != null) {
                    z2i.b(zt4Var3, yt3Var3.e.h, yt3Var16.s());
                    c(zt4Var2, zt4Var3, 1, uw4Var);
                    if (this.b.E) {
                        c(zt4Var, zt4Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        yt3 yt3Var18 = this.b;
                        if (yt3Var18.W > 0.0f) {
                            u67 u67Var2 = yt3Var18.d;
                            if (u67Var2.d == 3) {
                                u67Var2.e.k.add(uw4Var);
                                uw4Var.l.add(this.b.d.e);
                                uw4Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (uw4Var.l.size() == 0) {
            uw4Var.c = true;
        }
    }

    @Override // defpackage.z2i
    public final void e() {
        zt4 zt4Var = this.h;
        if (zt4Var.j) {
            this.b.Z = zt4Var.g;
        }
    }

    @Override // defpackage.z2i
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.z2i
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        zt4 zt4Var = this.h;
        zt4Var.c();
        zt4Var.j = false;
        zt4 zt4Var2 = this.i;
        zt4Var2.c();
        zt4Var2.j = false;
        zt4 zt4Var3 = this.k;
        zt4Var3.c();
        zt4Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
