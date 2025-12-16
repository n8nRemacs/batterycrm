package com.avito.android.campaigns_sale.counter;

import com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleCounterResult;
import kotlin.Metadata;

/* compiled from: CampaignsSaleCounterRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleCounterResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleCounterResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f113873b;

    public f(e eVar) {
        this.f113873b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String key = ((CampaignsSaleCounterResult) obj).getKey();
        e eVar = this.f113873b;
        eVar.f113872d.accept(Integer.valueOf((key == null || !eVar.f113871c.g(key)) ? 0 : 1));
    }
}
