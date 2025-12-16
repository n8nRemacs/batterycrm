package com.avito.android.wallet.webview.mvi.components;

import com.avito.android.arch.mvi.u;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewInternalAction;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletWebViewReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/components/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewState;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements u<WalletWebViewInternalAction, WalletWebViewState> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final WalletWebViewState a(WalletWebViewInternalAction walletWebViewInternalAction, WalletWebViewState walletWebViewState) {
        WalletWebViewInternalAction walletWebViewInternalAction2 = walletWebViewInternalAction;
        WalletWebViewState walletWebViewState2 = walletWebViewState;
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.Retry) {
            return new WalletWebViewState.Loading(0);
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.ShowContent) {
            return WalletWebViewState.Content.f329435d;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.ShowError) {
            return new WalletWebViewState.Error(((WalletWebViewInternalAction.ShowError) walletWebViewInternalAction2).f329431b);
        }
        if (!(walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.UpdateLoadingProgress)) {
            return walletWebViewState2;
        }
        if (walletWebViewState2 instanceof WalletWebViewState.Loading) {
            WalletWebViewState.Loading loading = (WalletWebViewState.Loading) walletWebViewState2;
            if (loading.f329437d >= ((WalletWebViewInternalAction.UpdateLoadingProgress) walletWebViewInternalAction2).f329432b) {
                return loading;
            }
        }
        return new WalletWebViewState.Loading(((WalletWebViewInternalAction.UpdateLoadingProgress) walletWebViewInternalAction2).f329432b);
    }
}
