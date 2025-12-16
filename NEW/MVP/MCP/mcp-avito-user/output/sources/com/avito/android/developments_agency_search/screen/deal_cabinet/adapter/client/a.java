package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.client;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/client/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GetClientListResponse.PendingClient f136786b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136787c;

    public a(@k GetClientListResponse.PendingClient pendingClient) {
        this.f136786b = pendingClient;
        this.f136787c = pendingClient.getId();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f136786b, ((a) obj).f136786b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return getF136787c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136787c() {
        return this.f136787c;
    }

    public final int hashCode() {
        return this.f136786b.hashCode();
    }

    @k
    public final String toString() {
        return "ClientItem(data=" + this.f136786b + ')';
    }
}
