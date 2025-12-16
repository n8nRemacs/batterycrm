package com.avito.android.service_booking_day_settings.daysettings;

import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DaySettingsViewHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DaySettingsState.SaveTooltip f277082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f277083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f277084n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DaySettingsState.SaveTooltip saveTooltip, com.avito.android.lib.design.tooltip.k kVar, Y41.a<G0> aVar) {
        super(1);
        this.f277082l = saveTooltip;
        this.f277083m = kVar;
        this.f277084n = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        DaySettingsState.SaveTooltip saveTooltip = this.f277082l;
        oVar2.b(saveTooltip.f277018c);
        oVar2.d(saveTooltip.f277017b);
        oVar2.c(new l(1, this.f277083m, this.f277084n));
        return G0.f406611a;
    }
}
