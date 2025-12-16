package com.yandex.mapkit.search.search_layer;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SubtitleItem;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public interface SearchResultItem {
    @N
    List<SubtitleItem> details();

    @P
    String getCategoryClass();

    @N
    GeoObject getGeoObject();

    @N
    String getId();

    @N
    String getName();

    @N
    Point getPoint();

    boolean hasDetails();

    boolean isClosed();

    boolean isCollection();

    boolean isOffline();
}
