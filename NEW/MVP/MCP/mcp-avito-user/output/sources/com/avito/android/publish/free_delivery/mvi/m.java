package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import he0.C40926c;
import he0.InterfaceC40924a;
import he0.InterfaceC40925b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lhe0/a;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lhe0/c;", "Lhe0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40924a, FreeDeliveryInternalAction, C40926c, InterfaceC40925b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f235854l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f235855m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f235856n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f235857o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f235858p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, i iVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar) {
        super(1);
        this.f235854l = kVar;
        this.f235855m = iVar;
        this.f235856n = screenPerformanceTracker;
        this.f235857o = rVar;
        this.f235858p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40924a, FreeDeliveryInternalAction, C40926c, InterfaceC40925b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40924a, FreeDeliveryInternalAction, C40926c, InterfaceC40925b> qVar2 = qVar;
        qVar2.f92008d = this.f235854l;
        qVar2.f92009e = this.f235855m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f235856n, this.f235857o);
        qVar2.f92010f = this.f235858p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
