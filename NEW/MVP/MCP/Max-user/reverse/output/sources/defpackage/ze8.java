package defpackage;

import androidx.fragment.app.a;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ze8 {
    public static final zl0 a = new zl0();

    public static boolean a(yt3 yt3Var) {
        int[] iArr = yt3Var.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        yt3 yt3Var2 = yt3Var.T;
        zt3 zt3Var = yt3Var2 != null ? (zt3) yt3Var2 : null;
        if (zt3Var != null) {
            int i3 = zt3Var.p0[0];
        }
        if (zt3Var != null) {
            int i4 = zt3Var.p0[1];
        }
        boolean z = i == 1 || yt3Var.A() || i == 2 || (i == 3 && yt3Var.r == 0 && yt3Var.W == 0.0f && yt3Var.t(0)) || (i == 3 && yt3Var.r == 1 && yt3Var.u(0, yt3Var.q()));
        boolean z2 = i2 == 1 || yt3Var.B() || i2 == 2 || (i2 == 3 && yt3Var.s == 0 && yt3Var.W == 0.0f && yt3Var.t(1)) || (i2 == 3 && yt3Var.s == 1 && yt3Var.u(1, yt3Var.k()));
        return (yt3Var.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return fni.a(vmf.c0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final x38 c(a aVar) {
        return cqi.e(aVar.C());
    }

    public static void d(int i, yt3 yt3Var, poc pocVar, boolean z) {
        ft3 ft3Var;
        ft3 ft3Var2;
        boolean z2;
        ft3 ft3Var3;
        ft3 ft3Var4;
        if (yt3Var.m) {
            return;
        }
        if (!(yt3Var instanceof zt3) && yt3Var.z() && a(yt3Var)) {
            zt3.V(yt3Var, pocVar, new zl0());
        }
        ft3 ft3VarI = yt3Var.i(2);
        ft3 ft3VarI2 = yt3Var.i(4);
        int iD = ft3VarI.d();
        int iD2 = ft3VarI2.d();
        HashSet hashSet = ft3VarI.a;
        if (hashSet != null && ft3VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ft3 ft3Var5 = (ft3) it.next();
                yt3 yt3Var2 = ft3Var5.d;
                int i2 = i + 1;
                boolean zA = a(yt3Var2);
                ft3 ft3Var6 = yt3Var2.I;
                ft3 ft3Var7 = yt3Var2.K;
                if (yt3Var2.z() && zA) {
                    z2 = true;
                    zt3.V(yt3Var2, pocVar, new zl0());
                } else {
                    z2 = true;
                }
                boolean z3 = ((ft3Var5 == ft3Var6 && (ft3Var4 = ft3Var7.f) != null && ft3Var4.c) || (ft3Var5 == ft3Var7 && (ft3Var3 = ft3Var6.f) != null && ft3Var3.c)) ? z2 : false;
                int i3 = yt3Var2.p0[0];
                if (i3 != 3 || zA) {
                    if (!yt3Var2.z()) {
                        if (ft3Var5 == ft3Var6 && ft3Var7.f == null) {
                            int iE = ft3Var6.e() + iD;
                            yt3Var2.J(iE, yt3Var2.q() + iE);
                            d(i2, yt3Var2, pocVar, z);
                        } else if (ft3Var5 == ft3Var7 && ft3Var6.f == null) {
                            int iE2 = iD - ft3Var7.e();
                            yt3Var2.J(iE2 - yt3Var2.q(), iE2);
                            d(i2, yt3Var2, pocVar, z);
                        } else if (z3 && !yt3Var2.x()) {
                            e(i2, yt3Var2, pocVar, z);
                        }
                    }
                } else if (i3 == 3 && yt3Var2.v >= 0 && yt3Var2.u >= 0 && (yt3Var2.g0 == 8 || (yt3Var2.r == 0 && yt3Var2.W == 0.0f))) {
                    if (!yt3Var2.x() && !yt3Var2.F && z3 && !yt3Var2.x()) {
                        f(i2, yt3Var, pocVar, yt3Var2, z);
                    }
                }
            }
        }
        if (yt3Var instanceof hz6) {
            return;
        }
        HashSet hashSet2 = ft3VarI2.a;
        if (hashSet2 != null && ft3VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ft3 ft3Var8 = (ft3) it2.next();
                yt3 yt3Var3 = ft3Var8.d;
                int i4 = i + 1;
                boolean zA2 = a(yt3Var3);
                ft3 ft3Var9 = yt3Var3.I;
                ft3 ft3Var10 = yt3Var3.K;
                if (yt3Var3.z() && zA2) {
                    zt3.V(yt3Var3, pocVar, new zl0());
                }
                boolean z4 = (ft3Var8 == ft3Var9 && (ft3Var2 = ft3Var10.f) != null && ft3Var2.c) || (ft3Var8 == ft3Var10 && (ft3Var = ft3Var9.f) != null && ft3Var.c);
                int i5 = yt3Var3.p0[0];
                if (i5 != 3 || zA2) {
                    if (!yt3Var3.z()) {
                        if (ft3Var8 == ft3Var9 && ft3Var10.f == null) {
                            int iE3 = ft3Var9.e() + iD2;
                            yt3Var3.J(iE3, yt3Var3.q() + iE3);
                            d(i4, yt3Var3, pocVar, z);
                        } else if (ft3Var8 == ft3Var10 && ft3Var9.f == null) {
                            int iE4 = iD2 - ft3Var10.e();
                            yt3Var3.J(iE4 - yt3Var3.q(), iE4);
                            d(i4, yt3Var3, pocVar, z);
                        } else if (z4 && !yt3Var3.x()) {
                            e(i4, yt3Var3, pocVar, z);
                        }
                    }
                } else if (i5 == 3 && yt3Var3.v >= 0 && yt3Var3.u >= 0) {
                    if (yt3Var3.g0 == 8 || (yt3Var3.r == 0 && yt3Var3.W == 0.0f)) {
                        if (!yt3Var3.x() && !yt3Var3.F && z4 && !yt3Var3.x()) {
                            f(i4, yt3Var, pocVar, yt3Var3, z);
                        }
                    }
                }
            }
        }
        yt3Var.m = true;
    }

    public static void e(int i, yt3 yt3Var, poc pocVar, boolean z) {
        float f = yt3Var.d0;
        ft3 ft3Var = yt3Var.I;
        int iD = ft3Var.f.d();
        ft3 ft3Var2 = yt3Var.K;
        int iD2 = ft3Var2.f.d();
        int iE = ft3Var.e() + iD;
        int iE2 = iD2 - ft3Var2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = yt3Var.q();
        int i2 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i2 = (iD - iD2) - iQ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iQ;
        if (iD > iD2) {
            i4 = i3 - iQ;
        }
        yt3Var.J(i3, i4);
        d(i + 1, yt3Var, pocVar, z);
    }

    public static void f(int i, yt3 yt3Var, poc pocVar, yt3 yt3Var2, boolean z) {
        float f = yt3Var2.d0;
        ft3 ft3Var = yt3Var2.I;
        int iE = ft3Var.e() + ft3Var.f.d();
        ft3 ft3Var2 = yt3Var2.K;
        int iD = ft3Var2.f.d() - ft3Var2.e();
        if (iD >= iE) {
            int iQ = yt3Var2.q();
            if (yt3Var2.g0 != 8) {
                int i2 = yt3Var2.r;
                if (i2 == 2) {
                    iQ = (int) (yt3Var2.d0 * 0.5f * (yt3Var instanceof zt3 ? yt3Var.q() : yt3Var.T.q()));
                } else if (i2 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(yt3Var2.u, iQ);
                int i3 = yt3Var2.v;
                if (i3 > 0) {
                    iQ = Math.min(i3, iQ);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iQ)) + 0.5f));
            yt3Var2.J(i4, iQ + i4);
            d(i + 1, yt3Var2, pocVar, z);
        }
    }

    public static void g(int i, yt3 yt3Var, poc pocVar) {
        float f = yt3Var.e0;
        ft3 ft3Var = yt3Var.J;
        int iD = ft3Var.f.d();
        ft3 ft3Var2 = yt3Var.L;
        int iD2 = ft3Var2.f.d();
        int iE = ft3Var.e() + iD;
        int iE2 = iD2 - ft3Var2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = yt3Var.k();
        int i2 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i2 = (iD - iD2) - iK;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iK;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iK;
        }
        yt3Var.K(i4, i5);
        i(i + 1, yt3Var, pocVar);
    }

    public static void h(int i, yt3 yt3Var, poc pocVar, yt3 yt3Var2) {
        float f = yt3Var2.e0;
        ft3 ft3Var = yt3Var2.J;
        int iE = ft3Var.e() + ft3Var.f.d();
        ft3 ft3Var2 = yt3Var2.L;
        int iD = ft3Var2.f.d() - ft3Var2.e();
        if (iD >= iE) {
            int iK = yt3Var2.k();
            if (yt3Var2.g0 != 8) {
                int i2 = yt3Var2.s;
                if (i2 == 2) {
                    iK = (int) (f * 0.5f * (yt3Var instanceof zt3 ? yt3Var.k() : yt3Var.T.k()));
                } else if (i2 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(yt3Var2.x, iK);
                int i3 = yt3Var2.y;
                if (i3 > 0) {
                    iK = Math.min(i3, iK);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            yt3Var2.K(i4, iK + i4);
            i(i + 1, yt3Var2, pocVar);
        }
    }

    public static void i(int i, yt3 yt3Var, poc pocVar) {
        boolean z;
        ft3 ft3Var;
        ft3 ft3Var2;
        ft3 ft3Var3;
        ft3 ft3Var4;
        if (yt3Var.n) {
            return;
        }
        if (!(yt3Var instanceof zt3) && yt3Var.z() && a(yt3Var)) {
            zt3.V(yt3Var, pocVar, new zl0());
        }
        ft3 ft3VarI = yt3Var.i(3);
        ft3 ft3VarI2 = yt3Var.i(5);
        int iD = ft3VarI.d();
        int iD2 = ft3VarI2.d();
        HashSet hashSet = ft3VarI.a;
        if (hashSet != null && ft3VarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ft3 ft3Var5 = (ft3) it.next();
                yt3 yt3Var2 = ft3Var5.d;
                int i2 = i + 1;
                boolean zA = a(yt3Var2);
                ft3 ft3Var6 = yt3Var2.J;
                ft3 ft3Var7 = yt3Var2.L;
                if (yt3Var2.z() && zA) {
                    zt3.V(yt3Var2, pocVar, new zl0());
                }
                boolean z2 = (ft3Var5 == ft3Var6 && (ft3Var4 = ft3Var7.f) != null && ft3Var4.c) || (ft3Var5 == ft3Var7 && (ft3Var3 = ft3Var6.f) != null && ft3Var3.c);
                int i3 = yt3Var2.p0[1];
                if (i3 != 3 || zA) {
                    if (!yt3Var2.z()) {
                        if (ft3Var5 == ft3Var6 && ft3Var7.f == null) {
                            int iE = ft3Var6.e() + iD;
                            yt3Var2.K(iE, yt3Var2.k() + iE);
                            i(i2, yt3Var2, pocVar);
                        } else if (ft3Var5 == ft3Var7 && ft3Var6.f == null) {
                            int iE2 = iD - ft3Var7.e();
                            yt3Var2.K(iE2 - yt3Var2.k(), iE2);
                            i(i2, yt3Var2, pocVar);
                        } else if (z2 && !yt3Var2.y()) {
                            g(i2, yt3Var2, pocVar);
                        }
                    }
                } else if (i3 == 3 && yt3Var2.y >= 0 && yt3Var2.x >= 0 && (yt3Var2.g0 == 8 || (yt3Var2.s == 0 && yt3Var2.W == 0.0f))) {
                    if (!yt3Var2.y() && !yt3Var2.F && z2 && !yt3Var2.y()) {
                        h(i2, yt3Var, pocVar, yt3Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (yt3Var instanceof hz6) {
            return;
        }
        HashSet hashSet2 = ft3VarI2.a;
        if (hashSet2 != null && ft3VarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ft3 ft3Var8 = (ft3) it2.next();
                yt3 yt3Var3 = ft3Var8.d;
                int i4 = i + 1;
                boolean zA2 = a(yt3Var3);
                ft3 ft3Var9 = yt3Var3.J;
                ft3 ft3Var10 = yt3Var3.L;
                if (yt3Var3.z() && zA2) {
                    zt3.V(yt3Var3, pocVar, new zl0());
                }
                boolean z4 = (ft3Var8 == ft3Var9 && (ft3Var2 = ft3Var10.f) != null && ft3Var2.c) || (ft3Var8 == ft3Var10 && (ft3Var = ft3Var9.f) != null && ft3Var.c);
                int i5 = yt3Var3.p0[1];
                if (i5 != 3 || zA2) {
                    if (!yt3Var3.z()) {
                        if (ft3Var8 == ft3Var9 && ft3Var10.f == null) {
                            int iE3 = ft3Var9.e() + iD2;
                            yt3Var3.K(iE3, yt3Var3.k() + iE3);
                            i(i4, yt3Var3, pocVar);
                        } else if (ft3Var8 == ft3Var10 && ft3Var9.f == null) {
                            int iE4 = iD2 - ft3Var10.e();
                            yt3Var3.K(iE4 - yt3Var3.k(), iE4);
                            i(i4, yt3Var3, pocVar);
                        } else if (z4 && !yt3Var3.y()) {
                            g(i4, yt3Var3, pocVar);
                        }
                    }
                } else if (i5 == 3 && yt3Var3.y >= 0 && yt3Var3.x >= 0 && (yt3Var3.g0 == 8 || (yt3Var3.s == 0 && yt3Var3.W == 0.0f))) {
                    if (!yt3Var3.y() && !yt3Var3.F && z4 && !yt3Var3.y()) {
                        h(i4, yt3Var, pocVar, yt3Var3);
                    }
                }
            }
        }
        ft3 ft3VarI3 = yt3Var.i(6);
        if (ft3VarI3.a != null && ft3VarI3.c) {
            int iD3 = ft3VarI3.d();
            Iterator it3 = ft3VarI3.a.iterator();
            while (it3.hasNext()) {
                ft3 ft3Var11 = (ft3) it3.next();
                yt3 yt3Var4 = ft3Var11.d;
                int i6 = i + 1;
                boolean zA3 = a(yt3Var4);
                ft3 ft3Var12 = yt3Var4.M;
                if (yt3Var4.z() && zA3) {
                    zt3.V(yt3Var4, pocVar, new zl0());
                }
                if (yt3Var4.p0[z3 ? 1 : 0] != 3 || zA3) {
                    if (!yt3Var4.z()) {
                        if (ft3Var11 == ft3Var12) {
                            int iE5 = ft3Var11.e() + iD3;
                            if (yt3Var4.E) {
                                int i7 = iE5 - yt3Var4.a0;
                                int i8 = yt3Var4.V + i7;
                                yt3Var4.Z = i7;
                                yt3Var4.J.l(i7);
                                yt3Var4.L.l(i8);
                                ft3Var12.l(iE5);
                                z = z3 ? 1 : 0;
                                yt3Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            i(i6, yt3Var4, pocVar);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        yt3Var.n = z3;
    }
}
