package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* loaded from: classes.dex */
public final class iu1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Boolean bool = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) obj2;
                callWaitingRoomEventsWidget.A0(((zt1) ((cu1) obj)).d);
                ug1.c.p0().b(":call-opponents-list?arg_key_scope_id=".concat(callWaitingRoomEventsWidget.getB()), null);
                break;
            case 1:
                m59 m59Var = (m59) obj;
                k69 k69Var = (k69) obj2;
                m59Var.I0.t0.x0 = k69Var;
                k69Var.l();
                m59Var.F0.setVisibility(4);
                m59Var.G0.setVisibility(0);
                break;
            case 2:
                RecordExitBottomSheet recordExitBottomSheet = (RecordExitBottomSheet) obj2;
                yy7[] yy7VarArr = RecordExitBottomSheet.K0;
                kgd kgdVar = (kgd) recordExitBottomSheet.D0.getValue();
                int i2 = (int) ((igd) obj).c.a;
                boolean zIsChecked = recordExitBottomSheet.O0().isChecked();
                qv1 qv1Var = kgdVar.d;
                if (i2 != j0b.w1 && i2 != j0b.n1) {
                    if (i2 == j0b.v1) {
                        ((hw1) qv1Var.a).y();
                    } else if (i2 == j0b.o1) {
                        Boolean boolValueOf = Boolean.valueOf(zIsChecked);
                        igd igdVar = (igd) kgdVar.Z.a.getValue();
                        if (igdVar != null && igdVar.f) {
                            bool = boolValueOf;
                        }
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = kgdVar.c;
                        if (bool2 != null) {
                            ((v11) ((z01) kgdVar.Y.getValue())).j(bool2.booleanValue());
                        }
                        qv1Var.k(zBooleanValue);
                    }
                }
                recordExitBottomSheet.E0(true);
                break;
            case 3:
                fcg fcgVar = (fcg) obj;
                Window.Callback callback = fcgVar.k;
                if (callback != null && fcgVar.l) {
                    callback.onMenuItemSelected(0, (b7) obj2);
                    break;
                }
                break;
            default:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
        }
    }

    public iu1(fcg fcgVar) {
        this.a = 3;
        this.c = fcgVar;
        Context context = fcgVar.a.getContext();
        CharSequence charSequence = fcgVar.h;
        b7 b7Var = new b7();
        b7Var.o = 4096;
        b7Var.Y = 4096;
        b7Var.v0 = null;
        b7Var.w0 = null;
        b7Var.x0 = false;
        b7Var.y0 = false;
        b7Var.z0 = 16;
        b7Var.s0 = context;
        b7Var.a = charSequence;
        this.b = b7Var;
    }

    public iu1(m59 m59Var, k69 k69Var) {
        this.a = 1;
        this.c = m59Var;
        this.b = k69Var;
    }
}
