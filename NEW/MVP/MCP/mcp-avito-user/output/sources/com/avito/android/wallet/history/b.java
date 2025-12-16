package com.avito.android.wallet.history;

import Y41.l;
import com.avito.android.wallet.history.mvi.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletHistoryActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGO0/a;", "it", "Lkotlin/G0;", "invoke", "(LGO0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements l<GO0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WalletHistoryActivity f327520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WalletHistoryActivity walletHistoryActivity) {
        super(1);
        this.f327520l = walletHistoryActivity;
    }

    @Override // Y41.l
    public final G0 invoke(GO0.a aVar) {
        ((H) this.f327520l.f327507n.getValue()).accept(aVar);
        return G0.f406611a;
    }
}
