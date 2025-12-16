package com.avito.android.spare_parts.bottom_sheet;

import android.animation.Animator;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import kotlin.Metadata;

/* compiled from: SparePartsBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/t;", "Landroid/animation/Animator$AnimatorListener;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41770c f284831a;

    public t(InterfaceC41770c interfaceC41770c) {
        this.f284831a = interfaceC41770c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        this.f284831a.e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@Y61.k Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Y61.k Animator animator) {
    }
}
