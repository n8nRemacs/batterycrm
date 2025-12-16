package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CampaignsSaleSearchBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/campaigns_sale_search/mvi/m;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.android.arch.mvi.b<CampaignsSaleSearchInternalAction> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CampaignsSaleSearchInternalAction> a() {
        return new C43210w(CampaignsSaleSearchInternalAction.ShowKeyboard.f114738b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
