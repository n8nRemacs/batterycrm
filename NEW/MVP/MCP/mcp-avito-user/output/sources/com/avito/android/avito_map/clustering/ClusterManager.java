package com.avito.android.avito_map.clustering;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.clustering.ClusterItem;
import com.avito.android.avito_map.clustering.MarkerManager;
import com.avito.android.avito_map.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.avito.android.avito_map.clustering.algo.PreCachingAlgorithmDecorator;
import com.avito.android.avito_map.clustering.algo.ScreenBasedAlgorithm;
import com.avito.android.avito_map.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.avito.android.avito_map.clustering.view.ClusterRenderer;
import com.avito.android.avito_map.clustering.view.DefaultClusterRenderer;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public class ClusterManager<T extends ClusterItem> implements AvitoMap.MarkerExactClickListener, AvitoMap.MapMoveEndListener {
    private ScreenBasedAlgorithm<T> mAlgorithm;
    private final MarkerManager.Collection mClusterMarkers;
    private ClusterManager<T>.ClusterTask mClusterTask;
    private final ReadWriteLock mClusterTaskLock;
    private AvitoMap mMap;
    private final MarkerManager mMarkerManager;
    private final MarkerManager.Collection mMarkers;
    private OnClusterClickListener<T> mOnClusterClickListener;
    private OnClusterItemClickListener<T> mOnClusterItemClickListener;
    private AvitoMapCameraPosition mPreviousCameraPosition;
    private ClusterRenderer<T> mRenderer;

    @SuppressLint({"StaticFieldLeak"})
    public class ClusterTask extends AsyncTask<Float, Void, Set<? extends Cluster<T>>> {
        private ClusterTask() {
        }

        @Override // android.os.AsyncTask
        public Set<? extends Cluster<T>> doInBackground(Float... fArr) {
            ClusterManager.this.mAlgorithm.lock();
            try {
                return (Set<? extends Cluster<T>>) ClusterManager.this.mAlgorithm.getClusters(fArr[0].floatValue());
            } finally {
                ClusterManager.this.mAlgorithm.unlock();
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Set<? extends Cluster<T>> set) {
            ClusterManager.this.mRenderer.onClustersChanged(set);
        }
    }

    public interface OnClusterClickListener<T extends ClusterItem> {
        boolean onClusterClick(Cluster<T> cluster);
    }

    public interface OnClusterItemClickListener<T extends ClusterItem> {
        boolean onClusterItemClick(T t12);
    }

    public ClusterManager(Context context, AvitoMap avitoMap) {
        this(context, avitoMap, new MarkerManager(avitoMap));
    }

    public void addItems(Collection<T> collection) {
        this.mAlgorithm.lock();
        try {
            this.mAlgorithm.addItems(collection);
        } finally {
            this.mAlgorithm.unlock();
        }
    }

    public void clearItems() {
        this.mAlgorithm.lock();
        try {
            this.mAlgorithm.clearItems();
        } finally {
            this.mAlgorithm.unlock();
        }
    }

    public void cluster() {
        this.mClusterTaskLock.writeLock().lock();
        try {
            this.mClusterTask.cancel(true);
            ClusterManager<T>.ClusterTask clusterTask = new ClusterTask();
            this.mClusterTask = clusterTask;
            clusterTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.mMap.getMapCameraPosition().getZoomLevel()));
        } finally {
            this.mClusterTaskLock.writeLock().unlock();
        }
    }

    public MarkerManager.Collection getClusterMarkerCollection() {
        return this.mClusterMarkers;
    }

    public MarkerManager.Collection getMarkerCollection() {
        return this.mMarkers;
    }

    public MarkerManager getMarkerManager() {
        return this.mMarkerManager;
    }

    public ClusterRenderer<T> getRenderer() {
        return this.mRenderer;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
    public void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
        ClusterRenderer<T> clusterRenderer = this.mRenderer;
        if (clusterRenderer instanceof AvitoMap.MapMoveEndListener) {
            ((AvitoMap.MapMoveEndListener) clusterRenderer).onMapSettled(avitoMapCameraPosition);
        }
        this.mAlgorithm.onCameraChange(this.mMap.getMapCameraPosition());
        if (this.mAlgorithm.shouldReClusterOnMapMovement()) {
            cluster();
            return;
        }
        AvitoMapCameraPosition avitoMapCameraPosition2 = this.mPreviousCameraPosition;
        if (avitoMapCameraPosition2 == null || avitoMapCameraPosition2.getZoomLevel() != this.mMap.getMapCameraPosition().getZoomLevel()) {
            this.mPreviousCameraPosition = this.mMap.getMapCameraPosition();
            cluster();
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerExactClickListener
    public boolean onMarkerClicked(AvitoMapMarker avitoMapMarker) {
        return getMarkerManager().onMarkerClicked(avitoMapMarker);
    }

    public void setOnClusterClickListener(OnClusterClickListener<T> onClusterClickListener) {
        this.mOnClusterClickListener = onClusterClickListener;
        this.mRenderer.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterItemClickListener(OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mOnClusterItemClickListener = onClusterItemClickListener;
        this.mRenderer.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setRenderer(ClusterRenderer<T> clusterRenderer) {
        this.mRenderer.setOnClusterClickListener(null);
        this.mRenderer.setOnClusterItemClickListener(null);
        this.mClusterMarkers.clear();
        this.mMarkers.clear();
        this.mRenderer.onRemove();
        this.mRenderer = clusterRenderer;
        clusterRenderer.onAdd();
        this.mRenderer.setOnClusterClickListener(this.mOnClusterClickListener);
        this.mRenderer.setOnClusterItemClickListener(this.mOnClusterItemClickListener);
        cluster();
    }

    private ClusterManager(Context context, AvitoMap avitoMap, MarkerManager markerManager) {
        this.mClusterTaskLock = new ReentrantReadWriteLock();
        this.mMap = avitoMap;
        this.mMarkerManager = markerManager;
        this.mClusterMarkers = markerManager.newCollection();
        this.mMarkers = markerManager.newCollection();
        this.mRenderer = new DefaultClusterRenderer(context, avitoMap, this);
        this.mAlgorithm = new ScreenBasedAlgorithmAdapter(new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm()));
        this.mClusterTask = new ClusterTask();
        this.mRenderer.onAdd();
    }
}
