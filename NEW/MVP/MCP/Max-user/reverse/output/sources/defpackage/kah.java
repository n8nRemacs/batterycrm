package defpackage;

import android.view.ViewPropertyAnimator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class kah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kah kahVar = (kah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kah kahVar = new kah(continuation, this.X);
        kahVar.o = obj;
        return kahVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        z8c z8cVar = (z8c) this.o;
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        VideoMessageWidget videoMessageWidget = this.X;
        if (!((Boolean) ((q8h) videoMessageWidget.G0().b).E.a.getValue()).booleanValue()) {
            int i = z8cVar == null ? -1 : aah.$EnumSwitchMapping$0[z8cVar.ordinal()];
            Object[] objArr = 0;
            final int i2 = 1;
            if (i == 1) {
                videoMessageWidget.A0().setPlaceholder(((f8h) ((q8h) videoMessageWidget.G0().b).q.getValue()).c);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                final l5h l5hVarA0 = videoMessageWidget.A0();
                OneMeDraweeView oneMeDraweeView = l5hVarA0.d;
                if (oneMeDraweeView.getVisibility() == 0) {
                    ViewPropertyAnimator viewPropertyAnimator = l5hVarA0.c;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    ViewPropertyAnimator duration = oneMeDraweeView.animate().alpha(0.0f).setDuration(200L);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction = duration.withStartAction(new Runnable() { // from class: k5h
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (objArr2) {
                                case 0:
                                    l5hVarA0.o.setVisibility(0);
                                    break;
                                default:
                                    l5h.a(l5hVarA0);
                                    break;
                            }
                        }
                    }).withEndAction(new Runnable() { // from class: k5h
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    l5hVarA0.o.setVisibility(0);
                                    break;
                                default:
                                    l5h.a(l5hVarA0);
                                    break;
                            }
                        }
                    });
                    l5hVarA0.c = viewPropertyAnimatorWithEndAction;
                    if (viewPropertyAnimatorWithEndAction != null) {
                        viewPropertyAnimatorWithEndAction.start();
                    }
                }
            }
            ((q8h) videoMessageWidget.G0().b).D.m(null, Boolean.valueOf(z8cVar == z8c.b));
        }
        return qqg.a;
    }
}
