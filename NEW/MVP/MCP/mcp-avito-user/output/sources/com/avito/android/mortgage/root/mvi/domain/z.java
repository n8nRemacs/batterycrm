package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageApplicationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/z;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface z {
    @Y61.l
    Object a(@Y61.k String str, @Y61.k Y41.l lVar, @Y61.k Y41.p pVar, @Y61.k Y41.p pVar2, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> b(@Y61.k String str, @Y61.k ApplicationProcessType applicationProcessType, boolean z12);
}
