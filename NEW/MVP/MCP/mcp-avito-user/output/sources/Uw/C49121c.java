package uw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersArguments;
import com.avito.android.developments_agency_search.screen.big_filters.mvi.entity.BigFiltersInternalAction;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: BigFiltersAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luw/c;", "Luw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49121c implements InterfaceC49120b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440330a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.developments_agency_search.analytics.a f440331b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C49119a f440332c;

    @Inject
    public C49121c(@k InterfaceC28373a interfaceC28373a, @k BigFiltersArguments bigFiltersArguments, @k com.avito.android.developments_agency_search.analytics.a aVar) {
        this.f440330a = interfaceC28373a;
        this.f440331b = aVar;
        Tab tab = bigFiltersArguments.f136545e;
        this.f440332c = new C49119a(aVar.b(tab), aVar.a(tab, bigFiltersArguments.f136546f, bigFiltersArguments.f136547g), bigFiltersArguments.f136548h, bigFiltersArguments.f136549i);
    }

    @Override // uw.InterfaceC49120b
    public final void a(@k BigFiltersInternalAction.AnalyticsEvent analyticsEvent) {
        InterfaceC28464o eVar;
        boolean z12 = analyticsEvent instanceof BigFiltersInternalAction.AnalyticsEvent.BigFiltersShown;
        com.avito.android.developments_agency_search.analytics.a aVar = this.f440331b;
        C49119a c49119a = this.f440332c;
        if (z12) {
            SearchParams searchParams = ((BigFiltersInternalAction.AnalyticsEvent.BigFiltersShown) analyticsEvent).f136695b;
            String locationId = searchParams.getLocationId();
            eVar = new f(locationId != null ? C43066x.y0(locationId) : null, c49119a.f440326a, c49119a.f440328c, aVar.c(searchParams), c49119a.f440327b, c49119a.f440329d);
        } else if (analyticsEvent instanceof BigFiltersInternalAction.AnalyticsEvent.ResetButtonClicked) {
            SearchParams searchParams2 = ((BigFiltersInternalAction.AnalyticsEvent.ResetButtonClicked) analyticsEvent).f136696b;
            String locationId2 = searchParams2.getLocationId();
            eVar = new com.avito.android.developments_agency_search.analytics.e(locationId2 != null ? C43066x.y0(locationId2) : null, "all_filters", c49119a.f440326a, c49119a.f440328c, aVar.c(searchParams2), c49119a.f440327b, c49119a.f440329d);
        } else {
            if (!(analyticsEvent instanceof BigFiltersInternalAction.AnalyticsEvent.ApplyButtonClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            SearchParams searchParams3 = ((BigFiltersInternalAction.AnalyticsEvent.ApplyButtonClicked) analyticsEvent).f136694b;
            String locationId3 = searchParams3.getLocationId();
            eVar = new e(locationId3 != null ? C43066x.y0(locationId3) : null, c49119a.f440326a, c49119a.f440328c, aVar.c(searchParams3), c49119a.f440327b, Integer.valueOf(c49119a.f440329d));
        }
        this.f440330a.c(eVar);
    }
}
