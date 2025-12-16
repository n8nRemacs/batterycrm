package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes6.dex */
class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f357338b;

    public l(BaseTransientBottomBar baseTransientBottomBar) {
        this.f357338b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f357338b;
        BaseTransientBottomBar.j jVar = baseTransientBottomBar.f357285i;
        if (jVar == null) {
            return;
        }
        ViewParent parent = jVar.getParent();
        BaseTransientBottomBar.j jVar2 = baseTransientBottomBar.f357285i;
        if (parent != null) {
            jVar2.setVisibility(0);
        }
        if (jVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f357280d);
            valueAnimatorOfFloat.addUpdateListener(new b(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f357282f);
            valueAnimatorOfFloat2.addUpdateListener(new c(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f357277a);
            animatorSet.addListener(new m(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = jVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = jVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        jVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f357281e);
        valueAnimator.setDuration(baseTransientBottomBar.f357279c);
        valueAnimator.addListener(new d(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new e(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
