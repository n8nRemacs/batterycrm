package com.avito.android.developments_agency_search.screen.deal_room_development;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.PriceTooltip;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DealRoomDevelopmentConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/a;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.screen.deal_room_development.a {

    /* compiled from: DealRoomDevelopmentConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/b$a;", "", "<init>", "()V", "", "ADDITIONAL_INFO_ITEMS_SEPARATOR", "Ljava/lang/String;", "LOT_ITEM_STRING_ID_PREFIX", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.a
    @k
    public final ArrayList a(@k List list) {
        List<GetDealRoomInfoResponse.Deal.SelectionHistory.Item.Lot> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (GetDealRoomInfoResponse.Deal.SelectionHistory.Item.Lot lot : list2) {
            String strO = C42745f0.O(C42745f0.U(lot.getFlatNumber(), lot.getRoomType(), lot.getTotalArea(), lot.getFloor()), "  ·  ", null, null, null, 62);
            String str = "lot-" + lot.getId();
            boolean z12 = !lot.isActive();
            long id2 = lot.getId();
            Image image = lot.getImage();
            String price = lot.getPrice();
            PriceTooltip priceTooltip = lot.getPriceTooltip();
            arrayList.add(new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.a(str, id2, z12, image, price, priceTooltip != null ? priceTooltip.getText() : null, lot.getCommissionInfoFormatted(), strO, lot.isActive(), !lot.isActive()));
        }
        return arrayList;
    }
}
