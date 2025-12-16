package com.avito.android.wallet.page.history.details.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentHistoryDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LSO0/a;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "LSO0/c;", "LSO0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<SO0.a, PaymentHistoryDetailsInternalAction, SO0.c, SO0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f327910l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f327911m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f327912n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f327913o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f327914p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f327910l = iVar;
        this.f327911m = aVar;
        this.f327912n = screenPerformanceTracker;
        this.f327913o = pVar;
        this.f327914p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<SO0.a, PaymentHistoryDetailsInternalAction, SO0.c, SO0.b> qVar) {
        com.avito.android.arch.mvi.q<SO0.a, PaymentHistoryDetailsInternalAction, SO0.c, SO0.b> qVar2 = qVar;
        qVar2.f92008d = this.f327910l;
        qVar2.f92009e = this.f327911m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f327912n, this.f327913o);
        qVar2.f92010f = this.f327914p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
