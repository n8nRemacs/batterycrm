package com.avito.android.auction.offer.domain;

import Nd.c;
import com.avito.android.auction.offer.items.benefit.AuctionBenefitItem;
import com.avito.android.auction.offer.items.link.AuctionLinkItem;
import com.avito.android.auction.offer.items.title.AuctionTitleItem;
import com.avito.android.auction.offer.mvi.p;
import com.avito.android.auction.remote.model.AuctionBenefit;
import com.avito.android.auction.remote.model.AuctionFooter;
import com.avito.android.auction.remote.model.AuctionOfferResponse;
import com.avito.android.auction.remote.model.AuctionOfferV2Response;
import com.avito.android.auction.remote.model.Button;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.text.AttributedText;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AuctionOfferMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/domain/j;", "", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f92518a;

    @Inject
    public j(@Y61.k p pVar) {
        this.f92518a = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Y61.k
    public static c.f a(@Y61.k AuctionOfferResponse auctionOfferResponse) {
        Button cancelButton;
        Button applyButton;
        AttributedText faq;
        ArrayList arrayList = new ArrayList();
        String title = auctionOfferResponse.getTitle();
        String text = 0;
        text = 0;
        int i12 = 1;
        arrayList.add(title == null ? null : new AuctionTitleItem(null, title, 1, null));
        List<AuctionBenefit> listC = auctionOfferResponse.c();
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        for (Object obj : listC) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            AuctionBenefit auctionBenefit = (AuctionBenefit) obj;
            String title2 = auctionBenefit.getTitle();
            String description = auctionBenefit.getDescription();
            AuctionBenefitItem auctionBenefitItem = (title2 == null && description == null) ? null : new AuctionBenefitItem(i13, title2, description, auctionBenefit.getImage());
            if (auctionBenefitItem != null) {
                arrayList2.add(auctionBenefitItem);
            }
            i13 = i14;
        }
        arrayList.addAll(arrayList2);
        AuctionFooter footer = auctionOfferResponse.getFooter();
        arrayList.add((footer == null || (faq = footer.getFaq()) == null) ? null : new AuctionLinkItem(text, faq, i12, text));
        ArrayList arrayListC = C42745f0.C(arrayList);
        AuctionFooter footer2 = auctionOfferResponse.getFooter();
        AttributedText terms = footer2 != null ? footer2.getTerms() : null;
        AuctionFooter footer3 = auctionOfferResponse.getFooter();
        String text2 = (footer3 == null || (applyButton = footer3.getApplyButton()) == null) ? null : applyButton.getText();
        AuctionFooter footer4 = auctionOfferResponse.getFooter();
        if (footer4 != null && (cancelButton = footer4.getCancelButton()) != null) {
            text = cancelButton.getText();
        }
        return new c.f(terms, text2, text, arrayListC);
    }

    @Y61.k
    public final c.g b(@Y61.k AuctionOfferV2Response auctionOfferV2Response) {
        Button cancelButton;
        Button applyButton;
        List<BeduinModel> components = auctionOfferV2Response.getComponents();
        p pVar = this.f92518a;
        com.avito.android.beduin_shared.model.utils.j.b(pVar.f92601a, "main", components);
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listD = pVar.f92601a.d();
        if (listD == null) {
            listD = C42784z0.f406748b;
        }
        AuctionFooter footer = auctionOfferV2Response.getFooter();
        String text = null;
        AttributedText terms = footer != null ? footer.getTerms() : null;
        AuctionFooter footer2 = auctionOfferV2Response.getFooter();
        String text2 = (footer2 == null || (applyButton = footer2.getApplyButton()) == null) ? null : applyButton.getText();
        AuctionFooter footer3 = auctionOfferV2Response.getFooter();
        if (footer3 != null && (cancelButton = footer3.getCancelButton()) != null) {
            text = cancelButton.getText();
        }
        return new c.g(listD, terms, text2, text);
    }
}
