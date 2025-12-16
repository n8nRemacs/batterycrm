package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search_impl.generated.api.api_1_nd_trx_mortgage_list_post.MortgageApplicationView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/mortgage/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MortgageApplicationView f136840b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136841c;

    public a(@k MortgageApplicationView mortgageApplicationView) {
        this.f136840b = mortgageApplicationView;
        this.f136841c = mortgageApplicationView.getId();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f136840b, ((a) obj).f136840b);
    }

    @Override // TV0.a
    public final long getId() {
        return getF136841c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136841c() {
        return this.f136841c;
    }

    public final int hashCode() {
        return this.f136840b.hashCode();
    }

    @k
    public final String toString() {
        return "MortgageItem(data=" + this.f136840b + ')';
    }
}
