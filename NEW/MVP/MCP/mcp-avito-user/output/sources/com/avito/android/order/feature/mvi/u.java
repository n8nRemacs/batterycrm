package com.avito.android.order.feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LP40/a;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "LP40/c;", "LP40/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u extends N implements Y41.l<com.avito.android.arch.mvi.q<P40.a, OrderInternalAction, P40.c, P40.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f209704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f209705m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B f209706n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C32941a f209707o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f209708p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, ScreenPerformanceTracker screenPerformanceTracker, B b12, C32941a c32941a, x xVar) {
        super(1);
        this.f209704l = sVar;
        this.f209705m = screenPerformanceTracker;
        this.f209706n = b12;
        this.f209707o = c32941a;
        this.f209708p = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<P40.a, OrderInternalAction, P40.c, P40.b> qVar) {
        com.avito.android.arch.mvi.q<P40.a, OrderInternalAction, P40.c, P40.b> qVar2 = qVar;
        qVar2.f92008d = this.f209704l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f209705m, this.f209706n);
        qVar2.f92009e = this.f209707o;
        qVar2.f92010f = this.f209708p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
