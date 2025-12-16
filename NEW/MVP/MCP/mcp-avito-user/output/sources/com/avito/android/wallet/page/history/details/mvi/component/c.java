package com.avito.android.wallet.page.history.details.mvi.component;

import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentHistoryDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSO0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "invoke", "(LSO0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<SO0.a, InterfaceC43160i<? extends PaymentHistoryDetailsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f327889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<SO0.c> f327890m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<SO0.c> aVar2) {
        super(1);
        this.f327889l = aVar;
        this.f327890m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends PaymentHistoryDetailsInternalAction> invoke(SO0.a aVar) {
        this.f327890m.invoke();
        return this.f327889l.c(aVar);
    }
}
