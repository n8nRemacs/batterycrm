package com.otaliastudios.transcoder.sink;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import java.nio.ByteBuffer;

/* compiled from: DataSink.java */
/* loaded from: classes7.dex */
public interface a {
    void a(@N TrackType trackType, @N MediaFormat mediaFormat);

    void b(@N TrackType trackType, @N ByteBuffer byteBuffer, @N MediaCodec.BufferInfo bufferInfo);
}
