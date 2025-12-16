package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import com.avito.android.advert_core.offers.items.OfferItem;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferButton;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity.OfferBottomSheetState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ContextButton;
import com.avito.android.remote.model.OffersPhoneParameters;
import com.avito.android.remote.model.SimpleAdvertAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: OfferStateMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/l;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f83913a = new l();

    @Y61.k
    public static OfferBottomSheetState a(@Y61.k OfferOpenParams offerOpenParams, @Y61.l Integer num) {
        DeepLink deepLink;
        String buttonStyle;
        String title;
        String icon;
        int iIntValue = num != null ? num.intValue() : offerOpenParams.f83862d;
        List<OfferItem> list = offerOpenParams.f83861c;
        OfferItem offerItem = (OfferItem) C42745f0.K(iIntValue, list);
        OfferButton offerButton = null;
        if ((offerItem != null ? offerItem.getF83832g() : null) != null) {
            ContextButton contextButton = offerItem.getF83832g();
            title = contextButton != null ? contextButton.getTitle() : null;
            ContextButton contextButton2 = offerItem.getF83832g();
            icon = contextButton2 != null ? contextButton2.getIcon() : null;
            ContextButton contextButton3 = offerItem.getF83832g();
            buttonStyle = contextButton3 != null ? contextButton3.getButtonStyle() : null;
            ContextButton contextButton4 = offerItem.getF83832g();
            deepLink = contextButton4 != null ? contextButton4.getUri() : null;
        } else {
            SimpleAdvertAction simpleAdvertAction = offerOpenParams.f83863e;
            String title2 = simpleAdvertAction.getTitle();
            OffersPhoneParameters offersPhoneParameters = offerOpenParams.f83860b;
            String icon2 = offersPhoneParameters != null ? offersPhoneParameters.getIcon() : null;
            String buttonStyle2 = offersPhoneParameters != null ? offersPhoneParameters.getButtonStyle() : null;
            deepLink = simpleAdvertAction.getDeepLink();
            String str = icon2;
            buttonStyle = buttonStyle2;
            title = title2;
            icon = str;
        }
        if (title != null && deepLink != null) {
            offerButton = new OfferButton(title, icon, buttonStyle, deepLink);
        }
        return new OfferBottomSheetState(list, iIntValue, offerButton);
    }
}
