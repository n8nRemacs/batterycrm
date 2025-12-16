package defpackage;

/* loaded from: classes.dex */
public abstract class z2i implements wt4 {
    public int a;
    public yt3 b;
    public rvd c;
    public int d;
    public final uw4 e = new uw4(this);
    public int f = 0;
    public boolean g = false;
    public final zt4 h = new zt4(this);
    public final zt4 i = new zt4(this);
    public int j = 1;

    public z2i(yt3 yt3Var) {
        this.b = yt3Var;
    }

    public static void b(zt4 zt4Var, zt4 zt4Var2, int i) {
        zt4Var.l.add(zt4Var2);
        zt4Var.f = i;
        zt4Var2.k.add(zt4Var);
    }

    public static zt4 h(ft3 ft3Var) {
        ft3 ft3Var2 = ft3Var.f;
        if (ft3Var2 == null) {
            return null;
        }
        yt3 yt3Var = ft3Var2.d;
        int iV = az1.v(ft3Var2.e);
        if (iV == 1) {
            return yt3Var.d.h;
        }
        if (iV == 2) {
            return yt3Var.e.h;
        }
        if (iV == 3) {
            return yt3Var.d.i;
        }
        if (iV == 4) {
            return yt3Var.e.i;
        }
        if (iV != 5) {
            return null;
        }
        return yt3Var.e.k;
    }

    public static zt4 i(ft3 ft3Var, int i) {
        ft3 ft3Var2 = ft3Var.f;
        if (ft3Var2 == null) {
            return null;
        }
        yt3 yt3Var = ft3Var2.d;
        z2i z2iVar = i == 0 ? yt3Var.d : yt3Var.e;
        int iV = az1.v(ft3Var2.e);
        if (iV == 1 || iV == 2) {
            return z2iVar.h;
        }
        if (iV == 3 || iV == 4) {
            return z2iVar.i;
        }
        return null;
    }

    public final void c(zt4 zt4Var, zt4 zt4Var2, int i, uw4 uw4Var) {
        zt4Var.l.add(zt4Var2);
        zt4Var.l.add(this.e);
        zt4Var.h = i;
        zt4Var.i = uw4Var;
        zt4Var2.k.add(zt4Var);
        uw4Var.k.add(zt4Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            yt3 yt3Var = this.b;
            int i3 = yt3Var.v;
            int iMax = Math.max(yt3Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            yt3 yt3Var2 = this.b;
            int i4 = yt3Var2.y;
            int iMax2 = Math.max(yt3Var2.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ft3 r12, defpackage.ft3 r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2i.l(ft3, ft3, int):void");
    }
}
