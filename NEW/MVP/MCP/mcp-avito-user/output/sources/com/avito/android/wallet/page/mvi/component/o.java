package com.avito.android.wallet.page.mvi.component;

import com.avito.android.arch.mvi.u;
import com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletPageReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/mvi/component/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageState;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements u<WalletPageInternalAction, WalletPageState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f328168b;

    @Inject
    public o(@Y61.k q qVar) {
        this.f328168b = qVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final WalletPageState a(WalletPageInternalAction walletPageInternalAction, WalletPageState walletPageState) {
        WalletPageInternalAction walletPageInternalAction2 = walletPageInternalAction;
        WalletPageState walletPageState2 = walletPageState;
        boolean z12 = walletPageInternalAction2 instanceof WalletPageInternalAction.ShowContentLoading;
        q qVar = this.f328168b;
        return z12 ? qVar.e(WalletPageState.a(walletPageState2, WalletPageState.ContentState.f328193b, false, null, null, 12)) : walletPageInternalAction2 instanceof WalletPageInternalAction.ShowContentLoadingError ? qVar.e(WalletPageState.a(walletPageState2, WalletPageState.ContentState.f328194c, false, null, null, 12)) : walletPageInternalAction2 instanceof WalletPageInternalAction.Refresh ? qVar.e(WalletPageState.a(walletPageState2, null, true, null, null, 13)) : walletPageInternalAction2 instanceof WalletPageInternalAction.ShowContent ? qVar.e(WalletPageState.a(walletPageState2, WalletPageState.ContentState.f328195d, false, null, ((WalletPageInternalAction.ShowContent) walletPageInternalAction2).f328181b, 4)) : walletPageState2;
    }
}
