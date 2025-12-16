package Kw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: RealtyAgencySearchAnalyticsHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/f;", "LKw/e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f9697a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.developments_agency_search.analytics.a f9698b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RealtyAgencySearchArguments f9699c;

    @Inject
    public f(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.developments_agency_search.analytics.a aVar, @k RealtyAgencySearchArguments realtyAgencySearchArguments) {
        this.f9697a = interfaceC28373a;
        this.f9698b = aVar;
        this.f9699c = realtyAgencySearchArguments;
    }

    @Override // Kw.e
    public final void a(@k RealtyAgencySearchInternalAction.AnalyticsEvent analyticsEvent) {
        InterfaceC28464o cVar;
        if (analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.SearchResultLoaded) {
            RealtyAgencySearchInternalAction.AnalyticsEvent.SearchResultLoaded searchResultLoaded = (RealtyAgencySearchInternalAction.AnalyticsEvent.SearchResultLoaded) analyticsEvent;
            SearchParams searchParams = searchResultLoaded.f138826b;
            String locationId = searchParams.getLocationId();
            Integer numY0 = locationId != null ? C43066x.y0(locationId) : null;
            String str = this.f9699c.f138664b;
            com.avito.android.developments_agency_search.analytics.a aVar = this.f9698b;
            Tab tab = searchResultLoaded.f138827c;
            cVar = new h(numY0, str, aVar.b(tab), searchResultLoaded.f138828d, aVar.c(searchParams), aVar.a(tab, searchResultLoaded.f138829e, searchResultLoaded.f138830f), searchResultLoaded.f138831g);
        } else if (analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.SortingSelectorClicked) {
            cVar = i.f9711c;
        } else if (analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.ClientFixationOptionClicked) {
            RealtyAgencySearchInternalAction.AnalyticsEvent.ClientFixationOptionClicked clientFixationOptionClicked = (RealtyAgencySearchInternalAction.AnalyticsEvent.ClientFixationOptionClicked) analyticsEvent;
            String locationId2 = clientFixationOptionClicked.f138819b.getLocationId();
            cVar = new b(locationId2 != null ? C43066x.y0(locationId2) : null, clientFixationOptionClicked.f138820c, clientFixationOptionClicked.f138821d, clientFixationOptionClicked.f138822e);
        } else if (analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.ClientBookingOptionClicked) {
            RealtyAgencySearchInternalAction.AnalyticsEvent.ClientBookingOptionClicked clientBookingOptionClicked = (RealtyAgencySearchInternalAction.AnalyticsEvent.ClientBookingOptionClicked) analyticsEvent;
            String locationId3 = clientBookingOptionClicked.f138816b.getLocationId();
            cVar = new C14355a(locationId3 != null ? C43066x.y0(locationId3) : null, clientBookingOptionClicked.f138817c, clientBookingOptionClicked.f138818d);
        } else if (analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.MapPinClicked) {
            RealtyAgencySearchInternalAction.AnalyticsEvent.MapPinClicked mapPinClicked = (RealtyAgencySearchInternalAction.AnalyticsEvent.MapPinClicked) analyticsEvent;
            String locationId4 = mapPinClicked.f138823b.getLocationId();
            cVar = new d(locationId4 != null ? C43066x.y0(locationId4) : null, mapPinClicked.f138824c, mapPinClicked.f138825d);
        } else {
            if (!(analyticsEvent instanceof RealtyAgencySearchInternalAction.AnalyticsEvent.LotAddedToSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new c();
        }
        this.f9697a.c(cVar);
    }
}
