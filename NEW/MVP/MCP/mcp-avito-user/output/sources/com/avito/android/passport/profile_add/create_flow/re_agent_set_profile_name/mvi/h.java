package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReAgentSetProfileNameFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQ50/a;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState;", "LQ50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<q<Q50.a, ReAgentSetProfileNameInternalAction, ReAgentSetProfileNameState, Q50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f211501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f211503n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f211504o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f211501l = eVar;
        this.f211502m = screenPerformanceTracker;
        this.f211503n = mVar;
        this.f211504o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Q50.a, ReAgentSetProfileNameInternalAction, ReAgentSetProfileNameState, Q50.b> qVar) {
        q<Q50.a, ReAgentSetProfileNameInternalAction, ReAgentSetProfileNameState, Q50.b> qVar2 = qVar;
        qVar2.f92009e = this.f211501l;
        qVar2.f92011g = new o(this.f211502m, this.f211503n);
        qVar2.f92010f = this.f211504o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
