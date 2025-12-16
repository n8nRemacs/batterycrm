package com.avito.android.tariff.cpa.info.ui.items.statistics_info;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import dC0.C39561c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatisticsInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/statistics_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294928b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C39561c f294929c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C39561c f294930d;

    public a(@k String str, @l C39561c c39561c, @l C39561c c39561c2) {
        this.f294928b = str;
        this.f294929c = c39561c;
        this.f294930d = c39561c2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f294928b, aVar.f294928b) && L.f(this.f294929c, aVar.f294929c) && L.f(this.f294930d, aVar.f294930d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return -2098753756;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF289505b() {
        return "statisticsInfoItem";
    }

    public final int hashCode() {
        int iD2 = H.d(-636856996, 31, this.f294928b);
        C39561c c39561c = this.f294929c;
        int iHashCode = (iD2 + (c39561c == null ? 0 : c39561c.hashCode())) * 31;
        C39561c c39561c2 = this.f294930d;
        return iHashCode + (c39561c2 != null ? c39561c2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StatisticsInfoItem(stringId=statisticsInfoItem, title=" + this.f294928b + ", actionsCount=" + this.f294929c + ", spentAmount=" + this.f294930d + ')';
    }
}
