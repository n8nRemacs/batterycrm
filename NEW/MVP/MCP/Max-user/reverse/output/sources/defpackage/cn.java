package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* loaded from: classes.dex */
public final class cn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn(Object obj, View view, View view2, int i) {
        this.a = i;
        this.d = obj;
        this.b = view;
        this.c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((AppBarLayout$BaseBehavior) this.d).K((CoordinatorLayout) this.b, (in) this.c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ((hyf) this.d).c(this.b, this.c, valueAnimator.getAnimatedFraction());
                break;
        }
    }
}
