package com.avito.android.advert_core.contactbar;

import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertContactsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class z extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.TooltipData f83277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f83278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, SafeDeal.TooltipData.Event, G0> f83279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(SafeDeal.TooltipData tooltipData, com.avito.android.lib.design.tooltip.k kVar, Y41.p<? super String, ? super SafeDeal.TooltipData.Event, G0> pVar) {
        super(1);
        this.f83277l = tooltipData;
        this.f83278m = kVar;
        this.f83279n = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        SafeDeal.TooltipData tooltipData = this.f83277l;
        oVar2.i(tooltipData.getTitle());
        oVar2.b(tooltipData.getText());
        com.avito.android.lib.design.tooltip.k kVar = this.f83278m;
        oVar2.e(new com.avito.android.advert.item.safedeal.trust_factors.k(kVar, 3));
        oVar2.f(true);
        kVar.setOnDismissListener(new com.avito.android.advert.item.service_booking.i(1, this.f83279n, tooltipData));
        return G0.f406611a;
    }
}
