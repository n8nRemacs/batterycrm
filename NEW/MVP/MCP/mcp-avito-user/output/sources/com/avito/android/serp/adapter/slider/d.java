package com.avito.android.serp.adapter.slider;

import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.slider.SliderWidget;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: SliderItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/slider/d;", "Lcom/avito/android/serp/adapter/slider/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f272264a;

    @Inject
    public d(@Y61.k C36135w2 c36135w2) {
        this.f272264a = c36135w2;
    }

    @Override // com.avito.android.serp.adapter.slider.c
    @Y61.l
    public final SliderItem a(@Y61.k SliderWidget sliderWidget, boolean z12) {
        UniversalColor endColor;
        DeepLink deeplink;
        AttributedText title = sliderWidget.getTitle();
        UniversalColor startColor = sliderWidget.getStartColor();
        if (startColor == null || (endColor = sliderWidget.getEndColor()) == null) {
            return null;
        }
        UniversalColor iconColor = sliderWidget.getIconColor();
        UniversalColor imageBackgroundColor = sliderWidget.getImageBackgroundColor();
        UniversalImage image = sliderWidget.getImage();
        if (image == null || (deeplink = sliderWidget.getDeeplink()) == null) {
            return null;
        }
        C36135w2 c36135w2 = this.f272264a;
        c36135w2.getClass();
        n<Object> nVar = C36135w2.f327457X[24];
        return new SliderItem(null, title, startColor, endColor, iconColor, image, imageBackgroundColor, deeplink, ((Boolean) c36135w2.f327500u.a().getValue()).booleanValue(), z12, sliderWidget.getAnalytics(), sliderWidget.getSettings(), 1, null);
    }
}
