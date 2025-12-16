package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import com.avito.android.tariff_lf.remote.model.TariffPriceSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffPriceSegmentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/d;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TariffPriceSegment f299270c;

    public d(@Y61.k String str, @Y61.k TariffPriceSegment tariffPriceSegment) {
        this.f299269b = str;
        this.f299270c = tariffPriceSegment;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f299269b, dVar.f299269b) && L.f(this.f299270c, dVar.f299270c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF298316b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298316b() {
        return this.f299269b;
    }

    public final int hashCode() {
        return this.f299270c.hashCode() + (this.f299269b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "TariffPriceSegmentItem(stringId=" + this.f299269b + ", segment=" + this.f299270c + ')';
    }
}
