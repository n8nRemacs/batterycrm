package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pP0.InterfaceC46989a;

/* compiled from: WalletPinVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LpP0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "invoke", "(LpP0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<InterfaceC46989a, InterfaceC43160i<? extends WalletPinVerificationInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36145a f329154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<WalletPinVerificationState> f329155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C36145a c36145a, Y41.a<WalletPinVerificationState> aVar) {
        super(1);
        this.f329154l = c36145a;
        this.f329155m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends WalletPinVerificationInternalAction> invoke(InterfaceC46989a interfaceC46989a) {
        WalletPinVerificationState walletPinVerificationStateInvoke = this.f329155m.invoke();
        return this.f329154l.b(interfaceC46989a, walletPinVerificationStateInvoke);
    }
}
