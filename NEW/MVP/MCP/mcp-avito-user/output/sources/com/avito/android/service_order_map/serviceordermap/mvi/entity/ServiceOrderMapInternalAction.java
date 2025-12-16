package com.avito.android.service_order_map.serviceordermap.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderMapInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddressUpdate", "Back", "ChangeMode", "CloseWithResult", "LoadingStarted", "NetworkError", "RequestLocationPermission", "UnknownError", "UpdatePinCoordinates", "UpdateSearchSuggestions", "UpdateTextResources", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$AddressUpdate;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$Back;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$ChangeMode;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$CloseWithResult;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$LoadingStarted;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$NetworkError;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$RequestLocationPermission;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UnknownError;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdatePinCoordinates;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdateSearchSuggestions;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdateTextResources;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceOrderMapInternalAction extends n {

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$AddressUpdate;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressUpdate implements ServiceOrderMapInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278754b;

        /* renamed from: c, reason: collision with root package name */
        public final double f278755c;

        /* renamed from: d, reason: collision with root package name */
        public final double f278756d;

        public AddressUpdate(@k String str, double d12, double d13) {
            this.f278754b = str;
            this.f278755c = d12;
            this.f278756d = d13;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            if (!(obj instanceof AddressUpdate)) {
                return false;
            }
            AddressUpdate addressUpdate = (AddressUpdate) obj;
            return L.f(this.f278754b, addressUpdate.f278754b) && Double.compare(this.f278755c, addressUpdate.f278755c) == 0 && Double.compare(this.f278756d, addressUpdate.f278756d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f278756d) + e.d(this.f278754b.hashCode() * 31, 31, this.f278755c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressUpdate(address=");
            sb2.append(this.f278754b);
            sb2.append(", lat=");
            sb2.append(this.f278755c);
            sb2.append(", lng=");
            return e.o(sb2, this.f278756d, ')');
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$Back;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f278757b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -607044231;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$ChangeMode;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeMode implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceOrderMapState.MapMode f278758b;

        public ChangeMode(@k ServiceOrderMapState.MapMode mapMode) {
            this.f278758b = mapMode;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeMode) && this.f278758b == ((ChangeMode) obj).f278758b;
        }

        public final int hashCode() {
            return this.f278758b.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeMode(mode=" + this.f278758b + ')';
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$CloseWithResult;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f278759b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f278760c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f278761d;

        public CloseWithResult(@l Double d12, @l Double d13, @l String str) {
            this.f278759b = str;
            this.f278760c = d12;
            this.f278761d = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseWithResult)) {
                return false;
            }
            CloseWithResult closeWithResult = (CloseWithResult) obj;
            return L.f(this.f278759b, closeWithResult.f278759b) && L.f(this.f278760c, closeWithResult.f278760c) && L.f(this.f278761d, closeWithResult.f278761d);
        }

        public final int hashCode() {
            String str = this.f278759b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d12 = this.f278760c;
            int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f278761d;
            return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseWithResult(address=");
            sb2.append(this.f278759b);
            sb2.append(", lat=");
            sb2.append(this.f278760c);
            sb2.append(", lng=");
            return b.h(sb2, this.f278761d, ')');
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$LoadingStarted;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements ServiceOrderMapInternalAction {
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$NetworkError;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkError implements ServiceOrderMapInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f278762b;

        public NetworkError(@k J.a aVar) {
            this.f278762b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof NetworkError) && L.f(this.f278762b, ((NetworkError) obj).f278762b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF159141c() {
            return this.f278762b;
        }

        public final int hashCode() {
            return this.f278762b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "NetworkError(failure=" + this.f278762b + ')';
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$RequestLocationPermission;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestLocationPermission implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RequestLocationPermission f278763b = new RequestLocationPermission();

        private RequestLocationPermission() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RequestLocationPermission);
        }

        public final int hashCode() {
            return -21372159;
        }

        @k
        public final String toString() {
            return "RequestLocationPermission";
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UnknownError;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements ServiceOrderMapInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f278764b;

        public UnknownError(@k J.a aVar) {
            this.f278764b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof UnknownError) && L.f(this.f278764b, ((UnknownError) obj).f278764b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF159141c() {
            return this.f278764b;
        }

        public final int hashCode() {
            return this.f278764b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "UnknownError(failure=" + this.f278764b + ')';
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdatePinCoordinates;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePinCoordinates implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Coordinates f278765b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f278766c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ServiceOrderMapView.ZoomLevel f278767d;

        public UpdatePinCoordinates(@k Coordinates coordinates, boolean z12, @k ServiceOrderMapView.ZoomLevel zoomLevel) {
            this.f278765b = coordinates;
            this.f278766c = z12;
            this.f278767d = zoomLevel;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatePinCoordinates)) {
                return false;
            }
            UpdatePinCoordinates updatePinCoordinates = (UpdatePinCoordinates) obj;
            return L.f(this.f278765b, updatePinCoordinates.f278765b) && this.f278766c == updatePinCoordinates.f278766c && this.f278767d == updatePinCoordinates.f278767d;
        }

        public final int hashCode() {
            return this.f278767d.hashCode() + r.i(this.f278765b.hashCode() * 31, 31, this.f278766c);
        }

        @k
        public final String toString() {
            return "UpdatePinCoordinates(coords=" + this.f278765b + ", animated=" + this.f278766c + ", zoomLevel=" + this.f278767d + ')';
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdateSearchSuggestions;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSearchSuggestions implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f278768b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f278769c;

        public UpdateSearchSuggestions(@l String str, @k ArrayList arrayList) {
            this.f278768b = str;
            this.f278769c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSearchSuggestions)) {
                return false;
            }
            UpdateSearchSuggestions updateSearchSuggestions = (UpdateSearchSuggestions) obj;
            return L.f(this.f278768b, updateSearchSuggestions.f278768b) && this.f278769c.equals(updateSearchSuggestions.f278769c);
        }

        public final int hashCode() {
            String str = this.f278768b;
            return this.f278769c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSearchSuggestions(searchQuery=");
            sb2.append(this.f278768b);
            sb2.append(", addressSuggestions=");
            return e.p(sb2, this.f278769c, ')');
        }
    }

    /* compiled from: ServiceOrderMapInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction$UpdateTextResources;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTextResources implements ServiceOrderMapInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f278770b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f278771c;

        public UpdateTextResources(@l String str, @l String str2) {
            this.f278770b = str;
            this.f278771c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateTextResources)) {
                return false;
            }
            UpdateTextResources updateTextResources = (UpdateTextResources) obj;
            return L.f(this.f278770b, updateTextResources.f278770b) && L.f(this.f278771c, updateTextResources.f278771c);
        }

        public final int hashCode() {
            String str = this.f278770b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f278771c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateTextResources(title=");
            sb2.append(this.f278770b);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f278771c, ')');
        }
    }
}
