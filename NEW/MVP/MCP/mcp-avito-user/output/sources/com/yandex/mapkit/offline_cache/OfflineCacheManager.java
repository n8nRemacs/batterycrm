package com.yandex.mapkit.offline_cache;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import j.N;
import j.P;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface OfflineCacheManager {

    public interface ClearListener {
        @j0
        void onClearCompleted();
    }

    public interface ErrorListener {
        @j0
        void onError(@N Error error);

        @j0
        void onRegionError(@N Error error, int i12);
    }

    public interface PathGetterListener {
        @j0
        void onPathReceived(@N String str);
    }

    public interface PathSetterListener {
        @j0
        void onPathSet();

        @j0
        void onPathSetError(@N Error error);
    }

    public interface SizeListener {
        @j0
        void onSizeComputed(@P Long l12);
    }

    void addErrorListener(@N ErrorListener errorListener);

    void addRegionListUpdatesListener(@N RegionListUpdatesListener regionListUpdatesListener);

    void addRegionListener(@N RegionListener regionListener);

    void allowUseCellularNetwork(boolean z12);

    void clear(@N ClearListener clearListener);

    void computeCacheSize(@N SizeListener sizeListener);

    void drop(int i12);

    void enableAutoUpdate(boolean z12);

    @N
    List<String> getCities(int i12);

    @P
    Long getDownloadedReleaseTime(int i12);

    float getProgress(int i12);

    @N
    RegionState getState(int i12);

    boolean isLegacyPath(int i12);

    boolean isValid();

    boolean mayBeOutOfAvailableSpace(int i12);

    void moveData(@N String str, @N DataMoveListener dataMoveListener);

    void pauseDownload(int i12);

    @N
    List<Region> regions();

    void removeErrorListener(@N ErrorListener errorListener);

    void removeRegionListUpdatesListener(@N RegionListUpdatesListener regionListUpdatesListener);

    void removeRegionListener(@N RegionListener regionListener);

    void requestPath(@N PathGetterListener pathGetterListener);

    void requestRegionsAtPoint(@N Point point, @N RegionsAtPointListener regionsAtPointListener);

    void setCachePath(@N String str, @N PathSetterListener pathSetterListener);

    void startDownload(int i12);

    void stopDownload(int i12);
}
