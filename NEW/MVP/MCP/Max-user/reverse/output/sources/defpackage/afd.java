package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class afd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ afd(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                cei.k(recordControlsWidget.B0().getDrawable(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                cei.k(recordControlsWidget.L0(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 2:
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                View viewP0 = recordControlsWidget.P0();
                ViewGroup.LayoutParams layoutParams = viewP0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewP0.setLayoutParams(layoutParams2);
                return;
            default:
                yy7[] yy7VarArr4 = RecordControlsWidget.g1;
                View viewP02 = recordControlsWidget.P0();
                ViewGroup.LayoutParams layoutParams3 = viewP02.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewP02.setLayoutParams(layoutParams4);
                return;
        }
    }
}
