package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.V;
import com.google.android.material.R;
import j.InterfaceC42150f;

/* compiled from: MaterialFadeThrough.java */
/* loaded from: classes6.dex */
public final class s extends u<i> {

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357980G = R.attr.motionDurationLong1;

    /* renamed from: H, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357981H = R.attr.motionEasingEmphasizedInterpolator;

    public s() {
        i iVar = new i();
        w wVar = new w();
        wVar.f357991b = false;
        wVar.f357990a = 0.92f;
        super(iVar, wVar);
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
    @InterfaceC42150f
    public final int W(boolean z12) {
        return f357980G;
    }

    @Override // com.google.android.material.transition.u
    @InterfaceC42150f
    public final int X(boolean z12) {
        return f357981H;
    }
}
