package com.avito.android.service_fee_conditions.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qu0.InterfaceC47449a;
import qu0.InterfaceC47450b;

/* compiled from: ServiceFeeConditionsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lqu0/a;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lqu0/c;", "Lqu0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.l<q<InterfaceC47449a, ServiceFeeConditionsInternalAction, qu0.c, InterfaceC47450b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f278444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f278445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f278446n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f278447o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f278448p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f278444l = cVar;
        this.f278445m = aVar;
        this.f278446n = screenPerformanceTracker;
        this.f278447o = jVar;
        this.f278448p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47449a, ServiceFeeConditionsInternalAction, qu0.c, InterfaceC47450b> qVar) {
        q<InterfaceC47449a, ServiceFeeConditionsInternalAction, qu0.c, InterfaceC47450b> qVar2 = qVar;
        qVar2.f92008d = this.f278444l;
        qVar2.f92009e = this.f278445m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f278446n, this.f278447o);
        qVar2.f92010f = this.f278448p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
