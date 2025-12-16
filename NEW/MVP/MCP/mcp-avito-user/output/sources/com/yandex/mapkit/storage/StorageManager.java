package com.yandex.mapkit.storage;

import com.yandex.runtime.Error;
import j.N;
import j.P;
import j.j0;

/* loaded from: classes7.dex */
public interface StorageManager {

    public interface ClearListener {
        @j0
        void onClearCompleted();
    }

    public interface SizeListener {
        @j0
        void onError(@N Error error);

        @j0
        void onSuccess(@P Long l12);
    }

    void addStorageErrorListener(@N StorageErrorListener storageErrorListener);

    void clear(@N ClearListener clearListener);

    void computeSize(@N SizeListener sizeListener);

    boolean isValid();

    void maxTileStorageSize(@N SizeListener sizeListener);

    void removeStorageErrorListener(@N StorageErrorListener storageErrorListener);

    void resetMaxTileStorageSize(@N SizeListener sizeListener);

    void setMaxTileStorageSize(long j12, @N SizeListener sizeListener);
}
