package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lK0.InterfaceC43650a;
import lK0.InterfaceC43651b;

/* compiled from: UserViewedFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LlK0/a;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "LlK0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC43650a, UserViewedInternalAction, UserViewedState, InterfaceC43651b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f318443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f318444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f318445n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f318446o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f318447p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, w wVar, n nVar) {
        super(1);
        this.f318443l = iVar;
        this.f318444m = eVar;
        this.f318445n = screenPerformanceTracker;
        this.f318446o = wVar;
        this.f318447p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC43650a, UserViewedInternalAction, UserViewedState, InterfaceC43651b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC43650a, UserViewedInternalAction, UserViewedState, InterfaceC43651b> qVar2 = qVar;
        qVar2.f92008d = this.f318443l;
        qVar2.f92009e = this.f318444m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f318445n, this.f318446o);
        qVar2.f92010f = this.f318447p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
