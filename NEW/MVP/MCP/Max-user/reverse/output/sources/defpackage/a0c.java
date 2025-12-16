package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class a0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0c(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a0c a0cVar = (a0c) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a0c a0cVar = new a0c(this.Y, continuation, this.X);
        a0cVar.o = obj;
        return a0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zk7 zk7Var = (zk7) this.o;
        ViewGroup viewGroup = (ViewGroup) this.Y;
        PinBarsWidget pinBarsWidget = this.X;
        AutoTransition autoTransition = pinBarsWidget.t0;
        if (zk7Var instanceof xk7) {
            if (pinBarsWidget.s0 == null) {
                n8b n8bVar = new n8b(pinBarsWidget.getContext(), 2);
                n8bVar.setId(k8b.g);
                n8bVar.setCloseButtonVisibility(true);
                n8bVar.setCloseBtnClickListener(new rzb(pinBarsWidget, 3));
                n8bVar.setOnClickListener(new rzb(pinBarsWidget, 4));
                tqi.c(new vzb(3, null, 0), n8bVar);
                if (n8bVar.isAttachedToWindow()) {
                    xk7 xk7Var = (xk7) zk7Var;
                    if (xk7Var.e) {
                        svi.e(tfh.b(n8bVar), null, null, new wzb(n8bVar, null), 3);
                    }
                    qzb qzbVarY0 = pinBarsWidget.y0();
                    String str = xk7Var.a;
                    qk7 qk7Var = qzbVarY0.B0;
                    if (qk7Var != null) {
                        svi.e(qk7Var.a, null, null, new ok7(qk7Var, str, null), 3);
                    }
                } else {
                    n8bVar.addOnAttachStateChangeListener(new xzb(n8bVar, zk7Var, pinBarsWidget, n8bVar));
                }
                pinBarsWidget.s0 = n8bVar;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                n8b n8bVar2 = pinBarsWidget.s0;
                int childCount = viewGroup.getChildCount();
                if (childCount >= 0) {
                    childCount = 0;
                }
                viewGroup.addView(n8bVar2, childCount);
            }
            n8b n8bVar3 = pinBarsWidget.s0;
            if (n8bVar3 != null) {
                xk7 xk7Var2 = (xk7) zk7Var;
                CharSequence charSequenceB = xk7Var2.b.b(pinBarsWidget.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                n8bVar3.setTitle(charSequenceB);
                CharSequence charSequenceB2 = xk7Var2.c.b(pinBarsWidget.getContext());
                n8bVar3.setSubtitle(charSequenceB2 != null ? charSequenceB2 : "");
                n8bVar3.setIcon(xk7Var2.d);
            }
        } else {
            View viewFindViewById = viewGroup.findViewById(k8b.g);
            if (viewFindViewById != null) {
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                viewGroup.removeView(viewFindViewById);
            }
            pinBarsWidget.s0 = null;
        }
        return qqg.a;
    }
}
