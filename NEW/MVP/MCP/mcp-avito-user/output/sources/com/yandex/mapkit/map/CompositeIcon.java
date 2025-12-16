package com.yandex.mapkit.map;

import com.yandex.runtime.image.ImageProvider;
import j.N;

/* loaded from: classes7.dex */
public interface CompositeIcon {
    boolean isValid();

    void removeAll();

    void removeIcon(@N String str);

    void setIcon(@N String str, @N ImageProvider imageProvider, @N IconStyle iconStyle);

    void setIcon(@N String str, @N ImageProvider imageProvider, @N IconStyle iconStyle, @N Callback callback);

    void setIconStyle(@N String str, @N IconStyle iconStyle);
}
