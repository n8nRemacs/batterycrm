package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.root.list.items.realty_object_details.DetailsBlockOption;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UpsertRealtyObjectInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/N;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface N {
    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, boolean z12);

    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> b(@Y61.k String str, @Y61.k KZ.D d12);

    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> c(@Y61.k String str, @Y61.k DetailsBlockOption.Type type);

    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> d(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> e(@Y61.k String str, @Y61.k KZ.D d12);
}
