package com.yandex.metrica;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface AppMetricaDeviceIDListener {

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE
    }

    void onError(@N Reason reason);

    void onLoaded(@P String str);
}
