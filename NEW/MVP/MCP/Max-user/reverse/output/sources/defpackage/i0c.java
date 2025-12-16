package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class i0c extends dtf implements ym6 {
    public /* synthetic */ c1c X;
    public /* synthetic */ zqg Y;
    public /* synthetic */ cz6 Z;
    public /* synthetic */ p0a o;
    public final /* synthetic */ PinBarsWidget s0;
    public final /* synthetic */ View t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0c(PinBarsWidget pinBarsWidget, View view, b66 b66Var) {
        super(5, b66Var);
        this.s0 = pinBarsWidget;
        this.t0 = view;
    }

    @Override // defpackage.ym6
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, b66 b66Var) {
        i0c i0cVar = new i0c(this.s0, this.t0, b66Var);
        i0cVar.o = (p0a) obj;
        i0cVar.X = (c1c) obj2;
        i0cVar.Y = (zqg) obj3;
        i0cVar.Z = (cz6) obj4;
        qqg qqgVar = qqg.a;
        i0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        zqg zqgVar;
        zqg zqgVar2;
        PinBarsWidget pinBarsWidget = this.s0;
        AutoTransition autoTransition = pinBarsWidget.t0;
        g8j.b(obj);
        p0a p0aVar = this.o;
        c1c c1cVar = this.X;
        zqg zqgVar3 = this.Y;
        cz6 cz6Var = this.Z;
        boolean z = c1cVar instanceof a1c;
        Continuation continuation = null;
        View view = this.t0;
        if (z && (p0aVar instanceof n0a) && zqgVar3 != null && (cz6Var instanceof bz6)) {
            if (pinBarsWidget.Y == null) {
                grg grgVar = new grg(pinBarsWidget.getContext());
                grgVar.setId(k8b.k);
                grgVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                grgVar.setOnAddContactClickListener(new rzb(pinBarsWidget, 1));
                grgVar.setOnBlockContactClickListener(new rzb(pinBarsWidget, 2));
                tqi.c(new kga(3, continuation, 6), grgVar);
                pinBarsWidget.Y = grgVar;
                ViewGroup viewGroup = (ViewGroup) view;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                grg grgVar2 = pinBarsWidget.Y;
                int childCount = viewGroup.getChildCount();
                if (childCount >= 0) {
                    childCount = 0;
                }
                viewGroup.addView(grgVar2, childCount);
            }
            crg crgVar = pinBarsWidget.y0().X;
            if (crgVar != null && (zqgVar2 = (zqg) crgVar.i.a.getValue()) != null) {
                long j = zqgVar2.a;
                l24 l24Var = crgVar.b;
                long j2 = ((w4e) ((pb3) crgVar.g.getValue())).j();
                qv3 qv3Var = l24Var.a;
                qv3Var.getClass();
                bwd.a(new nv3(0, j, j2, qv3Var), new df3(5), qv3Var.l);
            }
        } else {
            View viewFindViewById = view.findViewById(k8b.k);
            if (viewFindViewById != null) {
                int i = PinBarsWidget.u0;
                crg crgVar2 = pinBarsWidget.y0().X;
                if (crgVar2 != null && (zqgVar = (zqg) crgVar2.i.a.getValue()) != null) {
                    long j3 = zqgVar.a;
                    qv3 qv3Var2 = crgVar2.b.a;
                    qv3Var2.getClass();
                    bwd.a(new nv3(0, j3, 0L, qv3Var2), new df3(5), qv3Var2.l);
                }
                ViewGroup viewGroup2 = (ViewGroup) view;
                TransitionManager.beginDelayedTransition(viewGroup2, autoTransition);
                viewGroup2.removeView(viewFindViewById);
                pinBarsWidget.Y = null;
            }
        }
        return qqg.a;
    }
}
