package defpackage;

import android.content.Intent;
import android.graphics.Point;
import androidx.recyclerview.widget.b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class wo1 extends xfh {
    public final hbd A0;
    public final tcf B0;
    public final tcf C0;
    public final tcf D0;
    public final hbd E0;
    public final hbd F0;
    public final tcf G0;
    public final tcf H0;
    public final tcf I0;
    public final bwf J0;
    public boolean K0;
    public final ci5 L0;
    public final hbd M0;
    public final Object N0;
    public final hbd O0;
    public final Object P0;
    public final Object Q0;
    public final vl3 X;
    public final mr1 Y;
    public final ks1 Z;
    public final bsb b;
    public final qv1 c;
    public final k18 d;
    public final z21 o;
    public final o41 s0;
    public final r1e t0;
    public final k18 u0;
    public final k18 v0;
    public final hbd w0;
    public final tcf x0;
    public final bwf y0;
    public final bwf z0;

    public wo1(k18 k18Var, bsb bsbVar, qv1 qv1Var, k18 k18Var2, z21 z21Var, vl3 vl3Var, mr1 mr1Var, ks1 ks1Var, o41 o41Var, r1e r1eVar, k18 k18Var3) {
        s41 s41Var;
        z01 z01Var;
        Object objA;
        k18 k18Var4 = fm1.a;
        final int i = 0;
        this.b = bsbVar;
        this.c = qv1Var;
        this.d = k18Var2;
        this.o = z21Var;
        this.X = vl3Var;
        this.Y = mr1Var;
        this.Z = ks1Var;
        this.s0 = o41Var;
        this.t0 = r1eVar;
        this.u0 = k18Var3;
        this.v0 = k18Var;
        hbd hbdVar = qv1Var.p;
        s41 s41Var2 = qv1Var.f;
        z01 z01Var2 = qv1Var.l;
        this.w0 = hbdVar;
        tcf tcfVarA = ucf.a(new vc1());
        this.x0 = tcfVarA;
        this.y0 = new bwf(new cm6(this) { // from class: pn1
            public final /* synthetic */ wo1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                boolean zJ;
                switch (i) {
                    case 0:
                        gu5 gu5Var = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var.getClass();
                        zJ = gu5Var.j(PmsKey.f58groupcallchatsupport, false);
                        break;
                    case 1:
                        gu5 gu5Var2 = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var2.getClass();
                        zJ = gu5Var2.j(PmsKey.grse, false);
                        break;
                    default:
                        int i2 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i2);
                        return bVar;
                }
                return Boolean.valueOf(zJ);
            }
        });
        final int i2 = 1;
        this.z0 = new bwf(new cm6(this) { // from class: pn1
            public final /* synthetic */ wo1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                boolean zJ;
                switch (i2) {
                    case 0:
                        gu5 gu5Var = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var.getClass();
                        zJ = gu5Var.j(PmsKey.f58groupcallchatsupport, false);
                        break;
                    case 1:
                        gu5 gu5Var2 = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var2.getClass();
                        zJ = gu5Var2.j(PmsKey.grse, false);
                        break;
                    default:
                        int i22 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i22);
                        return bVar;
                }
                return Boolean.valueOf(zJ);
            }
        });
        hbd hbdVar2 = new hbd(tcfVarA);
        this.A0 = hbdVar2;
        tcf tcfVarA2 = ucf.a(id5.a);
        this.B0 = tcfVarA2;
        vfh vfhVar = vfh.a;
        tcf tcfVarA3 = ucf.a(new x51(new rt1(vfhVar, hd5.a, null, null, false, null, false, false)));
        this.C0 = tcfVarA3;
        this.D0 = tcfVarA3;
        x26 x26VarU = gw0.u(gw0.m(new m11(2, new yh0(tcfVarA3, 2))), ((q2b) x()).a());
        Boolean bool = Boolean.TRUE;
        ContextScope contextScope = this.a;
        lcj lcjVar = yve.a;
        this.E0 = gw0.C(x26VarU, contextScope, lcjVar, bool);
        int i3 = 3;
        this.F0 = gw0.C(gw0.u(new z41(hbdVar, tcfVarA, new ld0(i3, (Continuation) null, i3), 3), ((q2b) x()).a()), this.a, lcjVar, dxg.d);
        Boolean bool2 = Boolean.FALSE;
        this.G0 = ucf.a(bool2);
        this.H0 = ucf.a(bool2);
        this.I0 = ucf.a(nr1.d);
        bwf bwfVar = new bwf(new jl1(6));
        this.J0 = bwfVar;
        this.L0 = new ci5(0);
        this.M0 = gw0.C(new ph0(hbdVar, 16), this.a, lcjVar, vfhVar);
        gu5 gu5Var = (gu5) ((rt5) k18Var3.getValue());
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f58groupcallchatsupport, false)) {
            tcf tcfVar = ((c51) s41Var2).j;
            int i4 = s65.d;
            s41Var = s41Var2;
            z01Var = z01Var2;
            int i5 = 0;
            objA = gw0.C(gw0.u(gw0.m(new m11(3, gw0.E(gw0.m(new lo1(zs0.g(tcfVar, v9j.h(1, y65.SECONDS)), i5)), new mo1((Continuation) null, k18Var4, i5)))), ((q2b) x()).a()), this.a, lcjVar, 0);
        } else {
            s41Var = s41Var2;
            z01Var = z01Var2;
            objA = ucf.a(0);
        }
        this.N0 = objA;
        this.O0 = gw0.C(gw0.u(gw0.j(new ph0(hbdVar, 17), new ph0(((v11) z01Var).F0, 18), new ph0(qv1Var.b(), 19), ((v11) z01Var).t0, new jo1(5, null)), ((q2b) x()).a()), this.a, lcjVar, bool2);
        final int i6 = 2;
        this.P0 = ipi.b(3, new cm6(this) { // from class: pn1
            public final /* synthetic */ wo1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                boolean zJ;
                switch (i6) {
                    case 0:
                        gu5 gu5Var2 = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var2.getClass();
                        zJ = gu5Var2.j(PmsKey.f58groupcallchatsupport, false);
                        break;
                    case 1:
                        gu5 gu5Var22 = (gu5) ((rt5) this.b.u0.getValue());
                        gu5Var22.getClass();
                        zJ = gu5Var22.j(PmsKey.grse, false);
                        break;
                    default:
                        int i22 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i22);
                        return bVar;
                }
                return Boolean.valueOf(zJ);
            }
        });
        this.Q0 = ipi.b(3, new jl1(7));
        gw0.w(new g56(((x4h) bwfVar.getValue()).e, new sn1(2, null), 1), this.a);
        gw0.w(new g56(ks1Var.g, new tn1(this, null), 1), this.a);
        gw0.w(new g56(new ph0(qv1Var.f(), 20), new un1(this, null), 1), this.a);
        gw0.w(gw0.u(gw0.j(qv1Var.c.f, hbdVar2, new ph0(qv1Var.e(), 15), new x3(qv1Var.e(), this, 10), new go1(this, null)), ((q2b) x()).a()), this.a);
        gw0.w(gw0.u(new c66(new x26[]{qv1Var.b(), qv1Var.e(), ((c51) s41Var).j, qv1Var.f(), ((v11) z01Var).F0}, new wn1(this, null, 0)), ((q2b) x()).a()), this.a);
        gw0.w(gw0.u(gw0.i(hbdVar2, hbdVar, tcfVarA2, new ho1(this, null, 0)), ((q2b) x()).a()), this.a);
        gw0.w(gw0.u(new c66(new x26[]{qv1Var.e(), new ph0(hbdVar, 14), new zn1(hbdVar2, 0), new zn1(hbdVar2, 1), new zn1(hbdVar2, 2)}, new co1(this, null)), ((q2b) x()).a()), this.a);
        gw0.w(new g56(((v11) z01Var).D0, new vn1(this, null), 1), this.a);
    }

    public final void A(zi1 zi1Var) {
        cnb cnbVarD = this.c.d();
        if (zi1Var.equals(cnbVarD.a.getId()) || cnbVarD.a.m()) {
            xfh.r(this.L0, new tm1(zi1Var));
        }
    }

    public final void B(boolean z, Intent intent) {
        Conversation conversationA;
        qv1 qv1Var = this.c;
        g1e g1eVar = qv1Var.h;
        if (!z || !g1eVar.c()) {
            if (z && (conversationA = ((n64) g1eVar.a.getValue()).a()) != null && !conversationA.isDestroyed() && intent != null) {
                qv1Var.e.c(false);
                qv1Var.g.a = intent;
                g1eVar.b(true);
            } else if (!z && g1eVar.c()) {
                g1eVar.b(false);
            }
        }
        yx1 yx1Var = (yx1) this.v0.getValue();
        String strV = v();
        boolean z2 = ((vc1) this.A0.a.getValue()).g;
        yx1Var.getClass();
        yx1.d(yx1Var, "SCREEN_SHARE", strV, null, Long.valueOf(z ? 1L : 0L), null, null, z2, 116);
    }

    public final void C(zi1 zi1Var, Point point) {
        k51 k51VarB = this.Z.b(zi1Var, point);
        if (k51VarB == null) {
            return;
        }
        ((yx1) this.v0.getValue()).a(zi1Var.a, v(), k51VarB.c);
        xfh.r(this.L0, new bn1(k51VarB));
    }

    @Override // defpackage.xfh
    public final void s() {
        if (this.K0) {
            ((hw1) this.c.a).y();
        }
    }

    public final boolean t(boolean z) {
        if (!w().g && !z) {
            return true;
        }
        if (w().s) {
            return false;
        }
        return w().g || w().t;
    }

    public final void u() {
        Object value;
        tcf tcfVar = this.c.o;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, bt1.a((bt1) value, null, null, null, null, null, 0L, 247)));
    }

    public final String v() {
        return ((vc1) this.A0.a.getValue()).a;
    }

    public final vc1 w() {
        return (vc1) this.A0.a.getValue();
    }

    public final lzf x() {
        return (lzf) this.d.getValue();
    }

    public final void y(boolean z) {
        tcf tcfVar;
        Object value;
        do {
            tcfVar = this.G0;
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(z)));
    }

    public final void z() {
        Long l;
        d51 d51Var = w().f;
        if (d51Var == null || (l = d51Var.a) == null) {
            return;
        }
        long jLongValue = l.longValue();
        yx1 yx1Var = (yx1) this.v0.getValue();
        String str = w().a;
        boolean z = w().g;
        yx1Var.getClass();
        yx1.d(yx1Var, "CHAT_OPENED", str, null, null, null, null, z, 124);
        ug1.c.getClass();
        xc0.l(":chats?id=" + jLongValue + "&type=local&pop_controllers=true", this.L0);
    }
}
