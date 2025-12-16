package com.yandex.mapkit.layers;

import j.N;

/* loaded from: classes7.dex */
public interface Layer {
    @N
    DataSourceLayer dataSourceLayer();

    boolean isValid();

    void remove();
}
