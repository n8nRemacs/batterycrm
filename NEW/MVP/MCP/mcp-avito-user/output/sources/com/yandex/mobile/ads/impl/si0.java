package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.List;

/* loaded from: classes8.dex */
public final class si0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yi0 f389970a = new yi0();

    @Y61.k
    public final ExtendedViewContainer a(@Y61.k Context context, @Y61.k List<? extends b30> list) {
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context);
        this.f389970a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new rv0((float) yi0.a(list)));
        return extendedViewContainer;
    }
}
