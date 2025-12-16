package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import Q80.d;
import androidx.compose.runtime.internal.P;
import c90.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInSearchReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lc90/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<PositionInSearchInternalAction, c90.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.d f221535b;

    @Inject
    public l(@Y61.k com.avito.android.position_in_search.stats.screen.position_in_search.domain.d dVar) {
        this.f221535b = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final c90.c a(PositionInSearchInternalAction positionInSearchInternalAction, c90.c cVar) {
        List<c.e.a> list;
        c.e.a aVarA;
        c.e eVarA;
        c.e.a.C2036c c2036c;
        List<c.e.a.C2036c.b> list2;
        c.e eVarA2;
        PositionInSearchInternalAction positionInSearchInternalAction2 = positionInSearchInternalAction;
        c90.c cVar2 = cVar;
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.MainInfo.Loading) {
            return c90.c.a(cVar2, null, null, null, null, null, null, null, null, null, true, false, false, 6527);
        }
        boolean z12 = positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.MainInfo.Content;
        c.e.a aVarA2 = null;
        com.avito.android.position_in_search.stats.screen.position_in_search.domain.d dVar = this.f221535b;
        if (z12) {
            R80.c cVar3 = ((PositionInSearchInternalAction.MainInfo.Content) positionInSearchInternalAction2).f221501b;
            c.e eVarA3 = dVar.a(cVar3);
            List<c.e.a> list3 = eVarA3.f57741b;
            return c90.c.a(cVar2, cVar3.getScreenName(), cVar3.getScreenPeriod(), list3 != null ? list3.get(eVarA3.f57742c) : null, eVarA3, dVar.g(cVar3), dVar.h(cVar3), dVar.d(cVar3), null, null, false, false, false, 7424);
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.MainInfo.Error) {
            return c90.c.a(cVar2, null, null, null, null, null, null, null, ((PositionInSearchInternalAction.MainInfo.Error) positionInSearchInternalAction2).f221503b, null, false, false, false, 6271);
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodInfo.Loading) {
            return c90.c.a(cVar2, null, null, null, null, null, null, null, null, null, false, true, false, 6911);
        }
        boolean z13 = positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodInfo.Content;
        c.e eVar = cVar2.f57709e;
        c.e.a aVar = cVar2.f57708d;
        if (z13) {
            d.a aVar2 = ((PositionInSearchInternalAction.PeriodInfo.Content) positionInSearchInternalAction2).f221514b;
            c.e.a aVarA3 = aVar != null ? c.e.a.a(aVar, null, dVar.e(aVar2), dVar.c(aVar2), dVar.b(aVar2.getSearchQueriesData()), 3) : null;
            if (eVar != null) {
                List<c.e.a> list4 = eVar.f57741b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
                for (c.e.a aVar3 : list4) {
                    if (aVar3.f57743a == (aVarA3 != null ? aVarA3.f57743a : null)) {
                        aVar3 = aVarA3;
                    }
                    arrayList.add(aVar3);
                }
                eVarA2 = c.e.a(eVar, arrayList, 0, 5);
            } else {
                eVarA2 = null;
            }
            return c90.c.a(cVar2, null, aVar2.getPeriodTitle(), aVarA3, eVarA2, null, null, null, null, null, false, false, false, 6897);
        }
        if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodInfo.Error) {
            return c90.c.a(cVar2, null, null, null, null, null, null, null, null, ((PositionInSearchInternalAction.PeriodInfo.Error) positionInSearchInternalAction2).f221516b, false, false, false, 6911);
        }
        if (!(positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.NextPageLoaded.Content)) {
            if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.NextPageLoaded.Loading) {
                return c90.c.a(cVar2, null, null, null, null, null, null, null, null, null, false, false, true, 6143);
            }
            if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.NextPageLoaded.Error) {
                return c90.c.a(cVar2, null, null, null, null, null, null, null, null, null, false, false, false, 6143);
            }
            if (positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.CloseBanner) {
                if (((PositionInSearchInternalAction.CloseBanner) positionInSearchInternalAction2).f221499b) {
                    return c90.c.a(cVar2, null, null, aVar != null ? c.e.a.a(aVar, null, null, null, null, 27) : null, null, null, null, null, null, null, false, false, false, 8187);
                }
                return c90.c.a(cVar2, null, null, null, null, null, null, null, null, null, false, false, false, 8175);
            }
            if (!(positionInSearchInternalAction2 instanceof PositionInSearchInternalAction.PeriodClicked)) {
                return cVar2;
            }
            c.e.a aVar4 = (eVar == null || (list = eVar.f57741b) == null) ? null : (c.e.a) C42745f0.K(((PositionInSearchInternalAction.PeriodClicked) positionInSearchInternalAction2).f221513b, list);
            c.e eVarA4 = eVar != null ? c.e.a(eVar, null, ((PositionInSearchInternalAction.PeriodClicked) positionInSearchInternalAction2).f221513b, 3) : null;
            if (aVar4 != null && aVar != null) {
                aVarA2 = c.e.a.a(aVar, aVar4.f57743a, null, null, null, 30);
            }
            PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f221449b;
            return c90.c.a(cVar2, null, null, aVarA2, eVarA4, null, null, null, null, null, false, false, false, 3827);
        }
        c.e.a.C2036c c2036cB = dVar.b(((PositionInSearchInternalAction.NextPageLoaded.Content) positionInSearchInternalAction2).f221507b.getSearchQueriesData());
        if (aVar != null) {
            c.e.a.C2036c c2036c2 = aVar.f57747e;
            if (c2036c2 != null) {
                c2036c = new c.e.a.C2036c(c2036c2.f57757a, c2036c2.f57758b, c2036c2.f57759c, c2036c2.f57760d, C42745f0.h0((c2036cB == null || (list2 = c2036cB.f57761e) == null) ? C42784z0.f406748b : list2, c2036c2.f57761e), c2036cB != null ? c2036cB.f57762f : null);
            } else {
                c2036c = null;
            }
            aVarA = c.e.a.a(aVar, null, null, null, c2036c, 15);
        } else {
            aVarA = null;
        }
        if (eVar != null) {
            List<c.e.a> list5 = eVar.f57741b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list5, 10));
            for (c.e.a aVar5 : list5) {
                if (aVar5.f57743a == (aVarA != null ? aVarA.f57743a : null)) {
                    aVar5 = aVarA;
                }
                arrayList2.add(aVar5);
            }
            eVarA = c.e.a(eVar, arrayList2, 0, 5);
        } else {
            eVarA = null;
        }
        return c90.c.a(cVar2, null, null, aVarA, eVarA, null, null, null, null, null, false, false, false, 6131);
    }
}
