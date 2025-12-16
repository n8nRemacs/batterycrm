package com.avito.android.avito_map.clustering.algo;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.clustering.ClusterItem;

/* loaded from: classes11.dex */
public interface ScreenBasedAlgorithm<T extends ClusterItem> extends Algorithm<T> {
    void onCameraChange(AvitoMapCameraPosition avitoMapCameraPosition);

    boolean shouldReClusterOnMapMovement();
}
