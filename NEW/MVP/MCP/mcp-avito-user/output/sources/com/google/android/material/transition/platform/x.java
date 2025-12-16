package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialSharedAxis.java */
@X
/* loaded from: classes6.dex */
public final class x extends y<I> {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357968e = R.attr.motionDurationLong1;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357969f = R.attr.motionEasingEmphasizedInterpolator;

    /* compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int f(boolean z12) {
        return f357968e;
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int g(boolean z12) {
        return f357969f;
    }

    @Override // com.google.android.material.transition.platform.y, android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, true);
    }

    @Override // com.google.android.material.transition.platform.y, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, false);
    }
}
