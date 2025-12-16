package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LU40/a;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/c;", "LU40/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p extends N implements Y41.l<com.avito.android.arch.mvi.q<U40.a, OrderInternalAction, U40.c, U40.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f209921l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f209922m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f209923n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f209924o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f209925p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, u uVar, s sVar) {
        super(1);
        this.f209921l = nVar;
        this.f209922m = aVar;
        this.f209923n = screenPerformanceTracker;
        this.f209924o = uVar;
        this.f209925p = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<U40.a, OrderInternalAction, U40.c, U40.b> qVar) {
        com.avito.android.arch.mvi.q<U40.a, OrderInternalAction, U40.c, U40.b> qVar2 = qVar;
        qVar2.f92008d = this.f209921l;
        qVar2.f92009e = this.f209922m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f209923n, this.f209924o);
        qVar2.f92010f = this.f209925p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
