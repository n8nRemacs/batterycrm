package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.fmp.banner.AdvertDetailsFmpBannerItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.fmp.FMPBannerBackground;
import com.avito.android.remote.fmp.FMPBannerButton;
import com.avito.android.remote.fmp.FMPBannerPadding;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.fmp.FMPBanner;
import com.avito.android.remote.model.fmp.Fmp;
import com.avito.android.remote.model.fmp.util.Background;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.FmpButton;
import com.avito.android.remote.model.fmp.util.Padding;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFMPBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/t1;", "Lcom/avito/android/advert/item/blocks/items_factories/s1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28052t1 implements InterfaceC28046s1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74028a;

    @Inject
    public C28052t1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74028a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28046s1
    @Y61.l
    public final AdvertDetailsFmpBannerItem a(@Y61.k AdvertDetails advertDetails) {
        FMPBanner banner;
        FMPBannerButton fMPBannerButton;
        Fmp fmp = advertDetails.getFmp();
        if (fmp == null || (banner = fmp.getBanner()) == null) {
            return null;
        }
        AttributedText title = banner.getTitle();
        AttributedText subtitle = banner.getSubtitle();
        UniversalImage image = banner.getImage();
        DeepLink deeplink = banner.getDeeplink();
        AttributedText legal = banner.getLegal();
        Background background = banner.getBackground();
        FMPBannerBackground fMPBannerBackground = background != null ? new FMPBannerBackground(background.getSolid(), background.getGradient()) : null;
        FmpButton button = banner.getButton();
        if (button != null) {
            String text = button.getText();
            DeepLink deeplink2 = button.getDeeplink();
            String style = button.getStyle();
            List<FmpAnalyticsEvent> onClick = button.getOnClick();
            fMPBannerButton = new FMPBannerButton(text, deeplink2, style, onClick != null ? C28064v1.a(onClick) : null);
        } else {
            fMPBannerButton = null;
        }
        Padding padding = banner.getPadding();
        FMPBannerPadding fMPBannerPadding = padding != null ? new FMPBannerPadding(padding.getTop(), padding.getBottom(), padding.getLeft(), padding.getRight()) : null;
        List<FmpAnalyticsEvent> onSelect = banner.getOnSelect();
        ArrayList arrayListA = onSelect != null ? C28064v1.a(onSelect) : null;
        List<FmpAnalyticsEvent> onAppear = banner.getOnAppear();
        return new AdvertDetailsFmpBannerItem(title, subtitle, image, deeplink, legal, fMPBannerBackground, fMPBannerButton, fMPBannerPadding, arrayListA, onAppear != null ? C28064v1.a(onAppear) : null, 0L, null, this.f74028a.a(), null, null, 27648, null);
    }
}
