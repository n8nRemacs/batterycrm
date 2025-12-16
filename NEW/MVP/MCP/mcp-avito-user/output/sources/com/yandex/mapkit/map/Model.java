package com.yandex.mapkit.map;

import j.N;

/* loaded from: classes7.dex */
public interface Model {
    @N
    ModelStyle getModelStyle();

    boolean isValid();

    void setData(@N DataProviderWithId dataProviderWithId, @N Callback callback);

    void setModelStyle(@N ModelStyle modelStyle);
}
