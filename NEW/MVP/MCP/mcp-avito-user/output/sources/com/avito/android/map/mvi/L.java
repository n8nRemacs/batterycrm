package com.avito.android.map.mvi;

import bY.InterfaceC25596c;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MapOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/map/mvi/L;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "LbY/c;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class L implements com.avito.android.arch.mvi.t<MapInternalAction, InterfaceC25596c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L f184968b = new L();

    /* compiled from: MapOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MapErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MapErrorType mapErrorType = MapErrorType.f185053b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MapErrorType mapErrorType2 = MapErrorType.f185053b;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MapErrorType mapErrorType3 = MapErrorType.f185053b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MapErrorType mapErrorType4 = MapErrorType.f185053b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MapErrorType mapErrorType5 = MapErrorType.f185053b;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25596c b(MapInternalAction mapInternalAction) {
        MapInternalAction mapInternalAction2 = mapInternalAction;
        if (mapInternalAction2 instanceof MapInternalAction.Error) {
            MapInternalAction.Error error = (MapInternalAction.Error) mapInternalAction2;
            MapErrorType mapErrorType = error.f185067c;
            int iOrdinal = mapErrorType.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                return new InterfaceC25596c.k(error.f185066b, mapErrorType);
            }
            if (iOrdinal == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (mapInternalAction2 instanceof MapInternalAction.GeoEnabledAndPermissionGranted) {
            MapInternalAction.GeoEnabledAndPermissionGranted geoEnabledAndPermissionGranted = (MapInternalAction.GeoEnabledAndPermissionGranted) mapInternalAction2;
            return new InterfaceC25596c.b(geoEnabledAndPermissionGranted.f185078b, geoEnabledAndPermissionGranted.f185079c);
        }
        if (mapInternalAction2 instanceof MapInternalAction.FloatingViewsStateUpdate) {
            MapInternalAction.FloatingViewsStateUpdate floatingViewsStateUpdate = (MapInternalAction.FloatingViewsStateUpdate) mapInternalAction2;
            return new InterfaceC25596c.a(floatingViewsStateUpdate.f185075b, floatingViewsStateUpdate.f185076c);
        }
        if (mapInternalAction2 instanceof MapInternalAction.GoToSettings) {
            return InterfaceC25596c.C2005c.f57167a;
        }
        if (mapInternalAction2 instanceof MapInternalAction.SubscribeButtonClicked) {
            return InterfaceC25596c.m.f57178a;
        }
        if (mapInternalAction2 instanceof MapInternalAction.NotifyFeaturesAboutSubscriptionsState) {
            MapInternalAction.NotifyFeaturesAboutSubscriptionsState notifyFeaturesAboutSubscriptionsState = (MapInternalAction.NotifyFeaturesAboutSubscriptionsState) mapInternalAction2;
            return new InterfaceC25596c.d(notifyFeaturesAboutSubscriptionsState.f185114b, notifyFeaturesAboutSubscriptionsState.f185115c, notifyFeaturesAboutSubscriptionsState.f185116d);
        }
        if (mapInternalAction2 instanceof MapInternalAction.ShowListClicked) {
            return new InterfaceC25596c.l(((MapInternalAction.ShowListClicked) mapInternalAction2).f185136b);
        }
        if (mapInternalAction2 instanceof MapInternalAction.MapMoved) {
            return new InterfaceC25596c.p(((MapInternalAction.MapMoved) mapInternalAction2).f185090b);
        }
        if (mapInternalAction2 instanceof MapInternalAction.ReloadInlines) {
            return new InterfaceC25596c.i(((MapInternalAction.ReloadInlines) mapInternalAction2).f185128b);
        }
        if (mapInternalAction2 instanceof MapInternalAction.MarkerClicked) {
            return InterfaceC25596c.o.f57180a;
        }
        if (mapInternalAction2 instanceof MapInternalAction.MapClicked) {
            return InterfaceC25596c.n.f57179a;
        }
        if (mapInternalAction2 instanceof MapInternalAction.NotifyFeaturesRefresh) {
            return new InterfaceC25596c.e(((MapInternalAction.NotifyFeaturesRefresh) mapInternalAction2).f185117b);
        }
        if (mapInternalAction2 instanceof MapInternalAction.ScrollPinsToTop) {
            return InterfaceC25596c.j.f57174a;
        }
        if (mapInternalAction2 instanceof MapInternalAction.PanelOffsetChanged) {
            return new InterfaceC25596c.f(((MapInternalAction.PanelOffsetChanged) mapInternalAction2).f185118b);
        }
        if (mapInternalAction2 instanceof MapInternalAction.UpdateUserMovedMapSinceLastLocationUpdate ? true : mapInternalAction2 instanceof MapInternalAction.UpdateScrollToTopButtonVisibility ? true : mapInternalAction2 instanceof MapInternalAction.AnalyticsParentTypeUpdated ? true : mapInternalAction2 instanceof MapInternalAction.AreaSaved ? true : mapInternalAction2 instanceof MapInternalAction.FavorableAdvertChanged ? true : mapInternalAction2 instanceof MapInternalAction.FiltersUpdated ? true : mapInternalAction2.equals(MapInternalAction.GeoDisabledInSettings.f185077b) ? true : mapInternalAction2.equals(MapInternalAction.GeoNeedPermissionDialog.f185080b) ? true : mapInternalAction2.equals(MapInternalAction.IsPermissionGranted.f185082b) ? true : mapInternalAction2.equals(MapInternalAction.IsRequestRationale.f185083b) ? true : mapInternalAction2 instanceof MapInternalAction.LocationLoaded ? true : mapInternalAction2 instanceof MapInternalAction.MapOnboardingLoaded ? true : mapInternalAction2.equals(MapInternalAction.MapOnboardingLoading.f185092b) ? true : mapInternalAction2 instanceof MapInternalAction.MarkersLoaded ? true : mapInternalAction2 instanceof MapInternalAction.MarkersLoading ? true : mapInternalAction2 instanceof MapInternalAction.PinAdvertsLoaded ? true : mapInternalAction2 instanceof MapInternalAction.PinAdvertsLoading ? true : mapInternalAction2 instanceof MapInternalAction.SearchSubscriptionStateChanged ? true : mapInternalAction2 instanceof MapInternalAction.MapMoveStarted ? true : mapInternalAction2 instanceof MapInternalAction.ShortcutsLayoutChange ? true : mapInternalAction2 instanceof MapInternalAction.UpdateButtonsVisibility ? true : mapInternalAction2 instanceof MapInternalAction.Draw ? true : mapInternalAction2.equals(MapInternalAction.StartDrawing.f185137b) ? true : mapInternalAction2.equals(MapInternalAction.CancelDrawing.f185064b) ? true : mapInternalAction2.equals(MapInternalAction.ResetDrawing.f185129b) ? true : mapInternalAction2.equals(MapInternalAction.FinishDrawing.f185074b) ? true : mapInternalAction2 instanceof MapInternalAction.UpdateNewSerpMapInteraction ? true : mapInternalAction2 instanceof MapInternalAction.BottomSheetStateChanged ? true : mapInternalAction2 instanceof MapInternalAction.PanelStateChanged ? true : mapInternalAction2 instanceof MapInternalAction.UpdateLocationPermissionState ? true : mapInternalAction2 instanceof MapInternalAction.ZoomIn ? true : mapInternalAction2 instanceof MapInternalAction.ZoomOut) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
