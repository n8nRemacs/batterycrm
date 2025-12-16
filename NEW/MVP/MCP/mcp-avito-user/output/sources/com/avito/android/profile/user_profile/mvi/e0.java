package com.avito.android.profile.user_profile.mvi;

import Ua0.InterfaceC15503a;
import Ua0.InterfaceC15504b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserProfileFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUa0/a;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState;", "LUa0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC15503a, UserProfileInternalAction, UserProfileState, InterfaceC15504b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33388a f226410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f226411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0 f226412n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h0 f226413o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C33388a c33388a, ScreenPerformanceTracker screenPerformanceTracker, l0 l0Var, h0 h0Var) {
        super(1);
        this.f226410l = c33388a;
        this.f226411m = screenPerformanceTracker;
        this.f226412n = l0Var;
        this.f226413o = h0Var;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC15503a, UserProfileInternalAction, UserProfileState, InterfaceC15504b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC15503a, UserProfileInternalAction, UserProfileState, InterfaceC15504b> qVar2 = qVar;
        qVar2.f92009e = this.f226410l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f226411m, this.f226412n);
        qVar2.f92010f = this.f226413o;
        qVar2.f92014j = new com.avito.android.arch.mvi.r(true, true);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
