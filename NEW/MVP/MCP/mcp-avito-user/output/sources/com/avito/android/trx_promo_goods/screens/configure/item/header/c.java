package com.avito.android.trx_promo_goods.screens.configure.item.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f303556b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f303557c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f303558d;

    public c(@k String str, @l AttributedText attributedText, @l UniversalImage universalImage) {
        this.f303556b = str;
        this.f303557c = attributedText;
        this.f303558d = universalImage;
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
        return L.f(this.f303556b, cVar.f303556b) && L.f(this.f303557c, cVar.f303557c) && L.f(this.f303558d, cVar.f303558d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return 1600774500;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF300713b() {
        return "trx_promo_goods_configure_header";
    }

    public final int hashCode() {
        int iD2 = H.d(-1915598052, 31, this.f303556b);
        AttributedText attributedText = this.f303557c;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f303558d;
        return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureHeaderItem(stringId=trx_promo_goods_configure_header, title=");
        sb2.append(this.f303556b);
        sb2.append(", description=");
        sb2.append(this.f303557c);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f303558d, ')');
    }
}
