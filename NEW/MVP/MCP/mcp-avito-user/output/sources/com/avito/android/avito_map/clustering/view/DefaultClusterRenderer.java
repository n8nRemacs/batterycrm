package com.avito.android.avito_map.clustering.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerOptions;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import com.avito.android.avito_map.clustering.ClusterManager;
import com.google.maps.android.ui.RotationLayout;
import com.google.maps.android.ui.c;
import com.google.maps.android.ui.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final c mIconGenerator;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private final AvitoMap mMap;
    private float mZoom;
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<Bitmap> mIcons = new SparseArray<>();
    private MarkerCache<T> mMarkerCache = new MarkerCache<>();
    private int mMinClusterSize = 4;
    private Map<AvitoMapMarker, Cluster<T>> mMarkerToCluster = new HashMap();
    private Map<Cluster<T>, AvitoMapMarker> mClusterToMarker = new HashMap();
    private final DefaultClusterRenderer<T>.ViewModifier mViewModifier = new ViewModifier();

    public class CreateMarkerTask {
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set) {
            this.cluster = cluster;
            this.newMarkers = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (DefaultClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                AvitoMapMarker avitoMapMarkerAddMarker = (AvitoMapMarker) DefaultClusterRenderer.this.mClusterToMarker.get(this.cluster);
                if (avitoMapMarkerAddMarker == null) {
                    AvitoMapMarkerOptions avitoMapMarkerOptions = new AvitoMapMarkerOptions(this.cluster.getPosition(), AvitoMapMarker.Anchor.CENTER);
                    DefaultClusterRenderer.this.onBeforeClusterRendered(this.cluster, avitoMapMarkerOptions);
                    avitoMapMarkerAddMarker = DefaultClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(avitoMapMarkerOptions);
                    DefaultClusterRenderer.this.mMarkerToCluster.put(avitoMapMarkerAddMarker, this.cluster);
                    DefaultClusterRenderer.this.mClusterToMarker.put(this.cluster, avitoMapMarkerAddMarker);
                    markerWithPosition = new MarkerWithPosition(avitoMapMarkerAddMarker);
                } else {
                    markerWithPosition = new MarkerWithPosition(avitoMapMarkerAddMarker);
                }
                DefaultClusterRenderer.this.onClusterRendered(this.cluster, avitoMapMarkerAddMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t12 : this.cluster.getItems()) {
                AvitoMapMarker avitoMapMarkerAddMarker2 = DefaultClusterRenderer.this.mMarkerCache.get((MarkerCache) t12);
                if (avitoMapMarkerAddMarker2 == null) {
                    AvitoMapMarkerOptions avitoMapMarkerOptions2 = new AvitoMapMarkerOptions(t12.getPosition(), AvitoMapMarker.Anchor.BOTTOM_CENTER);
                    if (t12.getTitle() != null && t12.getSnippet() != null) {
                        avitoMapMarkerOptions2.setTitle(t12.getTitle());
                        avitoMapMarkerOptions2.setSnippet(t12.getSnippet());
                    } else if (t12.getSnippet() != null) {
                        avitoMapMarkerOptions2.setTitle(t12.getSnippet());
                    } else if (t12.getTitle() != null) {
                        avitoMapMarkerOptions2.setTitle(t12.getTitle());
                    }
                    DefaultClusterRenderer.this.onBeforeClusterItemRendered(t12, avitoMapMarkerOptions2);
                    avitoMapMarkerAddMarker2 = DefaultClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(avitoMapMarkerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(avitoMapMarkerAddMarker2);
                    DefaultClusterRenderer.this.mMarkerCache.put(t12, avitoMapMarkerAddMarker2);
                } else {
                    markerWithPosition2 = new MarkerWithPosition(avitoMapMarkerAddMarker2);
                }
                DefaultClusterRenderer.this.onClusterItemRendered(t12, avitoMapMarkerAddMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    public static class MarkerCache<T> {
        private Map<T, AvitoMapMarker> mCache;
        private Map<AvitoMapMarker, T> mCacheReverse;

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public AvitoMapMarker get(T t12) {
            return this.mCache.get(t12);
        }

        public void put(T t12, AvitoMapMarker avitoMapMarker) {
            this.mCache.put(t12, avitoMapMarker);
            this.mCacheReverse.put(avitoMapMarker, t12);
        }

        public void remove(AvitoMapMarker avitoMapMarker) {
            T t12 = this.mCacheReverse.get(avitoMapMarker);
            this.mCacheReverse.remove(avitoMapMarker);
            this.mCache.remove(t12);
        }

        public T get(AvitoMapMarker avitoMapMarker) {
            return this.mCacheReverse.get(avitoMapMarker);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private Queue<AvitoMapMarker> mOnScreenRemoveMarkerTasks;
        private Queue<AvitoMapMarker> mRemoveMarkerTasks;

        @TargetApi(11)
        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                this.mOnScreenCreateMarkerTasks.poll().perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                this.mCreateMarkerTasks.poll().perform(this);
            } else {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(AvitoMapMarker avitoMapMarker) {
            DefaultClusterRenderer.this.mClusterToMarker.remove((Cluster) DefaultClusterRenderer.this.mMarkerToCluster.get(avitoMapMarker));
            DefaultClusterRenderer.this.mMarkerCache.remove(avitoMapMarker);
            DefaultClusterRenderer.this.mMarkerToCluster.remove(avitoMapMarker);
            DefaultClusterRenderer.this.mClusterManager.getMarkerManager().remove(avitoMapMarker);
        }

        public void add(boolean z12, DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z12) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i12 = 0; i12 < 10; i12++) {
                try {
                    performNextTask();
                } catch (Throwable th2) {
                    this.lock.unlock();
                    throw th2;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            this.lock.unlock();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isBusy() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock     // Catch: java.lang.Throwable -> L28
                r0.lock()     // Catch: java.lang.Throwable -> L28
                java.util.Queue<com.avito.android.avito_map.clustering.view.DefaultClusterRenderer<T>$CreateMarkerTask> r0 = r2.mCreateMarkerTasks     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L2a
                java.util.Queue<com.avito.android.avito_map.clustering.view.DefaultClusterRenderer<T>$CreateMarkerTask> r0 = r2.mOnScreenCreateMarkerTasks     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L2a
                java.util.Queue<com.avito.android.avito_map.AvitoMapMarker> r0 = r2.mOnScreenRemoveMarkerTasks     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto L2a
                java.util.Queue<com.avito.android.avito_map.AvitoMapMarker> r0 = r2.mRemoveMarkerTasks     // Catch: java.lang.Throwable -> L28
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L28
                if (r0 != 0) goto L26
                goto L2a
            L26:
                r0 = 0
                goto L2b
            L28:
                r0 = move-exception
                goto L31
            L2a:
                r0 = 1
            L2b:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                return r0
            L31:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avito_map.clustering.view.DefaultClusterRenderer.MarkerModifier.isBusy():boolean");
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z12, AvitoMapMarker avitoMapMarker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z12) {
                this.mOnScreenRemoveMarkerTasks.add(avitoMapMarker);
            } else {
                this.mRemoveMarkerTasks.add(avitoMapMarker);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e12) {
                        throw new RuntimeException(e12);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
        }
    }

    public static class MarkerWithPosition {
        private final AvitoMapMarker marker;
        private AvitoMapPoint position;

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        private MarkerWithPosition(AvitoMapMarker avitoMapMarker) {
            this.marker = avitoMapMarker;
            this.position = avitoMapMarker.getPosition();
        }
    }

    public class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private AvitoMapBounds mProjection;

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            if (this.clusters.equals(DefaultClusterRenderer.this.mClusters)) {
                this.mCallback.run();
                return;
            }
            MarkerModifier markerModifier = new MarkerModifier();
            float f12 = this.mMapZoom;
            Set<MarkerWithPosition> set = DefaultClusterRenderer.this.mMarkers;
            AvitoMapBounds avitoMapBounds = this.mProjection;
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            Iterator<? extends Cluster<T>> it = this.clusters.iterator();
            while (it.hasNext()) {
                markerModifier.add(true, new CreateMarkerTask(it.next(), setNewSetFromMap));
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            for (MarkerWithPosition markerWithPosition : set) {
                markerModifier.remove(avitoMapBounds.contains(markerWithPosition.position), markerWithPosition.marker);
            }
            markerModifier.waitUntilFree();
            DefaultClusterRenderer.this.mMarkers = setNewSetFromMap;
            DefaultClusterRenderer.this.mClusters = this.clusters;
            DefaultClusterRenderer.this.mZoom = f12;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f12) {
            this.mMapZoom = f12;
        }

        public void setProjection(AvitoMapBounds avitoMapBounds) {
            this.mProjection = avitoMapBounds;
        }

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private DefaultClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            AvitoMapBounds mapBounds = DefaultClusterRenderer.this.mMap.getMapBounds();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new Runnable() { // from class: com.avito.android.avito_map.clustering.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98068b.lambda$handleMessage$0();
                }
            });
            renderTask.setProjection(mapBounds);
            renderTask.setMapZoom(DefaultClusterRenderer.this.mMap.getMapCameraPosition().getZoomLevel());
            new Thread(renderTask).start();
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultClusterRenderer(Context context, AvitoMap avitoMap, ClusterManager<T> clusterManager) {
        this.mMap = avitoMap;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        c cVar = new c(context);
        this.mIconGenerator = cVar;
        d dVarMakeSquareTextView = makeSquareTextView(context);
        RotationLayout rotationLayout = cVar.f362284b;
        rotationLayout.removeAllViews();
        rotationLayout.addView(dVarMakeSquareTextView);
        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        cVar.f362285c = textView;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_ClusterIcon_TextAppearance);
        }
        cVar.a(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i12 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i12, i12, i12, i12);
        return layerDrawable;
    }

    private d makeSquareTextView(Context context) {
        d dVar = new d(context);
        dVar.f362286b = 0;
        dVar.f362287c = 0;
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dVar.setId(R.id.amu_text);
        int i12 = (int) (this.mDensity * 12.0f);
        dVar.setPadding(i12, i12, i12, i12);
        return dVar;
    }

    public int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i12 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i12 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i13 = i12 + 1;
            if (size < iArr[i13]) {
                return iArr[i12];
            }
            i12 = i13;
        }
    }

    public String getClusterText(int i12) {
        if (i12 < BUCKETS[0]) {
            return String.valueOf(i12);
        }
        return String.valueOf(i12) + "+";
    }

    @SuppressLint({"CustomColorsKotlin"})
    public int getColor(int i12) {
        float fMin = 300.0f - Math.min(i12, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public AvitoMapMarker getMarker(T t12) {
        return this.mMarkerCache.get((MarkerCache<T>) t12);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.avito.android.avito_map.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new AvitoMap.MarkerExactClickListener() { // from class: com.avito.android.avito_map.clustering.view.DefaultClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.avito.android.avito_map.AvitoMap.MarkerExactClickListener
            public boolean onMarkerClicked(AvitoMapMarker avitoMapMarker) {
                return DefaultClusterRenderer.this.mItemClickListener != null && DefaultClusterRenderer.this.mItemClickListener.onClusterItemClick((ClusterItem) DefaultClusterRenderer.this.mMarkerCache.get(avitoMapMarker));
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new AvitoMap.MarkerExactClickListener() { // from class: com.avito.android.avito_map.clustering.view.DefaultClusterRenderer.2
            @Override // com.avito.android.avito_map.AvitoMap.MarkerExactClickListener
            public boolean onMarkerClicked(AvitoMapMarker avitoMapMarker) {
                return DefaultClusterRenderer.this.mClickListener != null && DefaultClusterRenderer.this.mClickListener.onClusterClick((Cluster) DefaultClusterRenderer.this.mMarkerToCluster.get(avitoMapMarker));
            }
        });
    }

    public void onBeforeClusterRendered(Cluster<T> cluster, AvitoMapMarkerOptions avitoMapMarkerOptions) {
        int bucket = getBucket(cluster);
        Bitmap bitmap = this.mIcons.get(bucket);
        if (bitmap == null) {
            this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
            c cVar = this.mIconGenerator;
            String clusterText = getClusterText(bucket);
            TextView textView = cVar.f362285c;
            if (textView != null) {
                textView.setText(clusterText);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ViewGroup viewGroup = cVar.f362283a;
            viewGroup.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            viewGroup.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            viewGroup.draw(new Canvas(bitmapCreateBitmap));
            this.mIcons.put(bucket, bitmapCreateBitmap);
            bitmap = bitmapCreateBitmap;
        }
        avitoMapMarkerOptions.setIcon(bitmap);
    }

    @Override // com.avito.android.avito_map.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.avito.android.avito_map.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
    }

    public void setMinClusterSize(int i12) {
        this.mMinClusterSize = i12;
    }

    @Override // com.avito.android.avito_map.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.avito.android.avito_map.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    public boolean shouldRenderAsCluster(Cluster<T> cluster) {
        return cluster.getSize() > this.mMinClusterSize;
    }

    public void onBeforeClusterItemRendered(T t12, AvitoMapMarkerOptions avitoMapMarkerOptions) {
    }

    public void onClusterItemRendered(T t12, AvitoMapMarker avitoMapMarker) {
    }

    public void onClusterRendered(Cluster<T> cluster, AvitoMapMarker avitoMapMarker) {
    }
}
