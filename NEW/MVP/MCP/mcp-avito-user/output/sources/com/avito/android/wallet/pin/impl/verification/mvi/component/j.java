package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pP0.InterfaceC46989a;
import pP0.InterfaceC46990b;

/* compiled from: WalletPinVerificationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LpP0/a;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState;", "LpP0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC46989a, WalletPinVerificationInternalAction, WalletPinVerificationState, InterfaceC46990b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f329169l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C36145a f329170m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f329171n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z f329172o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f329173p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, C36145a c36145a, ScreenPerformanceTracker screenPerformanceTracker, z zVar, x xVar) {
        super(1);
        this.f329169l = hVar;
        this.f329170m = c36145a;
        this.f329171n = screenPerformanceTracker;
        this.f329172o = zVar;
        this.f329173p = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC46989a, WalletPinVerificationInternalAction, WalletPinVerificationState, InterfaceC46990b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC46989a, WalletPinVerificationInternalAction, WalletPinVerificationState, InterfaceC46990b> qVar2 = qVar;
        qVar2.f92008d = this.f329169l;
        qVar2.f92009e = this.f329170m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f329171n, this.f329172o);
        qVar2.f92010f = this.f329173p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
