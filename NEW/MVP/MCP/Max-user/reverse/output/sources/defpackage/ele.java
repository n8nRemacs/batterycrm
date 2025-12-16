package defpackage;

import android.app.Application;
import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ele extends xfh {
    public static final /* synthetic */ yy7[] M0 = {new z8a(ele.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, ele.class, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;")};
    public final ra3 A0;
    public final ci5 B0;
    public final ci5 C0;
    public final tcf D0;
    public final hbd E0;
    public final tcf F0;
    public final hbd G0;
    public final AtomicReference H0;
    public final AtomicLong I0;
    public final t9f J0;
    public final t9f K0;
    public final h8a L0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final os6 b;
    public final zt6 c;
    public final Application d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public ele() {
        woe woeVar = woe.a;
        l4e l4eVar = (l4e) woeVar.getAccessor().c(397);
        bwf bwfVarD = woeVar.getAccessor().d(32);
        bwf bwfVarD2 = woeVar.getAccessor().d(437);
        os6 os6Var = (os6) woeVar.getAccessor().c(598);
        zt6 zt6Var = (zt6) woeVar.getAccessor().c(108);
        rhc rhcVar = (rhc) woeVar.getAccessor().c(599);
        bwf bwfVarD3 = woeVar.getAccessor().d(8);
        bwf bwfVarD4 = woeVar.getAccessor().d(10);
        Application application = (Application) woeVar.getAccessor().c(14);
        bwf bwfVarD5 = woeVar.getAccessor().d(111);
        bwf bwfVarD6 = woeVar.getAccessor().d(79);
        klc klcVar = (klc) woeVar.getAccessor().d(110).getValue();
        bwf bwfVarD7 = woeVar.getAccessor().d(109);
        bwf bwfVarD8 = woeVar.getAccessor().d(487);
        bwf bwfVarD9 = woeVar.getAccessor().d(582);
        bwf bwfVarD10 = woeVar.getAccessor().d(48);
        bwf bwfVarD11 = woeVar.getAccessor().d(84);
        bwf bwfVarD12 = woeVar.getAccessor().d(597);
        this.b = os6Var;
        this.c = zt6Var;
        this.d = application;
        this.o = bwfVarD;
        this.X = bwfVarD2;
        this.Y = bwfVarD3;
        this.Z = bwfVarD4;
        this.s0 = bwfVarD5;
        this.t0 = bwfVarD6;
        this.u0 = bwfVarD7;
        this.v0 = bwfVarD8;
        this.w0 = bwfVarD9;
        this.x0 = bwfVarD10;
        this.y0 = bwfVarD11;
        this.z0 = bwfVarD12;
        ra3 ra3Var = new ra3();
        ra3Var.a = ipi.b(3, new efd(21));
        ra3Var.b = ipi.b(3, new efd(22));
        ra3Var.c = ipi.b(3, new efd(23));
        ra3Var.d = ipi.b(3, new efd(24));
        ra3Var.e = ipi.b(3, new efd(25));
        ra3Var.f = ipi.b(3, new efd(26));
        this.A0 = ra3Var;
        this.B0 = new ci5(0);
        this.C0 = new ci5(0);
        tcf tcfVarA = ucf.a(fre.h);
        this.D0 = tcfVarA;
        this.E0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.F0 = tcfVarA2;
        this.G0 = new hbd(tcfVarA2);
        this.H0 = new AtomicReference();
        this.I0 = new AtomicLong();
        this.J0 = c7j.c();
        this.K0 = c7j.c();
        this.L0 = new h8a(2);
        t();
        svi.e(this.a, ((q2b) ((lzf) bwfVarD3.getValue())).a().plus((x74) bwfVarD11.getValue()), null, new qke(l4eVar, klcVar, bwfVarD, this, null), 2);
        gw0.w(new g56(new gbd(rhcVar.a), new rke(this, null), 1), this.a);
    }

    public final void A() {
        this.H0.set(null);
        xfh.r(this.B0, new ype(new n5g(pbb.o), Integer.valueOf(yud.J)));
    }

    public final void t() {
        x9f x9fVarD = svi.d(this.a, ((q2b) v()).a(), i84.b, new vke(this, null));
        this.K0.O(this, M0[1], x9fVarD);
    }

    public final a84 u() {
        return (a84) this.y0.getValue();
    }

    public final lzf v() {
        return (lzf) this.Y.getValue();
    }

    public final z7c w() {
        return (z7c) this.o.getValue();
    }

    public final Long x() {
        long j = ((fre) this.E0.a.getValue()).a;
        Long lValueOf = Long.valueOf(j);
        if (j != -1) {
            return lValueOf;
        }
        return null;
    }

    public final void y(String str, RectF rectF) {
        svi.e(this.a, ((q2b) v()).b().plus(u()), null, new xke(rectF, this, str, null), 2);
    }

    public final void z() {
        if (!((qsb) this.Z.getValue()).c(qsb.m)) {
            xfh.r(this.B0, spe.b);
            return;
        }
        svi.e(this.a, ((q2b) v()).b().plus(u()), null, new cle(this, null), 2);
    }
}
