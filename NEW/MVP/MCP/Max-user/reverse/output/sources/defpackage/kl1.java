package defpackage;

import androidx.recyclerview.widget.b;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class kl1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ kl1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        final int i2 = 0;
        final CallScreen callScreen = this.b;
        switch (i) {
            case 0:
                rha rhaVar = CallScreen.N0;
                bwf bwfVar = callScreen.X;
                bsb bsbVar = (bsb) bwfVar.getValue();
                k18 k18VarC = fm1.c();
                gm1 gm1Var = gm1.a;
                qv1 qv1VarA = gm1Var.a();
                k18 k18Var = x4e.j;
                k18 k18VarB = fm1.b();
                bwf bwfVar2 = callScreen.d;
                z21 z21Var = new z21(k18VarB, (r1e) bwfVar2.getValue());
                bsb bsbVar2 = (bsb) bwfVar.getValue();
                bwf bwfVar3 = callScreen.o;
                o41 o41Var = (o41) bwfVar3.getValue();
                vl3 vl3Var = new vl3();
                vl3Var.a = bsbVar2;
                vl3Var.b = o41Var;
                vl3Var.c = mb4.m;
                vl3Var.d = new onb(cnb.e);
                vl3Var.o = n41.h;
                vl3Var.Y = ca.h;
                mr1 mr1Var = new mr1(callScreen.getContext());
                gm1Var.getAccessor().getClass();
                k18 k18VarD = fm1.d();
                return new wo1(k18VarC, bsbVar, qv1VarA, k18Var, z21Var, vl3Var, mr1Var, (ks1) gm1Var.getAccessor().c(510), (o41) bwfVar3.getValue(), (r1e) bwfVar2.getValue(), k18VarD);
            case 1:
                rha rhaVar2 = CallScreen.N0;
                e64 e64Var = new e64();
                e64Var.h = new em6() { // from class: ll1
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        qqg qqgVar = qqg.a;
                        CallScreen callScreen2 = callScreen;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i3) {
                            case 0:
                                if (!zBooleanValue) {
                                    rha rhaVar3 = CallScreen.N0;
                                } else if (!callScreen2.t0) {
                                    callScreen2.H0().y(true);
                                }
                                callScreen2.G0().c();
                                break;
                            default:
                                rha rhaVar4 = CallScreen.N0;
                                if (!zBooleanValue) {
                                    callScreen2.H0().y(false);
                                    break;
                                }
                                break;
                        }
                        return qqgVar;
                    }
                };
                final int i3 = 1;
                e64Var.i = new em6() { // from class: ll1
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        qqg qqgVar = qqg.a;
                        CallScreen callScreen2 = callScreen;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i32) {
                            case 0:
                                if (!zBooleanValue) {
                                    rha rhaVar3 = CallScreen.N0;
                                } else if (!callScreen2.t0) {
                                    callScreen2.H0().y(true);
                                }
                                callScreen2.G0().c();
                                break;
                            default:
                                rha rhaVar4 = CallScreen.N0;
                                if (!zBooleanValue) {
                                    callScreen2.H0().y(false);
                                    break;
                                }
                                break;
                        }
                        return qqgVar;
                    }
                };
                return e64Var;
            case 2:
                rha rhaVar3 = CallScreen.N0;
                return new bm1(callScreen);
            case 3:
                rha rhaVar4 = CallScreen.N0;
                return new sl1(callScreen);
            case 4:
                rha rhaVar5 = CallScreen.N0;
                return new am1(callScreen);
            case 5:
                rha rhaVar6 = CallScreen.N0;
                return new ml1(0, callScreen);
            case 6:
                rha rhaVar7 = CallScreen.N0;
                return new dg1(callScreen.G0(), (bm1) callScreen.E0.getValue(), (sl1) callScreen.F0.getValue(), (am1) callScreen.G0.getValue(), (oq1) callScreen.Y.getValue(), callScreen.H0, callScreen.A0, (pr1) callScreen.H0().Q0.getValue(), (x4h) callScreen.H0().J0.getValue(), (b) callScreen.H0().P0.getValue());
            case 7:
                rha rhaVar8 = CallScreen.N0;
                return new rl1(callScreen);
            case 8:
                rha rhaVar9 = CallScreen.N0;
                return new ql1(callScreen);
            case 9:
                rha rhaVar10 = CallScreen.N0;
                return i9j.b(callScreen.getContext());
            default:
                rha rhaVar11 = CallScreen.N0;
                return new o41(callScreen.getContext());
        }
    }
}
