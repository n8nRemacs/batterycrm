package Hw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.analytics.SearchFiltersAction;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: LocationGroupAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHw/b;", "LHw/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hw.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C14040b implements InterfaceC14039a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f7811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.developments_agency_search.analytics.a f7812b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f7813c;

    @Inject
    public C14040b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.developments_agency_search.analytics.a aVar, @k LocationGroupArguments locationGroupArguments) {
        this.f7811a = interfaceC28373a;
        this.f7812b = aVar;
        Tab tab = locationGroupArguments.f138042e;
        this.f7813c = new f(aVar.b(tab), aVar.a(tab, locationGroupArguments.f138043f, locationGroupArguments.f138044g), locationGroupArguments.f138045h, locationGroupArguments.f138046i, locationGroupArguments.f138047j, locationGroupArguments.f138048k);
    }

    @Override // Hw.InterfaceC14039a
    public final void a(@k LocationGroupInternalAction.AnalyticsEvent analyticsEvent) {
        InterfaceC28464o eVar;
        boolean z12 = analyticsEvent instanceof LocationGroupInternalAction.AnalyticsEvent.LocationGroupShown;
        com.avito.android.developments_agency_search.analytics.a aVar = this.f7812b;
        f fVar = this.f7813c;
        if (z12) {
            SearchParams searchParams = ((LocationGroupInternalAction.AnalyticsEvent.LocationGroupShown) analyticsEvent).f138168b;
            String locationId = searchParams.getLocationId();
            eVar = new C14043e(locationId != null ? C43066x.y0(locationId) : null, fVar.f7841f, fVar.f7836a, fVar.f7838c, aVar.c(searchParams), fVar.f7837b, fVar.f7839d, fVar.f7840e);
        } else if (analyticsEvent instanceof LocationGroupInternalAction.AnalyticsEvent.ApplyButtonClicked) {
            SearchParams searchParams2 = ((LocationGroupInternalAction.AnalyticsEvent.ApplyButtonClicked) analyticsEvent).f138166b;
            String locationId2 = searchParams2.getLocationId();
            eVar = new C14042d(locationId2 != null ? C43066x.y0(locationId2) : null, fVar.f7841f, fVar.f7836a, fVar.f7838c, aVar.c(searchParams2), fVar.f7837b, fVar.f7839d, fVar.f7840e, SearchFiltersAction.f138070c);
        } else if (analyticsEvent instanceof LocationGroupInternalAction.AnalyticsEvent.ClosedWithoutApplying) {
            SearchParams searchParams3 = ((LocationGroupInternalAction.AnalyticsEvent.ClosedWithoutApplying) analyticsEvent).f138167b;
            String locationId3 = searchParams3.getLocationId();
            eVar = new C14042d(locationId3 != null ? C43066x.y0(locationId3) : null, fVar.f7841f, fVar.f7836a, fVar.f7838c, aVar.c(searchParams3), fVar.f7837b, fVar.f7839d, fVar.f7840e, SearchFiltersAction.f138071d);
        } else {
            if (!(analyticsEvent instanceof LocationGroupInternalAction.AnalyticsEvent.ResetButtonClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            SearchParams searchParams4 = ((LocationGroupInternalAction.AnalyticsEvent.ResetButtonClicked) analyticsEvent).f138169b;
            String locationId4 = searchParams4.getLocationId();
            eVar = new com.avito.android.developments_agency_search.analytics.e(locationId4 != null ? C43066x.y0(locationId4) : null, "geo_filters", fVar.f7836a, fVar.f7838c, aVar.c(searchParams4), fVar.f7837b, fVar.f7839d);
        }
        this.f7811a.c(eVar);
    }
}
