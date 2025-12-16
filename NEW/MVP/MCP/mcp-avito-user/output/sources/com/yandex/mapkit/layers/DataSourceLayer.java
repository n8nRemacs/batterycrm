package com.yandex.mapkit.layers;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface DataSourceLayer {
    void clear();

    boolean isActive();

    boolean isValid();

    void remove();

    void resetStyles();

    void setActive(boolean z12);

    void setDataSourceListener(@P DataSourceListener dataSourceListener);

    void setLayerLoadedListener(@P LayerLoadedListener layerLoadedListener);

    boolean setStyle(int i12, @N String str);
}
