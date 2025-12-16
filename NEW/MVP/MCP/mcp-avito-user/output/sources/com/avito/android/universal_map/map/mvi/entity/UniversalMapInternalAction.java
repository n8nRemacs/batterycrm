package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.mvi.entity.d;
import com.avito.android.universal_map.remote.model.MapMode;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qG0.C47290a;
import qG0.C47293d;

/* compiled from: UniversalMapInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BeduinFormContentChanged", "FiltersInternalAction", "MapViewInternalAction", "NonTrackableErrorWithApi", "PointInfoInternalAction", "PointsInternalAction", "RequestLocation", "ScreenShownFirstTime", "SubscribeNotPermissionGranted", "TriggerInvokeCustomActions", "TriggerShowUserLocation", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$BeduinFormContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$NonTrackableErrorWithApi;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$RequestLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$ScreenShownFirstTime;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$SubscribeNotPermissionGranted;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$TriggerInvokeCustomActions;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$TriggerShowUserLocation;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UniversalMapInternalAction extends n {

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$BeduinFormContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinFormContentChanged implements UniversalMapInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f305475b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305476c;

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinFormContentChanged(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f305475b = str;
            this.f305476c = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @k
        /* renamed from: e */
        public final String getF314460f() {
            return "beduin-form";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeduinFormContentChanged)) {
                return false;
            }
            BeduinFormContentChanged beduinFormContentChanged = (BeduinFormContentChanged) obj;
            return L.f(this.f305475b, beduinFormContentChanged.f305475b) && L.f(this.f305476c, beduinFormContentChanged.f305476c);
        }

        public final int hashCode() {
            return this.f305476c.hashCode() + (this.f305475b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinFormContentChanged(topFormId=");
            sb2.append(this.f305475b);
            sb2.append(", topComponents=");
            return H.p(sb2, this.f305476c, ')');
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "FiltersApplied", "FiltersContentChanged", "FiltersError", "FiltersLoaded", "FiltersLoading", "FiltersTooltipDataChanged", "HideFiltersBottomSheet", "ShowFiltersTooltip", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersApplied;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersTooltipDataChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$HideFiltersBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$ShowFiltersTooltip;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FiltersInternalAction extends UniversalMapInternalAction {

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersApplied;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersApplied implements FiltersInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Map<String, Object> f305477b;

            public FiltersApplied(@l Map<String, ? extends Object> map) {
                this.f305477b = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersApplied) && L.f(this.f305477b, ((FiltersApplied) obj).f305477b);
            }

            public final int hashCode() {
                Map<String, Object> map = this.f305477b;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("FiltersApplied(filterParams="), this.f305477b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersContentChanged implements FiltersInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305478b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305479c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f305480d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305481e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305482f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305483g;

            /* JADX WARN: Multi-variable type inference failed */
            public FiltersContentChanged(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                this.f305478b = str;
                this.f305479c = str2;
                this.f305480d = str3;
                this.f305481e = list;
                this.f305482f = list2;
                this.f305483g = list3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FiltersContentChanged)) {
                    return false;
                }
                FiltersContentChanged filtersContentChanged = (FiltersContentChanged) obj;
                return L.f(this.f305478b, filtersContentChanged.f305478b) && L.f(this.f305479c, filtersContentChanged.f305479c) && L.f(this.f305480d, filtersContentChanged.f305480d) && L.f(this.f305481e, filtersContentChanged.f305481e) && L.f(this.f305482f, filtersContentChanged.f305482f) && L.f(this.f305483g, filtersContentChanged.f305483g);
            }

            public final int hashCode() {
                String str = this.f305478b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305479c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305480d;
                return this.f305483g.hashCode() + H.e(H.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f305481e), 31, this.f305482f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FiltersContentChanged(topFormId=");
                sb2.append(this.f305478b);
                sb2.append(", mainFormId=");
                sb2.append(this.f305479c);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305480d);
                sb2.append(", topComponents=");
                sb2.append(this.f305481e);
                sb2.append(", mainComponents=");
                sb2.append(this.f305482f);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f305483g, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersError implements FiltersInternalAction, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f305484b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f305485c;

            public FiltersError(@k ApiError apiError) {
                this.f305484b = apiError;
                this.f305485c = new J.a(apiError);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d */
            public final String getF203255e() {
                return "filters-info";
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return "filters-info";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersError) && L.f(this.f305484b, ((FiltersError) obj).f305484b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF286419c() {
                return this.f305485c;
            }

            public final int hashCode() {
                return this.f305484b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("FiltersError(error="), this.f305484b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersLoaded implements FiltersInternalAction, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305486b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305487c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f305488d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305489e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305490f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305491g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final List<BeduinAction> f305492h;

            /* JADX WARN: Multi-variable type inference failed */
            public FiltersLoaded(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @l List<? extends BeduinAction> list4) {
                this.f305486b = str;
                this.f305487c = str2;
                this.f305488d = str3;
                this.f305489e = list;
                this.f305490f = list2;
                this.f305491g = list3;
                this.f305492h = list4;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d */
            public final String getF203255e() {
                return "filters-info";
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return "filters-info";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FiltersLoaded)) {
                    return false;
                }
                FiltersLoaded filtersLoaded = (FiltersLoaded) obj;
                return L.f(this.f305486b, filtersLoaded.f305486b) && L.f(this.f305487c, filtersLoaded.f305487c) && L.f(this.f305488d, filtersLoaded.f305488d) && L.f(this.f305489e, filtersLoaded.f305489e) && L.f(this.f305490f, filtersLoaded.f305490f) && L.f(this.f305491g, filtersLoaded.f305491g) && L.f(this.f305492h, filtersLoaded.f305492h);
            }

            public final int hashCode() {
                String str = this.f305486b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305487c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305488d;
                int iE2 = H.e(H.e(H.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f305489e), 31, this.f305490f), 31, this.f305491g);
                List<BeduinAction> list = this.f305492h;
                return iE2 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FiltersLoaded(topFormId=");
                sb2.append(this.f305486b);
                sb2.append(", mainFormId=");
                sb2.append(this.f305487c);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305488d);
                sb2.append(", topComponents=");
                sb2.append(this.f305489e);
                sb2.append(", mainComponents=");
                sb2.append(this.f305490f);
                sb2.append(", bottomComponents=");
                sb2.append(this.f305491g);
                sb2.append(", onNativeCloseActions=");
                return H.p(sb2, this.f305492h, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersLoading extends TrackableLoadingStarted implements FiltersInternalAction {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f305493d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f305494e;

            public FiltersLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF203255e() {
                return this.f305494e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersLoading) && L.f(this.f305493d, ((FiltersLoading) obj).f305493d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f305493d.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.v(new StringBuilder("FiltersLoading(stub="), this.f305493d, ')');
            }

            public FiltersLoading(G0 g02, int i12, C42822w c42822w) {
                this.f305493d = (i12 & 1) != 0 ? G0.f406611a : g02;
                this.f305494e = "filters-info";
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$FiltersTooltipDataChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FiltersTooltipDataChanged implements FiltersInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final C47293d f305495b;

            public FiltersTooltipDataChanged(@l C47293d c47293d) {
                this.f305495b = c47293d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersTooltipDataChanged) && L.f(this.f305495b, ((FiltersTooltipDataChanged) obj).f305495b);
            }

            public final int hashCode() {
                C47293d c47293d = this.f305495b;
                if (c47293d == null) {
                    return 0;
                }
                return c47293d.hashCode();
            }

            @k
            public final String toString() {
                return "FiltersTooltipDataChanged(tooltipData=" + this.f305495b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$HideFiltersBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HideFiltersBottomSheet implements FiltersInternalAction {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f305496b;

            public HideFiltersBottomSheet(boolean z12) {
                this.f305496b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HideFiltersBottomSheet) && this.f305496b == ((HideFiltersBottomSheet) obj).f305496b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f305496b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("HideFiltersBottomSheet(isNativeClose="), this.f305496b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction$ShowFiltersTooltip;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$FiltersInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowFiltersTooltip implements FiltersInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C47293d f305497b;

            public ShowFiltersTooltip(@k C47293d c47293d) {
                this.f305497b = c47293d;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowFiltersTooltip) && L.f(this.f305497b, ((ShowFiltersTooltip) obj).f305497b);
            }

            public final int hashCode() {
                return this.f305497b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowFiltersTooltip(tooltipData=" + this.f305497b + ')';
            }
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "CameraCoordinatesChanged", "ClearMarkerSelection", "CurrentPinIconChanged", "DefaultLocationChanged", "FocusOnRegionChanged", "MapCleared", "MarkPinSelected", "MoveCameraToBounds", "MoveCameraToState", "PointsStateChanged", "ShowUserLocationMarker", "SpecificLocationRequestParamsChanged", "UserLocationChanged", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$CameraCoordinatesChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$ClearMarkerSelection;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$CurrentPinIconChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$DefaultLocationChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MapCleared;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MarkPinSelected;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MoveCameraToBounds;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MoveCameraToState;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$PointsStateChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$ShowUserLocationMarker;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$UserLocationChanged;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapViewInternalAction extends UniversalMapInternalAction {

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$CameraCoordinatesChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CameraCoordinatesChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C47290a f305498b;

            public CameraCoordinatesChanged(@k C47290a c47290a) {
                this.f305498b = c47290a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CameraCoordinatesChanged) && L.f(this.f305498b, ((CameraCoordinatesChanged) obj).f305498b);
            }

            public final int hashCode() {
                return this.f305498b.hashCode();
            }

            @k
            public final String toString() {
                return "CameraCoordinatesChanged(cameraCoordinatesEvent=" + this.f305498b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$ClearMarkerSelection;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ClearMarkerSelection implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ClearMarkerSelection f305499b = new ClearMarkerSelection();

            private ClearMarkerSelection() {
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$CurrentPinIconChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CurrentPinIconChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Marker.Pin.IconType f305500b;

            public CurrentPinIconChanged(@k Marker.Pin.IconType iconType) {
                this.f305500b = iconType;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CurrentPinIconChanged) && this.f305500b == ((CurrentPinIconChanged) obj).f305500b;
            }

            public final int hashCode() {
                return this.f305500b.hashCode();
            }

            @k
            public final String toString() {
                return "CurrentPinIconChanged(iconType=" + this.f305500b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$DefaultLocationChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DefaultLocationChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Coordinates f305501b;

            public DefaultLocationChanged(@k Coordinates coordinates) {
                this.f305501b = coordinates;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DefaultLocationChanged) && L.f(this.f305501b, ((DefaultLocationChanged) obj).f305501b);
            }

            public final int hashCode() {
                return this.f305501b.hashCode();
            }

            @k
            public final String toString() {
                return "DefaultLocationChanged(coordinates=" + this.f305501b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FocusOnRegionChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final AvitoMapBounds f305502b;

            /* JADX WARN: Multi-variable type inference failed */
            public FocusOnRegionChanged() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FocusOnRegionChanged) && L.f(this.f305502b, ((FocusOnRegionChanged) obj).f305502b);
            }

            public final int hashCode() {
                AvitoMapBounds avitoMapBounds = this.f305502b;
                if (avitoMapBounds == null) {
                    return 0;
                }
                return avitoMapBounds.hashCode();
            }

            @k
            public final String toString() {
                return "FocusOnRegionChanged(focusOnRegionBounds=" + this.f305502b + ')';
            }

            public FocusOnRegionChanged(@l AvitoMapBounds avitoMapBounds) {
                this.f305502b = avitoMapBounds;
            }

            public /* synthetic */ FocusOnRegionChanged(AvitoMapBounds avitoMapBounds, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : avitoMapBounds);
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MapCleared;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MapCleared implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final MapCleared f305503b = new MapCleared();

            private MapCleared() {
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MarkPinSelected;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MarkPinSelected implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Marker.Pin f305504b;

            public MarkPinSelected(@k Marker.Pin pin) {
                this.f305504b = pin;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MarkPinSelected) && L.f(this.f305504b, ((MarkPinSelected) obj).f305504b);
            }

            public final int hashCode() {
                return this.f305504b.hashCode();
            }

            @k
            public final String toString() {
                return "MarkPinSelected(pin=" + this.f305504b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MoveCameraToBounds;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MoveCameraToBounds implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapBounds f305505b;

            public MoveCameraToBounds(@k AvitoMapBounds avitoMapBounds) {
                this.f305505b = avitoMapBounds;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof MoveCameraToBounds) {
                    return L.f(this.f305505b, ((MoveCameraToBounds) obj).f305505b);
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.f305505b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "MoveCameraToBounds(bounds=" + this.f305505b + ", animate=false)";
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$MoveCameraToState;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MoveCameraToState implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapPoint f305506b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f305507c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Float f305508d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f305509e;

            public MoveCameraToState(@k AvitoMapPoint avitoMapPoint, boolean z12, @l Float f12, boolean z13) {
                this.f305506b = avitoMapPoint;
                this.f305507c = z12;
                this.f305508d = f12;
                this.f305509e = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MoveCameraToState)) {
                    return false;
                }
                MoveCameraToState moveCameraToState = (MoveCameraToState) obj;
                return L.f(this.f305506b, moveCameraToState.f305506b) && this.f305507c == moveCameraToState.f305507c && L.f(this.f305508d, moveCameraToState.f305508d) && this.f305509e == moveCameraToState.f305509e;
            }

            public final int hashCode() {
                int i12 = r.i(this.f305506b.hashCode() * 31, 31, this.f305507c);
                Float f12 = this.f305508d;
                return Boolean.hashCode(this.f305509e) + ((i12 + (f12 == null ? 0 : f12.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MoveCameraToState(point=");
                sb2.append(this.f305506b);
                sb2.append(", animate=");
                sb2.append(this.f305507c);
                sb2.append(", zoomLevel=");
                sb2.append(this.f305508d);
                sb2.append(", applyLatitudeDiff=");
                return r.x(sb2, this.f305509e, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$PointsStateChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PointsStateChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final d.a.C9383a f305510b;

            public PointsStateChanged(@k d.a.C9383a c9383a) {
                this.f305510b = c9383a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PointsStateChanged) && L.f(this.f305510b, ((PointsStateChanged) obj).f305510b);
            }

            public final int hashCode() {
                return this.f305510b.hashCode();
            }

            @k
            public final String toString() {
                return "PointsStateChanged(state=" + this.f305510b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$ShowUserLocationMarker;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowUserLocationMarker implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AvitoMapPoint f305511b;

            public ShowUserLocationMarker(@k AvitoMapPoint avitoMapPoint) {
                this.f305511b = avitoMapPoint;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowUserLocationMarker) && L.f(this.f305511b, ((ShowUserLocationMarker) obj).f305511b);
            }

            public final int hashCode() {
                return this.f305511b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowUserLocationMarker(point=" + this.f305511b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SpecificLocationRequestParamsChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final BeduinShowSpecificLocationAction f305512b;

            /* JADX WARN: Multi-variable type inference failed */
            public SpecificLocationRequestParamsChanged() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpecificLocationRequestParamsChanged) && L.f(this.f305512b, ((SpecificLocationRequestParamsChanged) obj).f305512b);
            }

            public final int hashCode() {
                BeduinShowSpecificLocationAction beduinShowSpecificLocationAction = this.f305512b;
                if (beduinShowSpecificLocationAction == null) {
                    return 0;
                }
                return beduinShowSpecificLocationAction.hashCode();
            }

            @k
            public final String toString() {
                return "SpecificLocationRequestParamsChanged(params=" + this.f305512b + ')';
            }

            public SpecificLocationRequestParamsChanged(@l BeduinShowSpecificLocationAction beduinShowSpecificLocationAction) {
                this.f305512b = beduinShowSpecificLocationAction;
            }

            public /* synthetic */ SpecificLocationRequestParamsChanged(BeduinShowSpecificLocationAction beduinShowSpecificLocationAction, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : beduinShowSpecificLocationAction);
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction$UserLocationChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$MapViewInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UserLocationChanged implements MapViewInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final rG0.c f305513b;

            public UserLocationChanged(@l rG0.c cVar) {
                this.f305513b = cVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserLocationChanged) && L.f(this.f305513b, ((UserLocationChanged) obj).f305513b);
            }

            public final int hashCode() {
                rG0.c cVar = this.f305513b;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            @k
            public final String toString() {
                return "UserLocationChanged(userLocation=" + this.f305513b + ')';
            }
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$NonTrackableErrorWithApi;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NonTrackableErrorWithApi implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f305514b;

        public NonTrackableErrorWithApi(@k ApiError apiError) {
            this.f305514b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NonTrackableErrorWithApi) && L.f(this.f305514b, ((NonTrackableErrorWithApi) obj).f305514b);
        }

        public final int hashCode() {
            return this.f305514b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("NonTrackableErrorWithApi(error="), this.f305514b, ')');
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "CollapsePointInfoBottomSheet", "HidePointInfoBottomSheet", "InfoParametersChanged", "OverlayChanged", "PointInfoContentChanged", "PointInfoError", "PointInfoLoaded", "PointInfoLoading", "SelectedPinChanged", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$CollapsePointInfoBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$HidePointInfoBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$InfoParametersChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$OverlayChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$SelectedPinChanged;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PointInfoInternalAction extends UniversalMapInternalAction {

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$CollapsePointInfoBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CollapsePointInfoBottomSheet implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final CollapsePointInfoBottomSheet f305515b = new CollapsePointInfoBottomSheet();

            private CollapsePointInfoBottomSheet() {
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$HidePointInfoBottomSheet;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HidePointInfoBottomSheet implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final HidePointInfoBottomSheet f305516b = new HidePointInfoBottomSheet();

            private HidePointInfoBottomSheet() {
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$InfoParametersChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InfoParametersChanged implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Map<String, Object> f305517b;

            public InfoParametersChanged(@l Map<String, ? extends Object> map) {
                this.f305517b = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InfoParametersChanged) && L.f(this.f305517b, ((InfoParametersChanged) obj).f305517b);
            }

            public final int hashCode() {
                Map<String, Object> map = this.f305517b;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("InfoParametersChanged(infoParameters="), this.f305517b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$OverlayChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OverlayChanged implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Overlay f305518b;

            public OverlayChanged(@l Overlay overlay) {
                this.f305518b = overlay;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OverlayChanged) && L.f(this.f305518b, ((OverlayChanged) obj).f305518b);
            }

            public final int hashCode() {
                Overlay overlay = this.f305518b;
                if (overlay == null) {
                    return 0;
                }
                return overlay.hashCode();
            }

            @k
            public final String toString() {
                return "OverlayChanged(overlay=" + this.f305518b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoContentChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PointInfoContentChanged implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305519b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305520c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f305521d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305522e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305523f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305524g;

            /* JADX WARN: Multi-variable type inference failed */
            public PointInfoContentChanged(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                this.f305519b = str;
                this.f305520c = str2;
                this.f305521d = str3;
                this.f305522e = list;
                this.f305523f = list2;
                this.f305524g = list3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PointInfoContentChanged)) {
                    return false;
                }
                PointInfoContentChanged pointInfoContentChanged = (PointInfoContentChanged) obj;
                return L.f(this.f305519b, pointInfoContentChanged.f305519b) && L.f(this.f305520c, pointInfoContentChanged.f305520c) && L.f(this.f305521d, pointInfoContentChanged.f305521d) && L.f(this.f305522e, pointInfoContentChanged.f305522e) && L.f(this.f305523f, pointInfoContentChanged.f305523f) && L.f(this.f305524g, pointInfoContentChanged.f305524g);
            }

            public final int hashCode() {
                String str = this.f305519b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305520c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305521d;
                return this.f305524g.hashCode() + H.e(H.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f305522e), 31, this.f305523f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PointInfoContentChanged(topFormId=");
                sb2.append(this.f305519b);
                sb2.append(", mainFormId=");
                sb2.append(this.f305520c);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305521d);
                sb2.append(", topComponents=");
                sb2.append(this.f305522e);
                sb2.append(", mainComponents=");
                sb2.append(this.f305523f);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f305524g, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PointInfoError implements PointInfoInternalAction, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f305525b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f305526c;

            public PointInfoError(@k ApiError apiError) {
                this.f305525b = apiError;
                this.f305526c = new J.a(apiError);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d */
            public final String getF203255e() {
                return "point-info";
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return "point-info";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PointInfoError) && L.f(this.f305525b, ((PointInfoError) obj).f305525b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF286419c() {
                return this.f305526c;
            }

            public final int hashCode() {
                return this.f305525b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("PointInfoError(error="), this.f305525b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PointInfoLoaded implements PointInfoInternalAction, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305527b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305528c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f305529d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305530e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305531f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305532g;

            /* JADX WARN: Multi-variable type inference failed */
            public PointInfoLoaded(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                this.f305527b = str;
                this.f305528c = str2;
                this.f305529d = str3;
                this.f305530e = list;
                this.f305531f = list2;
                this.f305532g = list3;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d */
            public final String getF203255e() {
                return "point-info";
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return "point-info";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PointInfoLoaded)) {
                    return false;
                }
                PointInfoLoaded pointInfoLoaded = (PointInfoLoaded) obj;
                return L.f(this.f305527b, pointInfoLoaded.f305527b) && L.f(this.f305528c, pointInfoLoaded.f305528c) && L.f(this.f305529d, pointInfoLoaded.f305529d) && L.f(this.f305530e, pointInfoLoaded.f305530e) && L.f(this.f305531f, pointInfoLoaded.f305531f) && L.f(this.f305532g, pointInfoLoaded.f305532g);
            }

            public final int hashCode() {
                String str = this.f305527b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305528c;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305529d;
                return this.f305532g.hashCode() + H.e(H.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f305530e), 31, this.f305531f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PointInfoLoaded(topFormId=");
                sb2.append(this.f305527b);
                sb2.append(", mainFormId=");
                sb2.append(this.f305528c);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305529d);
                sb2.append(", topComponents=");
                sb2.append(this.f305530e);
                sb2.append(", mainComponents=");
                sb2.append(this.f305531f);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f305532g, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$PointInfoLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PointInfoLoading extends TrackableLoadingStarted implements PointInfoInternalAction {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f305533d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f305534e;

            public PointInfoLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF203255e() {
                return this.f305534e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PointInfoLoading) && L.f(this.f305533d, ((PointInfoLoading) obj).f305533d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f305533d.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.v(new StringBuilder("PointInfoLoading(stub="), this.f305533d, ')');
            }

            public PointInfoLoading(G0 g02, int i12, C42822w c42822w) {
                this.f305533d = (i12 & 1) != 0 ? G0.f406611a : g02;
                this.f305534e = "point-info";
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction$SelectedPinChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointInfoInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectedPinChanged implements PointInfoInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Marker.Pin f305535b;

            public SelectedPinChanged(@k Marker.Pin pin) {
                this.f305535b = pin;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectedPinChanged) && L.f(this.f305535b, ((SelectedPinChanged) obj).f305535b);
            }

            public final int hashCode() {
                return this.f305535b.hashCode();
            }

            @k
            public final String toString() {
                return "SelectedPinChanged(pin=" + this.f305535b + ')';
            }
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "MapModeChanged", "PinsChanged", "PinsError", "PinsLoaded", "PinsLoading", "ResetPins", "SetSavedLocation", "UsedLegacySavedLocation", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$MapModeChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$ResetPins;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$SetSavedLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$UsedLegacySavedLocation;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PointsInternalAction extends UniversalMapInternalAction {

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$MapModeChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MapModeChanged implements PointsInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final MapMode f305536b;

            public MapModeChanged(@l MapMode mapMode) {
                this.f305536b = mapMode;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MapModeChanged) && this.f305536b == ((MapModeChanged) obj).f305536b;
            }

            public final int hashCode() {
                MapMode mapMode = this.f305536b;
                if (mapMode == null) {
                    return 0;
                }
                return mapMode.hashCode();
            }

            @k
            public final String toString() {
                return "MapModeChanged(mapMode=" + this.f305536b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsChanged;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PinsChanged implements PointsInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UniversalMapPointsRectResult f305537b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final UniversalPreselectMapPoint f305538c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final List<BeduinAction> f305539d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f305540e;

            /* JADX WARN: Multi-variable type inference failed */
            public PinsChanged(@k UniversalMapPointsRectResult universalMapPointsRectResult, @l UniversalPreselectMapPoint universalPreselectMapPoint, @l List<? extends BeduinAction> list, boolean z12) {
                this.f305537b = universalMapPointsRectResult;
                this.f305538c = universalPreselectMapPoint;
                this.f305539d = list;
                this.f305540e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PinsChanged)) {
                    return false;
                }
                PinsChanged pinsChanged = (PinsChanged) obj;
                return L.f(this.f305537b, pinsChanged.f305537b) && L.f(this.f305538c, pinsChanged.f305538c) && L.f(this.f305539d, pinsChanged.f305539d) && this.f305540e == pinsChanged.f305540e;
            }

            public final int hashCode() {
                int iHashCode = this.f305537b.hashCode() * 31;
                UniversalPreselectMapPoint universalPreselectMapPoint = this.f305538c;
                int iHashCode2 = (iHashCode + (universalPreselectMapPoint == null ? 0 : universalPreselectMapPoint.hashCode())) * 31;
                List<BeduinAction> list = this.f305539d;
                return Boolean.hashCode(this.f305540e) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PinsChanged(pointsRectResult=");
                sb2.append(this.f305537b);
                sb2.append(", legacyPreselectedPin=");
                sb2.append(this.f305538c);
                sb2.append(", pinsLoadedActions=");
                sb2.append(this.f305539d);
                sb2.append(", resetSelectedPin=");
                return r.x(sb2, this.f305540e, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsError;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PinsError implements PointsInternalAction, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f305541b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final J.a f305542c;

            public PinsError(@k ApiError apiError) {
                this.f305541b = apiError;
                this.f305542c = new J.a(apiError);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d */
            public final String getF203255e() {
                return "map-points";
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return "map-points";
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PinsError) && L.f(this.f305541b, ((PinsError) obj).f305541b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @k
            /* renamed from: g, reason: from getter */
            public final J.a getF286419c() {
                return this.f305542c;
            }

            public final int hashCode() {
                return this.f305541b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("PinsError(error="), this.f305541b, ')');
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsLoaded;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PinsLoaded implements PointsInternalAction, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final G0 f305543b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f305544c;

            public PinsLoaded() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF203255e() {
                return this.f305544c;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @l
            /* renamed from: e */
            public final String getF314460f() {
                return this.f305544c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PinsLoaded) && L.f(this.f305543b, ((PinsLoaded) obj).f305543b);
            }

            public final int hashCode() {
                return this.f305543b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.v(new StringBuilder("PinsLoaded(stub="), this.f305543b, ')');
            }

            public PinsLoaded(G0 g02, int i12, C42822w c42822w) {
                this.f305543b = (i12 & 1) != 0 ? G0.f406611a : g02;
                this.f305544c = "map-points";
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$PinsLoading;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PinsLoading extends TrackableLoadingStarted implements PointsInternalAction {

            /* renamed from: d, reason: collision with root package name */
            @k
            public final G0 f305545d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f305546e;

            public PinsLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
            @k
            /* renamed from: d, reason: from getter */
            public final String getF203255e() {
                return this.f305546e;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PinsLoading) && L.f(this.f305545d, ((PinsLoading) obj).f305545d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f305545d.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.v(new StringBuilder("PinsLoading(stub="), this.f305545d, ')');
            }

            public PinsLoading(G0 g02, int i12, C42822w c42822w) {
                this.f305545d = (i12 & 1) != 0 ? G0.f406611a : g02;
                this.f305546e = "map-points";
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$ResetPins;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ResetPins implements PointsInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ResetPins f305547b = new ResetPins();

            private ResetPins() {
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$SetSavedLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetSavedLocation implements PointsInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final UniversalPreselectMapPoint f305548b;

            public SetSavedLocation(@l UniversalPreselectMapPoint universalPreselectMapPoint) {
                this.f305548b = universalPreselectMapPoint;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetSavedLocation) && L.f(this.f305548b, ((SetSavedLocation) obj).f305548b);
            }

            public final int hashCode() {
                UniversalPreselectMapPoint universalPreselectMapPoint = this.f305548b;
                if (universalPreselectMapPoint == null) {
                    return 0;
                }
                return universalPreselectMapPoint.hashCode();
            }

            @k
            public final String toString() {
                return "SetSavedLocation(preselectedPin=" + this.f305548b + ')';
            }
        }

        /* compiled from: UniversalMapInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction$UsedLegacySavedLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$PointsInternalAction;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UsedLegacySavedLocation implements PointsInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Marker.Pin f305549b;

            public UsedLegacySavedLocation(@k Marker.Pin pin) {
                this.f305549b = pin;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UsedLegacySavedLocation) && L.f(this.f305549b, ((UsedLegacySavedLocation) obj).f305549b);
            }

            public final int hashCode() {
                return this.f305549b.hashCode();
            }

            @k
            public final String toString() {
                return "UsedLegacySavedLocation(pin=" + this.f305549b + ')';
            }
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$RequestLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RequestLocation implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestLocation f305550b = new RequestLocation();

        private RequestLocation() {
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$ScreenShownFirstTime;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScreenShownFirstTime implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenShownFirstTime f305551b = new ScreenShownFirstTime();

        private ScreenShownFirstTime() {
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$SubscribeNotPermissionGranted;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubscribeNotPermissionGranted implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubscribeNotPermissionGranted f305552b = new SubscribeNotPermissionGranted();

        private SubscribeNotPermissionGranted() {
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$TriggerInvokeCustomActions;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TriggerInvokeCustomActions implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TriggerInvokeCustomActions f305553b = new TriggerInvokeCustomActions();

        private TriggerInvokeCustomActions() {
        }
    }

    /* compiled from: UniversalMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction$TriggerShowUserLocation;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TriggerShowUserLocation implements UniversalMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final TriggerShowUserLocation f305554b = new TriggerShowUserLocation();

        private TriggerShowUserLocation() {
        }
    }
}
