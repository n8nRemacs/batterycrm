package com.avito.android.user_advert.advert.items.premier_partner_promo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PremierPartnerPromoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/premier_partner_promo/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309823b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309824c;

    public a(String str, String str2, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? "premier_partner_promo_item" : str2;
        this.f309823b = str;
        this.f309824c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309823b, aVar.f309823b) && L.f(this.f309824c, aVar.f309824c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return getF309824c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF310359b() {
        return this.f309824c;
    }

    public final int hashCode() {
        return this.f309824c.hashCode() + (this.f309823b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PremierPartnerPromoItem(itemId=");
        sb2.append(this.f309823b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f309824c, ')');
    }
}
