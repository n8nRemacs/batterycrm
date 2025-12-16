package com.avito.android.sbc.utils;

import To0.C15384a;
import To0.C15385b;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sbc.create.model.ExpiresAtDto;
import com.avito.android.sbc.create.model.Offer;
import com.avito.android.sbc.generated.api.api_create_dispatch_vas_v_1.Offer;
import cp0.C39393d;
import cp0.C39394e;
import cp0.C39395f;
import cp0.j;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CreateDispatchVasV3ResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sbc_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* compiled from: CreateDispatchVasV3ResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f260184a;

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
            f260184a = iArr;
        }
    }

    @k
    public static final C15384a a(@k cp0.h hVar) {
        Parcelable discount;
        long id2 = hVar.getId();
        long availableAudienceCount = hVar.getAvailableAudienceCount();
        String previewMessage = hVar.getPreviewMessage();
        long price = hVar.getPrice();
        String status = hVar.getStatus();
        C39395f itemInfo = hVar.getItemInfo();
        To0.f fVar = new To0.f(itemInfo.getId(), itemInfo.getTitle(), itemInfo.getImageBySizes(), itemInfo.getOldPriceString(), itemInfo.getLocationWithMetro(), itemInfo.getUrlPath(), itemInfo.getUriPath());
        j tariff = hVar.getTariff();
        To0.h hVar2 = tariff != null ? new To0.h(GZ0.a.b(tariff.getDueDate(), new ParsePosition(0)), tariff.getTotalSends(), tariff.getSendsLeft()) : null;
        cp0.k vas = hVar.getVas();
        To0.i iVar = vas != null ? new To0.i(vas.getOfferLink()) : null;
        List<Offer> listE = hVar.e();
        ArrayList arrayList = new ArrayList(C42745f0.q(listE, 10));
        for (Offer offer : listE) {
            int i12 = a.f260184a[offer.getType().ordinal()];
            if (i12 == 1) {
                discount = new Offer.Discount(offer.getSlug(), offer.getName(), offer.getOfferText(), offer.getMessagePrice(), offer.getMinDiscount().longValue(), offer.getMaxDiscount().longValue(), b(offer.getExpiresAt()));
            } else if (i12 == 2) {
                discount = new Offer.DiscountPercent(offer.getSlug(), offer.getName(), offer.getOfferText(), offer.getMessagePrice(), offer.getMinDiscount().longValue(), offer.getMaxDiscount().longValue(), b(offer.getExpiresAt()));
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                discount = new Offer.Text(offer.getSlug(), offer.getName(), offer.getOfferText(), offer.getMessagePrice(), b(offer.getExpiresAt()));
            }
            arrayList.add(discount);
        }
        C39393d descriptions = hVar.getDescriptions();
        AttributedText audienceExplained = descriptions.getAudienceExplained();
        AttributedText howItWorks = descriptions.getHowItWorks();
        AttributedText noAudience = descriptions.getNoAudience();
        To0.g gVar = new To0.g(descriptions.getPreviewTitle().getStep1(), descriptions.getPreviewTitle().getStep2(), descriptions.getPreviewTitle().getStep3());
        String recipients = descriptions.getRecipients();
        String title = descriptions.getTitle();
        String offerTypeSubTitle = descriptions.getOfferTypeSubTitle();
        C42784z0 c42784z0 = C42784z0.f406748b;
        C15385b c15385b = new C15385b(audienceExplained, howItWorks, noAudience, gVar, recipients, title, offerTypeSubTitle, "", new AttributedText("", c42784z0, 1), "", new AttributedText("", c42784z0, 1), "", "", "", "");
        Long lValueOf = Long.valueOf(price);
        Boolean bool = Boolean.FALSE;
        return new C15384a(id2, availableAudienceCount, previewMessage, lValueOf, null, status, fVar, arrayList, hVar2, iVar, c15385b, bool, false, null, null, bool);
    }

    @k
    public static final ExpiresAtDto b(@k C39394e c39394e) {
        long j12 = c39394e.getDefault();
        long max = c39394e.getMax();
        return new ExpiresAtDto(Long.valueOf(j12), Long.valueOf(c39394e.getMin()), Long.valueOf(max), Boolean.valueOf(c39394e.getReadOnly()));
    }
}
