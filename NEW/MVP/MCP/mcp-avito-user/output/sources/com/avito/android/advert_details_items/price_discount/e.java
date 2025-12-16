package com.avito.android.advert_details_items.price_discount;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t9.InterfaceC48520a;

/* compiled from: PriceWithDiscountPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price_discount/e;", "Lcom/avito/android/advert_details_items/price_discount/c;", "Lcom/avito/android/advert_details_items/buyer_bonuses/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c, com.avito.android.advert_details_items.buyer_bonuses.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85326b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC48520a f85327c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f85328d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.price_hint.f f85329e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.buyer_bonuses.c f85330f;

    @Inject
    public e(@k @InterfaceC30174s String str, @k InterfaceC48520a interfaceC48520a, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.advert_details_items.price_hint.f fVar, @k com.avito.android.advert_details_items.buyer_bonuses.c cVar) {
        this.f85326b = str;
        this.f85327c = interfaceC48520a;
        this.f85328d = interfaceC28373a;
        this.f85329e = fVar;
        this.f85330f = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r7, TV0.a r8, int r9) {
        /*
            r6 = this;
            com.avito.android.advert_details_items.price_discount.g r7 = (com.avito.android.advert_details_items.price_discount.g) r7
            com.avito.android.advert_details_items.price_discount.PriceWithDiscountItem r8 = (com.avito.android.advert_details_items.price_discount.PriceWithDiscountItem) r8
            java.lang.String r0 = r8.f85305d
            r7.pT(r0)
            com.avito.android.remote.model.AdvertDiscounts r0 = r8.f85309h
            if (r0 != 0) goto L10
            com.avito.android.remote.model.AdvertDiscounts r1 = r8.f85308g
            goto L11
        L10:
            r1 = r0
        L11:
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            r2 = 0
            java.lang.String r3 = r8.f85306e
            if (r3 == 0) goto L2a
            if (r1 == 0) goto L22
            com.avito.android.remote.model.PriceWithDiscount r4 = r1.getPriceWithDiscount()
            goto L23
        L22:
            r4 = r2
        L23:
            if (r4 == 0) goto L26
            goto L2a
        L26:
            r7.fs(r3)
            goto L2d
        L2a:
            r7.Su()
        L2d:
            boolean r4 = r8.f85311j
            if (r4 == 0) goto L34
            r7.y1()
        L34:
            if (r3 == 0) goto L41
            java.lang.String r4 = r8.f85310i
            if (r4 == 0) goto L41
            java.lang.String r5 = r8.f85307f
            if (r5 == 0) goto L41
            r7.Eu(r3, r4, r5)
        L41:
            if (r1 == 0) goto L7b
            java.util.List r3 = r1.getDiscounts()
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L7b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L52
            goto L7b
        L52:
            com.avito.android.remote.model.PriceWithDiscount r3 = r1.getPriceWithDiscount()
            if (r3 == 0) goto L63
            r7.lL()
            com.avito.android.remote.model.PriceWithDiscount r2 = r1.getPriceWithDiscount()
            r7.NF(r2)
            goto L69
        L63:
            r7.KP()
            r7.NF(r2)
        L69:
            com.avito.android.remote.model.advert_details.ContactBarData r2 = r8.f85313l
            t9.a r3 = r6.f85327c
            java.util.List<com.avito.android.component.advert_contact_bar.ContactBar$Button$Action> r4 = r8.f85312k
            r3.a(r1, r4, r2, r0)
            com.avito.android.advert_details_items.price_discount.d r0 = new com.avito.android.advert_details_items.price_discount.d
            r0.<init>(r7, r6)
            r7.a(r0)
            goto L84
        L7b:
            r7.t3()
            r7.lL()
            r7.NF(r2)
        L84:
            com.avito.android.advert_details_items.price_hint.PriceHintItem r0 = r8.f85314m
            if (r0 == 0) goto L8d
            com.avito.android.advert_details_items.price_hint.f r1 = r6.f85329e
            r1.O5(r7, r0, r9)
        L8d:
            com.avito.android.advert_details_items.buyer_bonuses.BuyerBonusesItem r8 = r8.f85315n
            if (r8 == 0) goto L96
            com.avito.android.advert_details_items.buyer_bonuses.c r0 = r6.f85330f
            r0.k(r7, r8, r9)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_details_items.price_discount.e.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.c
    public final void k(@k com.avito.android.advert_details_items.buyer_bonuses.f fVar, @k BuyerBonusesItem buyerBonusesItem, int i12) {
        this.f85330f.k(fVar, buyerBonusesItem, i12);
    }
}
