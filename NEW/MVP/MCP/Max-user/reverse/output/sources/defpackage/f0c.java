package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class f0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0c(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f0c f0cVar = (f0c) l((c1c) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f0c f0cVar = new f0c(this.Y, continuation, this.X);
        f0cVar.o = obj;
        return f0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        c1c c1cVar = (c1c) this.o;
        ViewGroup viewGroup = (ViewGroup) this.Y;
        PinBarsWidget pinBarsWidget = this.X;
        AutoTransition autoTransition = pinBarsWidget.t0;
        if (c1cVar instanceof b1c) {
            if (pinBarsWidget.X == null) {
                n8b n8bVar = new n8b(pinBarsWidget.getContext(), 1);
                n8bVar.setId(k8b.h);
                n8bVar.setCloseBtnClickListener(new rzb(pinBarsWidget, 0));
                n8bVar.setOnClickListener(new rzb(pinBarsWidget, 5));
                tqi.c(new vzb(3, null, 1), n8bVar);
                pinBarsWidget.X = n8bVar;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                n8b n8bVar2 = pinBarsWidget.X;
                int childCount = viewGroup.getChildCount();
                if (childCount >= 0) {
                    childCount = 0;
                }
                viewGroup.addView(n8bVar2, childCount);
            }
            n8b n8bVar3 = pinBarsWidget.X;
            if (n8bVar3 != null) {
                b1c b1cVar = (b1c) c1cVar;
                CharSequence charSequenceB = b1cVar.b.b(pinBarsWidget.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                n8bVar3.setTitle(charSequenceB);
                CharSequence charSequenceB2 = b1cVar.c.b(pinBarsWidget.getContext());
                n8bVar3.setSubtitle(charSequenceB2 != null ? charSequenceB2 : "");
                n8bVar3.setCloseButtonVisibility(b1cVar.d);
            }
        } else {
            View viewFindViewById = viewGroup.findViewById(k8b.h);
            if (viewFindViewById != null) {
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                viewGroup.removeView(viewFindViewById);
            }
            pinBarsWidget.X = null;
        }
        return qqg.a;
    }
}
