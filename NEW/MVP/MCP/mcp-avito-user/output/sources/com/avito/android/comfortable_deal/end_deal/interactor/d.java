package com.avito.android.comfortable_deal.end_deal.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EndDealInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/interactor/d;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {
    @k
    InterfaceC43160i<EndDealInternalAction> a(int i12);

    @k
    InterfaceC43160i<EndDealInternalAction> b(@k Map<String, ? extends EndDealField> map, @l CommissionData commissionData, boolean z12);

    @k
    InterfaceC43160i<EndDealInternalAction> c(boolean z12);
}
