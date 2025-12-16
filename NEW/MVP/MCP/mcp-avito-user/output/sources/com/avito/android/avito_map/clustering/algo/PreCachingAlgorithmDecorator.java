package com.avito.android.avito_map.clustering.algo;

import androidx.collection.C20212g0;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final C20212g0<Integer, Set<? extends Cluster<T>>> mCache = new C20212g0<>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();

    public class PreCacheRunnable implements Runnable {
        private final int mZoom;

        public PreCacheRunnable(int i12) {
            this.mZoom = i12;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i12) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> clusters = this.mCache.get(Integer.valueOf(i12));
        this.mCacheLock.readLock().unlock();
        if (clusters == null) {
            this.mCacheLock.writeLock().lock();
            clusters = this.mCache.get(Integer.valueOf(i12));
            if (clusters == null) {
                clusters = this.mAlgorithm.getClusters(i12);
                this.mCache.put(Integer.valueOf(i12), clusters);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItem(T t12) {
        this.mAlgorithm.addItem(t12);
        clearCache();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItems(Collection<T> collection) {
        this.mAlgorithm.addItems(collection);
        clearCache();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f12) {
        int i12 = (int) f12;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i12);
        int i13 = i12 + 1;
        if (this.mCache.get(Integer.valueOf(i13)) == null) {
            new Thread(new PreCacheRunnable(i13)).start();
        }
        int i14 = i12 - 1;
        if (this.mCache.get(Integer.valueOf(i14)) == null) {
            new Thread(new PreCacheRunnable(i14)).start();
        }
        return clustersInternal;
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
        clearCache();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void removeItems(Collection<T> collection) {
        this.mAlgorithm.removeItems(collection);
        clearCache();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i12) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i12);
        clearCache();
    }
}
