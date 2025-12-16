package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class ki8 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni8 b;

    public /* synthetic */ ki8(ni8 ni8Var, int i) {
        this.a = i;
        this.b = ni8Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        qqg qqgVar = qqg.a;
        ni8 ni8Var = this.b;
        switch (i) {
            case 0:
                ve2 ve2Var = (ve2) ni8Var.d.getValue();
                ve2Var.p();
                ve2Var.p0("clear", new i62(5, new ae2(ve2Var, i2)));
                return qqgVar;
            case 1:
                ps5 ps5Var = (ps5) ni8Var.t.getValue();
                ps5Var.getClass();
                wqi.c("ps5", "clear: ", new Object[0]);
                js5 js5Var = (js5) ps5Var.Y.get();
                js5Var.getClass();
                wqi.c("js5", "cancelRequests: ", new Object[0]);
                js5Var.f.clear();
                js5Var.g.d();
                ps5Var.Z.d();
                azi.b(new ik3(((kr5) ps5Var.a.get()).a(), 2, new er5(1)).i(), pdf.e, new er5(29), new yl4(4));
                return qqgVar;
            default:
                k18 k18Var = ni8Var.i;
                ie4 ie4Var = (ie4) k18Var.getValue();
                q9b q9bVar = ie4Var.a;
                try {
                    wqi.c("ie4", "deleteAllExceptStats start", new Object[0]);
                    ((OneMeRoomDatabase) q9bVar.l()).c();
                    lq9 lq9VarD = ie4Var.c.d();
                    lrd lrdVar = lq9VarD.a;
                    lrdVar.b();
                    hq9 hq9Var = lq9VarD.t;
                    vk6 vk6VarA = hq9Var.a();
                    try {
                        lrdVar.c();
                        try {
                            vk6VarA.w();
                            lrdVar.q();
                            hq9Var.r(vk6VarA);
                            ie4Var.b.b();
                            m14 m14VarR = ie4Var.d.r();
                            lrd lrdVar2 = m14VarR.a;
                            lrdVar2.c();
                            try {
                                m14.a(m14VarR);
                                lrdVar2.q();
                                lrdVar2.k();
                                ie4Var.e.a();
                                d3g d3gVarB = ie4Var.f.b();
                                lrd lrdVar3 = d3gVarB.a;
                                lrdVar3.b();
                                crd crdVar = d3gVarB.h;
                                vk6 vk6VarA2 = crdVar.a();
                                try {
                                    lrdVar3.c();
                                    try {
                                        vk6VarA2.w();
                                        lrdVar3.q();
                                        crdVar.r(vk6VarA2);
                                        tgf tgfVar = (tgf) ((bwf) ie4Var.h.c).getValue();
                                        lrd lrdVar4 = tgfVar.a;
                                        lrdVar4.b();
                                        crd crdVar2 = tgfVar.c;
                                        vk6 vk6VarA3 = crdVar2.a();
                                        try {
                                            lrdVar4.c();
                                            try {
                                                vk6VarA3.w();
                                                lrdVar4.q();
                                                crdVar2.r(vk6VarA3);
                                                ie4Var.u.d();
                                                try {
                                                    ie4Var.k.clear().a();
                                                } catch (Throwable unused) {
                                                }
                                                try {
                                                    new ik3(ie4Var.p.a.w().h(new vef(12)), 2, new vef(11)).a();
                                                } catch (Throwable unused2) {
                                                }
                                                ((OneMeRoomDatabase) q9bVar.l()).v().a();
                                                ((OneMeRoomDatabase) q9bVar.l()).q();
                                            } finally {
                                                lrdVar4.k();
                                            }
                                        } catch (Throwable th) {
                                            crdVar2.r(vk6VarA3);
                                            throw th;
                                        }
                                    } finally {
                                        lrdVar3.k();
                                    }
                                } catch (Throwable th2) {
                                    crdVar.r(vk6VarA2);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                lrdVar2.k();
                                throw th3;
                            }
                        } finally {
                            lrdVar.k();
                        }
                    } catch (Throwable th4) {
                        hq9Var.r(vk6VarA);
                        throw th4;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                gu5 gu5Var = (gu5) ((rt5) ni8Var.y.getValue());
                if (!((Boolean) gu5Var.M.D(gu5Var, gu5.S[27])).booleanValue()) {
                    ie4 ie4Var2 = (ie4) k18Var.getValue();
                    ie4Var2.getClass();
                    try {
                        ie4Var2.a.close();
                    } catch (Throwable th5) {
                        wqi.e("ie4", "Got error during closing database", th5);
                    }
                }
                return qqgVar;
        }
    }
}
