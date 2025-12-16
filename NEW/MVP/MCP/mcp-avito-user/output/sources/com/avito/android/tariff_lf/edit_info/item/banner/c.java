package com.avito.android.tariff_lf.edit_info.item.banner;

import Y61.k;
import Y61.l;
import cD0.C27022p;
import kotlin.Metadata;

/* compiled from: TariffUpsellBannerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C27022p f298892b;

    public c(@k C27022p c27022p) {
        this.f298892b = c27022p;
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
        return this.f298892b.equals(cVar.f298892b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return -373208853;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF291445k() {
        return "tariff_upsell_banner_item_id";
    }

    public final int hashCode() {
        return this.f298892b.hashCode() + 1315427445;
    }

    @k
    public final String toString() {
        return "TariffUpsellBannerItem(stringId=tariff_upsell_banner_item_id, salesBanner=" + this.f298892b + ')';
    }
}
