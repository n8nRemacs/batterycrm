package com.avito.android.extended_profile.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import fA.InterfaceC40265a;
import fA.InterfaceC40270c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LfA/a;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/extended_profile/mvi/entity/a;", "LfA/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.extended_profile.mvi.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30473x extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40265a, ExtendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a, InterfaceC40270c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30451a f150430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f150431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f150432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f150433o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30473x(C30451a c30451a, ScreenPerformanceTracker screenPerformanceTracker, C c12, A a12) {
        super(1);
        this.f150430l = c30451a;
        this.f150431m = screenPerformanceTracker;
        this.f150432n = c12;
        this.f150433o = a12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40265a, ExtendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a, InterfaceC40270c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40265a, ExtendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a, InterfaceC40270c> qVar2 = qVar;
        qVar2.f92009e = this.f150430l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f150431m, this.f150432n);
        qVar2.f92010f = this.f150433o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
