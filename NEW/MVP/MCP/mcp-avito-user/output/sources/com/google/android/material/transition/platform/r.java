package com.google.android.material.transition.platform;

import android.app.Activity;
import android.transition.Transition;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
/* loaded from: classes6.dex */
class r extends E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f357955a;

    public r(Activity activity) {
        this.f357955a = activity;
    }

    @Override // com.google.android.material.transition.platform.E, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        View view;
        WeakReference<View> weakReference = t.f357957e;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setAlpha(1.0f);
            t.f357957e = null;
        }
        Activity activity = this.f357955a;
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
