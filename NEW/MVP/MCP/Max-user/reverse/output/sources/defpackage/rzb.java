package defpackage;

import android.net.Uri;
import android.view.View;
import one.me.chatscreen.ChatScreen;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class rzb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ rzb(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zqg zqgVar;
        zqg zqgVar2;
        x0c x0cVar;
        int i = this.a;
        ei4 ei4VarL0 = null;
        PinBarsWidget pinBarsWidget = this.b;
        switch (i) {
            case 0:
                int i2 = PinBarsWidget.u0;
                qzb qzbVarY0 = pinBarsWidget.y0();
                Object parentController = pinBarsWidget.getParentController();
                tzb tzbVar = parentController instanceof tzb ? (tzb) parentController : null;
                int iQ0 = tzbVar != null ? ((ChatScreen) tzbVar).Q0() : 0;
                x0c x0cVar2 = qzbVarY0.o;
                if (x0cVar2 != null) {
                    x9f x9fVar = x0cVar2.g;
                    if (x9fVar == null || !x9fVar.isActive()) {
                        x0cVar2.g = svi.e(x0cVar2.d, ((q2b) x0cVar2.b).b(), null, new w0c(x0cVar2, iQ0, null), 2);
                        break;
                    }
                }
                break;
            case 1:
                int i3 = PinBarsWidget.u0;
                qzb qzbVarY02 = pinBarsWidget.y0();
                Object parentController2 = pinBarsWidget.getParentController();
                tzb tzbVar2 = parentController2 instanceof tzb ? (tzb) parentController2 : null;
                int iQ02 = tzbVar2 != null ? ((ChatScreen) tzbVar2).Q0() : 0;
                crg crgVar = qzbVarY02.X;
                if (crgVar != null && (zqgVar = (zqg) crgVar.i.a.getValue()) != null) {
                    svi.e(crgVar.a, ((q2b) crgVar.c).b(), null, new arg(crgVar, zqgVar.a, null), 2);
                    crgVar.h.setValue(null);
                    ccb ccbVar = (ccb) crgVar.f.getValue();
                    ccbVar.c(new kcb(0, 0, iQ02, 3));
                    ccbVar.e(new qcb(yud.A));
                    ccbVar.g(new n5g(m8b.g));
                    ccbVar.i();
                    break;
                }
                break;
            case 2:
                int i4 = PinBarsWidget.u0;
                crg crgVar2 = pinBarsWidget.y0().X;
                if (crgVar2 != null && (zqgVar2 = (zqg) crgVar2.i.a.getValue()) != null) {
                    svi.e(crgVar2.a, ((q2b) crgVar2.c).b(), null, new brg(crgVar2, zqgVar2.a, null), 2);
                    crgVar2.h.setValue(null);
                    break;
                }
                break;
            case 3:
                int i5 = PinBarsWidget.u0;
                qk7 qk7Var = pinBarsWidget.y0().B0;
                if (qk7Var != null) {
                    svi.e(qk7Var.a, null, null, new mk7(qk7Var, null), 3);
                    break;
                }
                break;
            case 4:
                int i6 = PinBarsWidget.u0;
                qk7 qk7Var2 = pinBarsWidget.y0().B0;
                if (qk7Var2 != null) {
                    String str = qk7Var2.i;
                    if (str != null) {
                        qk7Var2.l.h(new wk7(Uri.parse(str)));
                    }
                    svi.e(qk7Var2.a, null, null, new lk7(qk7Var2, null), 3);
                    break;
                }
                break;
            case 5:
                int i7 = PinBarsWidget.u0;
                qzb qzbVarY03 = pinBarsWidget.y0();
                ozb ozbVar = qzbVarY03.b;
                Long l = ozbVar.c;
                if (l != null && (x0cVar = qzbVarY03.o) != null) {
                    long jLongValue = l.longValue();
                    boolean z = ozbVar.d == 1;
                    Object value = x0cVar.h.getValue();
                    b1c b1cVar = value instanceof b1c ? (b1c) value : null;
                    if (b1cVar != null) {
                        long j = b1cVar.a;
                        k0c.c.getClass();
                        ei4VarL0 = k0c.L0(jLongValue, j, z);
                    }
                    if (ei4VarL0 != null) {
                        xfh.r(qzbVarY03.E0, ei4VarL0);
                        break;
                    }
                }
                break;
            case 6:
                int i8 = PinBarsWidget.u0;
                qzb qzbVarY04 = pinBarsWidget.y0();
                ((h49) ((e5c) qzbVarY04.d.getValue())).b();
                qzbVarY04.x0.b();
                qzbVarY04.Z.f();
                ncg ncgVar = pinBarsWidget.a;
                if (ncgVar != null) {
                    ncgVar.dismiss();
                }
                pinBarsWidget.a = null;
                break;
            case 7:
                int i9 = PinBarsWidget.u0;
                pinBarsWidget.y0().x0.a();
                break;
            default:
                int i10 = PinBarsWidget.u0;
                qzb qzbVarY05 = pinBarsWidget.y0();
                ei4 ei4VarC = ((d4c) qzbVarY05.x0.d).c();
                if (ei4VarC != null) {
                    xfh.r(qzbVarY05.E0, ei4VarC);
                    break;
                }
                break;
        }
    }
}
