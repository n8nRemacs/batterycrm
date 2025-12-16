package com.avito.android.map.mvi.entity;

import Y61.k;
import Y61.l;
import android.location.Location;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.SearchMapScreen;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithIdAndContext;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.map.analytics.ParentType;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.CloseMapButton;
import com.avito.android.remote.model.Counter;
import com.avito.android.remote.model.MapOnboarding;
import com.avito.android.remote.model.MarkersFeatures;
import com.avito.android.remote.model.PinFloatingContainer;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.search.map.Rash;
import com.avito.android.serp.adapter.S;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: MapInternalAction.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:.\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./\u0082\u0001.0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]¨\u0006^"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnalyticsParentTypeUpdated", "AreaSaved", "BottomSheetStateChanged", "CancelDrawing", "Draw", "Error", "FavorableAdvertChanged", "FiltersUpdated", "FinishDrawing", "FloatingViewsStateUpdate", "GeoDisabledInSettings", "GeoEnabledAndPermissionGranted", "GeoNeedPermissionDialog", "GoToSettings", "IsPermissionGranted", "IsRequestRationale", "LocationLoaded", "MapClicked", "MapMoveStarted", "MapMoved", "MapOnboardingLoaded", "MapOnboardingLoading", "MarkerClicked", "MarkersLoaded", "MarkersLoading", "NotifyFeaturesAboutSubscriptionsState", "NotifyFeaturesRefresh", "PanelOffsetChanged", "PanelStateChanged", "PinAdvertsLoaded", "PinAdvertsLoading", "ReloadInlines", "ResetDrawing", "ScrollPinsToTop", "SearchSubscriptionStateChanged", "ShortcutsLayoutChange", "ShowListClicked", "StartDrawing", "SubscribeButtonClicked", "UpdateButtonsVisibility", "UpdateLocationPermissionState", "UpdateNewSerpMapInteraction", "UpdateScrollToTopButtonVisibility", "UpdateUserMovedMapSinceLastLocationUpdate", "ZoomIn", "ZoomOut", "Lcom/avito/android/map/mvi/entity/MapInternalAction$AnalyticsParentTypeUpdated;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$AreaSaved;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$BottomSheetStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$CancelDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$Draw;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$Error;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$FavorableAdvertChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$FiltersUpdated;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$FinishDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$FloatingViewsStateUpdate;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoDisabledInSettings;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoEnabledAndPermissionGranted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoNeedPermissionDialog;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$GoToSettings;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$IsPermissionGranted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$IsRequestRationale;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$LocationLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MapClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MapMoveStarted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MapMoved;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MapOnboardingLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MapOnboardingLoading;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkerClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkersLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkersLoading;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$NotifyFeaturesAboutSubscriptionsState;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$NotifyFeaturesRefresh;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$PanelOffsetChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$PanelStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$PinAdvertsLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$PinAdvertsLoading;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ReloadInlines;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ResetDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ScrollPinsToTop;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$SearchSubscriptionStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ShortcutsLayoutChange;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ShowListClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$StartDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$SubscribeButtonClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateButtonsVisibility;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateLocationPermissionState;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateNewSerpMapInteraction;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateScrollToTopButtonVisibility;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateUserMovedMapSinceLastLocationUpdate;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ZoomIn;", "Lcom/avito/android/map/mvi/entity/MapInternalAction$ZoomOut;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface MapInternalAction extends n {

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$AnalyticsParentTypeUpdated;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticsParentTypeUpdated implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParentType f185061b;

        public AnalyticsParentTypeUpdated(@k ParentType parentType) {
            this.f185061b = parentType;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ParentType getF185061b() {
            return this.f185061b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnalyticsParentTypeUpdated) && this.f185061b == ((AnalyticsParentTypeUpdated) obj).f185061b;
        }

        public final int hashCode() {
            return this.f185061b.hashCode();
        }

        @k
        public final String toString() {
            return "AnalyticsParentTypeUpdated(parentType=" + this.f185061b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$AreaSaved;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AreaSaved implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f185062b;

        public AreaSaved(@k String str) {
            this.f185062b = str;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getF185062b() {
            return this.f185062b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AreaSaved) && L.f(this.f185062b, ((AreaSaved) obj).f185062b);
        }

        public final int hashCode() {
            return this.f185062b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AreaSaved(drawId="), this.f185062b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$BottomSheetStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomSheetStateChanged implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f185063b;

        public BottomSheetStateChanged(int i12) {
            this.f185063b = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getF185063b() {
            return this.f185063b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomSheetStateChanged) && this.f185063b == ((BottomSheetStateChanged) obj).f185063b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185063b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("BottomSheetStateChanged(state="), this.f185063b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$CancelDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CancelDrawing implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancelDrawing f185064b = new CancelDrawing();

        private CancelDrawing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CancelDrawing);
        }

        public final int hashCode() {
            return -1528174875;
        }

        @k
        public final String toString() {
            return "CancelDrawing";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$Draw;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Draw implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoMapPoint f185065b;

        public Draw(@k AvitoMapPoint avitoMapPoint) {
            this.f185065b = avitoMapPoint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Draw) && L.f(this.f185065b, ((Draw) obj).f185065b);
        }

        public final int hashCode() {
            return this.f185065b.hashCode();
        }

        @k
        public final String toString() {
            return "Draw(point=" + this.f185065b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$Error;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrackableError, MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f185066b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final MapErrorType f185067c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f185068d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f185069e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f185070f;

        /* compiled from: MapInternalAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f185071a;

            static {
                int[] iArr = new int[MapErrorType.values().length];
                try {
                    MapErrorType mapErrorType = MapErrorType.f185053b;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f185071a = iArr;
            }
        }

        public Error(@k Throwable th2, @k MapErrorType mapErrorType) {
            String str;
            this.f185066b = th2;
            this.f185067c = mapErrorType;
            this.f185068d = new J.a(th2);
            int[] iArr = a.f185071a;
            String str2 = null;
            if (iArr[mapErrorType.ordinal()] == 1) {
                SearchMapScreen.f90473d.getClass();
                str = SearchMapScreen.f90476g;
            } else {
                str = null;
            }
            this.f185069e = str;
            if (iArr[mapErrorType.ordinal()] == 1) {
                SearchMapScreen.f90473d.getClass();
                str2 = SearchMapScreen.f90476g;
            }
            this.f185070f = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final MapErrorType getF185067c() {
            return this.f185067c;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f185069e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e, reason: from getter */
        public final String getF185111s() {
            return this.f185070f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f185066b, error.f185066b) && this.f185067c == error.f185067c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF185068d() {
            return this.f185068d;
        }

        public final int hashCode() {
            return this.f185067c.hashCode() + (this.f185066b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Error(throwable=" + this.f185066b + ", type=" + this.f185067c + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$FavorableAdvertChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FavorableAdvertChanged implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final S f185072b;

        public FavorableAdvertChanged(@k S s5) {
            this.f185072b = s5;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final S getF185072b() {
            return this.f185072b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavorableAdvertChanged) && L.f(this.f185072b, ((FavorableAdvertChanged) obj).f185072b);
        }

        public final int hashCode() {
            return this.f185072b.hashCode();
        }

        @k
        public final String toString() {
            return "FavorableAdvertChanged(item=" + this.f185072b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$FiltersUpdated;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FiltersUpdated implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ItemsSearchLink f185073b;

        public FiltersUpdated(@k ItemsSearchLink itemsSearchLink) {
            this.f185073b = itemsSearchLink;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ItemsSearchLink getF185073b() {
            return this.f185073b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FiltersUpdated) && L.f(this.f185073b, ((FiltersUpdated) obj).f185073b);
        }

        public final int hashCode() {
            return this.f185073b.hashCode();
        }

        @k
        public final String toString() {
            return "FiltersUpdated(link=" + this.f185073b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$FinishDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishDrawing implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishDrawing f185074b = new FinishDrawing();

        private FinishDrawing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishDrawing);
        }

        public final int hashCode() {
            return -470668628;
        }

        @k
        public final String toString() {
            return "FinishDrawing";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$FloatingViewsStateUpdate;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FloatingViewsStateUpdate implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FloatingViewsPresenter.Subscriber.b f185075b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185076c;

        public FloatingViewsStateUpdate(@k FloatingViewsPresenter.Subscriber.b bVar, boolean z12) {
            this.f185075b = bVar;
            this.f185076c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FloatingViewsStateUpdate)) {
                return false;
            }
            FloatingViewsStateUpdate floatingViewsStateUpdate = (FloatingViewsStateUpdate) obj;
            return L.f(this.f185075b, floatingViewsStateUpdate.f185075b) && this.f185076c == floatingViewsStateUpdate.f185076c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185076c) + (this.f185075b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FloatingViewsStateUpdate(state=");
            sb2.append(this.f185075b);
            sb2.append(", hideInlineAction=");
            return r.x(sb2, this.f185076c, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoDisabledInSettings;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeoDisabledInSettings implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GeoDisabledInSettings f185077b = new GeoDisabledInSettings();

        private GeoDisabledInSettings() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GeoDisabledInSettings);
        }

        public final int hashCode() {
            return -55291178;
        }

        @k
        public final String toString() {
            return "GeoDisabledInSettings";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoEnabledAndPermissionGranted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeoEnabledAndPermissionGranted implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185078b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185079c;

        public GeoEnabledAndPermissionGranted(boolean z12, boolean z13) {
            this.f185078b = z12;
            this.f185079c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeoEnabledAndPermissionGranted)) {
                return false;
            }
            GeoEnabledAndPermissionGranted geoEnabledAndPermissionGranted = (GeoEnabledAndPermissionGranted) obj;
            return this.f185078b == geoEnabledAndPermissionGranted.f185078b && this.f185079c == geoEnabledAndPermissionGranted.f185079c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185079c) + (Boolean.hashCode(this.f185078b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeoEnabledAndPermissionGranted(isFirstTime=");
            sb2.append(this.f185078b);
            sb2.append(", isApproximateLocation=");
            return r.x(sb2, this.f185079c, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$GeoNeedPermissionDialog;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GeoNeedPermissionDialog implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GeoNeedPermissionDialog f185080b = new GeoNeedPermissionDialog();

        private GeoNeedPermissionDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GeoNeedPermissionDialog);
        }

        public final int hashCode() {
            return 1726495487;
        }

        @k
        public final String toString() {
            return "GeoNeedPermissionDialog";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$GoToSettings;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoToSettings implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GoToSettings f185081b = new GoToSettings();

        private GoToSettings() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GoToSettings);
        }

        public final int hashCode() {
            return 940567557;
        }

        @k
        public final String toString() {
            return "GoToSettings";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$IsPermissionGranted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsPermissionGranted implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final IsPermissionGranted f185082b = new IsPermissionGranted();

        private IsPermissionGranted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof IsPermissionGranted);
        }

        public final int hashCode() {
            return 1684981699;
        }

        @k
        public final String toString() {
            return "IsPermissionGranted";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$IsRequestRationale;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IsRequestRationale implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final IsRequestRationale f185083b = new IsRequestRationale();

        private IsRequestRationale() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof IsRequestRationale);
        }

        public final int hashCode() {
            return -1666482575;
        }

        @k
        public final String toString() {
            return "IsRequestRationale";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$LocationLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationLoaded implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Location f185084b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185085c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f185086d;

        public LocationLoaded(@k Location location, boolean z12, boolean z13) {
            this.f185084b = location;
            this.f185085c = z12;
            this.f185086d = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationLoaded)) {
                return false;
            }
            LocationLoaded locationLoaded = (LocationLoaded) obj;
            return L.f(this.f185084b, locationLoaded.f185084b) && this.f185085c == locationLoaded.f185085c && this.f185086d == locationLoaded.f185086d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185086d) + r.i(this.f185084b.hashCode() * 31, 31, this.f185085c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocationLoaded(location=");
            sb2.append(this.f185084b);
            sb2.append(", isApproximateLocation=");
            sb2.append(this.f185085c);
            sb2.append(", isFirstTime=");
            return r.x(sb2, this.f185086d, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MapClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapClicked implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MapClicked f185087b = new MapClicked();

        private MapClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof MapClicked);
        }

        public final int hashCode() {
            return 1784793130;
        }

        @k
        public final String toString() {
            return "MapClicked";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MapMoveStarted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapMoveStarted implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185088b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185089c;

        public MapMoveStarted(boolean z12, boolean z13) {
            this.f185088b = z12;
            this.f185089c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapMoveStarted)) {
                return false;
            }
            MapMoveStarted mapMoveStarted = (MapMoveStarted) obj;
            return this.f185088b == mapMoveStarted.f185088b && this.f185089c == mapMoveStarted.f185089c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185089c) + (Boolean.hashCode(this.f185088b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapMoveStarted(isZoom=");
            sb2.append(this.f185088b);
            sb2.append(", isGesture=");
            return r.x(sb2, this.f185089c, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MapMoved;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapMoved implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LatLngBounds f185090b;

        public MapMoved(@k LatLngBounds latLngBounds) {
            this.f185090b = latLngBounds;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final LatLngBounds getF185090b() {
            return this.f185090b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapMoved) && L.f(this.f185090b, ((MapMoved) obj).f185090b);
        }

        public final int hashCode() {
            return this.f185090b.hashCode();
        }

        @k
        public final String toString() {
            return "MapMoved(mapBounds=" + this.f185090b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MapOnboardingLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapOnboardingLoaded implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final MapOnboarding f185091b;

        public MapOnboardingLoaded(@l MapOnboarding mapOnboarding) {
            this.f185091b = mapOnboarding;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapOnboardingLoaded) && L.f(this.f185091b, ((MapOnboardingLoaded) obj).f185091b);
        }

        public final int hashCode() {
            MapOnboarding mapOnboarding = this.f185091b;
            if (mapOnboarding == null) {
                return 0;
            }
            return mapOnboarding.hashCode();
        }

        @k
        public final String toString() {
            return "MapOnboardingLoaded(onboarding=" + this.f185091b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MapOnboardingLoading;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MapOnboardingLoading implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final MapOnboardingLoading f185092b = new MapOnboardingLoading();

        private MapOnboardingLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof MapOnboardingLoading);
        }

        public final int hashCode() {
            return -1474457884;
        }

        @k
        public final String toString() {
            return "MapOnboardingLoading";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkerClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarkerClicked implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerWithIdAndContext f185093b;

        public MarkerClicked(@k MarkerWithIdAndContext markerWithIdAndContext) {
            this.f185093b = markerWithIdAndContext;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final MarkerWithIdAndContext getF185093b() {
            return this.f185093b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkerClicked) && L.f(this.f185093b, ((MarkerClicked) obj).f185093b);
        }

        public final int hashCode() {
            return this.f185093b.hashCode();
        }

        @k
        public final String toString() {
            return "MarkerClicked(item=" + this.f185093b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkersLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarkersLoaded implements TrackableContent, MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MarkerItem> f185094b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final MarkersFeatures f185095c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DrawingState f185096d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final List<Rash> f185097e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final LatLngBounds f185098f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Counter f185099g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f185100h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Boolean f185101i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final CloseMapButton f185102j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Integer f185103k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final List<AvitoMapPoint> f185104l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Float f185105m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f185106n;

        /* renamed from: o, reason: collision with root package name */
        @k
        public final SearchParams f185107o;

        /* renamed from: p, reason: collision with root package name */
        @k
        public final InlineAction.Predefined.State f185108p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f185109q;

        /* renamed from: r, reason: collision with root package name */
        @k
        public final String f185110r;

        /* renamed from: s, reason: collision with root package name */
        @k
        public final String f185111s;

        /* JADX WARN: Multi-variable type inference failed */
        public MarkersLoaded(@k List<? extends MarkerItem> list, @l MarkersFeatures markersFeatures, @k DrawingState drawingState, @l List<Rash> list2, @l LatLngBounds latLngBounds, @l Counter counter, @l String str, @l Boolean bool, @l CloseMapButton closeMapButton, @l Integer num, @l List<AvitoMapPoint> list3, @l Float f12, boolean z12, @k SearchParams searchParams, @k InlineAction.Predefined.State state, boolean z13) {
            this.f185094b = list;
            this.f185095c = markersFeatures;
            this.f185096d = drawingState;
            this.f185097e = list2;
            this.f185098f = latLngBounds;
            this.f185099g = counter;
            this.f185100h = str;
            this.f185101i = bool;
            this.f185102j = closeMapButton;
            this.f185103k = num;
            this.f185104l = list3;
            this.f185105m = f12;
            this.f185106n = z12;
            this.f185107o = searchParams;
            this.f185108p = state;
            this.f185109q = z13;
            SearchMapScreen searchMapScreen = SearchMapScreen.f90473d;
            searchMapScreen.getClass();
            String str2 = SearchMapScreen.f90476g;
            this.f185110r = str2;
            searchMapScreen.getClass();
            this.f185111s = str2;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF185106n() {
            return this.f185106n;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f185110r;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e, reason: from getter */
        public final String getF185111s() {
            return this.f185111s;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarkersLoaded)) {
                return false;
            }
            MarkersLoaded markersLoaded = (MarkersLoaded) obj;
            return L.f(this.f185094b, markersLoaded.f185094b) && L.f(this.f185095c, markersLoaded.f185095c) && this.f185096d == markersLoaded.f185096d && L.f(this.f185097e, markersLoaded.f185097e) && L.f(this.f185098f, markersLoaded.f185098f) && L.f(this.f185099g, markersLoaded.f185099g) && L.f(this.f185100h, markersLoaded.f185100h) && L.f(this.f185101i, markersLoaded.f185101i) && L.f(this.f185102j, markersLoaded.f185102j) && L.f(this.f185103k, markersLoaded.f185103k) && L.f(this.f185104l, markersLoaded.f185104l) && L.f(this.f185105m, markersLoaded.f185105m) && this.f185106n == markersLoaded.f185106n && L.f(this.f185107o, markersLoaded.f185107o) && this.f185108p == markersLoaded.f185108p && this.f185109q == markersLoaded.f185109q;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final LatLngBounds getF185098f() {
            return this.f185098f;
        }

        public final int hashCode() {
            int iHashCode = this.f185094b.hashCode() * 31;
            MarkersFeatures markersFeatures = this.f185095c;
            int iHashCode2 = (this.f185096d.hashCode() + ((iHashCode + (markersFeatures == null ? 0 : markersFeatures.hashCode())) * 31)) * 31;
            List<Rash> list = this.f185097e;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            LatLngBounds latLngBounds = this.f185098f;
            int iHashCode4 = (iHashCode3 + (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 31;
            Counter counter = this.f185099g;
            int iHashCode5 = (iHashCode4 + (counter == null ? 0 : counter.hashCode())) * 31;
            String str = this.f185100h;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f185101i;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            CloseMapButton closeMapButton = this.f185102j;
            int iHashCode8 = (iHashCode7 + (closeMapButton == null ? 0 : closeMapButton.hashCode())) * 31;
            Integer num = this.f185103k;
            int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            List<AvitoMapPoint> list2 = this.f185104l;
            int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Float f12 = this.f185105m;
            return Boolean.hashCode(this.f185109q) + ((this.f185108p.hashCode() + ((this.f185107o.hashCode() + r.i((iHashCode10 + (f12 != null ? f12.hashCode() : 0)) * 31, 31, this.f185106n)) * 31)) * 31);
        }

        @l
        /* renamed from: i, reason: from getter */
        public final CloseMapButton getF185102j() {
            return this.f185102j;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final Counter getF185099g() {
            return this.f185099g;
        }

        @l
        public final List<AvitoMapPoint> k() {
            return this.f185104l;
        }

        @k
        /* renamed from: l, reason: from getter */
        public final DrawingState getF185096d() {
            return this.f185096d;
        }

        @l
        /* renamed from: m, reason: from getter */
        public final MarkersFeatures getF185095c() {
            return this.f185095c;
        }

        @k
        public final List<MarkerItem> n() {
            return this.f185094b;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getF185109q() {
            return this.f185109q;
        }

        @k
        /* renamed from: p, reason: from getter */
        public final SearchParams getF185107o() {
            return this.f185107o;
        }

        @l
        /* renamed from: q, reason: from getter */
        public final String getF185100h() {
            return this.f185100h;
        }

        @k
        /* renamed from: r, reason: from getter */
        public final InlineAction.Predefined.State getF185108p() {
            return this.f185108p;
        }

        @l
        /* renamed from: s, reason: from getter */
        public final Integer getF185103k() {
            return this.f185103k;
        }

        @l
        /* renamed from: t, reason: from getter */
        public final Float getF185105m() {
            return this.f185105m;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MarkersLoaded(markers=");
            sb2.append(this.f185094b);
            sb2.append(", features=");
            sb2.append(this.f185095c);
            sb2.append(", drawingState=");
            sb2.append(this.f185096d);
            sb2.append(", rash=");
            sb2.append(this.f185097e);
            sb2.append(", bounds=");
            sb2.append(this.f185098f);
            sb2.append(", counters=");
            sb2.append(this.f185099g);
            sb2.append(", subscriptionId=");
            sb2.append(this.f185100h);
            sb2.append(", isSubscribed=");
            sb2.append(this.f185101i);
            sb2.append(", closeMapButton=");
            sb2.append(this.f185102j);
            sb2.append(", verticalId=");
            sb2.append(this.f185103k);
            sb2.append(", drawArea=");
            sb2.append(this.f185104l);
            sb2.append(", zoom=");
            sb2.append(this.f185105m);
            sb2.append(", animate=");
            sb2.append(this.f185106n);
            sb2.append(", searchParams=");
            sb2.append(this.f185107o);
            sb2.append(", subscriptionState=");
            sb2.append(this.f185108p);
            sb2.append(", resetArea=");
            return r.x(sb2, this.f185109q, ')');
        }

        @l
        /* renamed from: u, reason: from getter */
        public final Boolean getF185101i() {
            return this.f185101i;
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$MarkersLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MarkersLoading extends TrackableLoadingStarted implements MapInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f185112d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ScreenPerformanceTracker.LoadingType f185113e;

        public MarkersLoading() {
            SearchMapScreen.f90473d.getClass();
            this.f185112d = SearchMapScreen.f90476g;
            this.f185113e = ScreenPerformanceTracker.LoadingType.f90785b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF185112d() {
            return this.f185112d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkersLoading) && super.equals(obj);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF185113e() {
            return this.f185113e;
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$NotifyFeaturesAboutSubscriptionsState;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyFeaturesAboutSubscriptionsState implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InlineAction.Predefined.State f185114b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f185115c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f185116d;

        public NotifyFeaturesAboutSubscriptionsState(@k InlineAction.Predefined.State state, @l String str, boolean z12) {
            this.f185114b = state;
            this.f185115c = str;
            this.f185116d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotifyFeaturesAboutSubscriptionsState)) {
                return false;
            }
            NotifyFeaturesAboutSubscriptionsState notifyFeaturesAboutSubscriptionsState = (NotifyFeaturesAboutSubscriptionsState) obj;
            return this.f185114b == notifyFeaturesAboutSubscriptionsState.f185114b && L.f(this.f185115c, notifyFeaturesAboutSubscriptionsState.f185115c) && this.f185116d == notifyFeaturesAboutSubscriptionsState.f185116d;
        }

        public final int hashCode() {
            int iHashCode = this.f185114b.hashCode() * 31;
            String str = this.f185115c;
            return Boolean.hashCode(this.f185116d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyFeaturesAboutSubscriptionsState(state=");
            sb2.append(this.f185114b);
            sb2.append(", filterId=");
            sb2.append(this.f185115c);
            sb2.append(", isSubscribed=");
            return r.x(sb2, this.f185116d, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$NotifyFeaturesRefresh;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyFeaturesRefresh implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185117b;

        public NotifyFeaturesRefresh(boolean z12) {
            this.f185117b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotifyFeaturesRefresh) && this.f185117b == ((NotifyFeaturesRefresh) obj).f185117b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185117b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NotifyFeaturesRefresh(shouldCollapseBottomSheet="), this.f185117b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$PanelOffsetChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PanelOffsetChanged implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f185118b;

        public PanelOffsetChanged(float f12) {
            this.f185118b = f12;
        }

        /* renamed from: c, reason: from getter */
        public final float getF185118b() {
            return this.f185118b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PanelOffsetChanged) && Float.compare(this.f185118b, ((PanelOffsetChanged) obj).f185118b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f185118b);
        }

        @k
        public final String toString() {
            return r.k(')', this.f185118b, new StringBuilder("PanelOffsetChanged(offset="));
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$PanelStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PanelStateChanged implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f185119b;

        public PanelStateChanged(@k String str) {
            this.f185119b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PanelStateChanged) && L.f(this.f185119b, ((PanelStateChanged) obj).f185119b);
        }

        public final int hashCode() {
            return this.f185119b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PanelStateChanged(newState="), this.f185119b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$PinAdvertsLoaded;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PinAdvertsLoaded implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SerpElement> f185120b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SerpDisplayType f185121c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final a.C5436a.C5437a f185122d;

        /* renamed from: e, reason: collision with root package name */
        public final int f185123e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f185124f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final PinFloatingContainer f185125g;

        /* JADX WARN: Multi-variable type inference failed */
        public PinAdvertsLoaded(@k List<? extends SerpElement> list, @l SerpDisplayType serpDisplayType, @k a.C5436a.C5437a c5437a, int i12, boolean z12, @l PinFloatingContainer pinFloatingContainer) {
            this.f185120b = list;
            this.f185121c = serpDisplayType;
            this.f185122d = c5437a;
            this.f185123e = i12;
            this.f185124f = z12;
            this.f185125g = pinFloatingContainer;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final SerpDisplayType getF185121c() {
            return this.f185121c;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final PinFloatingContainer getF185125g() {
            return this.f185125g;
        }

        @k
        public final List<SerpElement> e() {
            return this.f185120b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinAdvertsLoaded)) {
                return false;
            }
            PinAdvertsLoaded pinAdvertsLoaded = (PinAdvertsLoaded) obj;
            return L.f(this.f185120b, pinAdvertsLoaded.f185120b) && this.f185121c == pinAdvertsLoaded.f185121c && L.f(this.f185122d, pinAdvertsLoaded.f185122d) && this.f185123e == pinAdvertsLoaded.f185123e && this.f185124f == pinAdvertsLoaded.f185124f && L.f(this.f185125g, pinAdvertsLoaded.f185125g);
        }

        /* renamed from: h, reason: from getter */
        public final boolean getF185124f() {
            return this.f185124f;
        }

        public final int hashCode() {
            int iHashCode = this.f185120b.hashCode() * 31;
            SerpDisplayType serpDisplayType = this.f185121c;
            int i12 = r.i(r.e(this.f185123e, (this.f185122d.hashCode() + ((iHashCode + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31)) * 31, 31), 31, this.f185124f);
            PinFloatingContainer pinFloatingContainer = this.f185125g;
            return i12 + (pinFloatingContainer != null ? pinFloatingContainer.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "PinAdvertsLoaded(items=" + this.f185120b + ", displayType=" + this.f185121c + ", pin=" + this.f185122d + ", count=" + this.f185123e + ", isFirstPage=" + this.f185124f + ", floatingContainer=" + this.f185125g + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ReloadInlines;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReloadInlines implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LatLngBounds f185128b;

        public ReloadInlines(@k LatLngBounds latLngBounds) {
            this.f185128b = latLngBounds;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReloadInlines) && L.f(this.f185128b, ((ReloadInlines) obj).f185128b);
        }

        public final int hashCode() {
            return this.f185128b.hashCode();
        }

        @k
        public final String toString() {
            return "ReloadInlines(mapBounds=" + this.f185128b + ')';
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ResetDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetDrawing implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetDrawing f185129b = new ResetDrawing();

        private ResetDrawing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetDrawing);
        }

        public final int hashCode() {
            return 333801742;
        }

        @k
        public final String toString() {
            return "ResetDrawing";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ScrollPinsToTop;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollPinsToTop implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrollPinsToTop f185130b = new ScrollPinsToTop();

        private ScrollPinsToTop() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScrollPinsToTop);
        }

        public final int hashCode() {
            return -1876999152;
        }

        @k
        public final String toString() {
            return "ScrollPinsToTop";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$SearchSubscriptionStateChanged;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchSubscriptionStateChanged implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InlineAction.Predefined.State f185131b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f185132c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f185133d;

        public SearchSubscriptionStateChanged(@k InlineAction.Predefined.State state, @l String str, boolean z12) {
            this.f185131b = state;
            this.f185132c = str;
            this.f185133d = z12;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getF185132c() {
            return this.f185132c;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final InlineAction.Predefined.State getF185131b() {
            return this.f185131b;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getF185133d() {
            return this.f185133d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSubscriptionStateChanged)) {
                return false;
            }
            SearchSubscriptionStateChanged searchSubscriptionStateChanged = (SearchSubscriptionStateChanged) obj;
            return this.f185131b == searchSubscriptionStateChanged.f185131b && L.f(this.f185132c, searchSubscriptionStateChanged.f185132c) && this.f185133d == searchSubscriptionStateChanged.f185133d;
        }

        public final int hashCode() {
            int iHashCode = this.f185131b.hashCode() * 31;
            String str = this.f185132c;
            return Boolean.hashCode(this.f185133d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchSubscriptionStateChanged(state=");
            sb2.append(this.f185131b);
            sb2.append(", filterId=");
            sb2.append(this.f185132c);
            sb2.append(", isSubscribed=");
            return r.x(sb2, this.f185133d, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ShortcutsLayoutChange;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShortcutsLayoutChange implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f185134b;

        /* renamed from: c, reason: collision with root package name */
        public final int f185135c;

        public ShortcutsLayoutChange(int i12, int i13) {
            this.f185134b = i12;
            this.f185135c = i13;
        }

        /* renamed from: c, reason: from getter */
        public final int getF185135c() {
            return this.f185135c;
        }

        /* renamed from: d, reason: from getter */
        public final int getF185134b() {
            return this.f185134b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortcutsLayoutChange)) {
                return false;
            }
            ShortcutsLayoutChange shortcutsLayoutChange = (ShortcutsLayoutChange) obj;
            return this.f185134b == shortcutsLayoutChange.f185134b && this.f185135c == shortcutsLayoutChange.f185135c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185135c) + (Integer.hashCode(this.f185134b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShortcutsLayoutChange(top=");
            sb2.append(this.f185134b);
            sb2.append(", bottom=");
            return r.t(sb2, this.f185135c, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ShowListClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowListClicked implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f185136b;

        public ShowListClicked() {
            this(0, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowListClicked) && this.f185136b == ((ShowListClicked) obj).f185136b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185136b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShowListClicked(state="), this.f185136b, ')');
        }

        public ShowListClicked(int i12, int i13, C42822w c42822w) {
            this.f185136b = (i13 & 1) != 0 ? 4 : i12;
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$StartDrawing;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartDrawing implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartDrawing f185137b = new StartDrawing();

        private StartDrawing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartDrawing);
        }

        public final int hashCode() {
            return 793589403;
        }

        @k
        public final String toString() {
            return "StartDrawing";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$SubscribeButtonClicked;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscribeButtonClicked implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubscribeButtonClicked f185138b = new SubscribeButtonClicked();

        private SubscribeButtonClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubscribeButtonClicked);
        }

        public final int hashCode() {
            return -137241110;
        }

        @k
        public final String toString() {
            return "SubscribeButtonClicked";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateButtonsVisibility;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateButtonsVisibility implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185139b;

        public UpdateButtonsVisibility(boolean z12) {
            this.f185139b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF185139b() {
            return this.f185139b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateButtonsVisibility) && this.f185139b == ((UpdateButtonsVisibility) obj).f185139b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185139b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateButtonsVisibility(isVisible="), this.f185139b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateLocationPermissionState;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateLocationPermissionState implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185140b;

        public UpdateLocationPermissionState(boolean z12) {
            this.f185140b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF185140b() {
            return this.f185140b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateLocationPermissionState) && this.f185140b == ((UpdateLocationPermissionState) obj).f185140b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185140b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateLocationPermissionState(isEnabled="), this.f185140b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateNewSerpMapInteraction;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateNewSerpMapInteraction implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f185141b;

        public UpdateNewSerpMapInteraction(@l String str) {
            this.f185141b = str;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getF185141b() {
            return this.f185141b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNewSerpMapInteraction) && L.f(this.f185141b, ((UpdateNewSerpMapInteraction) obj).f185141b);
        }

        public final int hashCode() {
            String str = this.f185141b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNewSerpMapInteraction(newSerpMapInteraction="), this.f185141b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateScrollToTopButtonVisibility;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateScrollToTopButtonVisibility implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185142b;

        public UpdateScrollToTopButtonVisibility(boolean z12) {
            this.f185142b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF185142b() {
            return this.f185142b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateScrollToTopButtonVisibility) && this.f185142b == ((UpdateScrollToTopButtonVisibility) obj).f185142b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185142b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateScrollToTopButtonVisibility(isVisible="), this.f185142b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$UpdateUserMovedMapSinceLastLocationUpdate;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateUserMovedMapSinceLastLocationUpdate implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateUserMovedMapSinceLastLocationUpdate f185143b = new UpdateUserMovedMapSinceLastLocationUpdate();

        private UpdateUserMovedMapSinceLastLocationUpdate() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateUserMovedMapSinceLastLocationUpdate);
        }

        public final int hashCode() {
            return -1856677294;
        }

        @k
        public final String toString() {
            return "UpdateUserMovedMapSinceLastLocationUpdate";
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ZoomIn;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ZoomIn implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f185144b;

        public ZoomIn(@l Float f12) {
            this.f185144b = f12;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Float getF185144b() {
            return this.f185144b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZoomIn) && L.f(this.f185144b, ((ZoomIn) obj).f185144b);
        }

        public final int hashCode() {
            Float f12 = this.f185144b;
            if (f12 == null) {
                return 0;
            }
            return f12.hashCode();
        }

        @k
        public final String toString() {
            return h.d(new StringBuilder("ZoomIn(zoom="), this.f185144b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$ZoomOut;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ZoomOut implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f185145b;

        public ZoomOut(@l Float f12) {
            this.f185145b = f12;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Float getF185145b() {
            return this.f185145b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZoomOut) && L.f(this.f185145b, ((ZoomOut) obj).f185145b);
        }

        public final int hashCode() {
            Float f12 = this.f185145b;
            if (f12 == null) {
                return 0;
            }
            return f12.hashCode();
        }

        @k
        public final String toString() {
            return h.d(new StringBuilder("ZoomOut(zoom="), this.f185145b, ')');
        }
    }

    /* compiled from: MapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction$PinAdvertsLoading;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PinAdvertsLoading implements MapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.C5436a.C5437a f185126b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185127c;

        public PinAdvertsLoading(@k a.C5436a.C5437a c5437a, boolean z12) {
            this.f185126b = c5437a;
            this.f185127c = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF185127c() {
            return this.f185127c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinAdvertsLoading)) {
                return false;
            }
            PinAdvertsLoading pinAdvertsLoading = (PinAdvertsLoading) obj;
            return L.f(this.f185126b, pinAdvertsLoading.f185126b) && this.f185127c == pinAdvertsLoading.f185127c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185127c) + (this.f185126b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PinAdvertsLoading(pin=");
            sb2.append(this.f185126b);
            sb2.append(", isFirstPage=");
            return r.x(sb2, this.f185127c, ')');
        }

        public /* synthetic */ PinAdvertsLoading(a.C5436a.C5437a c5437a, boolean z12, int i12, C42822w c42822w) {
            this(c5437a, (i12 & 2) != 0 ? true : z12);
        }
    }
}
