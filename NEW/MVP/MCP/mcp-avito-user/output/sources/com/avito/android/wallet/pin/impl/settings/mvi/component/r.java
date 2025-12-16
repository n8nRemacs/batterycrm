package com.avito.android.wallet.pin.impl.settings.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/component/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsState;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements com.avito.android.arch.mvi.u<WalletSecuritySettingsInternalAction, WalletSecuritySettingsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f328851b;

    @Inject
    public r(@Y61.k t tVar) {
        this.f328851b = tVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final WalletSecuritySettingsState a(WalletSecuritySettingsInternalAction walletSecuritySettingsInternalAction, WalletSecuritySettingsState walletSecuritySettingsState) {
        WalletSecuritySettingsInternalAction walletSecuritySettingsInternalAction2 = walletSecuritySettingsInternalAction;
        WalletSecuritySettingsState walletSecuritySettingsState2 = walletSecuritySettingsState;
        boolean z12 = walletSecuritySettingsInternalAction2 instanceof WalletSecuritySettingsInternalAction.ShowContentLoading;
        t tVar = this.f328851b;
        if (z12) {
            WalletSecuritySettingsState walletSecuritySettingsStateA = WalletSecuritySettingsState.a(walletSecuritySettingsState2, null, WalletSecuritySettingsState.ContentState.f328866b, null, false, 13);
            tVar.getClass();
            return t.a(walletSecuritySettingsStateA);
        }
        if (walletSecuritySettingsInternalAction2 instanceof WalletSecuritySettingsInternalAction.ShowContentLoadingError) {
            WalletSecuritySettingsState walletSecuritySettingsStateA2 = WalletSecuritySettingsState.a(walletSecuritySettingsState2, null, WalletSecuritySettingsState.ContentState.f328867c, null, false, 13);
            tVar.getClass();
            return t.a(walletSecuritySettingsStateA2);
        }
        if (walletSecuritySettingsInternalAction2 instanceof WalletSecuritySettingsInternalAction.ShowContent) {
            WalletSecuritySettingsState walletSecuritySettingsStateA3 = WalletSecuritySettingsState.a(walletSecuritySettingsState2, ((WalletSecuritySettingsInternalAction.ShowContent) walletSecuritySettingsInternalAction2).f328857b, WalletSecuritySettingsState.ContentState.f328868d, null, false, 12);
            tVar.getClass();
            return t.a(walletSecuritySettingsStateA3);
        }
        if (!(walletSecuritySettingsInternalAction2 instanceof WalletSecuritySettingsInternalAction.SetBiometryEnabled)) {
            return walletSecuritySettingsState2;
        }
        WalletSecuritySettingsState walletSecuritySettingsStateA4 = WalletSecuritySettingsState.a(walletSecuritySettingsState2, null, null, null, ((WalletSecuritySettingsInternalAction.SetBiometryEnabled) walletSecuritySettingsInternalAction2).f328856b, 7);
        tVar.getClass();
        return t.a(walletSecuritySettingsStateA4);
    }
}
