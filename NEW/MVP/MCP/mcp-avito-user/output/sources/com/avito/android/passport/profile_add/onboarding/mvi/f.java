package com.avito.android.passport.profile_add.onboarding.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.onboarding.mvi.entity.PassportOnboardingInternalAction;
import h60.InterfaceC40776a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportOnboardingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lh60/a;", "Lcom/avito/android/passport/profile_add/onboarding/mvi/entity/PassportOnboardingInternalAction;", "Lh60/c;", "Lh60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC40776a, PassportOnboardingInternalAction, h60.c, h60.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f213588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f213589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f213590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f213591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f213592p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f213588l = dVar;
        this.f213589m = aVar;
        this.f213590n = screenPerformanceTracker;
        this.f213591o = kVar;
        this.f213592p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40776a, PassportOnboardingInternalAction, h60.c, h60.b> qVar) {
        q<InterfaceC40776a, PassportOnboardingInternalAction, h60.c, h60.b> qVar2 = qVar;
        qVar2.f92008d = this.f213588l;
        qVar2.f92009e = this.f213589m;
        qVar2.f92011g = new o(this.f213590n, this.f213591o);
        qVar2.f92010f = this.f213592p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
