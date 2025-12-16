package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.V;

/* compiled from: MaterialElevationScale.java */
/* loaded from: classes6.dex */
public final class q extends u<w> {
    @Override // com.google.android.material.transition.u, androidx.transition.o0
    public final Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, true);
    }

    @Override // com.google.android.material.transition.u, androidx.transition.o0
    public final Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, false);
    }
}
