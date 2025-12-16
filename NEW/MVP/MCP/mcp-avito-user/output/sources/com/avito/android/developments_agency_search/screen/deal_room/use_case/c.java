package com.avito.android.developments_agency_search.screen.deal_room.use_case;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UpdateDealClientUseCase.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/use_case/c;", "Lkotlin/Function2;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/e;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements p<GetDealRoomInfoResponse, com.avito.android.developments_agency_search.screen.deal_room.edit_client.e, GetDealRoomInfoResponse> {
    @Inject
    public c() {
    }

    @k
    public static GetDealRoomInfoResponse a(@k GetDealRoomInfoResponse getDealRoomInfoResponse, @k com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar) {
        return GetDealRoomInfoResponse.copy$default(getDealRoomInfoResponse, GetDealRoomInfoResponse.ClientInfo.copy$default(getDealRoomInfoResponse.getClient(), null, null, null, eVar.f137554b, eVar.f137555c, eVar.f137556d, eVar.f137557e, 7, null), null, null, 6, null);
    }

    @Override // Y41.p
    public final /* bridge */ /* synthetic */ GetDealRoomInfoResponse invoke(GetDealRoomInfoResponse getDealRoomInfoResponse, com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar) {
        return a(getDealRoomInfoResponse, eVar);
    }
}
