package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: LocationInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0012H&J\b\u0010\u0017\u001a\u00020\u0012H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/LocationInfo;", "", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "directionName", "", "getDirectionName", "()Ljava/lang/String;", "districtName", "getDistrictName", "locationName", "getLocationName", "metroName", "getMetroName", "getAddress", "hasAddress", "", "hasCoordinates", "hasDirection", "hasDistrict", "hasLocation", "hasMetro", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface LocationInfo {
    @l
    String getAddress();

    @l
    Coordinates getCoordinates();

    @k
    String getDirectionName();

    @k
    String getDistrictName();

    @k
    String getLocationName();

    @k
    String getMetroName();

    boolean hasAddress();

    boolean hasCoordinates();

    boolean hasDirection();

    boolean hasDistrict();

    boolean hasLocation();

    boolean hasMetro();
}
