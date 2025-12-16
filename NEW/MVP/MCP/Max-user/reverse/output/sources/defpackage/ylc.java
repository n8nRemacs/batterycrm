package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ylc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ amc b;

    public /* synthetic */ ylc(amc amcVar, int i) {
        this.a = i;
        this.b = amcVar;
    }

    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.lang.Object, k18] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i;
        pb2 pb2Var;
        String str;
        fmc fmcVar;
        fmc fmcVarC;
        switch (this.a) {
            case 0:
                pnc pncVarD0 = ((ProfileScreen) this.b.o).D0();
                yac yacVar = pncVarD0.T0;
                String strH = yacVar.h();
                if (strH != null) {
                    if (yacVar instanceof bs0) {
                        Long lI = yacVar.i();
                        i = (lI == null || (pb2Var = (pb2) pncVarD0.v().j(lI.longValue()).a.getValue()) == null || !pb2Var.c0((rt5) pncVarD0.x0.getValue())) ? avd.j : avd.i;
                    } else {
                        i = avd.m;
                    }
                    xfh.r(pncVarD0.E0, new bmc(new p5g(i, ys.D(new Object[]{strH}))));
                }
                return qqg.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                ProfileScreen profileScreen = (ProfileScreen) this.b.o;
                profileScreen.getClass();
                if (iIntValue == v8b.k) {
                    profileScreen.D0().B(false);
                } else if (iIntValue == v8b.w1) {
                    profileScreen.D0().B(true);
                } else if (iIntValue == v8b.s1) {
                    pnc pncVarD02 = profileScreen.D0();
                    Long lI2 = pncVarD02.T0.i();
                    if (lI2 != null) {
                        xfh.r(pncVarD02.F0, new ykc(lI2.longValue()));
                    }
                } else if (iIntValue == v8b.c1) {
                    pnc pncVarD03 = profileScreen.D0();
                    ci5 ci5Var = pncVarD03.E0;
                    mcc mccVar = (mcc) pncVarD03.L0.getValue();
                    mccVar.getClass();
                    n5g n5gVar = new n5g(x8b.v2);
                    o98 o98VarD = ve3.d();
                    o98VarD.add(new pq3(v8b.Y0, new n5g(x8b.x2), 3, 56));
                    o98VarD.add(new pq3(v8b.Z0, new n5g(x8b.y2), 3, 56));
                    o98VarD.add(new pq3(v8b.X0, new n5g(x8b.w2), 3, 56));
                    o98VarD.add(new pq3(v8b.a1, new n5g(x8b.z2), 1, 56));
                    o98VarD.add(mccVar.b());
                    xfh.r(ci5Var, new fmc(n5gVar, null, ve3.a(o98VarD), null));
                } else if (iIntValue == v8b.b1) {
                    pnc pncVarD04 = profileScreen.D0();
                    Long lI3 = pncVarD04.T0.i();
                    if (lI3 != null) {
                        long jLongValue = lI3.longValue();
                        ve2 ve2VarI = pncVarD04.v().i();
                        pb2 pb2VarM = ve2VarI.M(jLongValue);
                        if (pb2VarM != null) {
                            ve2VarI.v(pb2VarM, 0L);
                            ((hwa) ve2VarI.q.get()).m(pb2VarM.a);
                        }
                        xfh.r(pncVarD04.E0, new kmc(new n5g(mvd.O0), Integer.valueOf(yud.A)));
                    }
                } else if (iIntValue == v8b.u1) {
                    pnc pncVarD05 = profileScreen.D0();
                    svi.e(pncVarD05.a, ((q2b) pncVarD05.x()).a(), null, new jnc(pncVarD05, null), 2);
                } else if (iIntValue == v8b.t1) {
                    pnc pncVarD06 = profileScreen.D0();
                    svi.e(pncVarD06.a, ((q2b) pncVarD06.x()).b().plus(pncVarD06.w()), null, new mnc(pncVarD06, null), 2);
                } else if (iIntValue == v8b.v1) {
                    pnc pncVarD07 = profileScreen.D0();
                    svi.e(pncVarD07.a, ((q2b) pncVarD07.x()).b(), null, new onc(pncVarD07, null), 2);
                } else if (iIntValue == v8b.L0) {
                    pnc pncVarD08 = profileScreen.D0();
                    Long lJ = pncVarD08.T0.j();
                    if (lJ != null) {
                        xfh.r(pncVarD08.F0, new mkc(lJ.longValue()));
                    }
                } else {
                    if (iIntValue == v8b.N0) {
                        pnc pncVarD09 = profileScreen.D0();
                        yac yacVar2 = pncVarD09.T0;
                        yacVar2.getClass();
                        if (yacVar2 instanceof bs0) {
                            pncVarD09.t(false);
                        } else {
                            bbc bbcVar = (bbc) pncVarD09.R0.getValue();
                            Object obj2 = bbcVar != null ? bbcVar.e : null;
                            str = obj2 != null ? obj2 : "";
                            int iK = yacVar2.k();
                            if (iK != 0) {
                                ci5 ci5Var2 = pncVarD09.E0;
                                mcc mccVar2 = (mcc) pncVarD09.L0.getValue();
                                boolean zQ = yacVar2.q();
                                mccVar2.getClass();
                                int iV = az1.v(iK);
                                if (iV == 0) {
                                    p5g p5gVar = new p5g(x8b.F0, ys.D(new Object[]{str}));
                                    o98 o98VarD2 = ve3.d();
                                    o98VarD2.add(new pq3(v8b.y, new n5g(x8b.B0), 1, 56));
                                    if (zQ) {
                                        o98VarD2.add(new pq3(v8b.x, new n5g(x8b.A0), 1, 56));
                                    }
                                    o98VarD2.add(mccVar2.b());
                                    fmcVar = new fmc(p5gVar, null, ve3.a(o98VarD2), null);
                                } else if (iV == 1) {
                                    n5g n5gVar2 = new n5g(x8b.C0);
                                    p5g p5gVar2 = new p5g(x8b.E0, ys.D(new Object[]{str}));
                                    o98 o98VarD3 = ve3.d();
                                    o98VarD3.add(new pq3(v8b.y, new n5g(x8b.B0), 1, 56));
                                    o98VarD3.add(mccVar2.b());
                                    fmcVar = new fmc(n5gVar2, p5gVar2, ve3.a(o98VarD3), null);
                                } else if (iV == 2) {
                                    n5g n5gVar3 = new n5g(x8b.z0);
                                    n5g n5gVar4 = new n5g(x8b.y0);
                                    o98 o98VarD4 = ve3.d();
                                    o98VarD4.add(new pq3(v8b.x, new n5g(x8b.A0), 1, 56));
                                    o98VarD4.add(mccVar2.b());
                                    fmcVar = new fmc(n5gVar3, n5gVar4, ve3.a(o98VarD4), null);
                                } else {
                                    if (iV != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fmcVarC = mccVar2.c();
                                    xfh.r(ci5Var2, fmcVarC);
                                }
                                fmcVarC = fmcVar;
                                xfh.r(ci5Var2, fmcVarC);
                            }
                        }
                    } else if (iIntValue == v8b.U0) {
                        pnc pncVarD010 = profileScreen.D0();
                        Long lI4 = pncVarD010.T0.i();
                        if (lI4 != null) {
                            long jLongValue2 = lI4.longValue();
                            ci5 ci5Var3 = pncVarD010.F0;
                            kkc.c.getClass();
                            xc0.l(":complaint?ids=" + jLongValue2, ci5Var3);
                        }
                    } else if (iIntValue == v8b.M0) {
                        pnc pncVarD011 = profileScreen.D0();
                        bbc bbcVar2 = (bbc) pncVarD011.R0.getValue();
                        Object obj3 = bbcVar2 != null ? bbcVar2.e : null;
                        str = obj3 != null ? obj3 : "";
                        ci5 ci5Var4 = pncVarD011.E0;
                        mcc mccVar3 = (mcc) pncVarD011.L0.getValue();
                        mccVar3.getClass();
                        p5g p5gVar3 = new p5g(x8b.a0, ys.D(new Object[]{str}));
                        n5g n5gVar5 = new n5g(x8b.Z);
                        o98 o98VarD5 = ve3.d();
                        o98VarD5.add(new pq3(v8b.l, new n5g(x8b.Y), 1, 56));
                        o98VarD5.add(mccVar3.b());
                        xfh.r(ci5Var4, new fmc(p5gVar3, n5gVar5, ve3.a(o98VarD5), null));
                    } else {
                        int i2 = v8b.O0;
                        if (iIntValue == i2) {
                            profileScreen.D0().G();
                        } else if (iIntValue == v8b.V0) {
                            profileScreen.D0().I(false);
                        } else if (iIntValue == v8b.W0) {
                            profileScreen.D0().I(true);
                        } else if (iIntValue == v8b.Q0) {
                            profileScreen.D0().F(false);
                        } else if (iIntValue == v8b.R0) {
                            profileScreen.D0().F(true);
                        } else if (iIntValue == v8b.P0 || iIntValue == i2) {
                            yac yacVar3 = profileScreen.D0().T0;
                            yacVar3.getClass();
                            if (yacVar3 instanceof bs0) {
                                profileScreen.D0().H(false);
                            } else {
                                profileScreen.D0().G();
                            }
                        } else if (iIntValue == v8b.T0 || iIntValue == v8b.S0) {
                            pnc pncVarD012 = profileScreen.D0();
                            lmc lmcVarY = pncVarD012.T0.y();
                            if (lmcVarY != null) {
                                xfh.r(pncVarD012.E0, lmcVarY);
                            }
                        }
                    }
                }
                return qqg.a;
        }
    }
}
