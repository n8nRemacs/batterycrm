package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentHistoryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVO0/a;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "LVO0/d;", "LVO0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<VO0.a, PaymentHistoryInternalAction, VO0.d, VO0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f328028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f328029m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f328030n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f328031o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f328032p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, q qVar) {
        super(1);
        this.f328028l = fVar;
        this.f328029m = aVar;
        this.f328030n = screenPerformanceTracker;
        this.f328031o = sVar;
        this.f328032p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<VO0.a, PaymentHistoryInternalAction, VO0.d, VO0.c> qVar) {
        com.avito.android.arch.mvi.q<VO0.a, PaymentHistoryInternalAction, VO0.d, VO0.c> qVar2 = qVar;
        qVar2.f92008d = this.f328028l;
        qVar2.f92009e = this.f328029m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f328030n, this.f328031o);
        qVar2.f92010f = this.f328032p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
