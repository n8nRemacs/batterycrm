package com.avito.android.trx_promo_goods.screens.configure.item.discount_v2;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDiscountV2BannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f303523b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f303524c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f303525d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final wZ.l f303526e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f303527f;

    public c(@InterfaceC42150f @l Integer num, @l AttributedText attributedText, @l AttributedText attributedText2, @l wZ.l lVar, @l DeepLink deepLink) {
        this.f303523b = num;
        this.f303524c = attributedText;
        this.f303525d = attributedText2;
        this.f303526e = lVar;
        this.f303527f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f303523b, cVar.f303523b) && L.f(this.f303524c, cVar.f303524c) && L.f(this.f303525d, cVar.f303525d) && L.f(this.f303526e, cVar.f303526e) && L.f(this.f303527f, cVar.f303527f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return 371333571;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF293121b() {
        return "trx_promo_goods_configure_discount_v2";
    }

    public final int hashCode() {
        Integer num = this.f303523b;
        int iHashCode = ((-1373561187) + (num == null ? 0 : num.hashCode())) * 31;
        AttributedText attributedText = this.f303524c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f303525d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        wZ.l lVar = this.f303526e;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        DeepLink deepLink = this.f303527f;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoDiscountV2BannerItem(stringId=trx_promo_goods_configure_discount_v2, gradientAttr=");
        sb2.append(this.f303523b);
        sb2.append(", title=");
        sb2.append(this.f303524c);
        sb2.append(", description=");
        sb2.append(this.f303525d);
        sb2.append(", image=");
        sb2.append(this.f303526e);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f303527f, ')');
    }
}
