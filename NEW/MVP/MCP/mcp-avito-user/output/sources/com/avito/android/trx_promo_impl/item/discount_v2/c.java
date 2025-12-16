package com.avito.android.trx_promo_impl.item.discount_v2;

import RF0.m;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoStrDiscountV2BannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/discount_v2/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f304273b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f304274c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f304275d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final m f304276e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f304277f;

    public c(@InterfaceC42150f @l Integer num, @l AttributedText attributedText, @l AttributedText attributedText2, @l m mVar, @l DeepLink deepLink) {
        this.f304273b = num;
        this.f304274c = attributedText;
        this.f304275d = attributedText2;
        this.f304276e = mVar;
        this.f304277f = deepLink;
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
        return L.f(this.f304273b, cVar.f304273b) && L.f(this.f304274c, cVar.f304274c) && L.f(this.f304275d, cVar.f304275d) && this.f304276e.equals(cVar.f304276e) && L.f(this.f304277f, cVar.f304277f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return 972809157;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF293121b() {
        return "trx_promo_discount_v2";
    }

    public final int hashCode() {
        Integer num = this.f304273b;
        int iHashCode = (92312795 + (num == null ? 0 : num.hashCode())) * 31;
        AttributedText attributedText = this.f304274c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f304275d;
        int iHashCode3 = (this.f304276e.hashCode() + ((iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f304277f;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoStrDiscountV2BannerItem(stringId=trx_promo_discount_v2, gradientAttr=");
        sb2.append(this.f304273b);
        sb2.append(", title=");
        sb2.append(this.f304274c);
        sb2.append(", description=");
        sb2.append(this.f304275d);
        sb2.append(", image=");
        sb2.append(this.f304276e);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f304277f, ')');
    }
}
