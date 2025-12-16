package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentHistoryBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.arch.mvi.b<PaymentHistoryInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f328026a;

    @Inject
    public f(@Y61.k m mVar) {
        this.f328026a = mVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PaymentHistoryInternalAction> a() {
        m mVar = this.f328026a;
        mVar.getClass();
        return C43175k.G(new k(mVar, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
