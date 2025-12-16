package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.N;
import com.google.android.material.internal.O;
import java.util.Iterator;

/* compiled from: BaseSlider.java */
/* loaded from: classes6.dex */
class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseSlider f357271a;

    public c(BaseSlider baseSlider) {
        this.f357271a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f357271a;
        N nD2 = O.d(O.c(baseSlider));
        Iterator it = baseSlider.f357242l.iterator();
        while (it.hasNext()) {
            nD2.b((com.google.android.material.tooltip.a) it.next());
        }
    }
}
