package com.avito.android.wallet.history.mvi.components;

import GO0.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletHistoryOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/history/mvi/components/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "LGO0/d;", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements t<WalletHistoryInternalAction, GO0.d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final GO0.d b(WalletHistoryInternalAction walletHistoryInternalAction) {
        if (walletHistoryInternalAction instanceof WalletHistoryInternalAction.OpenDetailsDeeplink) {
            return new d.a();
        }
        return null;
    }
}
