package com.avito.android.developments_agency_search.screen.deal_cabinet;

import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DealCabinetConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @Y61.k
    PrintableText a();

    @Y61.k
    DealRoomLink.Status b(@Y61.k GetClientListResponse.PendingClientStateStatus pendingClientStateStatus);

    @Y61.k
    GetMortgageListRequestStatus c(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar);

    @Y61.k
    PrintableText d();

    @Y61.k
    GetClientListRequestStage e(@Y61.k com.avito.android.developments_agency_search.adapter.checkable_item.a aVar);

    @Y61.k
    ArrayList f(@Y61.k kotlin.enums.a aVar, @Y61.k GetMortgageListRequestStatus getMortgageListRequestStatus);

    @Y61.k
    DealRoomLink.Status g(@Y61.k GetDealUpdatesResponse.UpdatedDeal updatedDeal);

    @Y61.k
    VisualRubricatorWidgetElementItem h(@Y61.k GetDealCabinetHeader.BannerItem bannerItem);

    @Y61.k
    ArrayList i(@Y61.k kotlin.enums.a aVar, @Y61.k GetClientListRequestStage getClientListRequestStage);
}
