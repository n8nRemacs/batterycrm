package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class qzb extends xfh implements wq {
    public final hbd A0;
    public final qk7 B0;
    public final Object C0;
    public final x26 D0;
    public final ci5 E0;
    public final crg X;
    public final zy6 Y;
    public final i40 Z;
    public final ozb b;
    public final tih c;
    public final k18 d;
    public final x0c o;
    public final hbd s0;
    public final Object t0;
    public final gbd u0;
    public final hbd v0;
    public final gbd w0;
    public final qs3 x0;
    public final hbd y0;
    public final hbd z0;

    public qzb(lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, l7a l7aVar, k18 k18Var11, k18 k18Var12, k18 k18Var13, k18 k18Var14, k18 k18Var15, k18 k18Var16, ozb ozbVar, tih tihVar) {
        x0c x0cVar;
        x26 x26Var;
        Object obj;
        gbd gbdVar;
        hbd hbdVar;
        Object obj2;
        tcf tcfVar;
        mcf mcfVar = ozbVar.b;
        this.b = ozbVar;
        this.c = tihVar;
        this.d = k18Var12;
        mcf mcfVar2 = ozbVar.b;
        qk7 qk7Var = null;
        if (mcfVar2 == null) {
            x0cVar = null;
        } else {
            x0cVar = new x0c(mcfVar2, lzfVar, k18Var2, (wz2) k18Var3.getValue(), k18Var11, this.a);
        }
        this.o = x0cVar;
        crg crgVar = mcfVar2 != null ? new crg(mcfVar2, this.a, (l24) k18Var4.getValue(), lzfVar, k18Var9, k18Var5, k18Var6, k18Var11) : null;
        this.X = crgVar;
        zy6 zy6Var = (mcfVar == null || !((gu5) ((rt5) k18Var10.getValue())).u()) ? null : new zy6(this.a, lzfVar, ozbVar.b, k18Var4, k18Var7, k18Var8);
        this.Y = zy6Var;
        i40 i40Var = new i40(l7aVar, this.a, k18Var9);
        this.Z = i40Var;
        this.s0 = new hbd((x0cVar == null || (tcfVar = x0cVar.h) == null) ? ucf.a(null) : tcfVar);
        this.t0 = (crgVar == null || (obj2 = crgVar.i) == null) ? ucf.a(null) : obj2;
        this.u0 = (gbd) i40Var.e;
        this.v0 = (zy6Var == null || (hbdVar = zy6Var.f) == null) ? new hbd(ucf.a(bz6.a)) : hbdVar;
        this.w0 = (zy6Var == null || (gbdVar = zy6Var.h) == null) ? new gbd(kve.b(0, 0, 7)) : gbdVar;
        ContextScope contextScope = this.a;
        nzb nzbVar = nzb.a;
        qs3 qs3Var = new qs3(lzfVar, (v40) nzbVar.getAccessor().c(36), l7aVar, contextScope, (v7h) nzbVar.getAccessor().c(513), nzbVar.getAccessor().d(138), nzbVar.getAccessor().d(123), nzbVar.getAccessor().d(109), nzbVar.getAccessor().d(46), k18Var12);
        this.x0 = qs3Var;
        hbd hbdVar2 = (hbd) qs3Var.o;
        this.y0 = hbdVar2;
        this.z0 = (hbd) qs3Var.Y;
        this.A0 = (hbd) qs3Var.Z;
        if (mcfVar == null && ((gu5) ((rt5) k18Var10.getValue())).v()) {
            ContextScope contextScope2 = this.a;
            gk7 gk7Var = (gk7) k18Var13.getValue();
            wj wjVar = (wj) k18Var14.getValue();
            qk7Var = new qk7(contextScope2, gk7Var, wjVar, k18Var9, k18Var16, new xnb(hbdVar2, 4), (xia) nzbVar.getAccessor().c(308));
        }
        this.B0 = qk7Var;
        this.C0 = (qk7Var == null || (obj = qk7Var.k) == null) ? ucf.a(yk7.a) : obj;
        this.D0 = (qk7Var == null || (x26Var = qk7Var.m) == null) ? fd5.a : x26Var;
        this.E0 = new ci5(0);
        tihVar.c(this);
    }

    @Override // defpackage.wq
    public final void c() {
        qs3 qs3Var = this.x0;
        Object value = ((hbd) qs3Var.o).a.getValue();
        o0a o0aVar = value instanceof o0a ? (o0a) value : null;
        if ((o0aVar != null ? o0aVar.f : 0) == 2 && o0aVar.d) {
            qs3Var.pause();
        }
    }

    @Override // defpackage.wq
    public final void n() {
    }

    @Override // defpackage.xfh
    public final void s() {
        this.c.i.remove(this);
    }
}
