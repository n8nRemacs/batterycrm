package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DealCabinetInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/k;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface k {
    @Y61.k
    InterfaceC43160i<DealCabinetInternalAction> a(int i12, @Y61.k String str, @Y61.k GetMortgageListRequestStatus getMortgageListRequestStatus);

    @Y61.l
    Object b(@Y61.k String str, @Y61.k Continuation continuation);

    @Y61.k
    InterfaceC43160i<DealCabinetInternalAction> c();

    @Y61.k
    InterfaceC43160i<DealCabinetInternalAction> d(int i12, @Y61.k String str, @Y61.k GetClientListRequestStage getClientListRequestStage);

    @Y61.k
    InterfaceC43160i<DealCabinetInternalAction> e();
}
