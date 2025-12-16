package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import j.X;

/* compiled from: MaterialElevationScale.java */
@X
/* loaded from: classes6.dex */
public final class u extends y<A> {
    @Override // com.google.android.material.transition.platform.y, android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, true);
    }

    @Override // com.google.android.material.transition.platform.y, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, false);
    }
}
