package com.avito.android.wallet.pin.impl.verification.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.verification.WalletPinVerificationActivityResultParams;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import pP0.InterfaceC46990b;

/* compiled from: WalletPinVerificationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/x;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "LpP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements com.avito.android.arch.mvi.t<WalletPinVerificationInternalAction, InterfaceC46990b> {
    @Inject
    public x() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC46990b b(WalletPinVerificationInternalAction walletPinVerificationInternalAction) {
        InterfaceC46990b c12272b;
        WalletPinVerificationInternalAction walletPinVerificationInternalAction2 = walletPinVerificationInternalAction;
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.Close) {
            return InterfaceC46990b.a.f428527a;
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowPinVerifying) {
            return InterfaceC46990b.d.f428530a;
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.StopLoadingAnimation) {
            return InterfaceC46990b.g.f428533a;
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowErrorAnimation) {
            return InterfaceC46990b.c.f428529a;
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowToast) {
            c12272b = new InterfaceC46990b.f(((WalletPinVerificationInternalAction.ShowToast) walletPinVerificationInternalAction2).f329289b);
        } else {
            if (!(walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.SetActivityResultParams)) {
                if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowSuccessAnimation) {
                    return InterfaceC46990b.e.f428531a;
                }
                return null;
            }
            WalletPinVerificationInternalAction.SetActivityResultParams setActivityResultParams = (WalletPinVerificationInternalAction.SetActivityResultParams) walletPinVerificationInternalAction2;
            Boolean bool = setActivityResultParams.f329279c;
            c12272b = new InterfaceC46990b.C12272b(new WalletPinVerificationActivityResultParams(setActivityResultParams.f329278b, bool != null ? bool.booleanValue() : false));
        }
        return c12272b;
    }
}
