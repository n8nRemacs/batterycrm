package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.InterfaceC15722a;
import Vw0.InterfaceC15723b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SoaStatSettingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVw0/a;", "Lcom/avito/android/soa_stat/profile_settings/mvi/entity/SoaStatSettingInternalAction;", "LVw0/c;", "LVw0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC15722a, SoaStatSettingInternalAction, Vw0.c, InterfaceC15723b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f284211l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f284212m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f284213n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f284214o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f284215p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, ScreenPerformanceTracker screenPerformanceTracker, v vVar, t tVar, R0 r02) {
        super(1);
        this.f284211l = aVar;
        this.f284212m = screenPerformanceTracker;
        this.f284213n = vVar;
        this.f284214o = tVar;
        this.f284215p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC15722a, SoaStatSettingInternalAction, Vw0.c, InterfaceC15723b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC15722a, SoaStatSettingInternalAction, Vw0.c, InterfaceC15723b> qVar2 = qVar;
        qVar2.f92009e = this.f284211l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f284212m, this.f284213n);
        qVar2.f92010f = this.f284214o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92013i = this.f284215p.c();
        return G0.f406611a;
    }
}
