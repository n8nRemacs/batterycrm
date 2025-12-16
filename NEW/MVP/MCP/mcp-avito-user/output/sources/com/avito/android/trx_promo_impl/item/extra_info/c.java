package com.avito.android.trx_promo_impl.item.extra_info;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TrxPromoExtraInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/extra_info/c;", "Lcom/avito/conveyor_item/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f304295b;

    public c(@k AttributedText attributedText) {
        this.f304295b = attributedText;
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
        return this.f304295b.equals(cVar.f304295b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return -1836172142;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF301123b() {
        return "trx_promo_extra_info";
    }

    public final int hashCode() {
        return this.f304295b.hashCode() - 1086761554;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("TrxPromoExtraInfoItem(stringId=trx_promo_extra_info, info="), this.f304295b, ')');
    }
}
