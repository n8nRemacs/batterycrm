package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.zl;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.List;

/* loaded from: classes8.dex */
public final class ae0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final aj0 f383538a = new aj0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ti0 f383539b = new ti0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final si0 f383540c = new si0();

    @Y61.k
    public final zn1 a(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k w20 w20Var, @Y61.k List list, @Y61.k n2 n2Var, @Y61.l l31 l31Var) {
        Long lA2;
        ri0 ri0Var;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        ui0 ui0Var = new ui0(context);
        bj0 bj0Var = new bj0(viewPager2);
        if (l31Var == null || (lA2 = l31Var.a()) == null) {
            lA2 = 0L;
        }
        long jLongValue = lA2.longValue();
        if (jLongValue > 0) {
            ri0Var = new ri0(viewPager2, bj0Var, ui0Var);
            viewPager2.addOnAttachStateChangeListener(new xi0(ri0Var, jLongValue));
        } else {
            ri0Var = null;
        }
        viewPager2.e(new mr0(ui0Var, ri0Var));
        MultiBannerControlsContainer multiBannerControlsContainerA = this.f383539b.a(context);
        if (multiBannerControlsContainerA != null) {
            multiBannerControlsContainerA.a(viewPager2);
            multiBannerControlsContainerA.setOnClickLeftButtonListener(new zl.a(bj0Var, ui0Var, ri0Var));
            multiBannerControlsContainerA.setOnClickRightButtonListener(new zl.b(bj0Var, ui0Var, ri0Var));
        }
        ExtendedViewContainer extendedViewContainerA = this.f383540c.a(context, list);
        this.f383538a.getClass();
        aj0.a(customizableMediaView, extendedViewContainerA, viewPager2, multiBannerControlsContainerA);
        return new zn1(customizableMediaView, new dj0(viewPager2, w20Var), n2Var);
    }
}
