package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.N;
import j.X;
import lY0.C43707b;

/* compiled from: MaterialFade.java */
@X
/* loaded from: classes6.dex */
public final class v extends y<C37090f> {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357962e = R.attr.motionDurationMedium4;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357963f = R.attr.motionDurationShort3;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357964g = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357965h = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public v() {
        C37090f c37090f = new C37090f();
        c37090f.f357867a = 0.3f;
        A a12 = new A();
        a12.f357848b = false;
        a12.f357847a = 0.8f;
        super(c37090f, a12);
    }

    @Override // com.google.android.material.transition.platform.y
    @N
    public final TimeInterpolator e() {
        return C43707b.f413879a;
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int f(boolean z12) {
        return z12 ? f357962e : f357963f;
    }

    @Override // com.google.android.material.transition.platform.y
    @InterfaceC42150f
    public final int g(boolean z12) {
        return z12 ? f357964g : f357965h;
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
