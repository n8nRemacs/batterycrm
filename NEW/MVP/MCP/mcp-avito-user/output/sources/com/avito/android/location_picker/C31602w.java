package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapPointKt;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "cameraPosition", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31602w extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AvitoMapCameraPosition, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182804l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31602w(x0 x0Var) {
        super(2);
        this.f182804l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AvitoMapCameraPosition avitoMapCameraPosition) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AvitoMapCameraPosition avitoMapCameraPosition2 = avitoMapCameraPosition;
        boolean zAlmostEqual = AvitoMapPointKt.almostEqual(avitoMapCameraPosition2.getMapPoint(), locationPickerState2.f182358c);
        RadiusViewState radiusViewState = locationPickerState2.f182375t;
        if (zAlmostEqual) {
            if (locationPickerState2.f()) {
                boolean z12 = radiusViewState.f182395p != null;
                SearchParams searchParams = radiusViewState.f182393n;
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(radiusViewState, null, null, false, null, 0L, null, false, 0L, null, false, searchParams != null ? searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : new Coordinates(avitoMapCameraPosition2.getMapPoint().getLatitude(), avitoMapCameraPosition2.getMapPoint().getLongitude()), ((-1234173943) & 4) != 0 ? searchParams.locationId : null, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null) : null, z12, 20479), false, null, null, false, false, 16490495);
            }
            float zoomLevel = avitoMapCameraPosition2.getZoomLevel();
            SearchParams searchParams2 = radiusViewState.f182393n;
            return LocationPickerState.a(locationPickerState2, null, false, zoomLevel, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(radiusViewState, null, null, false, null, 0L, null, false, 0L, null, false, searchParams2 != null ? searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : new Coordinates(avitoMapCameraPosition2.getMapPoint().getLatitude(), avitoMapCameraPosition2.getMapPoint().getLongitude()), ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null) : null, radiusViewState.f182395p != null, 20479), false, null, null, false, false, 16490487);
        }
        float zoomLevel2 = avitoMapCameraPosition2.getZoomLevel();
        AvitoMapPoint mapPoint = avitoMapCameraPosition2.getMapPoint();
        boolean z13 = radiusViewState.f182395p != null;
        SearchParams searchParams3 = radiusViewState.f182393n;
        LocationPickerState locationPickerStateA = LocationPickerState.a(locationPickerState2, mapPoint, false, zoomLevel2, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(radiusViewState, null, null, false, null, 0L, null, false, 0L, null, false, searchParams3 != null ? searchParams3.copy(((-1234173943) & 1) != 0 ? searchParams3.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams3.geoCoords : new Coordinates(avitoMapCameraPosition2.getMapPoint().getLatitude(), avitoMapCameraPosition2.getMapPoint().getLongitude()), ((-1234173943) & 4) != 0 ? searchParams3.locationId : null, ((-1234173943) & 8) != 0 ? searchParams3.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams3.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams3.directionId : null, ((-1234173943) & 64) != 0 ? searchParams3.districtId : null, ((-1234173943) & 128) != 0 ? searchParams3.params : null, ((-1234173943) & 256) != 0 ? searchParams3.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams3.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams3.query : null, ((-1234173943) & 2048) != 0 ? searchParams3.title : null, ((-1234173943) & 4096) != 0 ? searchParams3.owner : null, ((-1234173943) & 8192) != 0 ? searchParams3.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams3.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams3.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams3.radius : null, ((-1234173943) & 131072) != 0 ? searchParams3.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams3.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams3.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams3.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams3.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams3.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams3.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams3.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams3.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams3.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams3.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams3.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams3.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams3.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams3.clarifyIconType : null, (0 & 1) != 0 ? searchParams3.drawId : null) : null, z13, 20479), false, null, null, false, false, 16490453);
        com.avito.android.location_picker.providers.w wVar = this.f182804l.f182814h;
        if (wVar == null) {
            return locationPickerStateA;
        }
        wVar.b(locationPickerStateA);
        return locationPickerStateA;
    }
}
