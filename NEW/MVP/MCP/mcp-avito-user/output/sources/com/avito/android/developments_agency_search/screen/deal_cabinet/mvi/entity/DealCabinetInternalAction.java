package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity;

import AK.c;
import Xw.C17054a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BannersLoading", "ClearClientListLoadedPages", "ClearMortgageListLoadedPages", "ClientsLoading", "CloseScreen", "DealUpdatesLoading", "HideCommissionPromoBanner", "MortgageLoading", "OpenDealRoomScreen", "OpenMortgageDeeplink", "OpenMortgageProApplicationLink", "OpenWebView", "RemoveDealUpdateItem", "ReturnToWork", "ShowClientsFilterSelectorScreen", "ShowMortgageFilterSelectorScreen", "UpdateClientListFilter", "UpdateClientsLastSearchQuery", "UpdateMortgageLastSearchQuery", "UpdateMortgageListFilter", "UpdateTab", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClearClientListLoadedPages;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClearMortgageListLoadedPages;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$HideCommissionPromoBanner;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenDealRoomScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenMortgageDeeplink;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenMortgageProApplicationLink;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenWebView;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$RemoveDealUpdateItem;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ReturnToWork;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ShowClientsFilterSelectorScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ShowMortgageFilterSelectorScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateClientListFilter;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateClientsLastSearchQuery;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateMortgageLastSearchQuery;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateMortgageListFilter;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateTab;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DealCabinetInternalAction extends n {

    /* compiled from: DealCabinetInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BannersLoading extends DealCabinetInternalAction {

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements BannersLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GetDealCabinetHeader f137076b;

            public Loaded(@k GetDealCabinetHeader getDealCabinetHeader) {
                this.f137076b = getDealCabinetHeader;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f137076b, ((Loaded) obj).f137076b);
            }

            public final int hashCode() {
                return this.f137076b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(data=" + this.f137076b + ')';
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements BannersLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f137077b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f137078c;

            public LoadingError(@k ApiException apiException) {
                this.f137077b = apiException;
                this.f137078c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f137077b.equals(((LoadingError) obj).f137077b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF318183d() {
                return this.f137078c;
            }

            public final int hashCode() {
                return this.f137077b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(error="), this.f137077b, ')');
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$BannersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartLoading extends TrackableLoadingStarted implements BannersLoading {
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClearClientListLoadedPages;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearClientListLoadedPages implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearClientListLoadedPages f137079b = new ClearClientListLoadedPages();

        private ClearClientListLoadedPages() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearClientListLoadedPages);
        }

        public final int hashCode() {
            return 911417574;
        }

        @k
        public final String toString() {
            return "ClearClientListLoadedPages";
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClearMortgageListLoadedPages;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearMortgageListLoadedPages implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearMortgageListLoadedPages f137080b = new ClearMortgageListLoadedPages();

        private ClearMortgageListLoadedPages() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearMortgageListLoadedPages);
        }

        public final int hashCode() {
            return -1709537291;
        }

        @k
        public final String toString() {
            return "ClearMortgageListLoadedPages";
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ClientsLoading extends DealCabinetInternalAction {

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements ClientsLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GetClientListResponse f137081b;

            public Loaded(@k GetClientListResponse getClientListResponse) {
                this.f137081b = getClientListResponse;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f137081b, ((Loaded) obj).f137081b);
            }

            public final int hashCode() {
                return this.f137081b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(data=" + this.f137081b + ')';
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements ClientsLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f137082b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f137083c;

            public LoadingError(@k ApiException apiException) {
                this.f137082b = apiException;
                this.f137083c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f137082b.equals(((LoadingError) obj).f137082b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF318183d() {
                return this.f137083c;
            }

            public final int hashCode() {
                return this.f137082b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(error="), this.f137082b, ')');
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ClientsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartLoading extends TrackableLoadingStarted implements ClientsLoading {
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$CloseScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f137084b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1270857959;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DealUpdatesLoading extends DealCabinetInternalAction {

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements DealUpdatesLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final GetDealUpdatesResponse f137085b;

            public Loaded(@k GetDealUpdatesResponse getDealUpdatesResponse) {
                this.f137085b = getDealUpdatesResponse;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f137085b, ((Loaded) obj).f137085b);
            }

            public final int hashCode() {
                return this.f137085b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(data=" + this.f137085b + ')';
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements DealUpdatesLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f137086b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f137087c;

            public LoadingError(@k ApiException apiException) {
                this.f137086b = apiException;
                this.f137087c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f137086b.equals(((LoadingError) obj).f137086b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF318183d() {
                return this.f137087c;
            }

            public final int hashCode() {
                return this.f137086b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(error="), this.f137086b, ')');
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$DealUpdatesLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartLoading extends TrackableLoadingStarted implements DealUpdatesLoading {
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$HideCommissionPromoBanner;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideCommissionPromoBanner implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideCommissionPromoBanner f137088b = new HideCommissionPromoBanner();

        private HideCommissionPromoBanner() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideCommissionPromoBanner);
        }

        public final int hashCode() {
            return -661209551;
        }

        @k
        public final String toString() {
            return "HideCommissionPromoBanner";
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MortgageLoading extends DealCabinetInternalAction {

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements MortgageLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C17054a f137089b;

            public Loaded(@k C17054a c17054a) {
                this.f137089b = c17054a;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f137089b, ((Loaded) obj).f137089b);
            }

            public final int hashCode() {
                return this.f137089b.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(data=" + this.f137089b + ')';
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements MortgageLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f137090b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f137091c;

            public LoadingError(@k ApiException apiException) {
                this.f137090b = apiException;
                this.f137091c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @l
            /* renamed from: d */
            public final String getF261005e() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f137090b.equals(((LoadingError) obj).f137090b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF318183d() {
                return this.f137091c;
            }

            public final int hashCode() {
                return this.f137090b.hashCode();
            }

            @k
            public final String toString() {
                return c.q(new StringBuilder("LoadingError(error="), this.f137090b, ')');
            }
        }

        /* compiled from: DealCabinetInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$MortgageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartLoading extends TrackableLoadingStarted implements MortgageLoading {
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenDealRoomScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDealRoomScreen implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137092b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DealRoomLink.Status f137093c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f137094d;

        public OpenDealRoomScreen(@k String str, @k DealRoomLink.Status status, @k String str2) {
            this.f137092b = str;
            this.f137093c = status;
            this.f137094d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDealRoomScreen)) {
                return false;
            }
            OpenDealRoomScreen openDealRoomScreen = (OpenDealRoomScreen) obj;
            return L.f(this.f137092b, openDealRoomScreen.f137092b) && this.f137093c == openDealRoomScreen.f137093c && L.f(this.f137094d, openDealRoomScreen.f137094d);
        }

        public final int hashCode() {
            return this.f137094d.hashCode() + ((this.f137093c.hashCode() + (this.f137092b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDealRoomScreen(clientId=");
            sb2.append(this.f137092b);
            sb2.append(", status=");
            sb2.append(this.f137093c);
            sb2.append(", parentScreen=");
            return C22026a.c(sb2, this.f137094d, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenMortgageDeeplink;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMortgageDeeplink implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f137095b;

        public OpenMortgageDeeplink(@k DeepLink deepLink) {
            this.f137095b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMortgageDeeplink) && L.f(this.f137095b, ((OpenMortgageDeeplink) obj).f137095b);
        }

        public final int hashCode() {
            return this.f137095b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenMortgageDeeplink(deeplink="), this.f137095b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenMortgageProApplicationLink;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMortgageProApplicationLink implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenMortgageProApplicationLink f137096b = new OpenMortgageProApplicationLink();

        private OpenMortgageProApplicationLink() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenMortgageProApplicationLink);
        }

        public final int hashCode() {
            return 1020373344;
        }

        @k
        public final String toString() {
            return "OpenMortgageProApplicationLink";
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$OpenWebView;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenWebView implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137097b;

        public OpenWebView(@k String str) {
            this.f137097b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWebView) && L.f(this.f137097b, ((OpenWebView) obj).f137097b);
        }

        public final int hashCode() {
            return this.f137097b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f137097b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$RemoveDealUpdateItem;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveDealUpdateItem implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f137098b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f137099c;

        public RemoveDealUpdateItem(int i12, @k String str) {
            this.f137098b = i12;
            this.f137099c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveDealUpdateItem)) {
                return false;
            }
            RemoveDealUpdateItem removeDealUpdateItem = (RemoveDealUpdateItem) obj;
            return this.f137098b == removeDealUpdateItem.f137098b && L.f(this.f137099c, removeDealUpdateItem.f137099c);
        }

        public final int hashCode() {
            return this.f137099c.hashCode() + (Integer.hashCode(this.f137098b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveDealUpdateItem(id=");
            sb2.append(this.f137098b);
            sb2.append(", dealId=");
            return C22026a.c(sb2, this.f137099c, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ReturnToWork;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReturnToWork implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137100b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f137101c;

        public ReturnToWork(@k String str, @k DeepLink deepLink) {
            this.f137100b = str;
            this.f137101c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReturnToWork)) {
                return false;
            }
            ReturnToWork returnToWork = (ReturnToWork) obj;
            return L.f(this.f137100b, returnToWork.f137100b) && L.f(this.f137101c, returnToWork.f137101c);
        }

        public final int hashCode() {
            return this.f137101c.hashCode() + (this.f137100b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReturnToWork(applicationId=");
            sb2.append(this.f137100b);
            sb2.append(", deeplink=");
            return a.v(sb2, this.f137101c, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ShowClientsFilterSelectorScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowClientsFilterSelectorScreen implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.android.developments_agency_search.adapter.checkable_item.a> f137102b;

        public ShowClientsFilterSelectorScreen(@k List<com.avito.android.developments_agency_search.adapter.checkable_item.a> list) {
            this.f137102b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowClientsFilterSelectorScreen) && L.f(this.f137102b, ((ShowClientsFilterSelectorScreen) obj).f137102b);
        }

        public final int hashCode() {
            return this.f137102b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowClientsFilterSelectorScreen(options="), this.f137102b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$ShowMortgageFilterSelectorScreen;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMortgageFilterSelectorScreen implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.android.developments_agency_search.adapter.checkable_item.a> f137103b;

        public ShowMortgageFilterSelectorScreen(@k List<com.avito.android.developments_agency_search.adapter.checkable_item.a> list) {
            this.f137103b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMortgageFilterSelectorScreen) && L.f(this.f137103b, ((ShowMortgageFilterSelectorScreen) obj).f137103b);
        }

        public final int hashCode() {
            return this.f137103b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowMortgageFilterSelectorScreen(options="), this.f137103b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateClientListFilter;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClientListFilter implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GetClientListRequestStage f137104b;

        public UpdateClientListFilter(@k GetClientListRequestStage getClientListRequestStage) {
            this.f137104b = getClientListRequestStage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClientListFilter) && this.f137104b == ((UpdateClientListFilter) obj).f137104b;
        }

        public final int hashCode() {
            return this.f137104b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateClientListFilter(filter=" + this.f137104b + ')';
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateClientsLastSearchQuery;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClientsLastSearchQuery implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137105b;

        public UpdateClientsLastSearchQuery(@k String str) {
            this.f137105b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClientsLastSearchQuery) && L.f(this.f137105b, ((UpdateClientsLastSearchQuery) obj).f137105b);
        }

        public final int hashCode() {
            return this.f137105b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateClientsLastSearchQuery(searchQuery="), this.f137105b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateMortgageLastSearchQuery;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateMortgageLastSearchQuery implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137106b;

        public UpdateMortgageLastSearchQuery(@k String str) {
            this.f137106b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateMortgageLastSearchQuery) && L.f(this.f137106b, ((UpdateMortgageLastSearchQuery) obj).f137106b);
        }

        public final int hashCode() {
            return this.f137106b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateMortgageLastSearchQuery(searchQuery="), this.f137106b, ')');
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateMortgageListFilter;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateMortgageListFilter implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GetMortgageListRequestStatus f137107b;

        public UpdateMortgageListFilter(@k GetMortgageListRequestStatus getMortgageListRequestStatus) {
            this.f137107b = getMortgageListRequestStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateMortgageListFilter) && this.f137107b == ((UpdateMortgageListFilter) obj).f137107b;
        }

        public final int hashCode() {
            return this.f137107b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateMortgageListFilter(filter=" + this.f137107b + ')';
        }
    }

    /* compiled from: DealCabinetInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction$UpdateTab;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTab implements DealCabinetInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Tab f137108b;

        public UpdateTab(@k Tab tab) {
            this.f137108b = tab;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTab) && this.f137108b == ((UpdateTab) obj).f137108b;
        }

        public final int hashCode() {
            return this.f137108b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateTab(tab=" + this.f137108b + ')';
        }
    }
}
