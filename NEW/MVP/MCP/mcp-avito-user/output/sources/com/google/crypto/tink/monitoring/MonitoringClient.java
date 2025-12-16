package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;

@Alpha
/* loaded from: classes6.dex */
public interface MonitoringClient {

    public interface Logger {
        void log(int i12, long j12);

        void logFailure();
    }

    Logger createLogger(MonitoringKeysetInfo monitoringKeysetInfo, String str, String str2);
}
