package com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealStageBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_stage_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137312b;

    public a(@k String str) {
        this.f137312b = str;
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
        return L.f(this.f137312b, aVar.f137312b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return -122488412;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF131428d() {
        return "deal-stage-banner-item";
    }

    public final int hashCode() {
        return this.f137312b.hashCode() + 497826524;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("DealStageBannerItem(stringId=deal-stage-banner-item, rewardAmount="), this.f137312b, ')');
    }
}
