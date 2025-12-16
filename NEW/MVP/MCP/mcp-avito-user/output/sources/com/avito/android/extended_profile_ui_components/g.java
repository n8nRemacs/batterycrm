package com.avito.android.extended_profile_ui_components;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: BadgeBarV3View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/g;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BadgeBarV3View f153340b;

    public g(BadgeBarV3View badgeBarV3View) {
        this.f153340b = badgeBarV3View;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        BadgeBarV3View badgeBarV3View = this.f153340b;
        badgeBarV3View.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AV.a(badgeBarV3View, 6));
        valueAnimatorOfFloat.start();
    }
}
