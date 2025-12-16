package com.yandex.mapkit.transport.time;

/* loaded from: classes7.dex */
public interface AdjustedClock {
    boolean isValid();

    long now();

    void pause();

    void resume();
}
