package com.avito.android.extended_profile_serp.mvi;

import bB.InterfaceC25487a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileSerpFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LbB/a;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "LbB/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class s extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC25487a, ExtendedProfileSerpInternalAction, ExtendedProfileSerpState, bB.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f153053l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f153054m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f153055n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f153056o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f153057p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, n nVar, ScreenPerformanceTracker screenPerformanceTracker, x xVar, v vVar) {
        super(1);
        this.f153053l = qVar;
        this.f153054m = nVar;
        this.f153055n = screenPerformanceTracker;
        this.f153056o = xVar;
        this.f153057p = vVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC25487a, ExtendedProfileSerpInternalAction, ExtendedProfileSerpState, bB.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC25487a, ExtendedProfileSerpInternalAction, ExtendedProfileSerpState, bB.b> qVar2 = qVar;
        qVar2.f92008d = this.f153053l;
        qVar2.f92009e = this.f153054m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f153055n, this.f153056o);
        qVar2.f92010f = this.f153057p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
