package com.avito.android.wallet.pin.impl.creation.mvi.components;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: WalletPinCreationReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/components/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationState;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements com.avito.android.arch.mvi.u<WalletPinCreationInternalAction, WalletPinCreationState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f328614b;

    @Inject
    public r(@Y61.k t tVar) {
        this.f328614b = tVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final WalletPinCreationState a(WalletPinCreationInternalAction walletPinCreationInternalAction, WalletPinCreationState walletPinCreationState) {
        WalletPinCreationInternalAction walletPinCreationInternalAction2 = walletPinCreationInternalAction;
        WalletPinCreationState walletPinCreationState2 = walletPinCreationState;
        boolean z12 = walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowContentLoading;
        t tVar = this.f328614b;
        if (z12) {
            WalletPinCreationState walletPinCreationStateA = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, WalletPinCreationState.LoadingStatus.f328656b, false, 0, 447);
            tVar.getClass();
            return t.a(walletPinCreationStateA);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowContent) {
            WalletPinCreationState walletPinCreationStateA2 = WalletPinCreationState.a(walletPinCreationState2, ((WalletPinCreationInternalAction.ShowContent) walletPinCreationInternalAction2).f328630b, null, false, null, null, null, WalletPinCreationState.LoadingStatus.f328658d, false, 0, 446);
            tVar.getClass();
            return t.a(walletPinCreationStateA2);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowContentLoadingError) {
            WalletPinCreationState walletPinCreationStateA3 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, WalletPinCreationState.LoadingStatus.f328657c, false, 0, 447);
            tVar.getClass();
            return t.a(walletPinCreationStateA3);
        }
        boolean z13 = walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.AddSymbolToFirstInput;
        String str = walletPinCreationState2.f328646e;
        if (z13) {
            StringBuilder sbR = H.r(str);
            sbR.append(((WalletPinCreationInternalAction.AddSymbolToFirstInput) walletPinCreationInternalAction2).f328620b);
            WalletPinCreationState walletPinCreationStateA4 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, sbR.toString(), null, null, null, false, 0, 503);
            tVar.getClass();
            return t.a(walletPinCreationStateA4);
        }
        boolean z14 = walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.AddSymbolToSecondInput;
        String str2 = walletPinCreationState2.f328647f;
        if (z14) {
            StringBuilder sbR2 = H.r(str2);
            sbR2.append(((WalletPinCreationInternalAction.AddSymbolToSecondInput) walletPinCreationInternalAction2).f328621b);
            WalletPinCreationState walletPinCreationStateA5 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, sbR2.toString(), null, null, false, 0, 495);
            tVar.getClass();
            return t.a(walletPinCreationStateA5);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.DeleteLastSymbolFromFirstInput) {
            WalletPinCreationState walletPinCreationStateA6 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, C43066x.y(1, str), null, null, null, false, 0, 503);
            tVar.getClass();
            return t.a(walletPinCreationStateA6);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.DeleteLastSymbolFromSecondInput) {
            WalletPinCreationState walletPinCreationStateA7 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, C43066x.y(1, str2), null, null, false, 0, 495);
            tVar.getClass();
            return t.a(walletPinCreationStateA7);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowPinsDoNotMatchError) {
            WalletPinCreationState walletPinCreationStateA8 = WalletPinCreationState.a(walletPinCreationState2, null, null, true, null, null, null, null, false, 0, 507);
            tVar.getClass();
            return t.a(walletPinCreationStateA8);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.HidePinsDoNotMatchError) {
            WalletPinCreationState walletPinCreationStateA9 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, null, false, 0, 507);
            tVar.getClass();
            return t.a(walletPinCreationStateA9);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ResetInputs) {
            WalletPinCreationState walletPinCreationStateA10 = WalletPinCreationState.a(walletPinCreationState2, null, WalletPinCreationState.InputState.f328652b, false, "", "", null, null, false, 0, 485);
            tVar.getClass();
            return t.a(walletPinCreationStateA10);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowFirstInput) {
            WalletPinCreationState walletPinCreationStateA11 = WalletPinCreationState.a(walletPinCreationState2, null, WalletPinCreationState.InputState.f328652b, false, null, null, null, null, false, 0, 509);
            tVar.getClass();
            return t.a(walletPinCreationStateA11);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowSecondInput) {
            WalletPinCreationState walletPinCreationStateA12 = WalletPinCreationState.a(walletPinCreationState2, null, WalletPinCreationState.InputState.f328653c, false, null, null, null, null, false, 0, 509);
            tVar.getClass();
            return t.a(walletPinCreationStateA12);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowPinSaving) {
            WalletPinCreationState walletPinCreationStateA13 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, null, true, 0, 383);
            tVar.getClass();
            return t.a(walletPinCreationStateA13);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowPinSavingError) {
            WalletPinCreationState walletPinCreationStateA14 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, null, false, walletPinCreationState2.f328651j + 1, 127);
            tVar.getClass();
            return t.a(walletPinCreationStateA14);
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.StopPinSaving) {
            WalletPinCreationState walletPinCreationStateA15 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, null, false, 0, 383);
            tVar.getClass();
            return t.a(walletPinCreationStateA15);
        }
        if (!(walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowWalletNotWorkingScreen)) {
            return walletPinCreationState2;
        }
        WalletPinCreationState walletPinCreationStateA16 = WalletPinCreationState.a(walletPinCreationState2, null, null, false, null, null, null, WalletPinCreationState.LoadingStatus.f328659e, false, 0, 447);
        tVar.getClass();
        return t.a(walletPinCreationStateA16);
    }
}
