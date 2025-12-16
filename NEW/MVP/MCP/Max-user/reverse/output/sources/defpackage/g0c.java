package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class g0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0c(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g0c g0cVar = (g0c) l((p0a) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g0c g0cVar = new g0c(this.Y, continuation, this.X);
        g0cVar.o = obj;
        return g0cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        p0a p0aVar = (p0a) this.o;
        ViewGroup viewGroup = (ViewGroup) this.Y;
        PinBarsWidget pinBarsWidget = this.X;
        AutoTransition autoTransition = pinBarsWidget.t0;
        r0a r0aVar = null;
        Object[] objArr = 0;
        if (p0aVar instanceof o0a) {
            if (pinBarsWidget.o == null) {
                s0a s0aVar = new s0a(pinBarsWidget.getContext());
                s0aVar.setId(k8b.i);
                int i = 6;
                s0aVar.setOnCloseClickListener(new rzb(pinBarsWidget, i));
                s0aVar.setOnPlaybackSpeedClick(new iqb(i, pinBarsWidget));
                s0aVar.setOnPlaybackClickListener(new rzb(pinBarsWidget, 7));
                f8j.d(s0aVar, 300L, new rzb(pinBarsWidget, 8));
                s0aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                tqi.c(new s3(pinBarsWidget, objArr == true ? 1 : 0, 24), s0aVar);
                pinBarsWidget.o = s0aVar;
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                s0a s0aVar2 = pinBarsWidget.o;
                int childCount = viewGroup.getChildCount();
                if (1 <= childCount) {
                    childCount = 1;
                }
                viewGroup.addView(s0aVar2, childCount);
            }
            s0a s0aVar3 = pinBarsWidget.o;
            if (s0aVar3 != null) {
                o0a o0aVar = (o0a) p0aVar;
                s0aVar3.setIsPlaying(o0aVar.d);
                s0aVar3.setTitle(o0aVar.a.b(s0aVar3.getContext()));
                s0aVar3.setSubtitle(o0aVar.b.b(s0aVar3.getContext()));
                d3c d3cVar = o0aVar.c;
                int i2 = d3cVar != null ? uzb.$EnumSwitchMapping$1[d3cVar.ordinal()] : -1;
                if (i2 == 1) {
                    r0aVar = r0a.a;
                } else if (i2 == 2) {
                    r0aVar = r0a.b;
                } else if (i2 == 3) {
                    r0aVar = r0a.c;
                }
                s0aVar3.setPlaybackSpeed(r0aVar);
                s0aVar3.setProgress(((Number) pinBarsWidget.y0().A0.a.getValue()).floatValue());
            }
        } else {
            View viewFindViewById = viewGroup.findViewById(k8b.i);
            if (viewFindViewById != null) {
                TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
                viewGroup.removeView(viewFindViewById);
            }
            pinBarsWidget.o = null;
        }
        return qqg.a;
    }
}
