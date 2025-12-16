package com.avito.android.avito_map.clustering.algo;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes11.dex */
public class StaticCluster<T extends ClusterItem> implements Cluster<T> {
    private final AvitoMapPoint mCenter;
    private final List<T> mItems = new ArrayList();

    public StaticCluster(AvitoMapPoint avitoMapPoint) {
        this.mCenter = avitoMapPoint;
    }

    public boolean add(T t12) {
        return this.mItems.add(t12);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        return staticCluster.mCenter.equals(this.mCenter) && staticCluster.mItems.equals(this.mItems);
    }

    @Override // com.avito.android.avito_map.clustering.Cluster
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.avito.android.avito_map.clustering.Cluster
    public AvitoMapPoint getPosition() {
        return this.mCenter;
    }

    @Override // com.avito.android.avito_map.clustering.Cluster
    public int getSize() {
        return this.mItems.size();
    }

    public int hashCode() {
        return this.mItems.hashCode() + this.mCenter.hashCode();
    }

    public boolean remove(T t12) {
        return this.mItems.remove(t12);
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.mCenter + ", mItems.size=" + this.mItems.size() + '}';
    }
}
