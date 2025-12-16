package com.google.android.material.transition.platform;

import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C22763c;
import java.lang.ref.WeakReference;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
/* loaded from: classes6.dex */
class q extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f357954a;

    public q(Window window) {
        this.f357954a = window;
    }

    @Override // com.google.android.material.transition.platform.E, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        Window window = this.f357954a;
        WeakReference<View> weakReference = t.f357957e;
        Drawable background = window.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().clearColorFilter();
    }

    @Override // com.google.android.material.transition.platform.E, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Window window = this.f357954a;
        WeakReference<View> weakReference = t.f357957e;
        Drawable background = window.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().setColorFilter(C22763c.a(0, BlendModeCompat.f44705b));
    }
}
