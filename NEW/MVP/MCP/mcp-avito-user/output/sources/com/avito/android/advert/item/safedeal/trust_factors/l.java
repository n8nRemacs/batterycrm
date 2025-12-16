package com.avito.android.advert.item.safedeal.trust_factors;

import Ca1.ViewOnClickListenerC13236c;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsTooltipHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.TooltipData f79188l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f79189m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f79190n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SafeDeal.TooltipData tooltipData, com.avito.android.lib.design.tooltip.k kVar, d dVar) {
        super(1);
        this.f79188l = tooltipData;
        this.f79189m = kVar;
        this.f79190n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        SafeDeal.TooltipData tooltipData = this.f79188l;
        oVar2.i(tooltipData.getTitle());
        oVar2.b(tooltipData.getText());
        SafeDeal.TooltipData.Button button = tooltipData.getButton();
        com.avito.android.lib.design.tooltip.k kVar = this.f79189m;
        if (button != null) {
            oVar2.d(button.getText());
            oVar2.c(new ViewOnClickListenerC13236c(button, kVar, this.f79190n, 5));
        }
        oVar2.e(new k(kVar, 0));
        oVar2.f(true);
        return G0.f406611a;
    }
}
