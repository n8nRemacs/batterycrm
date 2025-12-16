package com.avito.android.lib.design.page_indicator_re23;

import android.animation.Animator;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.avito.android.lib.design.page_indicator_re23.DotsStateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Animator.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/animation/e", "Landroid/animation/Animator$AnimatorListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DotsStateManager.DotState f179926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PageIndicatorRe23 f179927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f179928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GradientDrawable f179929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DotsStateManager.DotState f179930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GradientDrawable f179931f;

    public a(DotsStateManager.DotState dotState, PageIndicatorRe23 pageIndicatorRe23, ImageView imageView, GradientDrawable gradientDrawable, DotsStateManager.DotState dotState2, GradientDrawable gradientDrawable2) {
        this.f179926a = dotState;
        this.f179927b = pageIndicatorRe23;
        this.f179928c = imageView;
        this.f179929d = gradientDrawable;
        this.f179930e = dotState2;
        this.f179931f = gradientDrawable2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DotsStateManager.DotState dotState = DotsStateManager.DotState.f179903f;
        ImageView imageView = this.f179928c;
        PageIndicatorRe23 pageIndicatorRe23 = this.f179927b;
        DotsStateManager.DotState dotState2 = this.f179926a;
        if (dotState2 == dotState) {
            int i12 = PageIndicatorRe23.f179906k;
            pageIndicatorRe23.f179912g.push(imageView);
            pageIndicatorRe23.removeView(imageView);
        }
        if (dotState2 != DotsStateManager.DotState.f179899b) {
            this.f179929d.setShape(1);
        }
        int i13 = PageIndicatorRe23.f179906k;
        pageIndicatorRe23.getClass();
        imageView.setTag(dotState2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f179930e == DotsStateManager.DotState.f179899b) {
            GradientDrawable gradientDrawable = this.f179931f;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(this.f179927b.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f437681g.f437673d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
