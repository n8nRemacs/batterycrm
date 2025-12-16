package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import kP0.InterfaceC42615a;
import kP0.InterfaceC42618d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletSecuritySettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LkP0/a;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsState;", "LkP0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC42615a, WalletSecuritySettingsInternalAction, WalletSecuritySettingsState, InterfaceC42618d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f328836l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f328837m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f328838n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f328839o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f328840p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar) {
        super(1);
        this.f328836l = iVar;
        this.f328837m = aVar;
        this.f328838n = screenPerformanceTracker;
        this.f328839o = rVar;
        this.f328840p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC42615a, WalletSecuritySettingsInternalAction, WalletSecuritySettingsState, InterfaceC42618d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC42615a, WalletSecuritySettingsInternalAction, WalletSecuritySettingsState, InterfaceC42618d> qVar2 = qVar;
        qVar2.f92008d = this.f328836l;
        qVar2.f92009e = this.f328837m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f328838n, this.f328839o);
        qVar2.f92010f = this.f328840p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
