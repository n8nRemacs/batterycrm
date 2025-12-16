package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem;
import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import com.avito.android.advert_details_items.price_hint.PriceHintItem;
import com.avito.android.remote.model.AdvertOldPriceHintSheet;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AdvertPriceHint;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/w3;", "Lcom/avito/android/advert/item/blocks/items_factories/v3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.w3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28072w3 implements InterfaceC28066v3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74056a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.fair_price.converter.a f74057b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f74058c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f74059d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f74060e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f74061f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C29640d f74062g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q2 f74063h;

    @Inject
    public C28072w3(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert.item.fair_price.converter.a aVar, @Y61.k @C27710t.j InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @Y61.k @C27710t.r InterfaceC35945t1<AdvertPrice> interfaceC35945t12, @C27710t.s @Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t13, @Y61.k InterfaceC28265d interfaceC28265d, @Y61.k C29640d c29640d, @Y61.k Q2 q22) {
        this.f74056a = jVar;
        this.f74057b = aVar;
        this.f74058c = interfaceC35945t1;
        this.f74059d = interfaceC35945t12;
        this.f74060e = interfaceC35945t13;
        this.f74061f = interfaceC28265d;
        this.f74062g = c29640d;
        this.f74063h = q22;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28066v3
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.serp.adapter.PersistableSpannedItem a(@Y61.k com.avito.android.remote.model.AdvertDetails r43) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.C28072w3.a(com.avito.android.remote.model.AdvertDetails):com.avito.android.serp.adapter.PersistableSpannedItem");
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28066v3
    @Y61.l
    public final AdvertDetailsPriceItem b(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return c(str, null, str2, str3, null, null, false, null, false, false, null, false, false, false, false, false, null);
    }

    public final AdvertDetailsPriceItem c(String str, AttributedText attributedText, String str2, String str3, String str4, AdvertOldPriceHintSheet advertOldPriceHintSheet, boolean z12, AdvertPriceHint advertPriceHint, boolean z13, boolean z14, BuyerBonuses buyerBonuses, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str5) {
        C28072w3 c28072w3;
        AdvertDetailsPriceItem.OldPriceHintBottomSheet oldPriceHintBottomSheet;
        boolean z22 = str.length() > 0 || str3.length() > 0;
        if (!z22 && buyerBonuses == null) {
            return null;
        }
        if (advertOldPriceHintSheet != null) {
            oldPriceHintBottomSheet = new AdvertDetailsPriceItem.OldPriceHintBottomSheet(advertOldPriceHintSheet.getTitle(), advertOldPriceHintSheet.getDescription(), advertOldPriceHintSheet.getButton().getTitle(), advertOldPriceHintSheet.getButton().getDeeplink());
            c28072w3 = this;
        } else {
            c28072w3 = this;
            oldPriceHintBottomSheet = null;
        }
        com.avito.android.advert.item.similars.j jVar = c28072w3.f74056a;
        return new AdvertDetailsPriceItem(0L, null, str, attributedText, str2, str3, str4, oldPriceHintBottomSheet, z12, (advertPriceHint == null || z12) ? null : new PriceHintItem(0L, null, advertPriceHint, jVar.a(), null, null, 51, null), buyerBonuses != null ? new BuyerBonusesItem(0L, null, buyerBonuses, str, str2, z22 && z19, jVar.a(), null, null, 387, null) : null, z13, z14, z15, z16, z17, z18, str5, jVar.a(), null, null, 1572867, null);
    }
}
