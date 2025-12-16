package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i12);

    Surface createInputSurface();

    int dequeueInputBuffer(long j12);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j12);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i12);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i12);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i12);

    void queueInputBuffer(int i12, int i13, int i14, long j12, int i15);

    void release();

    void releaseOutputBuffer(int i12, boolean z12);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
