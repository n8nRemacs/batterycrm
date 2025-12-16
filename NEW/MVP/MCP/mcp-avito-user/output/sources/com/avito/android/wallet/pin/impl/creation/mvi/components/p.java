package com.avito.android.wallet.pin.impl.creation.mvi.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.creation.WalletPinCreationActivityResultParams;
import com.avito.android.wallet.pin.impl.creation.mvi.entity.WalletPinCreationInternalAction;
import eP0.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletPinCreationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/components/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/WalletPinCreationInternalAction;", "LeP0/b;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements com.avito.android.arch.mvi.t<WalletPinCreationInternalAction, eP0.b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final eP0.b b(WalletPinCreationInternalAction walletPinCreationInternalAction) {
        eP0.b cVar;
        WalletPinCreationInternalAction walletPinCreationInternalAction2 = walletPinCreationInternalAction;
        if (walletPinCreationInternalAction2.equals(WalletPinCreationInternalAction.ShowPinsDoNotMatchError.f328635b)) {
            return b.d.f395176a;
        }
        if (walletPinCreationInternalAction2.equals(WalletPinCreationInternalAction.ShowPinSaving.f328633b)) {
            return b.e.f395177a;
        }
        if (walletPinCreationInternalAction2.equals(WalletPinCreationInternalAction.StopPinSaving.f328640b)) {
            return b.h.f395180a;
        }
        if (walletPinCreationInternalAction2.equals(WalletPinCreationInternalAction.ShowPinSavingError.f328634b)) {
            return b.d.f395176a;
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.Finish) {
            return b.a.f395173a;
        }
        if (walletPinCreationInternalAction2.equals(WalletPinCreationInternalAction.OnBackPressed.f328626b)) {
            return b.C11080b.f395174a;
        }
        if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowToast) {
            cVar = new b.g(((WalletPinCreationInternalAction.ShowToast) walletPinCreationInternalAction2).f328638b);
        } else {
            if (!(walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.SetActivityResultParams)) {
                if (walletPinCreationInternalAction2 instanceof WalletPinCreationInternalAction.ShowSuccess) {
                    return b.f.f395178a;
                }
                return null;
            }
            WalletPinCreationInternalAction.SetActivityResultParams setActivityResultParams = (WalletPinCreationInternalAction.SetActivityResultParams) walletPinCreationInternalAction2;
            Boolean bool = setActivityResultParams.f328629c;
            cVar = new b.c(new WalletPinCreationActivityResultParams(setActivityResultParams.f328628b, bool != null ? bool.booleanValue() : false));
        }
        return cVar;
    }
}
