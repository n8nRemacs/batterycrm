package com.avito.android.lib.design.text_view;

import Y61.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: AvitoTextView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/text_view/b;", "Landroid/animation/AnimatorListenerAdapter;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f180936a;

    public b(a aVar) {
        this.f180936a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        super.onAnimationEnd(animator);
        a aVar = this.f180936a;
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        aVar.getLayoutParams().height = -2;
        aVar.setLayoutParams(layoutParams);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@k Animator animator) {
        super.onAnimationStart(animator);
        this.f180936a.f180932k = true;
    }
}
