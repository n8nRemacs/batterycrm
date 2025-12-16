package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import j.N;
import j.P;
import j.X;

/* compiled from: Hold.java */
@X
/* loaded from: classes6.dex */
public final class m extends Visibility {
    @Override // android.transition.Visibility
    @N
    public final Animator onAppear(@N ViewGroup viewGroup, @N View view, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @N
    public final Animator onDisappear(@N ViewGroup viewGroup, @N View view, @P TransitionValues transitionValues, @P TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
