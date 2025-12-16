package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* loaded from: classes8.dex */
public final class aj0 {
    public static void a(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k ExtendedViewContainer extendedViewContainer, @Y61.k ViewPager2 viewPager2, @Y61.l MultiBannerControlsContainer multiBannerControlsContainer) {
        customizableMediaView.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams);
    }
}
