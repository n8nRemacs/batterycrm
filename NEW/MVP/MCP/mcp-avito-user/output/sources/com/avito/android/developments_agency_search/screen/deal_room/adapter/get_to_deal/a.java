package com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetToDealItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/get_to_deal/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137386b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f137387c;

    public a(@k String str, @l String str2) {
        this.f137386b = str;
        this.f137387c = str2;
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
        return L.f(this.f137386b, aVar.f137386b) && L.f(this.f137387c, aVar.f137387c);
    }

    @Override // TV0.a
    public final long getId() {
        return 88679181;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF131998b() {
        return "booking-get-to-deal-item";
    }

    public final int hashCode() {
        int iD2 = H.d(-1545912685, 31, this.f137386b);
        String str = this.f137387c;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetToDealItem(stringId=booking-get-to-deal-item, dealId=");
        sb2.append(this.f137386b);
        sb2.append(", developerRequirementsLink=");
        return C22026a.c(sb2, this.f137387c, ')');
    }
}
