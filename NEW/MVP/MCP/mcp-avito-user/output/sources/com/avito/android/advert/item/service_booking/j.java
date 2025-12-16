package com.avito.android.advert.item.service_booking;

import Ca1.ViewOnClickListenerC13236c;
import com.avito.android.advert.item.service_booking.ServiceBookingItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingItem.TooltipInfo f79842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f79843m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f79844n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f79845o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f79846p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ServiceBookingItem.TooltipInfo tooltipInfo, boolean z12, com.avito.android.lib.design.tooltip.k kVar, k kVar2, Y41.a<G0> aVar) {
        super(1);
        this.f79842l = tooltipInfo;
        this.f79843m = z12;
        this.f79844n = kVar;
        this.f79845o = kVar2;
        this.f79846p = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        ServiceBookingItem.TooltipInfo tooltipInfo = this.f79842l;
        oVar2.b(tooltipInfo.f79822c);
        oVar2.i(tooltipInfo.f79821b);
        Y41.a<G0> aVar = this.f79846p;
        boolean z12 = this.f79843m;
        com.avito.android.lib.design.tooltip.k kVar = this.f79844n;
        k kVar2 = this.f79845o;
        if (z12) {
            oVar2.d(tooltipInfo.f79824e);
            oVar2.c(new ViewOnClickListenerC13236c(kVar2, aVar, kVar, 7));
        } else {
            kVar.setOnDismissListener(new i(0, kVar2, aVar));
        }
        return G0.f406611a;
    }
}
