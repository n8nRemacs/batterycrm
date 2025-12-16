package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.UspBanner;
import com.avito.android.remote.model.vertical_main.UspBannerAnalytics;
import com.avito.android.remote.model.vertical_main.UspBannerBadge;
import com.avito.android.remote.model.vertical_main.UspBannerButton;
import com.avito.android.remote.model.vertical_main.UspBannersWidget;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItem;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItemAnalytics;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItemBadge;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItemButton;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItemSettings;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UspBannersItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/b;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.a
    @Y61.k
    public final UspBannersWidgetItem a(@Y61.k UspBannersWidget uspBannersWidget) {
        List<UspBanner> items = uspBannersWidget.getItems();
        if (items == null) {
            items = C42784z0.f406748b;
        }
        List<UspBanner> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (UspBanner uspBanner : list) {
            AttributedText title = uspBanner.getTitle();
            AttributedText subtitle = uspBanner.getSubtitle();
            UniversalImage image = uspBanner.getImage();
            UspBannerBadge badge = uspBanner.getBadge();
            UspBannerItemBadge uspBannerItemBadge = badge != null ? new UspBannerItemBadge(badge.getText(), badge.getStyle(), badge.getTheme()) : null;
            UspBannerButton button = uspBanner.getButton();
            UspBannerItemButton uspBannerItemButton = button != null ? new UspBannerItemButton(button.getText(), button.getStyle(), button.getTheme()) : null;
            DeepLink deeplink = uspBanner.getDeeplink();
            UspBannerItemSettings uspBannerItemSettings = new UspBannerItemSettings(uspBanner.getBackgroundColor());
            UspBannerAnalytics analytics = uspBanner.getAnalytics();
            arrayList.add(new UspBannerItem(title, subtitle, uspBannerItemBadge, uspBannerItemButton, image, deeplink, uspBannerItemSettings, analytics != null ? new UspBannerItemAnalytics(analytics.getFromPage(), analytics.getTargetPage()) : null, null, 256, null));
        }
        return new UspBannersWidgetItem(null, false, arrayList, uspBannersWidget.getFromPage(), uspBannersWidget.getAnalytics(), uspBannersWidget.getSettings(), 3, null);
    }
}
