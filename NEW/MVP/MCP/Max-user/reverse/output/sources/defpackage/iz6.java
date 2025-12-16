package defpackage;

/* loaded from: classes.dex */
public final class iz6 extends z2i {
    @Override // defpackage.wt4
    public final void a(wt4 wt4Var) {
        zt4 zt4Var = this.h;
        if (zt4Var.c && !zt4Var.j) {
            zt4Var.d((int) ((((zt4) zt4Var.l.get(0)).g * ((hz6) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.z2i
    public final void d() {
        yt3 yt3Var = this.b;
        hz6 hz6Var = (hz6) yt3Var;
        int i = hz6Var.r0;
        int i2 = hz6Var.s0;
        int i3 = hz6Var.u0;
        zt4 zt4Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                zt4Var.l.add(yt3Var.T.d.h);
                this.b.T.d.h.k.add(zt4Var);
                zt4Var.f = i;
            } else if (i2 != -1) {
                zt4Var.l.add(yt3Var.T.d.i);
                this.b.T.d.i.k.add(zt4Var);
                zt4Var.f = -i2;
            } else {
                zt4Var.b = true;
                zt4Var.l.add(yt3Var.T.d.i);
                this.b.T.d.i.k.add(zt4Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            zt4Var.l.add(yt3Var.T.e.h);
            this.b.T.e.h.k.add(zt4Var);
            zt4Var.f = i;
        } else if (i2 != -1) {
            zt4Var.l.add(yt3Var.T.e.i);
            this.b.T.e.i.k.add(zt4Var);
            zt4Var.f = -i2;
        } else {
            zt4Var.b = true;
            zt4Var.l.add(yt3Var.T.e.i);
            this.b.T.e.i.k.add(zt4Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.z2i
    public final void e() {
        yt3 yt3Var = this.b;
        int i = ((hz6) yt3Var).u0;
        zt4 zt4Var = this.h;
        if (i == 1) {
            yt3Var.Y = zt4Var.g;
        } else {
            yt3Var.Z = zt4Var.g;
        }
    }

    @Override // defpackage.z2i
    public final void f() {
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
