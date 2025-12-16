package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;

/* compiled from: TooltipTargetViewWrapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/b;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "targetView", "Lkotlin/G0;", "setLayoutParams", "(Landroid/view/View;)V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35692b extends FrameLayout {
    public final void setLayoutParams(@Y61.k View targetView) {
        targetView.getLocationOnScreen(new int[2]);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(targetView.getWidth(), targetView.getHeight());
        setX(r0[0]);
        setY(r0[1] - targetView.getHeight());
        setLayoutParams(layoutParams);
    }
}
