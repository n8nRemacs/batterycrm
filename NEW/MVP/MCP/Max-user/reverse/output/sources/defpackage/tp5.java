package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class tp5 extends ih {
    public tp5() {
        super(0);
    }

    @Override // defpackage.h54
    public final h54 b() {
        return new tp5(this.d, this.t0);
    }

    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z2 ? 0.0f : view2.getAlpha(), 1.0f));
        }
        if (view != null && (!z || this.t0)) {
            animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        return animatorSet;
    }

    @Override // defpackage.ih
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public tp5(int i) {
        super(150L, 2);
    }
}
