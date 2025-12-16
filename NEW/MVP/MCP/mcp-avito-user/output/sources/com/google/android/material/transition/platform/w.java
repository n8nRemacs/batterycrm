package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.X;

/* compiled from: MaterialFadeThrough.java */
@X
/* loaded from: classes6.dex */
public final class w extends y<C37093i> {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357966e = R.attr.motionDurationLong1;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357967f = R.attr.motionEasingEmphasizedInterpolator;

    public w() {
        C37093i c37093i = new C37093i();
        A a12 = new A();
        a12.f357848b = false;
        a12.f357847a = 0.92f;
        super(c37093i, a12);
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int f(boolean z12) {
        return f357966e;
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int g(boolean z12) {
        return f357967f;
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
