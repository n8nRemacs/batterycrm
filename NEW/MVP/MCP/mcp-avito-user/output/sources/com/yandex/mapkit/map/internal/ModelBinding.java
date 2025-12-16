package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.DataProviderWithId;
import com.yandex.mapkit.map.Model;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class ModelBinding implements Model {
    private final NativeObject nativeObject;

    public ModelBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.Model
    @N
    public native ModelStyle getModelStyle();

    @Override // com.yandex.mapkit.map.Model
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.Model
    public native void setData(@N DataProviderWithId dataProviderWithId, @N Callback callback);

    @Override // com.yandex.mapkit.map.Model
    public native void setModelStyle(@N ModelStyle modelStyle);
}
