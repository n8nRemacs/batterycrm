package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: DeferredRequestCreator.java */
/* renamed from: com.squareup.picasso.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class ViewTreeObserverOnPreDrawListenerC37872i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
