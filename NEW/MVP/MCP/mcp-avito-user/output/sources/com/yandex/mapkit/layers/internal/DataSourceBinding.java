package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.DataSource;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class DataSourceBinding extends BaseDataSourceBinding implements DataSource {
    public DataSourceBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.layers.DataSource
    public native void setData(@N byte[] bArr);
}
