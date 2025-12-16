package com.avito.android.travel_onboarding.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.travel_onboarding.mvi.entity.TravelOnboardingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelOnboardingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZE0/a;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "LZE0/c;", "LZE0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<ZE0.a, TravelOnboardingInternalAction, ZE0.c, ZE0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f302314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f302315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f302316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f302317o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f302318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f302314l = dVar;
        this.f302315m = bVar;
        this.f302316n = screenPerformanceTracker;
        this.f302317o = kVar;
        this.f302318p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<ZE0.a, TravelOnboardingInternalAction, ZE0.c, ZE0.b> qVar) {
        q<ZE0.a, TravelOnboardingInternalAction, ZE0.c, ZE0.b> qVar2 = qVar;
        qVar2.f92008d = this.f302314l;
        qVar2.f92009e = this.f302315m;
        qVar2.f92011g = new o(this.f302316n, this.f302317o);
        qVar2.f92010f = this.f302318p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
