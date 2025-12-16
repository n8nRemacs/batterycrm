package com.avito.android.developments_agency_search.screen.deal_room.use_case;

import Y41.q;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UpdateDealNoteUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/use_case/e;", "Lkotlin/Function3;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements q<GetDealRoomInfoResponse, String, String, GetDealRoomInfoResponse> {
    @Inject
    public e() {
    }

    @Override // Y41.q
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GetDealRoomInfoResponse invoke(@k GetDealRoomInfoResponse getDealRoomInfoResponse, @k String str, @k String str2) {
        Iterator<GetDealRoomInfoResponse.Deal> it = getDealRoomInfoResponse.getDeals().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().getId(), str)) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return getDealRoomInfoResponse;
        }
        GetDealRoomInfoResponse.Deal deal = getDealRoomInfoResponse.getDeals().get(i12);
        GetDealRoomInfoResponse.Deal dealCopy = deal.copy((2031 & 1) != 0 ? deal.id : null, (2031 & 2) != 0 ? deal.title : null, (2031 & 4) != 0 ? deal.notes : str2, (2031 & 8) != 0 ? deal.progress : null, (2031 & 16) != 0 ? deal.revenue : null, (2031 & 32) != 0 ? deal.bookings : null, (2031 & 64) != 0 ? deal.selectionHistory : null, (2031 & 128) != 0 ? deal.preferences : null, (2031 & 256) != 0 ? deal.preferencesUri : null, (2031 & 512) != 0 ? deal.preferencesIds : null, (2031 & 1024) != 0 ? deal.recalculatedConfirmedLot : null);
        ArrayList arrayList = new ArrayList(getDealRoomInfoResponse.getDeals());
        arrayList.set(i12, dealCopy);
        return GetDealRoomInfoResponse.copy$default(getDealRoomInfoResponse, null, arrayList, null, 5, null);
    }
}
