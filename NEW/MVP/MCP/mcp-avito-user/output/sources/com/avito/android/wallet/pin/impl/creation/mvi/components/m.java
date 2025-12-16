package com.avito.android.wallet.pin.impl.creation.mvi.components;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationState;
import eP0.InterfaceC40037a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPinCreationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LeP0/a;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState;", "LeP0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40037a, WalletPinCreationInternalAction, WalletPinCreationState, eP0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f328603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f328604m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f328605n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f328606o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f328607p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, p pVar) {
        super(1);
        this.f328603l = kVar;
        this.f328604m = aVar;
        this.f328605n = screenPerformanceTracker;
        this.f328606o = rVar;
        this.f328607p = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40037a, WalletPinCreationInternalAction, WalletPinCreationState, eP0.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40037a, WalletPinCreationInternalAction, WalletPinCreationState, eP0.b> qVar2 = qVar;
        qVar2.f92008d = this.f328603l;
        qVar2.f92009e = this.f328604m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f328605n, this.f328606o);
        qVar2.f92010f = this.f328607p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
