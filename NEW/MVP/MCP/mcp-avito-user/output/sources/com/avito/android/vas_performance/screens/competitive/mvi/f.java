package com.avito.android.vas_performance.screens.competitive.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LJL0/a;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "LJL0/c;", "LJL0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<q<JL0.a, CompetitiveVasV2InternalAction, JL0.c, JL0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f320453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f320454m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f320455n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f320456o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f320457p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f320453l = dVar;
        this.f320454m = bVar;
        this.f320455n = screenPerformanceTracker;
        this.f320456o = kVar;
        this.f320457p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<JL0.a, CompetitiveVasV2InternalAction, JL0.c, JL0.b> qVar) {
        q<JL0.a, CompetitiveVasV2InternalAction, JL0.c, JL0.b> qVar2 = qVar;
        qVar2.f92008d = this.f320453l;
        qVar2.f92009e = this.f320454m;
        qVar2.f92011g = new o(this.f320455n, this.f320456o);
        qVar2.f92010f = this.f320457p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
