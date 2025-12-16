package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.CompositeIcon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import j.N;

/* loaded from: classes7.dex */
public class CompositeIconBinding implements CompositeIcon {
    private final NativeObject nativeObject;

    public CompositeIconBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void removeAll();

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void removeIcon(@N String str);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIcon(@N String str, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIcon(@N String str, @N ImageProvider imageProvider, @N IconStyle iconStyle, @N Callback callback);

    @Override // com.yandex.mapkit.map.CompositeIcon
    public native void setIconStyle(@N String str, @N IconStyle iconStyle);
}
