package com.avito.android.wallet.pin.impl.settings.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import javax.inject.Inject;
import kP0.InterfaceC42618d;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/component/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "LkP0/d;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements com.avito.android.arch.mvi.t<WalletSecuritySettingsInternalAction, InterfaceC42618d> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42618d b(WalletSecuritySettingsInternalAction walletSecuritySettingsInternalAction) {
        if (walletSecuritySettingsInternalAction instanceof WalletSecuritySettingsInternalAction.Close) {
            return InterfaceC42618d.a.f406273a;
        }
        return null;
    }
}
