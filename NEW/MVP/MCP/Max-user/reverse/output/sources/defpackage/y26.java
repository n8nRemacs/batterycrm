package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y26 extends e27 {
    public int A0;
    public zl0 B0;
    public poc C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public yt3[] X0;
    public yt3[] Y0;
    public int[] Z0;
    public yt3[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.e27
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            yt3 yt3Var = this.q0[i];
            if (yt3Var != null) {
                yt3Var.F = true;
            }
        }
    }

    public final int T(yt3 yt3Var, int i) {
        yt3 yt3Var2;
        if (yt3Var != null) {
            int[] iArr = yt3Var.p0;
            if (iArr[1] == 3) {
                int i2 = yt3Var.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (yt3Var.z * i);
                        if (i3 != yt3Var.k()) {
                            yt3Var.g = true;
                            V(iArr[0], yt3Var.q(), 1, i3, yt3Var);
                        }
                        return i3;
                    }
                    yt3Var2 = yt3Var;
                    if (i2 == 1) {
                        return yt3Var2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((yt3Var2.q() * yt3Var2.W) + 0.5f);
                    }
                }
            } else {
                yt3Var2 = yt3Var;
            }
            return yt3Var2.k();
        }
        return 0;
    }

    public final int U(yt3 yt3Var, int i) {
        yt3 yt3Var2;
        if (yt3Var != null) {
            int[] iArr = yt3Var.p0;
            if (iArr[0] == 3) {
                int i2 = yt3Var.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (yt3Var.w * i);
                        if (i3 != yt3Var.q()) {
                            yt3Var.g = true;
                            V(1, i3, iArr[1], yt3Var.k(), yt3Var);
                        }
                        return i3;
                    }
                    yt3Var2 = yt3Var;
                    if (i2 == 1) {
                        return yt3Var2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((yt3Var2.k() * yt3Var2.W) + 0.5f);
                    }
                }
            } else {
                yt3Var2 = yt3Var;
            }
            return yt3Var2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, yt3 yt3Var) {
        poc pocVar;
        yt3 yt3Var2;
        zl0 zl0Var = this.B0;
        while (true) {
            pocVar = this.C0;
            if (pocVar != null || (yt3Var2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((zt3) yt3Var2).u0;
            }
        }
        zl0Var.a = i;
        zl0Var.b = i3;
        zl0Var.c = i2;
        zl0Var.d = i4;
        pocVar.c(yt3Var, zl0Var);
        yt3Var.O(zl0Var.e);
        yt3Var.L(zl0Var.f);
        yt3Var.E = zl0Var.h;
        yt3Var.I(zl0Var.g);
    }

    @Override // defpackage.yt3
    public final void b(d58 d58Var, boolean z) {
        yt3 yt3Var;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(d58Var, z);
        yt3 yt3Var2 = this.T;
        boolean z2 = yt3Var2 != null && ((zt3) yt3Var2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((w26) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((w26) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                yt3 yt3Var3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    yt3 yt3Var4 = this.Y0[i];
                    if (yt3Var4 != null) {
                        ft3 ft3Var = yt3Var4.I;
                        if (yt3Var4.g0 != 8) {
                            if (i8 == 0) {
                                yt3Var4.f(ft3Var, this.I, this.w0);
                                yt3Var4.i0 = this.D0;
                                yt3Var4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                yt3Var4.f(yt3Var4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && yt3Var3 != null) {
                                ft3 ft3Var2 = yt3Var3.K;
                                yt3Var4.f(ft3Var, ft3Var2, this.P0);
                                yt3Var3.f(ft3Var2, ft3Var, 0);
                            }
                            yt3Var3 = yt3Var4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    yt3 yt3Var5 = this.X0[i9];
                    if (yt3Var5 != null) {
                        ft3 ft3Var3 = yt3Var5.J;
                        if (yt3Var5.g0 != 8) {
                            if (i9 == 0) {
                                yt3Var5.f(ft3Var3, this.J, this.s0);
                                yt3Var5.j0 = this.E0;
                                yt3Var5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                yt3Var5.f(yt3Var5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && yt3Var3 != null) {
                                ft3 ft3Var4 = yt3Var3.L;
                                yt3Var5.f(ft3Var3, ft3Var4, this.Q0);
                                yt3Var3.f(ft3Var4, ft3Var3, 0);
                            }
                            yt3Var3 = yt3Var5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        yt3[] yt3VarArr = this.a1;
                        if (i12 < yt3VarArr.length && (yt3Var = yt3VarArr[i12]) != null && yt3Var.g0 != 8) {
                            yt3 yt3Var6 = this.Y0[i10];
                            yt3 yt3Var7 = this.X0[i11];
                            if (yt3Var != yt3Var6) {
                                yt3Var.f(yt3Var.I, yt3Var6.I, 0);
                                yt3Var.f(yt3Var.K, yt3Var6.K, 0);
                            }
                            if (yt3Var != yt3Var7) {
                                yt3Var.f(yt3Var.J, yt3Var7.J, 0);
                                yt3Var.f(yt3Var.L, yt3Var7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((w26) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
