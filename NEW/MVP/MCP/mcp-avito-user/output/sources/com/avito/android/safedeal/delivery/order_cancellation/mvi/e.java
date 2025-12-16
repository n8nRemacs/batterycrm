package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import Hn0.InterfaceC14013a;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.safedeal.delivery.order_cancellation.mvi.entity.RdsOrderCancellationReasonsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RdsOrderCancellationReasonsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LHn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "LHn0/c;", "LHn0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<q<InterfaceC14013a, RdsOrderCancellationReasonsInternalAction, Hn0.c, Hn0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f256378l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f256379m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f256380n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f256381o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f256382p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f256378l = cVar;
        this.f256379m = aVar;
        this.f256380n = screenPerformanceTracker;
        this.f256381o = jVar;
        this.f256382p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14013a, RdsOrderCancellationReasonsInternalAction, Hn0.c, Hn0.b> qVar) {
        q<InterfaceC14013a, RdsOrderCancellationReasonsInternalAction, Hn0.c, Hn0.b> qVar2 = qVar;
        qVar2.f92008d = this.f256378l;
        qVar2.f92009e = this.f256379m;
        qVar2.f92011g = new o(this.f256380n, this.f256381o);
        qVar2.f92010f = this.f256382p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
