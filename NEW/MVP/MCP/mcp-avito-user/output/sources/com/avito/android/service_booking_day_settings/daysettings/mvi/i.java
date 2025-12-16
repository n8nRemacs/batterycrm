package com.avito.android.service_booking_day_settings.daysettings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yt0.InterfaceC50300a;
import yt0.InterfaceC50301b;

/* compiled from: DaySettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lyt0/a;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsState;", "Lyt0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<q<InterfaceC50300a, DaySettingsInternalAction, DaySettingsState, InterfaceC50301b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f277050l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f277051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f277052n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f277053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f277054p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f277050l = gVar;
        this.f277051m = dVar;
        this.f277052n = screenPerformanceTracker;
        this.f277053o = nVar;
        this.f277054p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50300a, DaySettingsInternalAction, DaySettingsState, InterfaceC50301b> qVar) {
        q<InterfaceC50300a, DaySettingsInternalAction, DaySettingsState, InterfaceC50301b> qVar2 = qVar;
        qVar2.f92008d = this.f277050l;
        qVar2.f92009e = this.f277051m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f277052n, this.f277053o);
        qVar2.f92010f = this.f277054p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
