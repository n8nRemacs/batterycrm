package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/safety/safety_settings/mvi/entity/a;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "Lvo0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class z extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.safety.safety_settings.mvi.entity.a, SafetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b, InterfaceC49362a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f257807l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f257808m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f257809n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G f257810o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C f257811p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, n nVar, ScreenPerformanceTracker screenPerformanceTracker, G g12, C c12) {
        super(1);
        this.f257807l = vVar;
        this.f257808m = nVar;
        this.f257809n = screenPerformanceTracker;
        this.f257810o = g12;
        this.f257811p = c12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.safety.safety_settings.mvi.entity.a, SafetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b, InterfaceC49362a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.safety.safety_settings.mvi.entity.a, SafetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b, InterfaceC49362a> qVar2 = qVar;
        qVar2.f92008d = this.f257807l;
        qVar2.f92009e = this.f257808m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f257809n, this.f257810o);
        qVar2.f92010f = this.f257811p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
