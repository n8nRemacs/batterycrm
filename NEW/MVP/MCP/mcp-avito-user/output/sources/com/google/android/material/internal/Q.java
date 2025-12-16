package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.C22823h0;

/* compiled from: ViewUtils.java */
/* loaded from: classes6.dex */
class Q implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@j.N View view) {
        view.removeOnAttachStateChangeListener(this);
        C22823h0.A(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
