package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lj.InterfaceC43779a;

/* compiled from: CampaignsSaleBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/I;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I implements com.avito.android.arch.mvi.b<CampaignsSaleInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f114094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f114095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.campaigns_sale.network.a f114096c;

    @Inject
    public I(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k InterfaceC43779a interfaceC43779a, @Y61.k com.avito.android.campaigns_sale.network.a aVar) {
        this.f114094a = interfaceC40691b;
        this.f114095b = interfaceC43779a;
        this.f114096c = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CampaignsSaleInternalAction> a() {
        return C43175k.N(C43175k.G(new H(this, null)), new G(kotlinx.coroutines.rx3.y.a(this.f114095b.getF103348p())));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f114094a.onCleared();
        return G0.f406611a;
    }
}
