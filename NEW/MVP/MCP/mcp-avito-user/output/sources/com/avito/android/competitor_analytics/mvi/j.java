package com.avito.android.competitor_analytics.mvi;

import Yq.InterfaceC18315a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessToast;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessToast;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import cr.C39401b;
import dr.C39787b;
import dr.C39788c;
import er.InterfaceC40148a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Ler/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<CompetitorAnalyticsInternalAction, InterfaceC40148a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18315a f124561b;

    @Inject
    public j(@Y61.k InterfaceC18315a interfaceC18315a) {
        this.f124561b = interfaceC18315a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40148a b(CompetitorAnalyticsInternalAction competitorAnalyticsInternalAction) {
        InterfaceC40148a bVar;
        CompetitorAnalyticsInternalAction competitorAnalyticsInternalAction2 = competitorAnalyticsInternalAction;
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Close) {
            return InterfaceC40148a.C11107a.f395395a;
        }
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.PeriodClicked) {
            return InterfaceC40148a.c.f395397a;
        }
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.Content) {
            CompetitorAnalyticsInternalAction.Content content = (CompetitorAnalyticsInternalAction.Content) competitorAnalyticsInternalAction2;
            C39401b c39401b = content.f124437b;
            OkResponseSuccessToast toast = c39401b.getToast();
            cr.e layout = c39401b.getLayout();
            DeepLink uxFeedbackDeepLink = layout != null ? layout.getUxFeedbackDeepLink() : null;
            if ((toast != null ? toast.getStyle() : null) == OkResponseSuccessToast.Style.Error) {
                bVar = new InterfaceC40148a.d(toast.getMessage(), content.f124438c, toast.getButtonTitle());
                return bVar;
            }
            if ((toast != null ? toast.getStyle() : null) == OkResponseSuccessToast.Style.Info) {
                return new InterfaceC40148a.e(toast.getMessage());
            }
            if (uxFeedbackDeepLink != null) {
                return new InterfaceC40148a.b(uxFeedbackDeepLink);
            }
            return null;
        }
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.ContentV2) {
            CompetitorAnalyticsInternalAction.ContentV2 contentV2 = (CompetitorAnalyticsInternalAction.ContentV2) competitorAnalyticsInternalAction2;
            C39787b c39787b = contentV2.f124439b;
            com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessToast toast2 = c39787b.getToast();
            C39788c layout2 = c39787b.getLayout();
            DeepLink uxFeedbackDeepLink2 = layout2 != null ? layout2.getUxFeedbackDeepLink() : null;
            if ((toast2 != null ? toast2.getStyle() : null) == OkResponseSuccessToast.Style.Error) {
                bVar = new InterfaceC40148a.d(toast2.getMessage(), contentV2.f124440c, toast2.getButtonTitle());
                return bVar;
            }
            if ((toast2 != null ? toast2.getStyle() : null) == OkResponseSuccessToast.Style.Info) {
                return new InterfaceC40148a.e(toast2.getMessage());
            }
            if (uxFeedbackDeepLink2 != null && !(uxFeedbackDeepLink2 instanceof NoMatchLink)) {
                return new InterfaceC40148a.b(uxFeedbackDeepLink2);
            }
            return null;
        }
        if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.ShowMessage) {
            bVar = new InterfaceC40148a.e(((CompetitorAnalyticsInternalAction.ShowMessage) competitorAnalyticsInternalAction2).f124448b);
        } else {
            if (!(competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.HandleDeeplink)) {
                boolean z12 = competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackChangePeriodEvent;
                InterfaceC18315a interfaceC18315a = this.f124561b;
                if (z12) {
                    interfaceC18315a.b(((CompetitorAnalyticsInternalAction.TrackChangePeriodEvent) competitorAnalyticsInternalAction2).f124450b);
                } else if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackClickOnChartMetricEvent) {
                    interfaceC18315a.f(((CompetitorAnalyticsInternalAction.TrackClickOnChartMetricEvent) competitorAnalyticsInternalAction2).f124452b);
                } else if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackShowChartEvent) {
                    interfaceC18315a.e(((CompetitorAnalyticsInternalAction.TrackShowChartEvent) competitorAnalyticsInternalAction2).f124454b);
                } else if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackClickInChartEvent) {
                    interfaceC18315a.c(((CompetitorAnalyticsInternalAction.TrackClickInChartEvent) competitorAnalyticsInternalAction2).f124451b);
                } else if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackClickSuggestsBlockEvent) {
                    interfaceC18315a.a(((CompetitorAnalyticsInternalAction.TrackClickSuggestsBlockEvent) competitorAnalyticsInternalAction2).f124453b);
                } else if (competitorAnalyticsInternalAction2 instanceof CompetitorAnalyticsInternalAction.TrackShowCompetitorAnalyticsEvent) {
                    interfaceC18315a.d(((CompetitorAnalyticsInternalAction.TrackShowCompetitorAnalyticsEvent) competitorAnalyticsInternalAction2).f124455b);
                }
                return null;
            }
            bVar = new InterfaceC40148a.b(((CompetitorAnalyticsInternalAction.HandleDeeplink) competitorAnalyticsInternalAction2).f124444b);
        }
        return bVar;
    }
}
