package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import Os0.InterfaceC14732a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsInternalAction;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingAdditionalSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LOs0/a;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;", "LOs0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC14732a, ServiceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState, Os0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f275012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f275013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f275014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f275015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f275016p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f275012l = eVar;
        this.f275013m = cVar;
        this.f275014n = screenPerformanceTracker;
        this.f275015o = lVar;
        this.f275016p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14732a, ServiceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState, Os0.b> qVar) {
        q<InterfaceC14732a, ServiceBookingAdditionalSettingsInternalAction, ServiceBookingAdditionalSettingsState, Os0.b> qVar2 = qVar;
        qVar2.f92008d = this.f275012l;
        qVar2.f92009e = this.f275013m;
        qVar2.f92011g = new o(this.f275014n, this.f275015o);
        qVar2.f92010f = this.f275016p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
