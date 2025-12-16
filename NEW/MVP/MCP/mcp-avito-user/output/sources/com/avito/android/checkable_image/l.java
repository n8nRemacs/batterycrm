package com.avito.android.checkable_image;

import android.animation.Animator;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.airbnb.lottie.B;
import kotlin.Metadata;

/* compiled from: CheckableImageWithAnimation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkable_image/l;", "Landroid/animation/Animator$AnimatorListener;", "_avito_checkable-image_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroupOverlay f118093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f118094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f118095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f118096d;

    public l(ViewGroupOverlay viewGroupOverlay, B b12, ViewGroup viewGroup, a aVar) {
        this.f118093a = viewGroupOverlay;
        this.f118094b = b12;
        this.f118095c = viewGroup;
        this.f118096d = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
        a aVar = this.f118096d;
        try {
            this.f118093a.remove(this.f118094b);
        } catch (Throwable unused) {
        }
        ViewGroup viewGroup = this.f118095c;
        if (viewGroup.getViewTreeObserver().isAlive()) {
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(aVar);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        a aVar = this.f118096d;
        try {
            this.f118093a.remove(this.f118094b);
        } catch (Throwable unused) {
        }
        ViewGroup viewGroup = this.f118095c;
        if (viewGroup.getViewTreeObserver().isAlive()) {
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(aVar);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@Y61.k Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
    }
}
