package com.avito.android.service_booking.mvi.step.mvi;

import Hs0.InterfaceC14030a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingMviStepFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LHs0/a;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState, com.avito.android.service_booking.mvi.step.mvi.entity.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f274775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f274776m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f274777n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f274778o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f274779p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, n nVar) {
        super(1);
        this.f274775l = iVar;
        this.f274776m = gVar;
        this.f274777n = screenPerformanceTracker;
        this.f274778o = sVar;
        this.f274779p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState, com.avito.android.service_booking.mvi.step.mvi.entity.a> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14030a, ServiceBookingMviStepInternalAction, ServiceBookingMviStepState, com.avito.android.service_booking.mvi.step.mvi.entity.a> qVar2 = qVar;
        qVar2.f92008d = this.f274775l;
        qVar2.f92009e = this.f274776m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f274777n, this.f274778o);
        qVar2.f92010f = this.f274779p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
