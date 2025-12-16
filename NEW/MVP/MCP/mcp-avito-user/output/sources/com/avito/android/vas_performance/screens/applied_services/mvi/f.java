package com.avito.android.vas_performance.screens.applied_services.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesInternalAction;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LIL0/a;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState;", "LIL0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<q<IL0.a, AppliedServicesInternalAction, AppliedServicesState, IL0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f320311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f320312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f320313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f320314o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f320315p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f320311l = dVar;
        this.f320312m = aVar;
        this.f320313n = screenPerformanceTracker;
        this.f320314o = kVar;
        this.f320315p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<IL0.a, AppliedServicesInternalAction, AppliedServicesState, IL0.b> qVar) {
        q<IL0.a, AppliedServicesInternalAction, AppliedServicesState, IL0.b> qVar2 = qVar;
        qVar2.f92008d = this.f320311l;
        qVar2.f92009e = this.f320312m;
        qVar2.f92011g = new o(this.f320313n, this.f320314o);
        qVar2.f92010f = this.f320315p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
