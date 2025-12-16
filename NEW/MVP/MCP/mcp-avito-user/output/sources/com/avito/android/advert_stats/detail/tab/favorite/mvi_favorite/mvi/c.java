package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi;

import Y41.l;
import cb.InterfaceC27155a;
import cb.InterfaceC27156b;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteInternalAction;
import com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity.MviFavoriteState;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MviFavoriteFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcb/a;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteInternalAction;", "Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState;", "Lcb/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<q<InterfaceC27155a, MviFavoriteInternalAction, MviFavoriteState, InterfaceC27156b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f86224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f86225m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f86226n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f86227o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ScreenPerformanceTracker screenPerformanceTracker, h hVar, f fVar) {
        super(1);
        this.f86224l = aVar;
        this.f86225m = screenPerformanceTracker;
        this.f86226n = hVar;
        this.f86227o = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC27155a, MviFavoriteInternalAction, MviFavoriteState, InterfaceC27156b> qVar) {
        q<InterfaceC27155a, MviFavoriteInternalAction, MviFavoriteState, InterfaceC27156b> qVar2 = qVar;
        qVar2.f92009e = this.f86224l;
        qVar2.f92011g = new o(this.f86225m, this.f86226n);
        qVar2.f92010f = this.f86227o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
