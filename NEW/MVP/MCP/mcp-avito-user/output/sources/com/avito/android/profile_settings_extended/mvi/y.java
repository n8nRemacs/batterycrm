package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lyc0/k;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/a;", "Lyc0/m;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class y extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a, yc0.m>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33480a f230768l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f230769m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f230770n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ O f230771o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C33480a c33480a, ScreenPerformanceTracker screenPerformanceTracker, Q q12, O o12) {
        super(1);
        this.f230768l = c33480a;
        this.f230769m = screenPerformanceTracker;
        this.f230770n = q12;
        this.f230771o = o12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a, yc0.m> qVar) {
        com.avito.android.arch.mvi.q<yc0.k, ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a, yc0.m> qVar2 = qVar;
        qVar2.f92009e = this.f230768l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f230769m, this.f230770n);
        qVar2.f92010f = this.f230771o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
