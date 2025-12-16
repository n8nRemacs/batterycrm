package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d27 extends z2i {
    @Override // defpackage.wt4
    public final void a(wt4 wt4Var) {
        qi0 qi0Var = (qi0) this.b;
        int i = qi0Var.s0;
        zt4 zt4Var = this.h;
        Iterator it = zt4Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((zt4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            zt4Var.d(i3 + qi0Var.u0);
        } else {
            zt4Var.d(i2 + qi0Var.u0);
        }
    }

    @Override // defpackage.z2i
    public final void d() {
        yt3 yt3Var = this.b;
        if (yt3Var instanceof qi0) {
            zt4 zt4Var = this.h;
            zt4Var.b = true;
            qi0 qi0Var = (qi0) yt3Var;
            int i = qi0Var.s0;
            boolean z = qi0Var.t0;
            int i2 = 0;
            if (i == 0) {
                zt4Var.e = 4;
                while (i2 < qi0Var.r0) {
                    yt3 yt3Var2 = qi0Var.q0[i2];
                    if (z || yt3Var2.g0 != 8) {
                        zt4 zt4Var2 = yt3Var2.d.h;
                        zt4Var2.k.add(zt4Var);
                        zt4Var.l.add(zt4Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                zt4Var.e = 5;
                while (i2 < qi0Var.r0) {
                    yt3 yt3Var3 = qi0Var.q0[i2];
                    if (z || yt3Var3.g0 != 8) {
                        zt4 zt4Var3 = yt3Var3.d.i;
                        zt4Var3.k.add(zt4Var);
                        zt4Var.l.add(zt4Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                zt4Var.e = 6;
                while (i2 < qi0Var.r0) {
                    yt3 yt3Var4 = qi0Var.q0[i2];
                    if (z || yt3Var4.g0 != 8) {
                        zt4 zt4Var4 = yt3Var4.e.h;
                        zt4Var4.k.add(zt4Var);
                        zt4Var.l.add(zt4Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            zt4Var.e = 7;
            while (i2 < qi0Var.r0) {
                yt3 yt3Var5 = qi0Var.q0[i2];
                if (z || yt3Var5.g0 != 8) {
                    zt4 zt4Var5 = yt3Var5.e.i;
                    zt4Var5.k.add(zt4Var);
                    zt4Var.l.add(zt4Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.z2i
    public final void e() {
        yt3 yt3Var = this.b;
        if (yt3Var instanceof qi0) {
            int i = ((qi0) yt3Var).s0;
            zt4 zt4Var = this.h;
            if (i == 0 || i == 1) {
                yt3Var.Y = zt4Var.g;
            } else {
                yt3Var.Z = zt4Var.g;
            }
        }
    }

    @Override // defpackage.z2i
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.z2i
    public final boolean k() {
        return false;
    }

    public final void m(zt4 zt4Var) {
        zt4 zt4Var2 = this.h;
        zt4Var2.k.add(zt4Var);
        zt4Var.l.add(zt4Var2);
    }
}
