package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.additionalSeller.AdditionalSellerButtonItem;
import com.avito.android.advert.item.additionalSeller.AdditionalSellerFeaturesItem;
import com.avito.android.advert.item.additionalSeller.title_item.AdditionalSellerTitleItem;
import com.avito.android.advert.item.blocks.items_factories.B3;
import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27963g;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27984j;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28005m;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailsAboutHouseBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/g;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27842g implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f73561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27984j f73562b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27963g f73563c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.blocks.h f73564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28005m f73565e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final B3 f73566f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73567g;

    @Inject
    public C27842g(@Y61.k C28070w1 c28070w1, @Y61.k InterfaceC27984j interfaceC27984j, @Y61.k InterfaceC27963g interfaceC27963g, @Y61.k com.avito.android.advert_core.blocks.h hVar, @Y61.k InterfaceC28005m interfaceC28005m, @Y61.k B3 b32, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73561a = c28070w1;
        this.f73562b = interfaceC27984j;
        this.f73563c = interfaceC27963g;
        this.f73564d = hVar;
        this.f73565e = interfaceC28005m;
        this.f73566f = b32;
        this.f73567g = jVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdditionalSellerTitleItem additionalSellerTitleItemA;
        AdvertDetailsGapItem advertDetailsGapItemA;
        AdvertDetailsGapItem advertDetailsGapItemA2;
        AttributedText attributedText;
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItemA;
        int i12;
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        AdditionalSeller additionalSeller = advertDetailsWithMeta.f82645b.getAdditionalSeller();
        boolean z12 = (additionalSeller != null ? additionalSeller.getRatingPreview() : null) != null;
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        AdditionalSeller additionalSeller2 = advertDetails.getAdditionalSeller();
        AttributedText title = additionalSeller2 != null ? additionalSeller2.getTitle() : null;
        com.avito.android.advert_core.blocks.h hVar = this.f73564d;
        if (z12) {
            additionalSellerTitleItemA = this.f73565e.a(advertDetails);
            AdditionalSeller additionalSeller3 = advertDetails.getAdditionalSeller();
            advertDetailsReviewsScoreItemA = this.f73566f.a(additionalSeller3 != null ? additionalSeller3.getRatingPreview() : null);
            attributedText = null;
            advertDetailsGapItemA = hVar.a(8);
            advertDetailsGapItemA2 = hVar.a(2);
        } else {
            additionalSellerTitleItemA = null;
            advertDetailsGapItemA = null;
            advertDetailsGapItemA2 = null;
            attributedText = title;
            advertDetailsReviewsScoreItemA = null;
        }
        AdditionalSeller additionalSeller4 = advertDetails.getAdditionalSeller();
        List<AdvertParameters.Parameter> params = additionalSeller4 != null ? additionalSeller4.getParams() : null;
        boolean z13 = !advertDetails.isActive();
        AdditionalSeller additionalSeller5 = advertDetails.getAdditionalSeller();
        C28070w1.a aVarA = C28070w1.a(this.f73561a, params, z13, attributedText, additionalSeller5 != null ? additionalSeller5.getExpandParamsButton() : null, AdvertDetailsFlatViewType.f82421c, advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), this.f73567g.a(), null, false, null, advertDetails.hasModelCardLink(), false, false, null, 14592);
        AdditionalSeller additionalSeller6 = advertDetails.getAdditionalSeller();
        String featuresTitle = additionalSeller6 != null ? additionalSeller6.getFeaturesTitle() : null;
        AdditionalSeller additionalSeller7 = advertDetails.getAdditionalSeller();
        AdditionalSellerFeaturesItem additionalSellerFeaturesItemA = this.f73562b.a(featuresTitle, additionalSeller7 != null ? additionalSeller7.getFeatures() : null);
        AdditionalSellerButtonItem additionalSellerButtonItemA = this.f73563c.a(advertDetails);
        if (additionalSellerButtonItemA != null) {
            i12 = 24;
        } else {
            i12 = (aVarA != null ? aVarA.f74054b : null) != null ? 20 : 12;
        }
        return C42756l.B(new PersistableSpannedItem[]{additionalSellerTitleItemA, advertDetailsGapItemA, advertDetailsReviewsScoreItemA, advertDetailsGapItemA2, aVarA != null ? aVarA.f74053a : null, aVarA != null ? aVarA.f74054b : null, hVar.a((aVarA != null ? aVarA.f74054b : null) != null ? 20 : 12), additionalSellerButtonItemA, hVar.a(i12), additionalSellerFeaturesItemA});
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
