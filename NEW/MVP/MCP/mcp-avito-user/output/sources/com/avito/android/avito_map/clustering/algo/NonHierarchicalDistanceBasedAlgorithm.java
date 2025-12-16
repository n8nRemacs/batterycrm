package com.avito.android.avito_map.clustering.algo;

import IZ0.a;
import IZ0.b;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import com.avito.android.avito_map.clustering.SphericalMercatorProjection;
import com.avito.android.avito_map.clustering.extra.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new HashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    public static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final b mPoint;
        private final AvitoMapPoint mPosition;
        private Set<T> singletonSet;

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.avito.android.avito_map.clustering.extra.PointQuadTree.Item
        public b getPoint() {
            return this.mPoint;
        }

        @Override // com.avito.android.avito_map.clustering.Cluster
        public AvitoMapPoint getPosition() {
            return this.mPosition;
        }

        @Override // com.avito.android.avito_map.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        private QuadItem(T t12) {
            this.mClusterItem = t12;
            AvitoMapPoint position = t12.getPosition();
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.latLngToPoint(position);
            this.singletonSet = Collections.singleton(t12);
        }

        @Override // com.avito.android.avito_map.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }
    }

    private a createBoundsFromSpan(b bVar, double d12) {
        double d13 = d12 / 2.0d;
        double d14 = bVar.f8204a;
        double d15 = d14 - d13;
        double d16 = d14 + d13;
        double d17 = bVar.f8205b;
        return new a(d15, d16, d17 - d13, d17 + d13);
    }

    private double distanceSquared(b bVar, b bVar2) {
        double d12 = bVar.f8204a;
        double d13 = bVar2.f8204a;
        double d14 = (d12 - d13) * (d12 - d13);
        double d15 = bVar.f8205b;
        double d16 = bVar2.f8205b;
        return ((d15 - d16) * (d15 - d16)) + d14;
    }

    private Collection<QuadItem<T>> getClusteringItems() {
        return this.mItems;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItem(T t12) {
        QuadItem<T> quadItem = new QuadItem<>(t12);
        synchronized (this.mQuadTree) {
            this.mItems.add(quadItem);
            this.mQuadTree.add(quadItem);
        }
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            addItem(it.next());
        }
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f12) {
        double dPow = (this.mMaxDistance / Math.pow(2.0d, (int) f12)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.mQuadTree) {
            try {
                for (QuadItem<T> quadItem : getClusteringItems()) {
                    if (!hashSet.contains(quadItem)) {
                        Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(quadItem.getPoint(), dPow));
                        if (collectionSearch.size() == 1) {
                            hashSet2.add(quadItem);
                            hashSet.add(quadItem);
                            map.put(quadItem, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(((QuadItem) quadItem).mClusterItem.getPosition());
                            hashSet2.add(staticCluster);
                            for (T t12 : collectionSearch) {
                                Double d12 = (Double) map.get(t12);
                                double d13 = dPow;
                                double dDistanceSquared = distanceSquared(t12.getPoint(), quadItem.getPoint());
                                if (d12 == null) {
                                    map.put(t12, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t12.mClusterItem);
                                    map2.put(t12, staticCluster);
                                } else if (d12.doubleValue() >= dDistanceSquared) {
                                    ((StaticCluster) map2.get(t12)).remove(t12.mClusterItem);
                                    map.put(t12, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t12.mClusterItem);
                                    map2.put(t12, staticCluster);
                                }
                                dPow = d13;
                            }
                            hashSet.addAll(collectionSearch);
                            dPow = dPow;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet2;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public Collection<T> getItems() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = this.mItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(((QuadItem) it.next()).mClusterItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void removeItem(T t12) {
        QuadItem quadItem = new QuadItem(t12);
        synchronized (this.mQuadTree) {
            this.mItems.remove(quadItem);
            this.mQuadTree.remove(quadItem);
        }
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void removeItems(Collection<T> collection) {
        synchronized (this.mQuadTree) {
            try {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    QuadItem quadItem = new QuadItem(it.next());
                    this.mItems.remove(quadItem);
                    this.mQuadTree.remove(quadItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.avito.android.avito_map.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i12) {
        this.mMaxDistance = i12;
    }
}
