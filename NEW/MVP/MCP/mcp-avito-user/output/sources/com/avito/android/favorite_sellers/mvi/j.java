package com.avito.android.favorite_sellers.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteSellersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFC/a;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState;", "LFC/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<q<FC.a, FavoriteSellersInternalAction, FavoriteSellersState, FC.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f156071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f156072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f156073n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f156074o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f156071l = aVar;
        this.f156072m = screenPerformanceTracker;
        this.f156073n = oVar;
        this.f156074o = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<FC.a, FavoriteSellersInternalAction, FavoriteSellersState, FC.b> qVar) {
        q<FC.a, FavoriteSellersInternalAction, FavoriteSellersState, FC.b> qVar2 = qVar;
        qVar2.f92009e = this.f156071l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f156072m, this.f156073n);
        qVar2.f92010f = this.f156074o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
