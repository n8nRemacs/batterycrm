package com.avito.android.vas_performance.screens.visual_v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRL0/a;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "LRL0/c;", "LRL0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<q<RL0.a, VisualVasV2InternalAction, RL0.c, RL0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f321291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f321292m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f321293n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f321294o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f321295p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f321291l = fVar;
        this.f321292m = dVar;
        this.f321293n = screenPerformanceTracker;
        this.f321294o = mVar;
        this.f321295p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<RL0.a, VisualVasV2InternalAction, RL0.c, RL0.b> qVar) {
        q<RL0.a, VisualVasV2InternalAction, RL0.c, RL0.b> qVar2 = qVar;
        qVar2.f92008d = this.f321291l;
        qVar2.f92009e = this.f321292m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f321293n, this.f321294o);
        qVar2.f92010f = this.f321295p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
