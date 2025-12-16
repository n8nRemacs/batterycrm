package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.BottomSheetPayloadItem;
import com.avito.android.remote.model.ComfortableDealPromoWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsPpRecallItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/n3;", "Lcom/avito/android/advert/item/blocks/items_factories/m3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.n3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28016n3 implements InterfaceC28009m3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73993a;

    @Inject
    public C28016n3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73993a = jVar;
    }

    public static AdvertDetailsPpRecallPromoItem.EventData b(DeepLink deepLink) {
        if (deepLink == null || !(deepLink instanceof ClickStreamLink)) {
            return null;
        }
        Map<String, String> map = ((ClickStreamLink) deepLink).f133109d;
        return new AdvertDetailsPpRecallPromoItem.EventData(map != null ? map.get("re_banner_name") : null, map != null ? map.get("placement") : null, map != null ? map.get("pagetype") : null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28009m3
    @Y61.l
    public final AdvertDetailsPpRecallPromoItem a(@Y61.k AdvertDetails advertDetails) {
        ComfortableDealPromoWidget comfortableDealPromoWidget = advertDetails.getComfortableDealPromoWidget();
        if (comfortableDealPromoWidget == null) {
            return null;
        }
        int iA2 = this.f73993a.a();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        long j12 = 162;
        String strValueOf = String.valueOf(162);
        String title = comfortableDealPromoWidget.getTitle();
        AttributedText subtitle = comfortableDealPromoWidget.getSubtitle();
        AdvertDetailsPpRecallPromoItem.ImageInformation imageInformation = new AdvertDetailsPpRecallPromoItem.ImageInformation(comfortableDealPromoWidget.getImageInformation().getImage(), comfortableDealPromoWidget.getImageInformation().getMargin().getTop(), comfortableDealPromoWidget.getImageInformation().getMargin().getBottom(), comfortableDealPromoWidget.getImageInformation().getMargin().getLeft(), comfortableDealPromoWidget.getImageInformation().getMargin().getRight());
        String radialGradientStringNameAttr = comfortableDealPromoWidget.getWidgetStyle().getRadialGradientStringNameAttr();
        Integer numI = radialGradientStringNameAttr != null ? com.avito.android.lib.util.f.i(radialGradientStringNameAttr) : null;
        String linearGradientAttr = comfortableDealPromoWidget.getWidgetStyle().getLinearGradientAttr();
        AdvertDetailsPpRecallPromoItem.WidgetStyle widgetStyle = new AdvertDetailsPpRecallPromoItem.WidgetStyle(numI, linearGradientAttr != null ? com.avito.android.lib.util.f.h(linearGradientAttr) : null, comfortableDealPromoWidget.getWidgetStyle().getColor());
        String phoneInputTitle = comfortableDealPromoWidget.getPhoneInputTitle();
        String text = comfortableDealPromoWidget.getSubmitButton().getText();
        DeepLink onTapAction = comfortableDealPromoWidget.getSubmitButton().getOnTapAction();
        if (onTapAction == null) {
            onTapAction = new NoMatchLink();
        }
        AdvertDetailsPpRecallPromoItem.SubmitButtonInformation submitButtonInformation = new AdvertDetailsPpRecallPromoItem.SubmitButtonInformation(text, onTapAction);
        AttributedText bottomText = comfortableDealPromoWidget.getBottomText();
        List<BottomSheetPayloadItem> bottomSheetItems = comfortableDealPromoWidget.getBottomSheetItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(bottomSheetItems, 10));
        Iterator it = bottomSheetItems.iterator();
        while (it.hasNext()) {
            BottomSheetPayloadItem bottomSheetPayloadItem = (BottomSheetPayloadItem) it.next();
            arrayList.add(new AdvertDetailsPpRecallPromoItem.SelectItem(bottomSheetPayloadItem.getIcon(), bottomSheetPayloadItem.getText(), bottomSheetPayloadItem.getOnSelectAction()));
            it = it;
            bottomText = bottomText;
        }
        return new AdvertDetailsPpRecallPromoItem(iA2, j12, strValueOf, title, subtitle, imageInformation, widgetStyle, phoneInputTitle, submitButtonInformation, bottomText, arrayList, comfortableDealPromoWidget.getCloseBannerPayload(), b(comfortableDealPromoWidget.getShowBannerPayload().getOnShowAction()), b(comfortableDealPromoWidget.getSubmitButton().getOnTapAction()), false, false, false);
    }
}
