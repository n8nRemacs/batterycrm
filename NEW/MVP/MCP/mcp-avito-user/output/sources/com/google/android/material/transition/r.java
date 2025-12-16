package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.V;
import com.google.android.material.R;
import j.InterfaceC42150f;
import j.N;
import lY0.C43707b;

/* compiled from: MaterialFade.java */
/* loaded from: classes6.dex */
public final class r extends u<f> {

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357976G = R.attr.motionDurationMedium4;

    /* renamed from: H, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357977H = R.attr.motionDurationShort3;

    /* renamed from: I, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357978I = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* renamed from: J, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357979J = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public r() {
        f fVar = new f();
        fVar.f357761a = 0.3f;
        w wVar = new w();
        wVar.f357991b = false;
        wVar.f357990a = 0.8f;
        super(fVar, wVar);
    }

    @Override // com.google.android.material.transition.u, androidx.transition.o0
    public final Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, true);
    }

    @Override // com.google.android.material.transition.u, androidx.transition.o0
    public final Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, false);
    }

    @Override // com.google.android.material.transition.u
    @N
    public final TimeInterpolator V() {
        return C43707b.f413879a;
    }

    @Override // com.google.android.material.transition.u
    @InterfaceC42150f
    public final int W(boolean z12) {
        return z12 ? f357976G : f357977H;
    }

    @Override // com.google.android.material.transition.u
    @InterfaceC42150f
    public final int X(boolean z12) {
        return z12 ? f357978I : f357979J;
    }
}
