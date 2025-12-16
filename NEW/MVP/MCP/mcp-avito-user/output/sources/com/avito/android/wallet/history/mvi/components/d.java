package com.avito.android.wallet.history.mvi.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.wallet.history.mvi.C36137b;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletHistoryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/history/mvi/components/d;", "Lcom/avito/android/arch/mvi/a;", "LGO0/a;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.a<GO0.a, WalletHistoryInternalAction, WalletHistoryState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36137b f327585a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f327586b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f327587c;

    @Inject
    public d(@Y61.k C36137b c36137b, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f327585a = c36137b;
        this.f327586b = interfaceC28373a;
        this.f327587c = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f327577l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<WalletHistoryInternalAction> b(GO0.a aVar, WalletHistoryState walletHistoryState) {
        return C43175k.G(new c(aVar, walletHistoryState, this, null));
    }
}
