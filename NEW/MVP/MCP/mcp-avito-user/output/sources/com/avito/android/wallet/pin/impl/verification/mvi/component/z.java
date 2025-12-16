package com.avito.android.wallet.pin.impl.verification.mvi.component;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationInternalAction;
import com.avito.android.wallet.pin.impl.verification.mvi.entity.WalletPinVerificationState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import rP0.C47583b;

/* compiled from: WalletPinVerificationReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/component/z;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationInternalAction;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/WalletPinVerificationState;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements com.avito.android.arch.mvi.u<WalletPinVerificationInternalAction, WalletPinVerificationState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f329267b;

    @Inject
    public z(@Y61.k B b12) {
        this.f329267b = b12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final WalletPinVerificationState a(WalletPinVerificationInternalAction walletPinVerificationInternalAction, WalletPinVerificationState walletPinVerificationState) {
        WalletPinVerificationInternalAction walletPinVerificationInternalAction2 = walletPinVerificationInternalAction;
        WalletPinVerificationState walletPinVerificationState2 = walletPinVerificationState;
        boolean z12 = walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowContentLoading;
        B b12 = this.f329267b;
        if (z12) {
            WalletPinVerificationState walletPinVerificationStateA = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, WalletPinVerificationState.ContentState.f329303b, false, null, 0, null, 247);
            b12.getClass();
            return B.a(walletPinVerificationStateA);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowContent) {
            WalletPinVerificationState.ContentState contentState = WalletPinVerificationState.ContentState.f329305d;
            WalletPinVerificationInternalAction.ShowContent showContent = (WalletPinVerificationInternalAction.ShowContent) walletPinVerificationInternalAction2;
            C47583b c47583b = showContent.f329281b;
            WalletPinVerificationState walletPinVerificationStateA2 = WalletPinVerificationState.a(walletPinVerificationState2, c47583b, null, null, contentState, false, null, c47583b.b(), showContent.f329282c, 54);
            b12.getClass();
            return B.a(walletPinVerificationStateA2);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowContentLoadingError) {
            WalletPinVerificationState walletPinVerificationStateA3 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, WalletPinVerificationState.ContentState.f329304c, false, null, 0, null, 247);
            b12.getClass();
            return B.a(walletPinVerificationStateA3);
        }
        boolean z13 = walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.AddPinSymbol;
        String str = walletPinVerificationState2.f329296c;
        if (z13) {
            StringBuilder sbR = H.r(str);
            sbR.append(((WalletPinVerificationInternalAction.AddPinSymbol) walletPinVerificationInternalAction2).f329272b);
            WalletPinVerificationState walletPinVerificationStateA4 = WalletPinVerificationState.a(walletPinVerificationState2, null, sbR.toString(), null, null, false, null, 0, null, 253);
            b12.getClass();
            return B.a(walletPinVerificationStateA4);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.DeleteLastPinSymbol) {
            WalletPinVerificationState walletPinVerificationStateA5 = WalletPinVerificationState.a(walletPinVerificationState2, null, C43066x.y(1, str), null, null, false, null, 0, null, 253);
            b12.getClass();
            return B.a(walletPinVerificationStateA5);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.SetPin) {
            WalletPinVerificationState walletPinVerificationStateA6 = WalletPinVerificationState.a(walletPinVerificationState2, null, ((WalletPinVerificationInternalAction.SetPin) walletPinVerificationInternalAction2).f329280b, null, null, false, null, 0, null, 253);
            b12.getClass();
            return B.a(walletPinVerificationStateA6);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowIncorrectPinErrorMessage) {
            WalletPinVerificationState walletPinVerificationStateA7 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, false, ((WalletPinVerificationInternalAction.ShowIncorrectPinErrorMessage) walletPinVerificationInternalAction2).f329286b, 0, null, 223);
            b12.getClass();
            return B.a(walletPinVerificationStateA7);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.HideIncorrectPinErrorMessage) {
            WalletPinVerificationState walletPinVerificationStateA8 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, false, null, 0, null, 223);
            b12.getClass();
            return B.a(walletPinVerificationStateA8);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ResetEnteredPin) {
            WalletPinVerificationState walletPinVerificationStateA9 = WalletPinVerificationState.a(walletPinVerificationState2, null, "", null, null, false, null, 0, null, 253);
            b12.getClass();
            return B.a(walletPinVerificationStateA9);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ResetPinCipher) {
            WalletPinVerificationState walletPinVerificationStateA10 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, false, null, 0, null, 127);
            b12.getClass();
            return B.a(walletPinVerificationStateA10);
        }
        if (walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.ShowPinVerifying) {
            WalletPinVerificationState walletPinVerificationStateA11 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, true, null, 0, null, 239);
            b12.getClass();
            return B.a(walletPinVerificationStateA11);
        }
        if (!(walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.StopPinVerifying)) {
            return walletPinVerificationInternalAction2 instanceof WalletPinVerificationInternalAction.UpdateCurrentAttempt ? WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, false, null, ((WalletPinVerificationInternalAction.UpdateCurrentAttempt) walletPinVerificationInternalAction2).f329292b, null, 191) : walletPinVerificationState2;
        }
        WalletPinVerificationState walletPinVerificationStateA12 = WalletPinVerificationState.a(walletPinVerificationState2, null, null, null, null, false, null, 0, null, 239);
        b12.getClass();
        return B.a(walletPinVerificationStateA12);
    }
}
