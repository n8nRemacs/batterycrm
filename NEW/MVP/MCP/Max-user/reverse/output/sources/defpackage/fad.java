package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class fad implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9d b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ fad(x9d x9dVar, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = x9dVar;
        this.c = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RecyclerView recyclerView = this.b.d;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iIntValue;
                recyclerView.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.c;
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = iIntValue;
                viewGroup.setLayoutParams(layoutParams2);
                return;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RecyclerView recyclerView2 = this.b.d;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.height = iIntValue2;
                recyclerView2.setLayoutParams(layoutParams3);
                ViewGroup viewGroup2 = this.c;
                ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams4.height = iIntValue2;
                viewGroup2.setLayoutParams(layoutParams4);
                return;
        }
    }
}
