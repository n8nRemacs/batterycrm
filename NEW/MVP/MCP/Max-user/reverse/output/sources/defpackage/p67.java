package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p67 extends ih {
    public p67() {
        super(0);
    }

    @Override // defpackage.h54
    public final h54 b() {
        return new p67(this.d, this.t0);
    }

    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, view2.getWidth(), 0.0f));
                return animatorSet;
            }
        } else {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, (view != null ? view.getTranslationX() : 0.0f) - view2.getWidth(), 0.0f));
            }
        }
        return animatorSet;
    }

    @Override // defpackage.ih
    public final void n(View view) {
        view.setTranslationX(0.0f);
    }

    public p67(int i) {
        super(200L, 2);
    }
}
