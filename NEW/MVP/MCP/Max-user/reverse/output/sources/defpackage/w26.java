package defpackage;

/* loaded from: classes.dex */
public final class w26 {
    public int a;
    public ft3 d;
    public ft3 e;
    public ft3 f;
    public ft3 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ y26 r;
    public yt3 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public w26(y26 y26Var, int i, ft3 ft3Var, ft3 ft3Var2, ft3 ft3Var3, ft3 ft3Var4, int i2) {
        this.r = y26Var;
        this.a = i;
        this.d = ft3Var;
        this.e = ft3Var2;
        this.f = ft3Var3;
        this.g = ft3Var4;
        this.h = y26Var.w0;
        this.i = y26Var.s0;
        this.j = y26Var.x0;
        this.k = y26Var.t0;
        this.q = i2;
    }

    public final void a(yt3 yt3Var) {
        int i = this.a;
        y26 y26Var = this.r;
        if (i == 0) {
            int iU = y26Var.U(yt3Var, this.q);
            if (yt3Var.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (yt3Var.g0 != 8 ? y26Var.P0 : 0) + this.l;
            int iT = y26Var.T(yt3Var, this.q);
            if (this.b == null || this.c < iT) {
                this.b = yt3Var;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = y26Var.U(yt3Var, this.q);
            int iT2 = y26Var.T(yt3Var, this.q);
            if (yt3Var.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (yt3Var.g0 != 8 ? y26Var.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = yt3Var;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        y26 y26Var;
        int i2;
        int i3;
        yt3 yt3Var;
        boolean z3;
        int i4;
        int i5;
        char c;
        float f;
        float f2;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        int i8 = this.o;
        int i9 = 0;
        while (true) {
            y26Var = this.r;
            if (i9 >= i8 || (i7 = this.n + i9) >= y26Var.b1) {
                break;
            }
            yt3 yt3Var2 = y26Var.a1[i7];
            if (yt3Var2 != null) {
                yt3Var2.D();
            }
            i9++;
        }
        if (i8 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.n + (z ? (i8 - 1) - i12 : i12);
            if (i13 >= y26Var.b1) {
                break;
            }
            yt3 yt3Var3 = y26Var.a1[i13];
            if (yt3Var3 != null && yt3Var3.g0 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.a == 0) {
            yt3 yt3Var4 = this.b;
            yt3Var4.j0 = y26Var.E0;
            ft3 ft3Var = yt3Var4.L;
            ft3 ft3Var2 = yt3Var4.J;
            int i14 = this.i;
            if (i > 0) {
                i14 += y26Var.Q0;
            }
            ft3Var2.a(this.e, i14);
            if (z2) {
                ft3Var.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(ft3Var2, 0);
            }
            if (y26Var.S0 != 3 || yt3Var4.E) {
                yt3Var = yt3Var4;
            } else {
                for (int i15 = 0; i15 < i8; i15++) {
                    int i16 = this.n + (z ? (i8 - 1) - i15 : i15);
                    if (i16 >= y26Var.b1) {
                        break;
                    }
                    yt3Var = y26Var.a1[i16];
                    if (yt3Var.E) {
                        break;
                    }
                }
                yt3Var = yt3Var4;
            }
            int i17 = 0;
            yt3 yt3Var5 = null;
            while (i17 < i8) {
                int i18 = z ? (i8 - 1) - i17 : i17;
                int i19 = this.n + i18;
                if (i19 >= y26Var.b1) {
                    return;
                }
                yt3 yt3Var6 = y26Var.a1[i19];
                if (yt3Var6 == null) {
                    i5 = i8;
                    z3 = z4;
                    i4 = i11;
                    c = 3;
                } else {
                    ft3 ft3Var3 = yt3Var6.L;
                    ft3 ft3Var4 = yt3Var6.J;
                    ft3 ft3Var5 = yt3Var6.I;
                    z3 = z4;
                    if (i17 == 0) {
                        i4 = i11;
                        yt3Var6.f(ft3Var5, this.d, this.h);
                    } else {
                        i4 = i11;
                    }
                    if (i18 == 0) {
                        int i20 = y26Var.D0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - y26Var.J0;
                        } else {
                            f = 1.0f;
                            f2 = y26Var.J0;
                        }
                        if (this.n == 0) {
                            i6 = y26Var.F0;
                            f3 = f2;
                            if (i6 != -1) {
                                if (z) {
                                    f5 = y26Var.L0;
                                    f4 = f - f5;
                                    yt3Var6.i0 = i6;
                                    yt3Var6.d0 = f4;
                                } else {
                                    f4 = y26Var.L0;
                                    yt3Var6.i0 = i6;
                                    yt3Var6.d0 = f4;
                                }
                            }
                        } else {
                            f3 = f2;
                        }
                        if (!z2 || (i6 = y26Var.H0) == -1) {
                            i6 = i20;
                            f4 = f3;
                        } else if (z) {
                            f5 = y26Var.N0;
                            f4 = f - f5;
                        } else {
                            f4 = y26Var.N0;
                        }
                        yt3Var6.i0 = i6;
                        yt3Var6.d0 = f4;
                    }
                    if (i17 == i8 - 1) {
                        i5 = i8;
                        yt3Var6.f(yt3Var6.K, this.f, this.j);
                    } else {
                        i5 = i8;
                    }
                    if (yt3Var5 != null) {
                        ft3 ft3Var6 = yt3Var5.K;
                        ft3Var5.a(ft3Var6, y26Var.P0);
                        if (i17 == i10) {
                            int i21 = this.h;
                            if (ft3Var5.h()) {
                                ft3Var5.h = i21;
                            }
                        }
                        ft3Var6.a(ft3Var5, 0);
                        if (i17 == i4 + 1) {
                            int i22 = this.j;
                            if (ft3Var6.h()) {
                                ft3Var6.h = i22;
                            }
                        }
                    }
                    if (yt3Var6 != yt3Var4) {
                        int i23 = y26Var.S0;
                        c = 3;
                        if (i23 == 3 && yt3Var.E && yt3Var6 != yt3Var && yt3Var6.E) {
                            yt3Var6.M.a(yt3Var.M, 0);
                        } else if (i23 == 0) {
                            ft3Var4.a(ft3Var2, 0);
                        } else if (i23 == 1) {
                            ft3Var3.a(ft3Var, 0);
                        } else if (z3) {
                            ft3Var4.a(this.e, this.i);
                            ft3Var3.a(this.g, this.k);
                        } else {
                            ft3Var4.a(ft3Var2, 0);
                            ft3Var3.a(ft3Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    yt3Var5 = yt3Var6;
                }
                i17++;
                z4 = z3;
                i11 = i4;
                i8 = i5;
            }
            return;
        }
        int i24 = i8;
        boolean z5 = z4;
        int i25 = i11;
        yt3 yt3Var7 = this.b;
        yt3Var7.i0 = y26Var.D0;
        ft3 ft3Var7 = yt3Var7.I;
        ft3 ft3Var8 = yt3Var7.K;
        int i26 = this.h;
        if (i > 0) {
            i26 += y26Var.P0;
        }
        if (z) {
            ft3Var8.a(this.f, i26);
            if (z2) {
                ft3Var7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(ft3Var8, 0);
            }
        } else {
            ft3Var7.a(this.d, i26);
            if (z2) {
                ft3Var8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(ft3Var7, 0);
            }
        }
        int i27 = 0;
        yt3 yt3Var8 = null;
        while (true) {
            int i28 = i24;
            if (i27 >= i28 || (i2 = this.n + i27) >= y26Var.b1) {
                return;
            }
            yt3 yt3Var9 = y26Var.a1[i2];
            if (yt3Var9 == null) {
                i24 = i28;
            } else {
                ft3 ft3Var9 = yt3Var9.J;
                ft3 ft3Var10 = yt3Var9.K;
                ft3 ft3Var11 = yt3Var9.I;
                if (i27 == 0) {
                    yt3Var9.f(ft3Var9, this.e, this.i);
                    int i29 = y26Var.E0;
                    float f6 = y26Var.K0;
                    if (this.n == 0) {
                        int i30 = y26Var.G0;
                        i24 = i28;
                        i3 = -1;
                        if (i30 != -1) {
                            f6 = y26Var.M0;
                        }
                        i29 = i30;
                        yt3Var9.j0 = i29;
                        yt3Var9.e0 = f6;
                    } else {
                        i24 = i28;
                        i3 = -1;
                    }
                    if (z2 && (i30 = y26Var.I0) != i3) {
                        f6 = y26Var.O0;
                        i29 = i30;
                    }
                    yt3Var9.j0 = i29;
                    yt3Var9.e0 = f6;
                } else {
                    i24 = i28;
                }
                if (i27 == i24 - 1) {
                    yt3Var9.f(yt3Var9.L, this.g, this.k);
                }
                if (yt3Var8 != null) {
                    ft3 ft3Var12 = yt3Var8.L;
                    ft3Var9.a(ft3Var12, y26Var.Q0);
                    if (i27 == i10) {
                        int i31 = this.i;
                        if (ft3Var9.h()) {
                            ft3Var9.h = i31;
                        }
                    }
                    ft3Var12.a(ft3Var9, 0);
                    if (i27 == i25 + 1) {
                        int i32 = this.k;
                        if (ft3Var12.h()) {
                            ft3Var12.h = i32;
                        }
                    }
                }
                if (yt3Var9 == yt3Var7) {
                    yt3Var8 = yt3Var9;
                } else if (z) {
                    int i33 = y26Var.R0;
                    if (i33 == 0) {
                        ft3Var10.a(ft3Var8, 0);
                    } else if (i33 == 1) {
                        ft3Var11.a(ft3Var7, 0);
                    } else if (i33 == 2) {
                        ft3Var11.a(ft3Var7, 0);
                        ft3Var10.a(ft3Var8, 0);
                    }
                    yt3Var8 = yt3Var9;
                } else {
                    int i34 = y26Var.R0;
                    if (i34 == 0) {
                        ft3Var11.a(ft3Var7, 0);
                    } else if (i34 == 1) {
                        ft3Var10.a(ft3Var8, 0);
                    } else if (i34 == 2) {
                        if (z5) {
                            ft3Var11.a(this.d, this.h);
                            ft3Var10.a(this.f, this.j);
                        } else {
                            ft3Var11.a(ft3Var7, 0);
                            ft3Var10.a(ft3Var8, 0);
                        }
                    }
                    yt3Var8 = yt3Var9;
                }
            }
            i27++;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i) {
        y26 y26Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            y26Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= y26Var.b1) {
                break;
            }
            yt3 yt3Var = y26Var.a1[i2];
            if (this.a == 0) {
                if (yt3Var != null) {
                    int[] iArr = yt3Var.p0;
                    if (iArr[0] == 3 && yt3Var.r == 0) {
                        y26Var.V(1, i5, iArr[1], yt3Var.k(), yt3Var);
                    }
                }
            } else if (yt3Var != null) {
                int[] iArr2 = yt3Var.p0;
                if (iArr2[1] == 3 && yt3Var.s == 0) {
                    int i7 = i5;
                    y26Var.V(iArr2[0], yt3Var.q(), 1, i7, yt3Var);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= y26Var.b1) {
                return;
            }
            yt3 yt3Var2 = y26Var.a1[i10];
            if (this.a == 0) {
                int iQ = yt3Var2.q();
                int i11 = y26Var.P0;
                if (yt3Var2.g0 == 8) {
                    i11 = 0;
                }
                this.l = iQ + i11 + this.l;
                int iT = y26Var.T(yt3Var2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = yt3Var2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = y26Var.U(yt3Var2, this.q);
                int iT2 = y26Var.T(yt3Var2, this.q);
                int i12 = y26Var.Q0;
                if (yt3Var2.g0 == 8) {
                    i12 = 0;
                }
                this.m = iT2 + i12 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = yt3Var2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, ft3 ft3Var, ft3 ft3Var2, ft3 ft3Var3, ft3 ft3Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = ft3Var;
        this.e = ft3Var2;
        this.f = ft3Var3;
        this.g = ft3Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
