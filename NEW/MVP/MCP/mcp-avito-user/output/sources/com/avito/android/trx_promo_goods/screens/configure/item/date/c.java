package com.avito.android.trx_promo_goods.screens.configure.item.date;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureDateItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/date/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f303508b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303509c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f303510d;

    public c(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f303508b = str;
        this.f303509c = str2;
        this.f303510d = deepLink;
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
        return L.f(this.f303508b, cVar.f303508b) && this.f303509c.equals(cVar.f303509c) && L.f(this.f303510d, cVar.f303510d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return 645118021;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF302516b() {
        return "trx_promo_goods_configure_date";
    }

    public final int hashCode() {
        return this.f303510d.hashCode() + H.d(H.d(-1476177829, 31, this.f303508b), 31, this.f303509c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureDateItem(stringId=trx_promo_goods_configure_date, title=");
        sb2.append(this.f303508b);
        sb2.append(", formattedDate=");
        sb2.append(this.f303509c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f303510d, ')');
    }
}
