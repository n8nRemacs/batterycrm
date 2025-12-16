package com.avito.android.sbc.utils;

import To0.C15384a;
import To0.C15385b;
import To0.C15386c;
import Y61.k;
import bp0.C25689a;
import bp0.C25690b;
import bp0.C25691c;
import bp0.C25692d;
import com.avito.android.sbc.create.model.ExpiresAtDto;
import com.avito.android.sbc.create.model.Offer;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.ApiCreateDispatchV1Response;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.Offer;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.OkRespDataSuccessForecastPresetsItem;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CreateDispatchV3ResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sbc_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: CreateDispatchV3ResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f260183a;

        static {
            int[] iArr = new int[Offer.Type.values().length];
            try {
                iArr[Offer.Type.Discount.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Offer.Type.DiscountPercent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Offer.Type.Text.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f260183a = iArr;
        }
    }

    @k
    public static final C15384a a(@k ApiCreateDispatchV1Response.a aVar) {
        C15385b c15385b;
        ArrayList arrayList;
        Boolean bool;
        ArrayList arrayList2;
        long j12;
        ArrayList arrayList3;
        long id2 = aVar.getId();
        long recipientsCount = aVar.getRecipientsCount();
        String messageTemplate = aVar.getDescriptions().getPreviews().getPreview1().getMessageTemplate();
        long price = aVar.getItemInfo().getPrice();
        long pricePerRecipient = aVar.getPricePerRecipient();
        String status = aVar.getStatus();
        C25691c itemInfo = aVar.getItemInfo();
        To0.f fVar = new To0.f(itemInfo.getId(), itemInfo.getTitle(), itemInfo.getImageBySizes(), itemInfo.getOldPriceString(), itemInfo.getLocationWithMetro(), itemInfo.getUrlPath(), itemInfo.getUriPath());
        bp0.h tariff = aVar.getTariff();
        To0.h hVar = tariff != null ? new To0.h(GZ0.a.b(tariff.getDueDate(), new ParsePosition(0)), tariff.getTotalSends(), tariff.getSendsLeft()) : null;
        bp0.i vas = aVar.getVas();
        To0.i iVar = vas != null ? new To0.i(vas.getOfferLink()) : null;
        List<Offer> listI = aVar.i();
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listI, 10));
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList4.add(c((Offer) it.next(), aVar.getPricePerRecipient()));
            iVar = iVar;
        }
        To0.i iVar2 = iVar;
        C25692d descriptions = aVar.getDescriptions();
        C15385b c15385b2 = new C15385b(descriptions.getAudienceExplained(), descriptions.getHowItWorks(), descriptions.getNoAudience(), new To0.g(descriptions.getPreviews().getPreview1().getTitle(), "", ""), descriptions.getRecipients(), descriptions.getTitle(), descriptions.getOfferTypeSubTitle(), descriptions.getAutoDispatchSubTitle(), descriptions.getAutoDispatchExplained(), descriptions.getAutoDispatchRequired(), descriptions.getAutoDispatchSummaryExplained(), descriptions.getFastChipsRecommendationSubtitle(), descriptions.getFastChipsRecommendationTitle(), descriptions.getFastChipsSubtitle(), descriptions.getFastChipsTitle());
        Boolean autoDispatchFeatureSupport = aVar.getAutoDispatchFeatureSupport();
        boolean autoDispatchEnabledByDefault = aVar.getAutoDispatchEnabledByDefault();
        List<C25690b> listD = aVar.d();
        if (listD != null) {
            List<C25690b> list = listD;
            bool = autoDispatchFeatureSupport;
            ArrayList arrayList5 = new ArrayList(C42745f0.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C25690b c25690b = (C25690b) it2.next();
                arrayList5.add(new C15386c(c25690b.getDiscountValue(), c(c25690b.getOffer(), aVar.getPricePerRecipient()), c25690b.getSlug(), c25690b.getTitle()));
                c15385b2 = c15385b2;
                it2 = it2;
                arrayList4 = arrayList4;
            }
            c15385b = c15385b2;
            arrayList = arrayList4;
            arrayList2 = arrayList5;
        } else {
            c15385b = c15385b2;
            arrayList = arrayList4;
            bool = autoDispatchFeatureSupport;
            arrayList2 = null;
        }
        List<OkRespDataSuccessForecastPresetsItem> listE = aVar.e();
        if (listE != null) {
            List<OkRespDataSuccessForecastPresetsItem> list2 = listE;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                OkRespDataSuccessForecastPresetsItem okRespDataSuccessForecastPresetsItem = (OkRespDataSuccessForecastPresetsItem) it3.next();
                bp0.f audience = okRespDataSuccessForecastPresetsItem.getAudience();
                Iterator it4 = it3;
                long j13 = recipientsCount;
                arrayList6.add(new To0.d(new To0.e(Long.valueOf(audience.getMin()), audience.getMax()), okRespDataSuccessForecastPresetsItem.getBudget(), okRespDataSuccessForecastPresetsItem.getIsDefault(), okRespDataSuccessForecastPresetsItem.getTtlDays(), okRespDataSuccessForecastPresetsItem.getForecastType() == OkRespDataSuccessForecastPresetsItem.ForecastType.Preferred));
                it3 = it4;
                recipientsCount = j13;
            }
            j12 = recipientsCount;
            arrayList3 = arrayList6;
        } else {
            j12 = recipientsCount;
            arrayList3 = null;
        }
        return new C15384a(id2, j12, messageTemplate, Long.valueOf(price), Long.valueOf(pricePerRecipient), status, fVar, arrayList, hVar, iVar2, c15385b, bool, autoDispatchEnabledByDefault, arrayList2, arrayList3, aVar.getForecastsForAutoDispatchFeatureSupported());
    }

    @k
    public static final ExpiresAtDto b(@k C25689a c25689a) {
        long j12 = c25689a.getDefault();
        long max = c25689a.getMax();
        return new ExpiresAtDto(Long.valueOf(j12), Long.valueOf(c25689a.getMin()), Long.valueOf(max), Boolean.valueOf(c25689a.getReadOnly()));
    }

    @k
    public static final com.avito.android.sbc.create.model.Offer c(@k Offer offer, long j12) {
        int i12 = a.f260183a[offer.getType().ordinal()];
        if (i12 == 1) {
            return new Offer.Discount(offer.getSlug(), offer.getName(), offer.getOfferText(), j12, offer.getMinDiscount().longValue(), offer.getMaxDiscount().longValue(), b(offer.getExpiresAt()));
        }
        if (i12 == 2) {
            return new Offer.DiscountPercent(offer.getSlug(), offer.getName(), offer.getOfferText(), j12, offer.getMinDiscount().longValue(), offer.getMaxDiscount().longValue(), b(offer.getExpiresAt()));
        }
        if (i12 == 3) {
            return new Offer.Text(offer.getSlug(), offer.getName(), offer.getOfferText(), j12, b(offer.getExpiresAt()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
