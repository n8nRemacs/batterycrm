package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class tq6 extends xfh {
    public static final /* synthetic */ int Q0 = 0;
    public final tcf A0;
    public final hbd B0;
    public final pv0 C0;
    public final o92 D0;
    public final dce E0;
    public boolean F0;
    public x9f G0;
    public x9f H0;
    public final k18 I0;
    public final vp6 J0;
    public x9f K0;
    public final wp6 L0;
    public final kq6 M0;
    public final tcf N0;
    public final bwf O0;
    public final ci5 P0;
    public final mp6 X;
    public final k18 Y;
    public final k18 Z;
    public final xo6 b;
    public final Context c;
    public final a84 d;
    public final de8 o;
    public final k18 s0;
    public final tcf t0;
    public final tcf u0;
    public final tcf v0;
    public final y83 w0;
    public qp6 x0;
    public final tcf y0;
    public final tcf z0;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, vp6] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, wp6] */
    public tq6(xo6 xo6Var, Context context, a84 a84Var, sd8 sd8Var, de8 de8Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, mp6 mp6Var) {
        this.b = xo6Var;
        this.c = context;
        this.d = a84Var;
        this.o = de8Var;
        this.X = mp6Var;
        this.Y = k18Var3;
        this.Z = k18Var2;
        this.s0 = k18Var4;
        hd5 hd5Var = hd5.a;
        this.t0 = ucf.a(hd5Var);
        Boolean bool = Boolean.FALSE;
        this.u0 = ucf.a(bool);
        tcf tcfVarA = ucf.a(hd5Var);
        this.v0 = tcfVarA;
        this.w0 = new y83(tcfVarA, 10, this);
        this.x0 = dwa.a(context);
        tcf tcfVarA2 = ucf.a(bool);
        this.y0 = tcfVarA2;
        this.z0 = tcfVarA2;
        tcf tcfVarA3 = ucf.a(null);
        this.A0 = tcfVarA3;
        this.B0 = new hbd(tcfVarA3);
        int i = 0;
        pv0 pv0VarA = gzi.a(-2, 0, 6);
        this.C0 = pv0VarA;
        this.D0 = new o92(pv0VarA);
        dce dceVar = sd8Var.f;
        this.E0 = dceVar;
        this.I0 = k18Var;
        ?? r11 = new ace() { // from class: vp6
            @Override // defpackage.ace
            public final void R(fce fceVar) {
                tq6 tq6Var = this.a;
                xfh.o(tq6Var, ((q2b) tq6Var.v()).f().plus(tq6Var.d), new lq6(tq6Var, fceVar, null), 2);
            }
        };
        this.J0 = r11;
        ?? r12 = new bce() { // from class: wp6
            @Override // defpackage.bce
            public final void X(Set set) {
                tq6 tq6Var = this.a;
                tq6Var.u0.m(null, Boolean.valueOf(set.size() >= 100));
                wqi.c("tq6", "onSelectedMediasChangeListener(), selectedCount " + set.size(), new Object[0]);
                if (set.isEmpty()) {
                    tq6.u(tq6Var, 1);
                } else {
                    x9f x9fVar = tq6Var.K0;
                    if (x9fVar != null) {
                        x9fVar.cancel((CancellationException) null);
                    }
                    tq6Var.K0 = xfh.o(tq6Var, tq6Var.d, new nq6(tq6Var, set, null), 2);
                }
                xfh.r(tq6Var.X.c, new gp6(pqi.b(tq6Var.E0)));
            }
        };
        this.L0 = r12;
        kq6 kq6Var = new kq6(this);
        this.M0 = kq6Var;
        this.N0 = ucf.a(null);
        bwf bwfVar = new bwf(new e44(22, this));
        this.O0 = bwfVar;
        ci5 ci5Var = new ci5(0);
        this.P0 = ci5Var;
        ContextScope contextScope = this.a;
        bj7 bj7Var = (bj7) de8Var;
        x9f x9fVar = bj7Var.x0;
        int i2 = 1;
        if (x9fVar == null || !x9fVar.isCompleted()) {
            bj7Var.e();
        }
        wqi.c("tq6", "init", new Object[0]);
        gw0.w(gw0.u(new g56(new dq6(xo6Var.b ? bj7Var.Y : bj7Var.t0, this, i), new fq6(this, null), 1), ((q2b) v()).f()), d7j.i(contextScope, a84Var));
        gw0.w(gw0.u(new g56(new dq6(bj7Var.v0, this, i2), new gq6(this, null), 1), ((q2b) v()).a()), d7j.i(contextScope, a84Var));
        if (xo6Var.c) {
            dceVar.c.add(r12);
            dceVar.e.add(kq6Var);
            dceVar.f.add(r11);
            dceVar.l.add((xp6) bwfVar.getValue());
        }
        gw0.w(new g56(obj.c(ci5Var), new hq6(this, null), 1), d7j.i(contextScope, a84Var));
    }

    public static final Object t(tq6 tq6Var, List list, q44 q44Var) {
        return svi.i(((q2b) tq6Var.v()).f(), new rq6(tq6Var, list, null), q44Var);
    }

    public static void u(tq6 tq6Var, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        tq6Var.getClass();
        wqi.c("tq6", "clearSelections()", new Object[0]);
        if (z2) {
            dce dceVar = tq6Var.E0;
            dceVar.a.clear();
            dceVar.n();
            dceVar.b.clear();
            if (dceVar.h.g.getBoolean("app.send.media.as.collage", true)) {
                dceVar.k = 3;
            } else {
                dceVar.k = 1;
            }
        }
        xfh.o(tq6Var, ((q2b) tq6Var.v()).f().plus(tq6Var.d), new yp6(tq6Var, z, null), 2);
        xfh.r(tq6Var.X.c, new gp6(hd5.a));
    }

    @Override // defpackage.xfh
    public final void s() {
        wqi.c("tq6", "onCleared()", new Object[0]);
        kq6 kq6Var = this.M0;
        dce dceVar = this.E0;
        dceVar.e.remove(kq6Var);
        dceVar.f.remove(this.J0);
        dceVar.c.remove(this.L0);
        dceVar.l.remove((xp6) this.O0.getValue());
        ConcurrentHashMap concurrentHashMap = ((bj7) this.o).z0;
        for (uo6 uo6Var : concurrentHashMap.keySet()) {
            if (uo6Var instanceof po6) {
                concurrentHashMap.put(uo6Var, hd5.a);
            }
        }
    }

    public final lzf v() {
        return (lzf) this.Y.getValue();
    }

    public final int w(vd8 vd8Var) {
        return this.E0.g(nqi.b(vd8Var));
    }

    public final int x(vd8 vd8Var, boolean z) {
        wqi.c("tq6", "onItemSelect: " + vd8Var, new Object[0]);
        this.F0 = true;
        pd8 pd8VarB = nqi.b(vd8Var);
        dce dceVar = this.E0;
        int iG = dceVar.g(pd8VarB);
        if (iG == 0 && ((Boolean) this.u0.getValue()).booleanValue()) {
            return 0;
        }
        l5c l5cVar = (l5c) ((age) this.s0.getValue());
        l5cVar.getClass();
        int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
        mp6 mp6Var = this.X;
        if (((Boolean) mp6Var.b.invoke()).booleanValue() && iG == 0 && dceVar.b() >= iM) {
            xfh.r(mp6Var.c, new ip6(iM));
            return 0;
        }
        if (z) {
            dceVar.r(pd8VarB);
        }
        xfh.o(this, ((q2b) v()).f().plus(this.d), new jq6(this, null), 2);
        this.F0 = false;
        return dceVar.g(nqi.b(vd8Var));
    }
}
