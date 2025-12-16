package com.adjust.sdk;

/* loaded from: classes10.dex */
public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    SUPRESS(8);

    final int androidLogLevel;

    LogLevel(int i12) {
        this.androidLogLevel = i12;
    }

    public int getAndroidLogLevel() {
        return this.androidLogLevel;
    }
}
