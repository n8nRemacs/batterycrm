package com.avito.android.wallet.history.mvi.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.wallet.history.mvi.C36137b;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletHistoryBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/history/mvi/components/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.arch.mvi.b<WalletHistoryInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36137b f327591a;

    @Inject
    public f(@Y61.k C36137b c36137b) {
        this.f327591a = c36137b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WalletHistoryInternalAction> a() {
        return this.f327591a.e(false);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
