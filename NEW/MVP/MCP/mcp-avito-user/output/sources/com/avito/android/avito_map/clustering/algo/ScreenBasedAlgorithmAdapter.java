package com.avito.android.avito_map.clustering.algo;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes11.dex */
public class ScreenBasedAlgorithmAdapter<T extends ClusterItem> extends AbstractAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private Algorithm<T> mAlgorithm;

    public ScreenBasedAlgorithmAdapter(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItem(T t12) {
        this.mAlgorithm.addItem(t12);
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItems(Collection<T> collection) {
        this.mAlgorithm.addItems(collection);
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f12) {
        return this.mAlgorithm.getClusters(f12);
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void removeItem(T t12) {
        this.mAlgorithm.removeItem(t12);
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void removeItems(Collection<T> collection) {
        this.mAlgorithm.removeItems(collection);
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i12) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i12);
    }

    @Override // com.avito.android.avito_map.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReClusterOnMapMovement() {
        return false;
    }

    @Override // com.avito.android.avito_map.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(AvitoMapCameraPosition avitoMapCameraPosition) {
    }
}
