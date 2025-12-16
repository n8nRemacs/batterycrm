package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealUpdateItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GetDealUpdatesResponse.UpdatedDeal f136808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136809c;

    public a(@k GetDealUpdatesResponse.UpdatedDeal updatedDeal) {
        this.f136808b = updatedDeal;
        this.f136809c = updatedDeal.getDealId();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f136808b, ((a) obj).f136808b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return getF138457b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138457b() {
        return this.f136809c;
    }

    public final int hashCode() {
        return this.f136808b.hashCode();
    }

    @k
    public final String toString() {
        return "DealUpdateItem(data=" + this.f136808b + ')';
    }
}
