package com.avito.android.wallet.history.mvi.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import com.avito.android.wallet.history.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WalletHistoryViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/mvi/components/q;", "", "<init>", "()V", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {

    /* compiled from: WalletHistoryViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[WalletHistoryState.InitialLoadState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WalletHistoryState.InitialLoadState initialLoadState = WalletHistoryState.InitialLoadState.f327671b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WalletHistoryState.InitialLoadState initialLoadState2 = WalletHistoryState.InitialLoadState.f327671b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public q() {
    }

    @Y61.k
    public static WalletHistoryState a(@Y61.k WalletHistoryState walletHistoryState) {
        com.avito.android.wallet.history.mvi.entity.a c10157a;
        int iOrdinal = walletHistoryState.f327666d.ordinal();
        if (iOrdinal == 0) {
            c10157a = a.c.f327681a;
        } else if (iOrdinal == 1) {
            c10157a = a.b.f327680a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str = walletHistoryState.f327665c;
            c10157a = new a.C10157a(walletHistoryState.f327664b, true ^ (str == null || str.length() == 0), walletHistoryState.getPerfTrackerParams(), walletHistoryState.f327670h);
        }
        return WalletHistoryState.a(walletHistoryState, null, null, null, c10157a, false, false, 119);
    }
}
