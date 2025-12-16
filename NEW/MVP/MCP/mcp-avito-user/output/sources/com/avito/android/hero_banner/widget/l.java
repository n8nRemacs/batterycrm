package com.avito.android.hero_banner.widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import j.D;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HeroBannerWidgetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/l;", "LTV0/e;", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface l extends TV0.e {

    /* compiled from: HeroBannerWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ve(@Y61.k HeroBannerWidgetItem.HeroBannerItemTitle heroBannerItemTitle, @Y61.l AttributedText attributedText, @Y61.k Y41.q<? super DeepLink, ? super String, ? super String, G0> qVar);

    void aR(@Y61.l List<UniversalColor> list);

    void d3(boolean z12);

    void f0();

    void f4(@Y61.l UniversalImage universalImage);

    void hd(@Y61.k String str);

    void kY(boolean z12, @Y61.k Y41.l<? super Float, G0> lVar, @Y61.k Y41.l<? super com.avito.android.ui.status_bar.d, G0> lVar2, @Y61.l HeroBannerWidgetItem.UdfToolbarAndStatusBarConfig udfToolbarAndStatusBarConfig, @Y61.k Y41.l<? super UdfToolbarColors, G0> lVar3, @Y61.k Y41.p<? super String, ? super String, G0> pVar, @Y61.k Y41.l<? super k, G0> lVar4, boolean z13, boolean z14);

    void uV(@D int i12, @Y61.k UniversalColor universalColor);

    void v1(@Y61.l UniversalImage universalImage);
}
