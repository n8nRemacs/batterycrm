package com.yandex.mapkit.map;

import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface Cluster {
    void addClusterTapListener(@N ClusterTapListener clusterTapListener);

    @N
    PlacemarkMapObject getAppearance();

    @N
    List<PlacemarkMapObject> getPlacemarks();

    int getSize();

    boolean isValid();

    void removeClusterTapListener(@N ClusterTapListener clusterTapListener);
}
