package com.avito.android.avito_map.clustering.algo;

import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes11.dex */
public interface Algorithm<T extends ClusterItem> {
    void addItem(T t12);

    void addItems(Collection<T> collection);

    void clearItems();

    Set<? extends Cluster<T>> getClusters(float f12);

    Collection<T> getItems();

    int getMaxDistanceBetweenClusteredItems();

    void lock();

    void removeItem(T t12);

    void removeItems(Collection<T> collection);

    void setMaxDistanceBetweenClusteredItems(int i12);

    void unlock();
}
