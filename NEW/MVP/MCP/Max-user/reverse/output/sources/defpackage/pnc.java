package defpackage;

import android.graphics.RectF;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class pnc extends xfh {
    public static final /* synthetic */ yy7[] X0 = {new z8a(pnc.class, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, pnc.class, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;"), new z8a(pnc.class, "openCallJob", "getOpenCallJob()Lkotlinx/coroutines/Job;"), new z8a(pnc.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public final k18 A0;
    public final k18 B0;
    public final ssb C0;
    public final k18 D0;
    public final ci5 E0;
    public final ci5 F0;
    public final t9f G0;
    public final t9f H0;
    public final t9f I0;
    public final t9f J0;
    public final Object K0;
    public final Object L0;
    public final Object M0;
    public final tcf N0;
    public final hbd O0;
    public final tcf P0;
    public final hbd Q0;
    public final tcf R0;
    public final hbd S0;
    public final yac T0;
    public final AtomicReference U0;
    public final k18 V0;
    public boolean W0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final pdc c;
    public final kj1 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;

    public pnc(long j, pdc pdcVar, boolean z, i5i i5iVar, kj1 kj1Var) {
        yac bu2Var;
        fdc fdcVar = fdc.a;
        bwf bwfVarD = fdcVar.getAccessor().d(526);
        this.b = j;
        this.c = pdcVar;
        this.d = kj1Var;
        String name = pnc.class.getName();
        k18 k18VarD = fdcVar.d();
        this.o = fdcVar.b();
        this.X = fdcVar.getAccessor().d(254);
        this.Y = fdcVar.getAccessor().d(108);
        this.Z = fdcVar.getAccessor().d(186);
        this.s0 = fdcVar.e();
        bwf bwfVarD2 = fdcVar.getAccessor().d(605);
        this.t0 = bwfVarD2;
        this.u0 = fdcVar.getAccessor().d(10);
        this.v0 = fdcVar.c();
        this.w0 = fdcVar.getAccessor().d(47);
        this.x0 = fdcVar.f();
        this.y0 = fdcVar.getAccessor().d(111);
        this.z0 = fdcVar.getAccessor().d(140);
        this.A0 = bwfVarD;
        this.B0 = fdcVar.getAccessor().d(142);
        this.C0 = new ssb((dd) fdcVar.getAccessor().c(88), 2, (pb3) fdcVar.getAccessor().c(46));
        this.D0 = fdcVar.getAccessor().d(84);
        this.E0 = new ci5(0);
        this.F0 = new ci5(0);
        this.G0 = c7j.c();
        this.H0 = c7j.c();
        this.I0 = c7j.c();
        this.J0 = c7j.c();
        this.K0 = ipi.b(3, new hdc(14));
        this.L0 = ipi.b(3, new hdc(15));
        this.M0 = ipi.b(3, new hdc(16));
        hd5 hd5Var = hd5.a;
        tcf tcfVarA = ucf.a(hd5Var);
        this.N0 = tcfVarA;
        this.O0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(hd5Var);
        this.P0 = tcfVarA2;
        this.Q0 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(null);
        this.R0 = tcfVarA3;
        this.S0 = new hbd(tcfVarA3);
        this.U0 = new AtomicReference();
        this.V0 = fdcVar.getAccessor().d(12);
        wqi.c(name, "inited by " + pdcVar + ":#" + j, new Object[0]);
        int iOrdinal = pdcVar.ordinal();
        if (iOrdinal == 0) {
            pb2 pb2Var = (pb2) v().j(j).a.getValue();
            ku3 ku3VarN = pb2Var != null ? pb2Var.n() : null;
            if (pb2Var == null || !pb2Var.K()) {
                bu2Var = (pb2Var == null || !pb2Var.Q() || ku3VarN == null) ? new bu2(j, this.a, i5iVar) : new j04(ku3VarN.p(), this.a, z);
            } else {
                if (ku3VarN == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bu2Var = new bs0(ku3VarN.p(), this.a);
            }
        } else if (iOrdinal == 1) {
            bu2Var = new hfe(j);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ku3 ku3Var = (ku3) ((l24) ((bwf) k18VarD).getValue()).c(j).a.getValue();
            bu2Var = (ku3Var == null || !ku3Var.v()) ? new j04(j, this.a, z) : new bs0(j, this.a);
        }
        this.T0 = bu2Var;
        gw0.w(gw0.u(new g56(new d53(bu2Var.f, 12), new tmc(this, null), 1), ((q2b) x()).a()), this.a);
        ohc ohcVar = (ohc) bwfVarD2.getValue();
        ohcVar.a.d(ohcVar);
        gw0.w(new g56(new gbd(((ohc) bwfVarD2.getValue()).b), new umc(this, null), 1), this.a);
    }

    public final void A(String str, RectF rectF) {
        svi.e(this.a, ((q2b) x()).b().plus(w()), null, new fnc(this, str, rectF, null), 2);
    }

    public final void B(boolean z) {
        uid uidVar = new uid();
        yac yacVar = this.T0;
        pdc pdcVarL = yacVar.l();
        if (pdcVarL == null) {
            return;
        }
        uidVar.a = pdcVarL;
        tid tidVar = new tid();
        tidVar.a = yacVar.m();
        x9f x9fVarO = xfh.o(this, null, new inc(uidVar, tidVar, this, z, null), 1);
        this.I0.O(this, X0[2], x9fVarO);
    }

    public final void C(int i, String str, i88 i88Var) {
        String str2;
        yac yacVar = this.T0;
        char c = 4;
        char c2 = yacVar.p() ? (char) 4 : yacVar instanceof bs0 ? (char) 2 : yacVar.r() ? (char) 1 : (char) 3;
        long jM = yacVar.m();
        ssb ssbVar = this.C0;
        dd ddVar = (dd) ssbVar.b;
        int iV = az1.v(ooi.b(str) ? 3 : ooi.c(str) ? 2 : 1);
        if (iV != 0) {
            if (iV == 1) {
                c = 3;
            } else {
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c = 2;
            }
        } else if (i88Var != i88.o) {
            c = 1;
        }
        int i2 = 1;
        if (c != 1) {
            i2 = 2;
            if (c != 2) {
                i2 = 3;
                if (c != 3) {
                    i2 = 4;
                    if (c != 4) {
                        throw null;
                    }
                }
            }
        }
        imb imbVar = new imb("element_type", Integer.valueOf(i2));
        imb imbVar2 = new imb("source_id", Long.valueOf(jM));
        int i3 = 1;
        if (c2 != 1) {
            i3 = 2;
            if (c2 != 2) {
                i3 = 3;
                if (c2 != 3) {
                    i3 = 4;
                    if (c2 != 4) {
                        throw null;
                    }
                }
            }
        }
        Map mapJ = to8.j(imbVar, imbVar2, new imb("source_type", Integer.valueOf(i3)));
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "CHAT_PROFILE_CLICKABLE_ELEMENT_ACTIONS";
        if (i == 1) {
            str2 = "clicked_clickable_element";
        } else if (i == 2) {
            str2 = "clicked_open_context_menu";
        } else if (i == 3) {
            str2 = "clicked_copy";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "clicked_in_context_menu";
        }
        xp7Var.d = str2;
        pb3 pb3Var = (pb3) ssbVar.c;
        xp7Var.b = ((w4e) pb3Var).s();
        xp7Var.c(mapJ);
        xp7Var.o = ((pe8) pb3Var).K();
        ddVar.h(xp7Var.d());
    }

    public final void D() {
        if (!((qsb) this.u0.getValue()).c(qsb.m)) {
            xfh.r(this.E0, cmc.a);
            return;
        }
        svi.e(this.a, ((q2b) x()).b().plus(w()), null, new lnc(this, null), 2);
    }

    public final void E() {
        this.U0.set(null);
        xfh.r(this.E0, new kmc(new n5g(x8b.b0), Integer.valueOf(yud.J)));
    }

    public final void F(boolean z) {
        xfh.r(this.E0, new emc(new n5g(z ? mvd.y : mvd.z), new smc(this, z, 1)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    public final void G() {
        fmc fmcVar;
        fmc fmcVar2;
        bbc bbcVar = (bbc) this.R0.getValue();
        CharSequence charSequence = bbcVar != null ? bbcVar.e : null;
        if (charSequence == null) {
            charSequence = "";
        }
        int iK = this.T0.k();
        if (iK == 0) {
            return;
        }
        mcc mccVar = (mcc) this.L0.getValue();
        mccVar.getClass();
        int iV = az1.v(iK);
        if (iV != 0) {
            if (iV == 1) {
                n5g n5gVar = new n5g(x8b.O0);
                n5g n5gVar2 = new n5g(x8b.P0);
                o98 o98VarD = ve3.d();
                o98VarD.add(new pq3(v8b.C, new n5g(x8b.N0), 1, 56));
                o98VarD.add(mccVar.b());
                fmcVar2 = new fmc(n5gVar, n5gVar2, ve3.a(o98VarD), null);
            } else if (iV == 2) {
                n5g n5gVar3 = new n5g(x8b.M0);
                n5g n5gVar4 = new n5g(x8b.L0);
                o98 o98VarD2 = ve3.d();
                o98VarD2.add(new pq3(v8b.q, new n5g(x8b.k0), 1, 56));
                o98VarD2.add(new pq3(v8b.B, new n5g(x8b.K0), 1, 56));
                o98VarD2.add(mccVar.b());
                fmcVar2 = new fmc(n5gVar3, n5gVar4, ve3.a(o98VarD2), null);
            } else {
                if (iV != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fmcVar = mccVar.c();
            }
            fmcVar = fmcVar2;
        } else {
            p5g p5gVar = new p5g(x8b.Q0, ys.D(new Object[]{charSequence}));
            o98 o98VarD3 = ve3.d();
            o98VarD3.add(new pq3(v8b.q, new n5g(x8b.k0), 1, 56));
            o98VarD3.add(new pq3(v8b.C, new n5g(x8b.N0), 1, 56));
            o98VarD3.add(mccVar.b());
            fmcVar = new fmc(p5gVar, null, ve3.a(o98VarD3), null);
        }
        xfh.r(this.E0, fmcVar);
    }

    public final void H(boolean z) {
        xfh.r(this.E0, new emc(new n5g(z ? x8b.p0 : x8b.r0), new smc(this, z, 0)));
    }

    public final void I(boolean z) {
        xfh.r(this.E0, new emc(new n5g(z ? mvd.Z1 : mvd.a2), new smc(this, z, 2)));
    }

    public final void J() {
        svi.d(this.a, ((q2b) x()).b().plus(bia.a).plus(w()), i84.c, new nnc(this, null));
    }

    @Override // defpackage.xfh
    public final void s() {
        this.T0.d();
        ohc ohcVar = (ohc) this.t0.getValue();
        ohcVar.a.f(ohcVar);
        yy7[] yy7VarArr = X0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.G0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
        yy7 yy7Var2 = yy7VarArr[1];
        t9f t9fVar2 = this.H0;
        qt7 qt7Var2 = (qt7) t9fVar2.D(this, yy7Var2);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        t9fVar2.O(this, yy7VarArr[1], null);
    }

    public final void t(boolean z) {
        Long lI = this.T0.i();
        if (lI != null) {
            xfh.r(this.E0, new emc(new n5g(x8b.D0), new rmc(this, lI.longValue(), z, 0)));
        }
    }

    public final void u() {
        Long lI;
        if (this.W0 || (lI = this.T0.i()) == null) {
            return;
        }
        long jLongValue = lI.longValue();
        this.W0 = true;
        svi.d(this.a, ((q2b) x()).b().plus(bia.a), i84.c, new ymc(this, jLongValue, null));
    }

    public final w63 v() {
        return (w63) this.o.getValue();
    }

    public final a84 w() {
        return (a84) this.D0.getValue();
    }

    public final lzf x() {
        return (lzf) this.s0.getValue();
    }

    public final void y(String str) {
        x9f x9fVarD = svi.d(this.a, ((q2b) x()).b().plus(w()), i84.b, new bnc(this, str, null));
        this.J0.O(this, X0[3], x9fVarD);
    }

    public final void z(String str, i88 i88Var) {
        int iOrdinal = i88Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 4) {
                String strA = ((j98) this.B0.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                y(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        y(str);
    }
}
