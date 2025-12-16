package com.yandex.mapkit.traffic;

import j.N;

/* loaded from: classes7.dex */
public interface TrafficLayer {
    void addTrafficListener(@N TrafficListener trafficListener);

    boolean isTrafficVisible();

    boolean isValid();

    void removeTrafficListener(@N TrafficListener trafficListener);

    void resetTrafficStyles();

    boolean setTrafficStyle(int i12, @N String str);

    boolean setTrafficStyle(@N String str);

    void setTrafficVisible(boolean z12);
}
