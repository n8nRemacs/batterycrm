package com.avito.android.wallet.history.mvi.components;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryInternalAction;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletHistoryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LGO0/a;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryInternalAction;", "Lcom/avito/android/wallet/history/mvi/entity/WalletHistoryState;", "LGO0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<GO0.a, WalletHistoryInternalAction, WalletHistoryState, GO0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f327593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f327594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f327595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f327596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f327597p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f327593l = fVar;
        this.f327594m = dVar;
        this.f327595n = screenPerformanceTracker;
        this.f327596o = oVar;
        this.f327597p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<GO0.a, WalletHistoryInternalAction, WalletHistoryState, GO0.d> qVar) {
        com.avito.android.arch.mvi.q<GO0.a, WalletHistoryInternalAction, WalletHistoryState, GO0.d> qVar2 = qVar;
        qVar2.f92008d = this.f327593l;
        qVar2.f92009e = this.f327594m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f327595n, this.f327596o);
        qVar2.f92010f = this.f327597p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
