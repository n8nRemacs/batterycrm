package com.yandex.mapkit.offline_cache.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.offline_cache.DataMoveListener;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.offline_cache.Region;
import com.yandex.mapkit.offline_cache.RegionListUpdatesListener;
import com.yandex.mapkit.offline_cache.RegionListener;
import com.yandex.mapkit.offline_cache.RegionState;
import com.yandex.mapkit.offline_cache.RegionsAtPointListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class OfflineCacheManagerBinding implements OfflineCacheManager {
    private final NativeObject nativeObject;
    protected Subscription<DataMoveListener> dataMoveListenerSubscription = new Subscription<DataMoveListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(DataMoveListener dataMoveListener) {
            return OfflineCacheManagerBinding.createDataMoveListener(dataMoveListener);
        }
    };
    protected Subscription<OfflineCacheManager.ErrorListener> errorListenerSubscription = new Subscription<OfflineCacheManager.ErrorListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(OfflineCacheManager.ErrorListener errorListener) {
            return OfflineCacheManagerBinding.createErrorListener(errorListener);
        }
    };
    protected Subscription<RegionListUpdatesListener> regionListUpdatesListenerSubscription = new Subscription<RegionListUpdatesListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RegionListUpdatesListener regionListUpdatesListener) {
            return OfflineCacheManagerBinding.createRegionListUpdatesListener(regionListUpdatesListener);
        }
    };
    protected Subscription<RegionListener> regionListenerSubscription = new Subscription<RegionListener>() { // from class: com.yandex.mapkit.offline_cache.internal.OfflineCacheManagerBinding.4
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RegionListener regionListener) {
            return OfflineCacheManagerBinding.createRegionListener(regionListener);
        }
    };

    public OfflineCacheManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createDataMoveListener(DataMoveListener dataMoveListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createErrorListener(OfflineCacheManager.ErrorListener errorListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRegionListUpdatesListener(RegionListUpdatesListener regionListUpdatesListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRegionListener(RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addErrorListener(@N OfflineCacheManager.ErrorListener errorListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addRegionListUpdatesListener(@N RegionListUpdatesListener regionListUpdatesListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void addRegionListener(@N RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void allowUseCellularNetwork(boolean z12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void clear(@N OfflineCacheManager.ClearListener clearListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void computeCacheSize(@N OfflineCacheManager.SizeListener sizeListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void drop(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void enableAutoUpdate(boolean z12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @N
    public native List<String> getCities(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @P
    public native Long getDownloadedReleaseTime(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native float getProgress(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @N
    public native RegionState getState(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean isLegacyPath(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native boolean mayBeOutOfAvailableSpace(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void moveData(@N String str, @N DataMoveListener dataMoveListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void pauseDownload(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    @N
    public native List<Region> regions();

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeErrorListener(@N OfflineCacheManager.ErrorListener errorListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeRegionListUpdatesListener(@N RegionListUpdatesListener regionListUpdatesListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void removeRegionListener(@N RegionListener regionListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void requestPath(@N OfflineCacheManager.PathGetterListener pathGetterListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void requestRegionsAtPoint(@N Point point, @N RegionsAtPointListener regionsAtPointListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void setCachePath(@N String str, @N OfflineCacheManager.PathSetterListener pathSetterListener);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void startDownload(int i12);

    @Override // com.yandex.mapkit.offline_cache.OfflineCacheManager
    public native void stopDownload(int i12);
}
