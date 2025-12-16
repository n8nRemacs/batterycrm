package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t61 extends ih {
    public final boolean u0;

    public t61() {
        this(-1L, true);
    }

    @Override // defpackage.ih, defpackage.h54
    public final boolean d() {
        return this.u0;
    }

    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // defpackage.ih
    public final void n(View view) {
    }

    public t61(long j, boolean z) {
        super(j, 2);
        this.u0 = z;
    }
}
