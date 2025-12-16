package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.j;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: PeriodInfoFeatureBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/u;", "Lcom/avito/android/arch/mvi/q;", "LX80/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LX80/j;", "LX80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u extends com.avito.android.arch.mvi.q<X80.b, PeriodInfoInternalAction, X80.j, X80.d> {

    /* compiled from: PeriodInfoFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LX80/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LX80/j;", "LX80/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<X80.b, PeriodInfoInternalAction, X80.j, X80.d>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a f220684l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f220685m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ x f220686n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ s f220687o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ R0 f220688p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a aVar, ScreenPerformanceTracker screenPerformanceTracker, x xVar, s sVar, R0 r02) {
            super(1);
            this.f220684l = aVar;
            this.f220685m = screenPerformanceTracker;
            this.f220686n = xVar;
            this.f220687o = sVar;
            this.f220688p = r02;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<X80.b, PeriodInfoInternalAction, X80.j, X80.d> qVar) {
            com.avito.android.arch.mvi.q<X80.b, PeriodInfoInternalAction, X80.j, X80.d> qVar2 = qVar;
            qVar2.f92009e = this.f220684l;
            qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f220685m, this.f220686n);
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
            qVar2.f92010f = this.f220687o;
            qVar2.f92013i = this.f220688p.c();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    public u(@Y61.k w wVar, @Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a aVar, @Y61.k x xVar, @Y61.k s sVar, @Y61.k R0 r02, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        j.a aVar2;
        String strA = wVar.a();
        long f220689a = wVar.getF220689a();
        String f220690b = wVar.getF220690b();
        if (wVar instanceof w.a) {
            aVar2 = j.a.C1322a.f18716a;
        } else {
            if (!(wVar instanceof w.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = j.a.b.f18717a;
        }
        super(strA, new X80.j(f220689a, f220690b, null, aVar2, null, null, 52, null), new a(aVar, screenPerformanceTracker, xVar, sVar, r02));
    }
}
