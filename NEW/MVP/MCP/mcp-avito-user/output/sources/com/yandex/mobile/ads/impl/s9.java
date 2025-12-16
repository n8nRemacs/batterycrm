package com.yandex.mobile.ads.impl;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes8.dex */
public final class s9 {
    public static final int a(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
