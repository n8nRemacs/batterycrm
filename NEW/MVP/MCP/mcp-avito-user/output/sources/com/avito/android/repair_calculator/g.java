package com.avito.android.repair_calculator;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.RepairPrices;
import com.avito.android.remote.model.RepairServicesCalculator;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRepairCalculatorBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/repair_calculator/g;", "Lcom/avito/android/repair_calculator/c;", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f254481b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.repair_calculator.beduin.a f254482c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f254483d;

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.repair_calculator.beduin.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f254481b = aVar;
        this.f254482c = aVar2;
        this.f254483d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem = (AdvertDetailsRepairCalculatorItem) aVar;
        this.f254483d.c(new wm0.d(advertDetailsRepairCalculatorItem.f254466c, advertDetailsRepairCalculatorItem.f254467d));
        RepairServicesCalculator repairServicesCalculator = advertDetailsRepairCalculatorItem.f254465b;
        RepairPrices prices = repairServicesCalculator.getPrices();
        if (prices != null) {
            iVar.qp(prices, repairServicesCalculator.isFlatNew(), new d(this, advertDetailsRepairCalculatorItem));
        }
        iVar.nk(new e(this, advertDetailsRepairCalculatorItem));
        iVar.Hm(new f(this, advertDetailsRepairCalculatorItem));
    }
}
