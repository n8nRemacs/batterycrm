package org.webrtc;

import org.webrtc.Logging;

/* loaded from: classes9.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i12, Logging.Severity severity) {
        if (str == null) {
            throw new IllegalArgumentException("dirPath may not be null.");
        }
        this.nativeSink = nativeAddSink(str, i12, severity.ordinal());
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i12, int i13);

    private static native void nativeDeleteSink(long j12);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j12 = this.nativeSink;
        if (j12 != 0) {
            nativeDeleteSink(j12);
            this.nativeSink = 0L;
        }
    }
}
