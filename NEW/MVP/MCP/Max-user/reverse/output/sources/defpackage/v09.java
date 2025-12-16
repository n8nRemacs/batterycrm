package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class v09 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y09 b;

    public /* synthetic */ v09(y09 y09Var, int i) {
        this.a = i;
        this.b = y09Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MediaKeyboardWidget mediaKeyboardWidgetD = this.b.d();
                if (mediaKeyboardWidgetD == null || (view = mediaKeyboardWidgetD.getView()) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
                return;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = this.b.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iIntValue2);
                return;
        }
    }
}
