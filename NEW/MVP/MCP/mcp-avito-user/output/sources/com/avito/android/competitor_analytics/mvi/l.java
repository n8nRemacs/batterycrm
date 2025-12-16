package com.avito.android.competitor_analytics.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.util.ApiException;
import cr.C39401b;
import dr.C39787b;
import dr.C39788c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitorAnalyticsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/competitor_analytics/mvi/entity/b;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<CompetitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.competitor_analytics.domain.a f124563b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.competitor_analytics.domain.h f124564c;

    @Inject
    public l(@Y61.k com.avito.android.competitor_analytics.domain.a aVar, @Y61.k com.avito.android.competitor_analytics.domain.h hVar) {
        this.f124563b = aVar;
        this.f124564c = hVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.competitor_analytics.mvi.entity.b a(CompetitorAnalyticsInternalAction competitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b bVar) {
        b.h.a aVar;
        b.h hVarA;
        String title;
        List<b.h.a> list;
        b.h.a aVar2;
        b.h hVarA2;
        String title2;
        List<b.h.a> list2;
        CompetitorAnalyticsInternalAction competitorAnalyticsInternalAction2 = competitorAnalyticsInternalAction;
        com.avito.android.competitor_analytics.mvi.entity.b bVar2 = bVar;
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Loading) {
            boolean z12 = ((CompetitorAnalyticsInternalAction.Loading) competitorAnalyticsInternalAction2).f124445d;
            return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, null, null, null, z12, !z12, false, false, 25087);
        }
        boolean z13 = competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Content;
        b.e eVar = bVar2.f124478i;
        b.a aVar3 = bVar2.f124474e;
        String str = bVar2.f124471b;
        b.h.a aVar4 = bVar2.f124473d;
        b.h hVarH = bVar2.f124475f;
        if (z13) {
            C39401b c39401b = ((CompetitorAnalyticsInternalAction.Content) competitorAnalyticsInternalAction2).f124437b;
            com.avito.android.competitor_analytics.domain.a aVar5 = this.f124563b;
            if (hVarH == null) {
                hVarH = aVar5.b(c39401b);
            }
            if (aVar4 == null) {
                aVar4 = (hVarH == null || (list2 = hVarH.f124524b) == null) ? null : list2.get(hVarH.f124525c);
            }
            if (hVarH != null) {
                List<b.h.a> list3 = hVarH.f124524b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                for (b.h.a aVarA : list3) {
                    if (aVarA.f124526a == (aVar4 != null ? aVar4.f124526a : null)) {
                        aVarA = b.h.a.a(aVarA, c39401b.getPeriodTitle(), aVar5.g(c39401b), null, null, aVar5.c(c39401b), null, 179);
                        aVar4 = aVarA;
                    }
                    arrayList.add(aVarA);
                }
                hVarA2 = b.h.a(hVarH, arrayList, 0, 5);
                aVar2 = aVar4;
            } else {
                aVar2 = aVar4;
                hVarA2 = null;
            }
            if (str == null) {
                cr.e layout = c39401b.getLayout();
                title2 = layout != null ? layout.getTitle() : null;
            } else {
                title2 = str;
            }
            b.a aVarE = aVar5.e(c39401b);
            if (aVarE != null) {
                aVar3 = aVarE;
            }
            b.j jVarD = aVar5.d(c39401b);
            if (jVarD == null) {
                jVarD = bVar2.f124477h;
            }
            b.j jVar = jVarD;
            b.e eVarF = aVar5.f(c39401b);
            if (eVarF == null) {
                eVarF = eVar;
            }
            return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, title2, null, aVar2, aVar3, hVarA2, null, jVar, eVarF, null, null, null, false, false, false, false, 24610);
        }
        if (!(competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.ContentV2)) {
            if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Error) {
                CompetitorAnalyticsInternalAction.Error error = (CompetitorAnalyticsInternalAction.Error) competitorAnalyticsInternalAction2;
                ApiException apiException = error.f124441b;
                boolean z14 = error.f124442c;
                return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, null, z14 ? apiException : null, z14 ? null : apiException, false, false, false, false, 25087);
            }
            if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Back) {
                return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 32511);
            }
            if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.CloseBanner) {
                return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 32759);
            }
            if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.PeriodClicked) {
                return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, ((CompetitorAnalyticsInternalAction.PeriodClicked) competitorAnalyticsInternalAction2).f124446b, null, hVarH != null ? b.h.a(hVarH, null, ((CompetitorAnalyticsInternalAction.PeriodClicked) competitorAnalyticsInternalAction2).f124447c, 3) : null, null, null, null, null, null, null, false, false, false, false, 31723);
            }
            return competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.ChartMetricClicked ? com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, ((CompetitorAnalyticsInternalAction.ChartMetricClicked) competitorAnalyticsInternalAction2).f124434b, null, null, false, false, false, false, 32511) : competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.SuggestsBlockClicked ? com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, ((CompetitorAnalyticsInternalAction.SuggestsBlockClicked) competitorAnalyticsInternalAction2).f124449b, 16383) : bVar2;
        }
        C39787b c39787b = ((CompetitorAnalyticsInternalAction.ContentV2) competitorAnalyticsInternalAction2).f124439b;
        com.avito.android.competitor_analytics.domain.h hVar = this.f124564c;
        if (hVarH == null) {
            hVarH = hVar.h(c39787b);
        }
        if (aVar4 == null) {
            aVar4 = (hVarH == null || (list = hVarH.f124524b) == null) ? null : list.get(hVarH.f124525c);
        }
        if (hVarH != null) {
            List<b.h.a> list4 = hVarH.f124524b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
            for (b.h.a aVarA2 : list4) {
                if (aVarA2.f124526a == (aVar4 != null ? aVar4.f124526a : null)) {
                    aVarA2 = b.h.a.a(aVarA2, c39787b.getPeriodTitle(), null, c39787b.getDetailsInfo(), hVar.b(c39787b), null, hVar.f(c39787b), 75);
                    aVar4 = aVarA2;
                }
                arrayList2.add(aVarA2);
            }
            hVarA = b.h.a(hVarH, arrayList2, 0, 5);
            aVar = aVar4;
        } else {
            aVar = aVar4;
            hVarA = null;
        }
        if (str == null) {
            C39788c layout2 = c39787b.getLayout();
            title = layout2 != null ? layout2.getTitle() : null;
        } else {
            title = str;
        }
        b.d dVarG = bVar2.f124472c;
        if (dVarG == null) {
            dVarG = hVar.g(c39787b);
        }
        b.a aVarD = hVar.d(c39787b);
        if (aVarD == null) {
            aVarD = aVar3;
        }
        b.i iVarC = hVar.c(c39787b);
        if (iVarC == null) {
            iVarC = bVar2.f124476g;
        }
        b.i iVar = iVarC;
        b.e eVarE = hVar.e(c39787b);
        if (eVarE == null) {
            eVarE = eVar;
        }
        return com.avito.android.competitor_analytics.mvi.entity.b.a(bVar2, title, dVarG, aVar, aVarD, hVarA, iVar, null, eVarE, null, null, null, false, false, false, bVar2.f124485p, 8192);
    }
}
