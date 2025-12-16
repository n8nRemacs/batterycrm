package org.webrtc.audio;

import defpackage.az1;
import defpackage.utb;
import defpackage.wy1;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;

/* loaded from: classes2.dex */
class WebRtcSilenceProvider {
    private static final String TAG = "WebRtcSilenceProvider";
    private final int audioFormat;
    private final long bufferDurationNs;
    private final int channelCount;
    private long lastReadTimeNs;
    private final int sampleRate;
    private final byte[] silenceBytes;
    private final Statistics statistics = new Statistics(0);

    public static class Statistics {
        private static final long LOG_INTERVAL = TimeUnit.SECONDS.toNanos(15);
        private long lastLogTimeNs;
        private int readCount;
        private long totalReadTimeNs;
        private long totalSleepTimeMs;

        public /* synthetic */ Statistics(int i) {
            this();
        }

        private void reset() {
            this.totalSleepTimeMs = 0L;
            this.totalReadTimeNs = 0L;
            this.readCount = 0;
        }

        public void trackRead(long j, long j2, long j3) {
            int i = this.readCount + 1;
            this.readCount = i;
            if (j3 > 0) {
                this.totalSleepTimeMs += j3;
            }
            long j4 = (j2 - j) + this.totalReadTimeNs;
            this.totalReadTimeNs = j4;
            long j5 = j2 - this.lastLogTimeNs;
            long j6 = LOG_INTERVAL;
            if (j5 > j6) {
                long j7 = this.totalSleepTimeMs / i;
                long millis = TimeUnit.NANOSECONDS.toMillis(j4 / i);
                this.lastLogTimeNs = j2;
                int i2 = this.readCount;
                StringBuilder sbL = az1.l(j6, "Log interval: ", "ns, log delta: ");
                utb.n(sbL, j5, "ns, reads: ", i2);
                az1.r(millis, ", read time: ", "ms, suspend time: ", sbL);
                sbL.append(j7);
                sbL.append("ms");
                Logging.d(WebRtcSilenceProvider.TAG, sbL.toString());
                reset();
            }
        }

        private Statistics() {
        }
    }

    public WebRtcSilenceProvider(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.sampleRate = i2;
        this.audioFormat = i;
        this.channelCount = i3;
        long nanos = (i4 * TimeUnit.SECONDS.toNanos(1L)) / i2;
        this.bufferDurationNs = nanos;
        if (bArr == null || i5 != bArr.length) {
            bArr = new byte[i5 < 0 ? 0 : i5];
        }
        this.silenceBytes = bArr;
        long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
        int length = bArr.length;
        StringBuilder sbK = wy1.k("Silence provider initialized, sampleRate=", i2, ", framesPerBuffer=", i4, ", bufferDuration=");
        sbK.append(millis);
        sbK.append("ms, bufferCapacity=");
        sbK.append(length);
        Logging.d(TAG, sbK.toString());
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int read(ByteBuffer byteBuffer, int i) throws InterruptedException {
        int iMin = Math.min(i, byteBuffer.capacity());
        int i2 = 0;
        while (i2 < iMin) {
            int iMin2 = Math.min(byteBuffer.remaining(), this.silenceBytes.length);
            if (iMin2 == 0) {
                break;
            }
            byteBuffer.put(this.silenceBytes, byteBuffer.position(), iMin2);
            i2 += iMin2;
        }
        long jNanoTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(this.bufferDurationNs - (jNanoTime - this.lastReadTimeNs));
        if (millis > 0) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException unused) {
                Logging.d(TAG, "Interrupted while waiting for frame duration, return immediately");
            }
        }
        long jNanoTime2 = System.nanoTime();
        this.lastReadTimeNs = jNanoTime2;
        this.statistics.trackRead(jNanoTime, jNanoTime2, millis);
        return i2;
    }
}
