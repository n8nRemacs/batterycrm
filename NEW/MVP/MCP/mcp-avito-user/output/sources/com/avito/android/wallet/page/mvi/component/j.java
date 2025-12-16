package com.avito.android.wallet.page.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPageFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZO0/b;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageState;", "LZO0/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<ZO0.b, WalletPageInternalAction, WalletPageState, ZO0.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f328156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f328157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f328158n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f328159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f328160p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f328156l = hVar;
        this.f328157m = aVar;
        this.f328158n = screenPerformanceTracker;
        this.f328159o = oVar;
        this.f328160p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<ZO0.b, WalletPageInternalAction, WalletPageState, ZO0.e> qVar) {
        com.avito.android.arch.mvi.q<ZO0.b, WalletPageInternalAction, WalletPageState, ZO0.e> qVar2 = qVar;
        qVar2.f92008d = this.f328156l;
        qVar2.f92009e = this.f328157m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f328158n, this.f328159o);
        qVar2.f92010f = this.f328160p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
