package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.exo.error.OneVideoExoPlaybackException;

/* loaded from: classes2.dex */
public final class oh6 implements dhb {
    public final awd a = new awd(null);
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // defpackage.dhb
    public final void a(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 3));
    }

    @Override // defpackage.dhb
    public final void b(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 5));
    }

    @Override // defpackage.dhb
    public final void c(ghb ghbVar) {
        this.a.b(new qn2(this, 21, (vgb) ghbVar));
    }

    @Override // defpackage.dhb
    public final void d(vgb vgbVar, u5g u5gVar, boolean z) {
        this.a.b(new qn1(this, vgbVar, z, u5gVar, 1));
    }

    @Override // defpackage.dhb
    public final void e(OneVideoExoPlaybackException oneVideoExoPlaybackException, uch uchVar, ghb ghbVar) {
        this.a.b(new fq(this, oneVideoExoPlaybackException, uchVar, ghbVar, 3));
    }

    @Override // defpackage.dhb
    public final void f(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 9));
    }

    @Override // defpackage.dhb
    public final void g(final ghb ghbVar, final float f) {
        this.a.b(new cm6() { // from class: hh6
            @Override // defpackage.cm6
            public final Object invoke() {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).g(ghbVar, f);
                }
                return qqg.a;
            }
        });
    }

    @Override // defpackage.dhb
    public final void h(vgb vgbVar, adh adhVar) {
        this.a.b(new mh6(this, vgbVar, adhVar, 1));
    }

    @Override // defpackage.dhb
    public final void i(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 7));
    }

    @Override // defpackage.dhb
    public final void j(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 0));
    }

    @Override // defpackage.dhb
    public final void k(vgb vgbVar, adh adhVar) {
        this.a.b(new mh6(this, vgbVar, adhVar, 0));
    }

    @Override // defpackage.dhb
    public final void l(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 8));
    }

    @Override // defpackage.dhb
    public final void m(ghb ghbVar, int i) {
        this.a.b(new gh6(this, ghbVar, i, 1));
    }

    @Override // defpackage.dhb
    public final void n(ghb ghbVar, boolean z) {
        this.a.b(new ih6(this, ghbVar, z, 1));
    }

    @Override // defpackage.dhb
    public final void o(vgb vgbVar, j60 j60Var) {
        this.a.b(new da1(this, vgbVar, j60Var, 6));
    }

    @Override // defpackage.dhb
    public final void p(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 1));
    }

    @Override // defpackage.dhb
    public final void q(ghb ghbVar, chb chbVar, c32 c32Var, c32 c32Var2) {
        this.a.b(new jh6(this, ghbVar, chbVar, c32Var, c32Var2, 0));
    }

    @Override // defpackage.dhb
    public final void r(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 6));
    }

    @Override // defpackage.dhb
    public final void s(final rl0 rl0Var, final int i, final int i2) {
        this.a.b(new cm6() { // from class: lh6
            @Override // defpackage.cm6
            public final Object invoke() {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).s(rl0Var, i, i2);
                }
                return qqg.a;
            }
        });
    }

    @Override // defpackage.dhb
    public final void t(ghb ghbVar, long j) {
        this.a.b(new pr0(this, ghbVar, j));
    }

    @Override // defpackage.dhb
    public final void u(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 4));
    }

    @Override // defpackage.dhb
    public final void v(ghb ghbVar) {
        this.a.b(new kh6(this, ghbVar, 2));
    }

    @Override // defpackage.dhb
    public final void w(ghb ghbVar, boolean z) {
        this.a.b(new ih6(this, ghbVar, z, 0));
    }

    @Override // defpackage.dhb
    public final void x(ghb ghbVar, int i) {
        this.a.b(new gh6(this, ghbVar, i, 0));
    }
}
