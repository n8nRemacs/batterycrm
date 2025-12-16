package com.avito.android.lib.beduin_v2.feature.tracker;

import GV0.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.annotation.Annotation;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NetworkRequestTracker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/i;", "LSU0/k;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements SU0.k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f176385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f176386b;

    @Inject
    public i(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k g gVar) {
        this.f176385a = screenPerformanceTracker;
        this.f176386b = gVar;
    }

    @Override // SU0.k
    public final void a(@Y61.k SU0.e eVar) {
        GV0.a.f6520c.getClass();
        GV0.a aVarA = a.C0352a.a(eVar);
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        this.f176385a.s(aVarA.f6521a, loadingType);
    }

    @Override // SU0.k
    public final void b(@Y61.k SU0.e eVar, @Y61.k Throwable th2) {
        GV0.a.f6520c.getClass();
        GV0.a aVarA = a.C0352a.a(eVar);
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        J.a.f90383b.getClass();
        J.a aVarC = J.a.C2676a.c(th2);
        this.f176385a.r(aVarA.f6521a, loadingType, aVarC, aVarA.f6522b);
        g gVar = this.f176386b;
        gVar.getClass();
        gVar.f176381b.d(new f(eVar, gVar), new Annotation[0], null, th2, null);
    }

    @Override // SU0.k
    public final void c(@Y61.k SU0.e eVar) {
        GV0.a.f6520c.getClass();
        GV0.a aVarA = a.C0352a.a(eVar);
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        J.b bVar = J.b.f90385a;
        this.f176385a.r(aVarA.f6521a, loadingType, bVar, aVarA.f6522b);
        g gVar = this.f176386b;
        gVar.getClass();
        gVar.f176381b.c(new f(eVar, gVar), new Annotation[0]);
    }
}
