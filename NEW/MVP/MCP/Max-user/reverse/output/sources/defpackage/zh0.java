package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zh0 extends xfh {
    public static final /* synthetic */ yy7[] t0;
    public static final long u0;
    public final tcf X;
    public final tcf Y;
    public final hbd Z;
    public final lzf b;
    public final hi0 c;
    public final cm6 d;
    public final k18 o;
    public final t9f s0;

    static {
        z8a z8aVar = new z8a(zh0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
        u0 = new kc3(14).hashCode();
    }

    public zh0(k18 k18Var, boolean z, az3 az3Var, int i) {
        bi0 bi0Var = bi0.a;
        sh0 sh0Var = (sh0) bi0Var.getAccessor().c(552);
        lzf lzfVar = (lzf) bi0Var.getAccessor().c(8);
        hi0 hi0Var = (hi0) bi0Var.getAccessor().c(554);
        int i2 = 0;
        z = (i & 16) != 0 ? false : z;
        cm6 lVar = (i & 32) != 0 ? new l(20) : az3Var;
        this.b = lzfVar;
        this.c = hi0Var;
        this.d = lVar;
        this.o = k18Var;
        tcf tcfVarA = ucf.a(Boolean.valueOf(z));
        this.X = tcfVarA;
        hbd hbdVar = new hbd(tcfVarA);
        boolean z2 = hi0Var.e;
        hd5 hd5Var = hd5.a;
        tcf tcfVarA2 = ucf.a((z2 || hi0Var.g || hi0Var.f) ? t(z) : hd5Var);
        this.Y = tcfVarA2;
        this.Z = gw0.C(new yh0(tcfVarA2, i2), this.a, yve.a, hd5Var);
        this.s0 = c7j.c();
        int i3 = 1;
        gw0.w(new g56(new z41(new n46(new m36(new rh0(sh0Var, null), gw0.t(new m11(12, new x26[]{new gbd(sh0Var.b), new ph0(sh0Var.d, i2), new ph0(sh0Var.e, i3)}))), new er(sh0Var, (Continuation) null, i3)), hbdVar, new uh0(3, null, 0), 3), new wh0(this, k18Var, null), 1), this.a);
    }

    public final List t(boolean z) {
        o98 o98VarD = ve3.d();
        hi0 hi0Var = this.c;
        o98VarD.add(hi0Var.e ? new d14(((Boolean) this.d.invoke()).booleanValue() ? 1 : z ? 2 : 3) : null);
        o98VarD.add(hi0Var.g ? new d14(z ? 5 : 4) : null);
        o98VarD.add(hi0Var.f ? new d14(z ? 7 : 6) : null);
        List listE = ue3.E(ve3.a(o98VarD));
        if (!((ArrayList) listE).isEmpty()) {
            em6 em6VarB = u().b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (((Boolean) em6VarB.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            listE = arrayList;
        }
        return !listE.isEmpty() ? ue3.X(listE, u().a()) : listE;
    }

    public final th0 u() {
        return (th0) this.o.getValue();
    }
}
