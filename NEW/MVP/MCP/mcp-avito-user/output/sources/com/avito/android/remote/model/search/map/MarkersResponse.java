package com.avito.android.remote.model.search.map;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MarkersResponse.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\r\u0010!R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/search/map/MarkersResponse;", "", "markers", "", "Lcom/avito/android/remote/model/search/map/Pin;", "rash", "Lcom/avito/android/remote/model/search/map/Rash;", "area", "Lcom/avito/android/remote/model/search/map/Area;", "counters", "Lcom/avito/android/remote/model/search/map/Counter;", "subscriptionId", "", "isSubscribed", "", "closeMapButton", "Lcom/avito/android/remote/model/search/map/CloseMapButton;", "verticalId", "", "drawAreaBase64", "features", "Lcom/avito/android/remote/model/search/map/MarkersFeatures;", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/search/map/Area;Lcom/avito/android/remote/model/search/map/Counter;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/map/CloseMapButton;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/search/map/MarkersFeatures;)V", "getArea", "()Lcom/avito/android/remote/model/search/map/Area;", "getCloseMapButton", "()Lcom/avito/android/remote/model/search/map/CloseMapButton;", "getCounters", "()Lcom/avito/android/remote/model/search/map/Counter;", "getDrawAreaBase64", "()Ljava/lang/String;", "getFeatures", "()Lcom/avito/android/remote/model/search/map/MarkersFeatures;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarkers", "()Ljava/util/List;", "getRash", "getSubscriptionId", "getVerticalId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarkersResponse {

    @c("mapArea")
    @l
    private final Area area;

    @c("closeMapButton")
    @l
    private final CloseMapButton closeMapButton;

    @c("counters")
    @l
    private final Counter counters;

    @c("drawAreaBase64")
    @l
    private final String drawAreaBase64;

    @c("features")
    @l
    private final MarkersFeatures features;

    @c("isSubscribed")
    @l
    private final Boolean isSubscribed;

    @c("markers")
    @k
    private final List<Pin> markers;

    @c("rash")
    @l
    private final List<Rash> rash;

    @c("subscriptionId")
    @l
    private final String subscriptionId;

    @c("verticalId")
    @l
    private final Integer verticalId;

    public MarkersResponse(@k List<Pin> list, @l List<Rash> list2, @l Area area, @l Counter counter, @l String str, @l Boolean bool, @l CloseMapButton closeMapButton, @l Integer num, @l String str2, @l MarkersFeatures markersFeatures) {
        this.markers = list;
        this.rash = list2;
        this.area = area;
        this.counters = counter;
        this.subscriptionId = str;
        this.isSubscribed = bool;
        this.closeMapButton = closeMapButton;
        this.verticalId = num;
        this.drawAreaBase64 = str2;
        this.features = markersFeatures;
    }

    @l
    public final Area getArea() {
        return this.area;
    }

    @l
    public final CloseMapButton getCloseMapButton() {
        return this.closeMapButton;
    }

    @l
    public final Counter getCounters() {
        return this.counters;
    }

    @l
    public final String getDrawAreaBase64() {
        return this.drawAreaBase64;
    }

    @l
    public final MarkersFeatures getFeatures() {
        return this.features;
    }

    @k
    public final List<Pin> getMarkers() {
        return this.markers;
    }

    @l
    public final List<Rash> getRash() {
        return this.rash;
    }

    @l
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @l
    public final Integer getVerticalId() {
        return this.verticalId;
    }

    @l
    /* renamed from: isSubscribed, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }
}
