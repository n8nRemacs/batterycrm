package com.avito.android.developments_agency_search.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetDealRoomInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/b;", "", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "client", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "deal", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "selection", "<init>", "(Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;)V", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "a", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "b", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "c", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b {

    @c("clientInfo")
    @k
    private final GetDealRoomInfoResponse.ClientInfo client;

    @c("deal")
    @k
    private final GetDealRoomInfoResponse.Deal deal;

    @c("selection")
    @l
    private final GetDealRoomInfoResponse.Selection selection;

    public b(@k GetDealRoomInfoResponse.ClientInfo clientInfo, @k GetDealRoomInfoResponse.Deal deal, @l GetDealRoomInfoResponse.Selection selection) {
        this.client = clientInfo;
        this.deal = deal;
        this.selection = selection;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final GetDealRoomInfoResponse.ClientInfo getClient() {
        return this.client;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final GetDealRoomInfoResponse.Deal getDeal() {
        return this.deal;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final GetDealRoomInfoResponse.Selection getSelection() {
        return this.selection;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.client, bVar.client) && L.f(this.deal, bVar.deal) && L.f(this.selection, bVar.selection);
    }

    public final int hashCode() {
        int iHashCode = (this.deal.hashCode() + (this.client.hashCode() * 31)) * 31;
        GetDealRoomInfoResponse.Selection selection = this.selection;
        return iHashCode + (selection == null ? 0 : selection.hashCode());
    }

    @k
    public final String toString() {
        return "GetSingleDealRoomInfoResponse(client=" + this.client + ", deal=" + this.deal + ", selection=" + this.selection + ')';
    }
}
