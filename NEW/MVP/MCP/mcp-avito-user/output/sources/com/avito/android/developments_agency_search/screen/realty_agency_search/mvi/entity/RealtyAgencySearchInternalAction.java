package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.domain.GetDevelopmentTooltipInfo;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import com.avito.android.realty_agency.beduin.DevelopmentCardParentScreen;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.ApiException;
import dx.C39813a;
import ex.C40174a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealtyAgencySearchInternalAction.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:!\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u0082\u0001!#$%&'()*+,-./0123456789:;<=>?@ABC¨\u0006D"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnalyticsEvent", "CloseScreen", "ContentBottomSheet", "DevelopmentsLoading", "HandleDeeplink", "LotsLoading", "Map", "OpenFiltersScreen", "OpenLocationGroupScreen", "OpenWebView", "RefreshInlineFilter", "ScrollToTop", "SearchParamsClarifiedInternalAction", "SelectedDevelopmentItemInfoLoading", "ShowBookingScreen", "ShowClientFixationScreen", "ShowDevelopmentItemBottomSheetOptions", "ShowDevelopmentItemCardScreen", "ShowDevelopmentSortingTypeDialogSelector", "ShowHelpCenterBottomSheet", "ShowLotItemBottomSheetOptions", "ShowLotItemCardScreen", "ShowLotSortingTypeDialogSelector", "ShowNavigationMenuScreen", "ShowSelectionClientPickerBottomSheetScreen", "ShowSelectionsOnboardingBottomSheet", "ShowToast", "UpdateClientMode", "UpdateCommissionPromoBanner", "UpdateDevelopmentSortingType", "UpdateInlineFiltersLoadingState", "UpdateLotSortingType", "UpdateSelectedTab", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$HandleDeeplink;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenFiltersScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenLocationGroupScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenWebView;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$RefreshInlineFilter;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ScrollToTop;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SearchParamsClarifiedInternalAction;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowBookingScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowClientFixationScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentItemBottomSheetOptions;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentItemCardScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentSortingTypeDialogSelector;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowHelpCenterBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotItemBottomSheetOptions;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotItemCardScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotSortingTypeDialogSelector;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowNavigationMenuScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowSelectionClientPickerBottomSheetScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowSelectionsOnboardingBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowToast;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateClientMode;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateCommissionPromoBanner;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateDevelopmentSortingType;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateInlineFiltersLoadingState;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateLotSortingType;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateSelectedTab;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RealtyAgencySearchInternalAction extends n {

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "ClientBookingOptionClicked", "ClientFixationOptionClicked", "LotAddedToSelection", "MapPinClicked", "SearchResultLoaded", "SortingSelectorClicked", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$ClientBookingOptionClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$ClientFixationOptionClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$LotAddedToSelection;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$MapPinClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$SearchResultLoaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$SortingSelectorClicked;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AnalyticsEvent extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$ClientBookingOptionClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ClientBookingOptionClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138816b;

            /* renamed from: c, reason: collision with root package name */
            public final long f138817c;

            /* renamed from: d, reason: collision with root package name */
            public final long f138818d;

            public ClientBookingOptionClicked(@k SearchParams searchParams, long j12, long j13) {
                this.f138816b = searchParams;
                this.f138817c = j12;
                this.f138818d = j13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClientBookingOptionClicked)) {
                    return false;
                }
                ClientBookingOptionClicked clientBookingOptionClicked = (ClientBookingOptionClicked) obj;
                return L.f(this.f138816b, clientBookingOptionClicked.f138816b) && this.f138817c == clientBookingOptionClicked.f138817c && this.f138818d == clientBookingOptionClicked.f138818d;
            }

            public final int hashCode() {
                return Long.hashCode(this.f138818d) + r.g(((this.f138816b.hashCode() * 31) - 1312354729) * 31, 31, this.f138817c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ClientBookingOptionClicked(searchParams=");
                sb2.append(this.f138816b);
                sb2.append(", fromPage=flat_snippet, developmentId=");
                sb2.append(this.f138817c);
                sb2.append(", lotId=");
                return r.u(sb2, this.f138818d, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$ClientFixationOptionClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ClientFixationOptionClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138819b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f138820c;

            /* renamed from: d, reason: collision with root package name */
            public final long f138821d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Long f138822e;

            public ClientFixationOptionClicked(@k SearchParams searchParams, @k String str, long j12, @l Long l12) {
                this.f138819b = searchParams;
                this.f138820c = str;
                this.f138821d = j12;
                this.f138822e = l12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClientFixationOptionClicked)) {
                    return false;
                }
                ClientFixationOptionClicked clientFixationOptionClicked = (ClientFixationOptionClicked) obj;
                return L.f(this.f138819b, clientFixationOptionClicked.f138819b) && L.f(this.f138820c, clientFixationOptionClicked.f138820c) && this.f138821d == clientFixationOptionClicked.f138821d && L.f(this.f138822e, clientFixationOptionClicked.f138822e);
            }

            public final int hashCode() {
                int iG2 = r.g(H.d(this.f138819b.hashCode() * 31, 31, this.f138820c), 31, this.f138821d);
                Long l12 = this.f138822e;
                return iG2 + (l12 == null ? 0 : l12.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ClientFixationOptionClicked(searchParams=");
                sb2.append(this.f138819b);
                sb2.append(", fromPage=");
                sb2.append(this.f138820c);
                sb2.append(", developmentId=");
                sb2.append(this.f138821d);
                sb2.append(", lotId=");
                return m.m(sb2, this.f138822e, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$LotAddedToSelection;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LotAddedToSelection implements AnalyticsEvent {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LotAddedToSelection)) {
                    return false;
                }
                ((LotAddedToSelection) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "LotAddedToSelection(clientId=null, lotId=0)";
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$MapPinClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MapPinClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138823b;

            /* renamed from: c, reason: collision with root package name */
            public final long f138824c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f138825d;

            public MapPinClicked(@k SearchParams searchParams, long j12, boolean z12) {
                this.f138823b = searchParams;
                this.f138824c = j12;
                this.f138825d = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MapPinClicked)) {
                    return false;
                }
                MapPinClicked mapPinClicked = (MapPinClicked) obj;
                return L.f(this.f138823b, mapPinClicked.f138823b) && this.f138824c == mapPinClicked.f138824c && this.f138825d == mapPinClicked.f138825d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f138825d) + r.g(this.f138823b.hashCode() * 31, 31, this.f138824c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MapPinClicked(searchParams=");
                sb2.append(this.f138823b);
                sb2.append(", developmentId=");
                sb2.append(this.f138824c);
                sb2.append(", isHiddenCommission=");
                return r.x(sb2, this.f138825d, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$SearchResultLoaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SearchResultLoaded implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final SearchParams f138826b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Tab f138827c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f138828d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final DevelopmentSort f138829e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final LotSort f138830f;

            /* renamed from: g, reason: collision with root package name */
            public final int f138831g;

            public SearchResultLoaded(int i12, @k Tab tab, @k DevelopmentSort developmentSort, @k LotSort lotSort, @k SearchParams searchParams, boolean z12) {
                this.f138826b = searchParams;
                this.f138827c = tab;
                this.f138828d = z12;
                this.f138829e = developmentSort;
                this.f138830f = lotSort;
                this.f138831g = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchResultLoaded)) {
                    return false;
                }
                SearchResultLoaded searchResultLoaded = (SearchResultLoaded) obj;
                return L.f(this.f138826b, searchResultLoaded.f138826b) && this.f138827c == searchResultLoaded.f138827c && this.f138828d == searchResultLoaded.f138828d && this.f138829e == searchResultLoaded.f138829e && this.f138830f == searchResultLoaded.f138830f && this.f138831g == searchResultLoaded.f138831g;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f138831g) + ((this.f138830f.hashCode() + ((this.f138829e.hashCode() + r.i((this.f138827c.hashCode() + (this.f138826b.hashCode() * 31)) * 31, 31, this.f138828d)) * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SearchResultLoaded(searchParams=");
                sb2.append(this.f138826b);
                sb2.append(", selectedTab=");
                sb2.append(this.f138827c);
                sb2.append(", isHiddenCommission=");
                sb2.append(this.f138828d);
                sb2.append(", developmentSort=");
                sb2.append(this.f138829e);
                sb2.append(", lotSort=");
                sb2.append(this.f138830f);
                sb2.append(", loadedPageNumber=");
                return r.t(sb2, this.f138831g, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent$SortingSelectorClicked;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$AnalyticsEvent;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SortingSelectorClicked implements AnalyticsEvent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final SortingSelectorClicked f138832b = new SortingSelectorClicked();

            private SortingSelectorClicked() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof SortingSelectorClicked);
            }

            public final int hashCode() {
                return 1075436930;
            }

            @k
            public final String toString() {
                return "SortingSelectorClicked";
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f138833b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -555162296;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Collapse", "ExpandByHalf", "UpdateState", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$Collapse;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$ExpandByHalf;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$UpdateState;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ContentBottomSheet extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$Collapse;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Collapse implements ContentBottomSheet {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Collapse f138834b = new Collapse();

            private Collapse() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Collapse);
            }

            public final int hashCode() {
                return 1687983460;
            }

            @k
            public final String toString() {
                return "Collapse";
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$ExpandByHalf;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ExpandByHalf implements ContentBottomSheet {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ExpandByHalf f138835b = new ExpandByHalf();

            private ExpandByHalf() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ExpandByHalf);
            }

            public final int hashCode() {
                return 649128603;
            }

            @k
            public final String toString() {
                return "ExpandByHalf";
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet$UpdateState;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ContentBottomSheet;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateState implements ContentBottomSheet {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f138836b;

            public UpdateState(boolean z12) {
                this.f138836b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateState) && this.f138836b == ((UpdateState) obj).f138836b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f138836b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("UpdateState(collapsed="), this.f138836b, ')');
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DevelopmentsLoading extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements DevelopmentsLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C39813a f138837b;

            /* renamed from: c, reason: collision with root package name */
            public final int f138838c;

            public Loaded(@k C39813a c39813a, int i12) {
                this.f138837b = c39813a;
                this.f138838c = i12;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return L.f(this.f138837b, loaded.f138837b) && this.f138838c == loaded.f138838c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f138838c) + (this.f138837b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(data=");
                sb2.append(this.f138837b);
                sb2.append(", page=");
                return r.t(sb2, this.f138838c, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements DevelopmentsLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f138839b;

            /* renamed from: c, reason: collision with root package name */
            public final int f138840c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final J.a f138841d;

            public LoadingError(@k ApiException apiException, int i12) {
                this.f138839b = apiException;
                this.f138840c = i12;
                this.f138841d = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingError)) {
                    return false;
                }
                LoadingError loadingError = (LoadingError) obj;
                return this.f138839b.equals(loadingError.f138839b) && this.f138840c == loadingError.f138840c;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF138866c() {
                return this.f138841d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f138840c) + (this.f138839b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingError(e=");
                sb2.append(this.f138839b);
                sb2.append(", page=");
                return r.t(sb2, this.f138840c, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$DevelopmentsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements DevelopmentsLoading {

            /* renamed from: d, reason: collision with root package name */
            public final int f138842d;

            public StartLoading(int i12) {
                this.f138842d = i12;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && this.f138842d == ((StartLoading) obj).f138842d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return Integer.hashCode(this.f138842d);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("StartLoading(page="), this.f138842d, ')');
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$HandleDeeplink;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f138843b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f138843b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f138843b, ((HandleDeeplink) obj).f138843b);
        }

        public final int hashCode() {
            return this.f138843b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f138843b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LotsLoading extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements LotsLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C40174a f138844b;

            /* renamed from: c, reason: collision with root package name */
            public final int f138845c;

            public Loaded(@k C40174a c40174a, int i12) {
                this.f138844b = c40174a;
                this.f138845c = i12;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return L.f(this.f138844b, loaded.f138844b) && this.f138845c == loaded.f138845c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f138845c) + (this.f138844b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(data=");
                sb2.append(this.f138844b);
                sb2.append(", page=");
                return r.t(sb2, this.f138845c, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements LotsLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f138846b;

            /* renamed from: c, reason: collision with root package name */
            public final int f138847c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final J.a f138848d;

            public LoadingError(@k ApiException apiException, int i12) {
                this.f138846b = apiException;
                this.f138847c = i12;
                this.f138848d = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingError)) {
                    return false;
                }
                LoadingError loadingError = (LoadingError) obj;
                return this.f138846b.equals(loadingError.f138846b) && this.f138847c == loadingError.f138847c;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF138866c() {
                return this.f138848d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f138847c) + (this.f138846b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingError(e=");
                sb2.append(this.f138846b);
                sb2.append(", page=");
                return r.t(sb2, this.f138847c, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$LotsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements LotsLoading {

            /* renamed from: d, reason: collision with root package name */
            public final int f138849d;

            public StartLoading(int i12) {
                this.f138849d = i12;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && this.f138849d == ((StartLoading) obj).f138849d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return Integer.hashCode(this.f138849d);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("StartLoading(page="), this.f138849d, ')');
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "MoveToBounds", "MoveToPoint", "UpdateBounds", "UpdateLastLoadedMarkers", "UpdateSelectedMarker", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$MoveToBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$MoveToPoint;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateLastLoadedMarkers;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateSelectedMarker;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Map extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$MoveToBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MoveToBounds implements Map {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapBounds f138850b;

            public MoveToBounds(@k AvitoMapBounds avitoMapBounds) {
                this.f138850b = avitoMapBounds;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoveToBounds) && L.f(this.f138850b, ((MoveToBounds) obj).f138850b);
            }

            public final int hashCode() {
                return this.f138850b.hashCode();
            }

            @k
            public final String toString() {
                return "MoveToBounds(bounds=" + this.f138850b + ')';
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$MoveToPoint;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MoveToPoint implements Map {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapPoint f138851b;

            /* renamed from: c, reason: collision with root package name */
            public final long f138852c;

            public MoveToPoint(@k AvitoMapPoint avitoMapPoint, long j12) {
                this.f138851b = avitoMapPoint;
                this.f138852c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoveToPoint)) {
                    return false;
                }
                MoveToPoint moveToPoint = (MoveToPoint) obj;
                return L.f(this.f138851b, moveToPoint.f138851b) && this.f138852c == moveToPoint.f138852c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f138852c) + (this.f138851b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MoveToPoint(point=");
                sb2.append(this.f138851b);
                sb2.append(", zoomLevel=");
                return r.u(sb2, this.f138852c, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateBounds;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateBounds implements Map {

            /* renamed from: b, reason: collision with root package name */
            public final int f138853b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AvitoMapBounds f138854c;

            public UpdateBounds(int i12, @k AvitoMapBounds avitoMapBounds) {
                this.f138853b = i12;
                this.f138854c = avitoMapBounds;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateBounds)) {
                    return false;
                }
                UpdateBounds updateBounds = (UpdateBounds) obj;
                return this.f138853b == updateBounds.f138853b && L.f(this.f138854c, updateBounds.f138854c);
            }

            public final int hashCode() {
                return this.f138854c.hashCode() + (Integer.hashCode(this.f138853b) * 31);
            }

            @k
            public final String toString() {
                return "UpdateBounds(zoomLevel=" + this.f138853b + ", bounds=" + this.f138854c + ')';
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateLastLoadedMarkers;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateLastLoadedMarkers implements Map {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GetMapMarkersResponse f138855b;

            public UpdateLastLoadedMarkers(@k GetMapMarkersResponse getMapMarkersResponse) {
                this.f138855b = getMapMarkersResponse;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateLastLoadedMarkers) && L.f(this.f138855b, ((UpdateLastLoadedMarkers) obj).f138855b);
            }

            public final int hashCode() {
                return this.f138855b.hashCode();
            }

            @k
            public final String toString() {
                return "UpdateLastLoadedMarkers(data=" + this.f138855b + ')';
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map$UpdateSelectedMarker;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$Map;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateSelectedMarker implements Map {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f138856b;

            public UpdateSelectedMarker(@l String str) {
                this.f138856b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateSelectedMarker) && L.f(this.f138856b, ((UpdateSelectedMarker) obj).f138856b);
            }

            public final int hashCode() {
                String str = this.f138856b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("UpdateSelectedMarker(markerId="), this.f138856b, ')');
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenFiltersScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFiltersScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f138857b;

        public OpenFiltersScreen(@k SearchParams searchParams) {
            this.f138857b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenFiltersScreen) && L.f(this.f138857b, ((OpenFiltersScreen) obj).f138857b);
        }

        public final int hashCode() {
            return this.f138857b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("OpenFiltersScreen(searchParams="), this.f138857b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenLocationGroupScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenLocationGroupScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f138858b;

        public OpenLocationGroupScreen(@k SearchParams searchParams) {
            this.f138858b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLocationGroupScreen) && L.f(this.f138858b, ((OpenLocationGroupScreen) obj).f138858b);
        }

        public final int hashCode() {
            return this.f138858b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("OpenLocationGroupScreen(searchParams="), this.f138858b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$OpenWebView;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenWebView implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f138859b;

        public OpenWebView(@k String str) {
            this.f138859b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWebView) && L.f(this.f138859b, ((OpenWebView) obj).f138859b);
        }

        public final int hashCode() {
            return this.f138859b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f138859b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$RefreshInlineFilter;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshInlineFilter implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RefreshInlineFilter f138860b = new RefreshInlineFilter();

        private RefreshInlineFilter() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RefreshInlineFilter);
        }

        public final int hashCode() {
            return 58092208;
        }

        @k
        public final String toString() {
            return "RefreshInlineFilter";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ScrollToTop;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToTop implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrollToTop f138861b = new ScrollToTop();

        private ScrollToTop() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScrollToTop);
        }

        public final int hashCode() {
            return 1342667473;
        }

        @k
        public final String toString() {
            return "ScrollToTop";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SearchParamsClarifiedInternalAction;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchParamsClarifiedInternalAction implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f138862b;

        public SearchParamsClarifiedInternalAction(@k SearchParams searchParams) {
            this.f138862b = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchParamsClarifiedInternalAction) && L.f(this.f138862b, ((SearchParamsClarifiedInternalAction) obj).f138862b);
        }

        public final int hashCode() {
            return this.f138862b.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("SearchParamsClarifiedInternalAction(searchParams="), this.f138862b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Clear", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Clear;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SelectedDevelopmentItemInfoLoading extends RealtyAgencySearchInternalAction {

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Clear;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Clear implements SelectedDevelopmentItemInfoLoading {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Clear f138863b = new Clear();

            private Clear() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Clear);
            }

            public final int hashCode() {
                return 1695599638;
            }

            @k
            public final String toString() {
                return "Clear";
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements SelectedDevelopmentItemInfoLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GetDevelopmentTooltipInfo f138864b;

            public Loaded(@k GetDevelopmentTooltipInfo getDevelopmentTooltipInfo) {
                this.f138864b = getDevelopmentTooltipInfo;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f138864b, ((Loaded) obj).f138864b);
            }

            public final int hashCode() {
                return this.f138864b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(response=" + this.f138864b + ')';
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements SelectedDevelopmentItemInfoLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f138865b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f138866c;

            public LoadingError(@k ApiException apiException) {
                this.f138865b = apiException;
                this.f138866c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF146467d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF303160d() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f138865b.equals(((LoadingError) obj).f138865b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF138866c() {
                return this.f138866c;
            }

            public final int hashCode() {
                return this.f138865b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(e="), this.f138865b, ')');
            }
        }

        /* compiled from: RealtyAgencySearchInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$SelectedDevelopmentItemInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements SelectedDevelopmentItemInfoLoading {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f138867d;

            public StartLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && L.f(this.f138867d, ((StartLoading) obj).f138867d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f138867d.hashCode();
            }

            @k
            public final String toString() {
                return c.v(new StringBuilder("StartLoading(stub="), this.f138867d, ')');
            }

            public StartLoading(G0 g02, int i12, C42822w c42822w) {
                this.f138867d = (i12 & 1) != 0 ? G0.f406611a : g02;
            }
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowBookingScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowBookingScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138868b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f138869c;

        public ShowBookingScreen(long j12, @l String str) {
            this.f138868b = j12;
            this.f138869c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowBookingScreen)) {
                return false;
            }
            ShowBookingScreen showBookingScreen = (ShowBookingScreen) obj;
            return this.f138868b == showBookingScreen.f138868b && L.f(this.f138869c, showBookingScreen.f138869c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f138868b) * 31;
            String str = this.f138869c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowBookingScreen(lotId=");
            sb2.append(this.f138868b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f138869c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowClientFixationScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowClientFixationScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138870b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f138871c;

        public ShowClientFixationScreen(long j12, @l String str) {
            this.f138870b = j12;
            this.f138871c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowClientFixationScreen)) {
                return false;
            }
            ShowClientFixationScreen showClientFixationScreen = (ShowClientFixationScreen) obj;
            return this.f138870b == showClientFixationScreen.f138870b && L.f(this.f138871c, showClientFixationScreen.f138871c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f138870b) * 31;
            String str = this.f138871c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowClientFixationScreen(developmentId=");
            sb2.append(this.f138870b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f138871c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentItemBottomSheetOptions;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDevelopmentItemBottomSheetOptions implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138872b;

        public ShowDevelopmentItemBottomSheetOptions(long j12) {
            this.f138872b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDevelopmentItemBottomSheetOptions) && this.f138872b == ((ShowDevelopmentItemBottomSheetOptions) obj).f138872b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f138872b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ShowDevelopmentItemBottomSheetOptions(developmentId="), this.f138872b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentItemCardScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDevelopmentItemCardScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DevelopmentCardParentScreen f138873b;

        /* renamed from: c, reason: collision with root package name */
        public final long f138874c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f138875d;

        public ShowDevelopmentItemCardScreen(@k DevelopmentCardParentScreen developmentCardParentScreen, long j12, @l String str) {
            this.f138873b = developmentCardParentScreen;
            this.f138874c = j12;
            this.f138875d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowDevelopmentItemCardScreen)) {
                return false;
            }
            ShowDevelopmentItemCardScreen showDevelopmentItemCardScreen = (ShowDevelopmentItemCardScreen) obj;
            return this.f138873b == showDevelopmentItemCardScreen.f138873b && this.f138874c == showDevelopmentItemCardScreen.f138874c && L.f(this.f138875d, showDevelopmentItemCardScreen.f138875d);
        }

        public final int hashCode() {
            int iG2 = r.g(this.f138873b.hashCode() * 31, 31, this.f138874c);
            String str = this.f138875d;
            return iG2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDevelopmentItemCardScreen(parentScreen=");
            sb2.append(this.f138873b);
            sb2.append(", developmentId=");
            sb2.append(this.f138874c);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f138875d, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowDevelopmentSortingTypeDialogSelector;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDevelopmentSortingTypeDialogSelector implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowDevelopmentSortingTypeDialogSelector f138876b = new ShowDevelopmentSortingTypeDialogSelector();

        private ShowDevelopmentSortingTypeDialogSelector() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowDevelopmentSortingTypeDialogSelector);
        }

        public final int hashCode() {
            return 1841988899;
        }

        @k
        public final String toString() {
            return "ShowDevelopmentSortingTypeDialogSelector";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowHelpCenterBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowHelpCenterBottomSheet implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f138877b;

        public ShowHelpCenterBottomSheet(@l String str) {
            this.f138877b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowHelpCenterBottomSheet) && L.f(this.f138877b, ((ShowHelpCenterBottomSheet) obj).f138877b);
        }

        public final int hashCode() {
            String str = this.f138877b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowHelpCenterBottomSheet(locationId="), this.f138877b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotItemBottomSheetOptions;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLotItemBottomSheetOptions implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138878b;

        /* renamed from: c, reason: collision with root package name */
        public final long f138879c;

        public ShowLotItemBottomSheetOptions(long j12, long j13) {
            this.f138878b = j12;
            this.f138879c = j13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLotItemBottomSheetOptions)) {
                return false;
            }
            ShowLotItemBottomSheetOptions showLotItemBottomSheetOptions = (ShowLotItemBottomSheetOptions) obj;
            return this.f138878b == showLotItemBottomSheetOptions.f138878b && this.f138879c == showLotItemBottomSheetOptions.f138879c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f138879c) + (Long.hashCode(this.f138878b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLotItemBottomSheetOptions(lotId=");
            sb2.append(this.f138878b);
            sb2.append(", developmentId=");
            return r.u(sb2, this.f138879c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotItemCardScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLotItemCardScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138880b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f138881c;

        public ShowLotItemCardScreen(long j12, @l String str) {
            this.f138880b = j12;
            this.f138881c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLotItemCardScreen)) {
                return false;
            }
            ShowLotItemCardScreen showLotItemCardScreen = (ShowLotItemCardScreen) obj;
            return this.f138880b == showLotItemCardScreen.f138880b && L.f(this.f138881c, showLotItemCardScreen.f138881c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f138880b) * 31;
            String str = this.f138881c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowLotItemCardScreen(lotId=");
            sb2.append(this.f138880b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f138881c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowLotSortingTypeDialogSelector;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLotSortingTypeDialogSelector implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLotSortingTypeDialogSelector f138882b = new ShowLotSortingTypeDialogSelector();

        private ShowLotSortingTypeDialogSelector() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLotSortingTypeDialogSelector);
        }

        public final int hashCode() {
            return -1894331187;
        }

        @k
        public final String toString() {
            return "ShowLotSortingTypeDialogSelector";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowNavigationMenuScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowNavigationMenuScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowNavigationMenuScreen f138883b = new ShowNavigationMenuScreen();

        private ShowNavigationMenuScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowNavigationMenuScreen);
        }

        public final int hashCode() {
            return -1485163464;
        }

        @k
        public final String toString() {
            return "ShowNavigationMenuScreen";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowSelectionClientPickerBottomSheetScreen;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelectionClientPickerBottomSheetScreen implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f138884b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f138885c;

        public ShowSelectionClientPickerBottomSheetScreen(long j12, @l String str) {
            this.f138884b = j12;
            this.f138885c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSelectionClientPickerBottomSheetScreen)) {
                return false;
            }
            ShowSelectionClientPickerBottomSheetScreen showSelectionClientPickerBottomSheetScreen = (ShowSelectionClientPickerBottomSheetScreen) obj;
            return this.f138884b == showSelectionClientPickerBottomSheetScreen.f138884b && L.f(this.f138885c, showSelectionClientPickerBottomSheetScreen.f138885c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f138884b) * 31;
            String str = this.f138885c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSelectionClientPickerBottomSheetScreen(lotId=");
            sb2.append(this.f138884b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f138885c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowSelectionsOnboardingBottomSheet;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSelectionsOnboardingBottomSheet implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSelectionsOnboardingBottomSheet f138886b = new ShowSelectionsOnboardingBottomSheet();

        private ShowSelectionsOnboardingBottomSheet() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSelectionsOnboardingBottomSheet);
        }

        public final int hashCode() {
            return 231335097;
        }

        @k
        public final String toString() {
            return "ShowSelectionsOnboardingBottomSheet";
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$ShowToast;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f138887b;

        public ShowToast(@k String str) {
            this.f138887b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f138887b, ((ShowToast) obj).f138887b);
        }

        public final int hashCode() {
            return this.f138887b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f138887b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateClientMode;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClientMode implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f138888b;

        public UpdateClientMode(boolean z12) {
            this.f138888b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClientMode) && this.f138888b == ((UpdateClientMode) obj).f138888b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138888b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateClientMode(isEnabled="), this.f138888b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateCommissionPromoBanner;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCommissionPromoBanner implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final RealtyAgencySearchArguments.CommissionPromoBanner f138889b;

        public UpdateCommissionPromoBanner(@l RealtyAgencySearchArguments.CommissionPromoBanner commissionPromoBanner) {
            this.f138889b = commissionPromoBanner;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCommissionPromoBanner) && L.f(this.f138889b, ((UpdateCommissionPromoBanner) obj).f138889b);
        }

        public final int hashCode() {
            RealtyAgencySearchArguments.CommissionPromoBanner commissionPromoBanner = this.f138889b;
            if (commissionPromoBanner == null) {
                return 0;
            }
            return commissionPromoBanner.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCommissionPromoBanner(commissionPromoBanner=" + this.f138889b + ')';
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateDevelopmentSortingType;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDevelopmentSortingType implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DevelopmentSort f138890b;

        public UpdateDevelopmentSortingType(@k DevelopmentSort developmentSort) {
            this.f138890b = developmentSort;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateDevelopmentSortingType) && this.f138890b == ((UpdateDevelopmentSortingType) obj).f138890b;
        }

        public final int hashCode() {
            return this.f138890b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateDevelopmentSortingType(sortingType=" + this.f138890b + ')';
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateInlineFiltersLoadingState;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInlineFiltersLoadingState implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f138891b;

        public UpdateInlineFiltersLoadingState(boolean z12) {
            this.f138891b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateInlineFiltersLoadingState) && this.f138891b == ((UpdateInlineFiltersLoadingState) obj).f138891b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138891b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateInlineFiltersLoadingState(loaded="), this.f138891b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateLotSortingType;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLotSortingType implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LotSort f138892b;

        public UpdateLotSortingType(@k LotSort lotSort) {
            this.f138892b = lotSort;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLotSortingType) && this.f138892b == ((UpdateLotSortingType) obj).f138892b;
        }

        public final int hashCode() {
            return this.f138892b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateLotSortingType(sortingType=" + this.f138892b + ')';
        }
    }

    /* compiled from: RealtyAgencySearchInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction$UpdateSelectedTab;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedTab implements RealtyAgencySearchInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Tab f138893b;

        public UpdateSelectedTab(@k Tab tab) {
            this.f138893b = tab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedTab) && this.f138893b == ((UpdateSelectedTab) obj).f138893b;
        }

        public final int hashCode() {
            return this.f138893b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSelectedTab(selectedTab=" + this.f138893b + ')';
        }
    }
}
