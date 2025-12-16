package com.avito.android.beduin.common.container.horizontal_slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: Animator.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "androidx/core/animation/i", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseHorizontalSliderLayout f103096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.f f103097b;

    public b(BeduinBaseHorizontalSliderLayout beduinBaseHorizontalSliderLayout, l0.f fVar) {
        this.f103096a = beduinBaseHorizontalSliderLayout;
        this.f103097b = fVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        BeduinBaseHorizontalSliderLayout beduinBaseHorizontalSliderLayout = this.f103096a;
        if (beduinBaseHorizontalSliderLayout.getRecycler().getScrollState() == 0) {
            beduinBaseHorizontalSliderLayout.getRecycler().scrollBy(-this.f103097b.f406840b, 0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
