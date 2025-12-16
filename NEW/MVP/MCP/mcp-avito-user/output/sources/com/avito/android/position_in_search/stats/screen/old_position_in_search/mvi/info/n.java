package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import W80.h;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: PositionInfoFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/n;", "Lcom/avito/android/arch/mvi/q;", "LW80/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "LW80/h;", "LW80/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends com.avito.android.arch.mvi.q<W80.a, PositionInfoInternalAction, W80.h, W80.e> {

    /* compiled from: PositionInfoFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LW80/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "LW80/h;", "LW80/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<W80.a, PositionInfoInternalAction, W80.h, W80.e>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a f220548l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f220549m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ q f220550n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l f220551o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ R0 f220552p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a aVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, l lVar, R0 r02) {
            super(1);
            this.f220548l = aVar;
            this.f220549m = screenPerformanceTracker;
            this.f220550n = qVar;
            this.f220551o = lVar;
            this.f220552p = r02;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<W80.a, PositionInfoInternalAction, W80.h, W80.e> qVar) {
            com.avito.android.arch.mvi.q<W80.a, PositionInfoInternalAction, W80.h, W80.e> qVar2 = qVar;
            qVar2.f92009e = this.f220548l;
            qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f220549m, this.f220550n);
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
            qVar2.f92010f = this.f220551o;
            qVar2.f92013i = this.f220552p.c();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    public n(@Y61.k p pVar, @Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a aVar, @Y61.k q qVar, @Y61.k l lVar, @Y61.k R0 r02, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        h.a aVar2;
        long f220553a = pVar.getF220553a();
        String f220554b = pVar.getF220554b();
        if (pVar instanceof p.a) {
            aVar2 = h.a.C1255a.f17801a;
        } else {
            if (!(pVar instanceof p.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = h.a.b.f17802a;
        }
        super("SearchPositionInfoFeature", new W80.h(f220553a, f220554b, aVar2, null, null, 24, null), new a(aVar, screenPerformanceTracker, qVar, lVar, r02));
    }
}
