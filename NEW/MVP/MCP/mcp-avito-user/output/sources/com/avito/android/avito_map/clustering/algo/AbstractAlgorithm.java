package com.avito.android.avito_map.clustering.algo;

import com.avito.android.avito_map.clustering.ClusterItem;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public abstract class AbstractAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    private final ReadWriteLock mLock = new ReentrantReadWriteLock();

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void lock() {
        this.mLock.writeLock().lock();
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void unlock() {
        this.mLock.writeLock().unlock();
    }
}
