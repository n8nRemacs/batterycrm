package com.yandex.mapkit.location;

import j.N;

/* loaded from: classes7.dex */
public interface LocationManager {
    void requestSingleUpdate(@N LocationListener locationListener);

    void resume();

    void subscribeForLocationUpdates(double d12, long j12, double d13, boolean z12, @N FilteringMode filteringMode, @N Purpose purpose, @N LocationListener locationListener);

    void suspend();

    void unsubscribe(@N LocationListener locationListener);
}
