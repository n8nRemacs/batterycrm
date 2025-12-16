package com.avito.android.service_booking_details.mvi;

import Bt0.InterfaceC13184a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingItemDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LBt0/a;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "LBt0/c;", "LBt0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13184a, ServiceBookingItemDetailsInternalAction, Bt0.c, Bt0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f277441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f277442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f277443n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f277444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f277445p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, h hVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, o oVar) {
        super(1);
        this.f277441l = jVar;
        this.f277442m = hVar;
        this.f277443n = screenPerformanceTracker;
        this.f277444o = qVar;
        this.f277445p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13184a, ServiceBookingItemDetailsInternalAction, Bt0.c, Bt0.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13184a, ServiceBookingItemDetailsInternalAction, Bt0.c, Bt0.b> qVar2 = qVar;
        qVar2.f92008d = this.f277441l;
        qVar2.f92009e = this.f277442m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f277443n, this.f277444o);
        qVar2.f92010f = this.f277445p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
