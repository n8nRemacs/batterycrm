package defpackage;

import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class qif implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ qif(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                StickersSettingsScreen stickersSettingsScreen = this.b;
                yy7[] yy7VarArr = StickersSettingsScreen.X;
                stickersSettingsScreen.getRouter().C();
                break;
            case 1:
                StickersSettingsScreen stickersSettingsScreen2 = this.b;
                yy7[] yy7VarArr2 = StickersSettingsScreen.X;
                bjf bjfVarY0 = stickersSettingsScreen2.y0();
                int iF = ((mid) obj).f();
                String name = bjf.class.getName();
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    bjfVarY0.getClass();
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, name, "Move finish. moved:" + bjfVarY0.s0 + ", target:" + bjfVarY0.u0, null);
                    }
                }
                Long l = bjfVarY0.s0;
                Long l2 = bjfVarY0.u0;
                if (l == null || l2 == null || bjfVarY0.t0 == -1 || bjfVarY0.t0 == iF) {
                    bjfVarY0.t0 = -1;
                    bjfVarY0.s0 = null;
                    bjfVarY0.u0 = null;
                } else {
                    bjfVarY0.t0 = -1;
                    bjfVarY0.s0 = null;
                    bjfVarY0.u0 = null;
                    bjfVarY0.v0.O(bjfVarY0, bjf.A0[0], svi.d(bjfVarY0.a, ((q2b) bjfVarY0.c).b(), i84.b, new zif(bjfVarY0, l, l2, null)));
                }
                break;
            case 2:
                StickersSettingsScreen stickersSettingsScreen3 = this.b;
                h8e h8eVar = (h8e) obj;
                yy7[] yy7VarArr3 = StickersSettingsScreen.X;
                ci5 ci5Var = stickersSettingsScreen3.y0().Z;
                if (h8eVar instanceof f8e) {
                    pif pifVar = pif.c;
                    long j = ((f8e) h8eVar).a;
                    pifVar.getClass();
                    xc0.l(":stickers/set?set_id=" + j, ci5Var);
                } else if (h8eVar instanceof g8e) {
                    xfh.r(ci5Var, ((g8e) h8eVar).b);
                }
                break;
            case 3:
                StickersSettingsScreen stickersSettingsScreen4 = this.b;
                h8e h8eVar2 = (h8e) obj;
                yy7[] yy7VarArr4 = StickersSettingsScreen.X;
                bjf bjfVarY02 = stickersSettingsScreen4.y0();
                bjfVarY02.getClass();
                if (h8eVar2 instanceof f8e) {
                    o98 o98VarD = ve3.d();
                    int i = udb.k;
                    n5g n5gVar = new n5g(vdb.n);
                    Integer numValueOf = Integer.valueOf(yud.T1);
                    int i2 = w9b.T;
                    o98VarD.add(new b44(i, n5gVar, numValueOf, Integer.valueOf(i2), 4));
                    o98VarD.add(new b44(udb.l, new n5g(vdb.o), Integer.valueOf(y9b.z), Integer.valueOf(i2), 4));
                    o98VarD.add(new b44(udb.i, new n5g(vdb.f), Integer.valueOf(yud.u), Integer.valueOf(i2), 4));
                    o98VarD.add(new b44(udb.j, new n5g(vdb.m), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q), 4));
                    o98 o98VarA = ve3.a(o98VarD);
                    bjfVarY02.w0 = Long.valueOf(((f8e) h8eVar2).a);
                    xfh.r(bjfVarY02.Y, new pne(o98VarA));
                }
                break;
            default:
                StickersSettingsScreen stickersSettingsScreen5 = this.b;
                mid midVar = (mid) obj;
                yy7[] yy7VarArr5 = StickersSettingsScreen.X;
                uog.i(midVar.a, q07.LONG_PRESS);
                bt7 bt7Var = stickersSettingsScreen5.d;
                if (bt7Var != null) {
                    bt7Var.u(midVar);
                }
                break;
        }
        return qqg.a;
    }
}
