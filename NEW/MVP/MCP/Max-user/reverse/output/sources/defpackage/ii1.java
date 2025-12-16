package defpackage;

import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class ii1 extends dtf implements sm6 {
    public final /* synthetic */ CallOpponentsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.X = callOpponentsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ii1 ii1Var = (ii1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ii1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ii1 ii1Var = new ii1(continuation, this.X);
        ii1Var.o = obj;
        return ii1Var;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        mi1 mi1Var = (mi1) this.o;
        CallOpponentsListWidget callOpponentsListWidget = this.X;
        sn0 sn0Var = callOpponentsListWidget.C0;
        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
        sn0 sn0Var2 = callOpponentsListWidget.w0;
        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
        yy7 yy7Var = yy7VarArr2[5];
        TextView textView = (TextView) sn0Var2.getValue();
        CharSequence charSequence = mi1Var.e;
        boolean z = mi1Var.d;
        textView.setText(charSequence);
        callOpponentsListWidget.D0().setTitle(mi1Var.e);
        vza vzaVarB0 = callOpponentsListWidget.B0();
        List list = mi1Var.b;
        vzaVarB0.y0 = list.size() < 3 && !z;
        callOpponentsListWidget.B0().b(list, mi1Var.c, z);
        if (mi1Var.f) {
            callOpponentsListWidget.D0().setRightActions((lfb) callOpponentsListWidget.s0.getValue());
        } else {
            callOpponentsListWidget.D0().setRightActions(jfb.a);
        }
        o98 o98VarD = ve3.d();
        o98VarD.addAll(mi1Var.a);
        o98 o98VarA = ve3.a(o98VarD);
        ((nh1) callOpponentsListWidget.D0.getValue()).E(o98VarA);
        boolean zIsEmpty = o98VarA.isEmpty();
        if (zIsEmpty || dqi.q(callOpponentsListWidget.A0())) {
            ViewStub viewStubA0 = callOpponentsListWidget.A0();
            yy7 yy7Var2 = yy7VarArr2[11];
            dqi.p(viewStubA0, (x3b) sn0Var.getValue(), null);
            yy7 yy7Var3 = yy7VarArr2[11];
            ((x3b) sn0Var.getValue()).setVisibility(zIsEmpty ? 0 : 8);
            sn0 sn0Var3 = callOpponentsListWidget.v0;
            yy7 yy7Var4 = yy7VarArr2[4];
            ((RecyclerView) sn0Var3.getValue()).setVisibility(zIsEmpty ? 8 : 0);
        }
        return qqg.a;
    }
}
