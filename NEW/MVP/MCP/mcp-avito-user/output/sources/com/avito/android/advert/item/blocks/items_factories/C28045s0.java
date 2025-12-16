package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ComfortableDealAnalyticsEvent;
import com.avito.android.remote.model.ComfortableDealButton;
import com.avito.android.remote.model.ComfortableDealImageInformation;
import com.avito.android.remote.model.ComfortableDealPromoBanner;
import com.avito.android.remote.model.OpenQuizButton;
import com.avito.android.remote.model.Style;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsComfortableDealPromoItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/s0;", "Lcom/avito/android/advert/item/blocks/items_factories/r0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28045s0 implements InterfaceC28039r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74023a;

    @Inject
    public C28045s0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74023a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28039r0
    @Y61.l
    public final AdvertDetailsComfortableDealPromoItem a(@Y61.k AdvertDetails advertDetails) {
        AdvertDetailsComfortableDealPromoItem.WidgetStyle widgetStyle;
        Iterator it;
        AdvertDetailsComfortableDealPromoItem.Button button;
        AdvertDetailsComfortableDealPromoItem.AnalyticsEvent analyticsEvent;
        ComfortableDealPromoBanner comfortableDealPromoBanner = advertDetails.getComfortableDealPromoBanner();
        if (comfortableDealPromoBanner == null) {
            return null;
        }
        int iA2 = this.f74023a.a();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        long j12 = 164;
        String strValueOf = String.valueOf(164);
        String title = comfortableDealPromoBanner.getTitle();
        AttributedText subtitle = comfortableDealPromoBanner.getSubtitle();
        ComfortableDealImageInformation imageInformation = comfortableDealPromoBanner.getImageInformation();
        AdvertDetailsComfortableDealPromoItem.ImageInformation imageInformation2 = imageInformation != null ? new AdvertDetailsComfortableDealPromoItem.ImageInformation(imageInformation.getImage(), imageInformation.getMargin().getTop(), imageInformation.getMargin().getBottom(), imageInformation.getMargin().getLeft(), imageInformation.getMargin().getRight()) : null;
        Style style = comfortableDealPromoBanner.getStyle();
        if (style != null) {
            String linearGradient = style.getLinearGradient();
            widgetStyle = new AdvertDetailsComfortableDealPromoItem.WidgetStyle(linearGradient != null ? com.avito.android.lib.util.f.h(linearGradient) : null, style.getBackgroundColor());
        } else {
            widgetStyle = null;
        }
        List<ComfortableDealButton> buttons = comfortableDealPromoBanner.getButtons();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = buttons.iterator();
        while (it2.hasNext()) {
            OpenQuizButton openQuizButton = ((ComfortableDealButton) it2.next()).getOpenQuizButton();
            if (openQuizButton != null) {
                String text = openQuizButton.getText();
                DeepLink deeplink = openQuizButton.getDeeplink();
                ComfortableDealAnalyticsEvent onClickEvent = openQuizButton.getOnClickEvent();
                if (onClickEvent != null) {
                    it = it2;
                    analyticsEvent = new AdvertDetailsComfortableDealPromoItem.AnalyticsEvent(onClickEvent.getId(), onClickEvent.getVersion(), onClickEvent.getParams());
                } else {
                    it = it2;
                    analyticsEvent = null;
                }
                button = new AdvertDetailsComfortableDealPromoItem.Button(text, deeplink, analyticsEvent);
            } else {
                it = it2;
                button = null;
            }
            if (button != null) {
                arrayList.add(button);
            }
            it2 = it;
        }
        ComfortableDealAnalyticsEvent onShowEvent = comfortableDealPromoBanner.getOnShowEvent();
        return new AdvertDetailsComfortableDealPromoItem(iA2, j12, strValueOf, title, subtitle, imageInformation2, widgetStyle, arrayList, onShowEvent != null ? new AdvertDetailsComfortableDealPromoItem.AnalyticsEvent(onShowEvent.getId(), onShowEvent.getVersion(), onShowEvent.getParams()) : null);
    }
}
