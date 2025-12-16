package com.avito.android.hero_banner.widget;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: HeroBannerWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/g;", "Lcom/avito/android/ui/status_bar/k;", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface g extends com.avito.android.ui.status_bar.k {
    void d3(boolean z12);

    @Y61.k
    InterfaceC43160i<UdfToolbarColors> e3();

    void f0();

    @Y61.k
    InterfaceC43160i<Float> f3();

    @Y61.k
    InterfaceC43160i<DeepLink> g3();

    @Y61.k
    InterfaceC43160i<k> h3();

    void hide();

    void l4(@Y61.k l lVar, @Y61.k BxContentFragment.H h12);

    void z3(boolean z12, @Y61.k HeroBannerWidgetItem heroBannerWidgetItem, boolean z13);
}
