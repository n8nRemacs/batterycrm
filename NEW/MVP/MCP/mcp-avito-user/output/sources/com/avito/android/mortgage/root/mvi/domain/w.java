package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.MortgageVerificationFlow;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InitialLoadingSideEffectUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/w;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface w {
    @Y61.k
    InterfaceC43160i<MortgageRootInternalAction> a(@Y61.k String str, @Y61.l MortgageVerificationFlow mortgageVerificationFlow, @Y61.l DeepLink deepLink);
}
