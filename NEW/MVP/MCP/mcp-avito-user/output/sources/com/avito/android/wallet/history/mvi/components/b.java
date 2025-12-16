package com.avito.android.wallet.history.mvi.components;

import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WalletHistoryActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGO0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "invoke", "(LGO0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<GO0.a, InterfaceC43160i<? extends WalletHistoryInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f327578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<WalletHistoryState> f327579m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Y41.a<WalletHistoryState> aVar) {
        super(1);
        this.f327578l = dVar;
        this.f327579m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends WalletHistoryInternalAction> invoke(GO0.a aVar) {
        WalletHistoryState walletHistoryStateInvoke = this.f327579m.invoke();
        d dVar = this.f327578l;
        dVar.getClass();
        return C43175k.G(new c(aVar, walletHistoryStateInvoke, dVar, null));
    }
}
