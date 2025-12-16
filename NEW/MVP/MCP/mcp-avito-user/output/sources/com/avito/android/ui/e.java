package com.avito.android.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.Metadata;

/* compiled from: ScaleInOutTouchListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/e;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f304583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f304584b;

    public e(f fVar, View view) {
        this.f304583a = fVar;
        this.f304584b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
        f fVar = this.f304583a;
        fVar.f304588e = null;
        if (fVar.f304589f) {
            fVar.a(this.f304584b, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        f fVar = this.f304583a;
        fVar.f304588e = null;
        if (fVar.f304589f) {
            fVar.a(this.f304584b, true);
        }
    }
}
