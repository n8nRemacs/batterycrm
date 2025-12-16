package com.avito.android.wallet.webview.mvi.components;

import com.avito.android.arch.mvi.t;
import com.avito.android.wallet.webview.mvi.entity.WalletWebViewInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import xP0.InterfaceC49874b;

/* compiled from: WalletWebViewOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/webview/mvi/components/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/webview/mvi/entity/WalletWebViewInternalAction;", "LxP0/b;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements t<WalletWebViewInternalAction, InterfaceC49874b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49874b b(WalletWebViewInternalAction walletWebViewInternalAction) {
        WalletWebViewInternalAction walletWebViewInternalAction2 = walletWebViewInternalAction;
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.ShowCancellationDialog) {
            return InterfaceC49874b.e.f442467a;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.FirstLaunch) {
            return InterfaceC49874b.C12870b.f442464a;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.Retry) {
            return InterfaceC49874b.d.f442466a;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.Finish) {
            return new InterfaceC49874b.a();
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.ShowContent) {
            return InterfaceC49874b.c.f442465a;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.ShowError) {
            return InterfaceC49874b.c.f442465a;
        }
        if (walletWebViewInternalAction2 instanceof WalletWebViewInternalAction.UpdateLoadingProgress) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
