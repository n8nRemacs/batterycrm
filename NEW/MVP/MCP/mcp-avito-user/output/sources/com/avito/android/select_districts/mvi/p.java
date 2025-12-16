package com.avito.android.select_districts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pq0.InterfaceC47130a;

/* compiled from: SelectDistrictsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lpq0/a;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lpq0/c;", "Lpq0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC47130a, SelectDistrictsInternalAction, pq0.c, pq0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f267081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f267082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f267083n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f267084o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f267085p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, k kVar, ScreenPerformanceTracker screenPerformanceTracker, u uVar, s sVar) {
        super(1);
        this.f267081l = nVar;
        this.f267082m = kVar;
        this.f267083n = screenPerformanceTracker;
        this.f267084o = uVar;
        this.f267085p = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC47130a, SelectDistrictsInternalAction, pq0.c, pq0.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC47130a, SelectDistrictsInternalAction, pq0.c, pq0.b> qVar2 = qVar;
        qVar2.f92008d = this.f267081l;
        qVar2.f92009e = this.f267082m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f267083n, this.f267084o);
        qVar2.f92010f = this.f267085p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
