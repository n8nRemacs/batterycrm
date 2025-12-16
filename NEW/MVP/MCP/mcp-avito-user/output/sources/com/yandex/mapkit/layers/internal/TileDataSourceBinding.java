package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.TileDataSource;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class TileDataSourceBinding extends BaseDataSourceBinding implements TileDataSource {
    public TileDataSourceBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.layers.TileDataSource
    public native void invalidate(@N String str);
}
