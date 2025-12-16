package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.V;
import com.google.android.material.R;
import j.InterfaceC42150f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialSharedAxis.java */
/* loaded from: classes6.dex */
public final class t extends u<E> {

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357982G = R.attr.motionDurationLong1;

    /* renamed from: H, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f357983H = R.attr.motionEasingEmphasizedInterpolator;

    /* compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
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
        return f357982G;
    }

    @Override // com.google.android.material.transition.u
    @InterfaceC42150f
    public final int X(boolean z12) {
        return f357983H;
    }
}
