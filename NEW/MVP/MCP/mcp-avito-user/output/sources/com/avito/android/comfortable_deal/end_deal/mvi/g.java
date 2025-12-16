package com.avito.android.comfortable_deal.end_deal.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EndDealBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.b<EndDealInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.end_deal.interactor.d f122339a;

    @Inject
    public g(@Y61.k com.avito.android.comfortable_deal.end_deal.interactor.d dVar) {
        this.f122339a = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EndDealInternalAction> a() {
        return this.f122339a.c(true);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
