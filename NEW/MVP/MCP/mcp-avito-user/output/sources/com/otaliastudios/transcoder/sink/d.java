package com.otaliastudios.transcoder.sink;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import java.nio.ByteBuffer;

/* compiled from: MultiDataSink.java */
/* loaded from: classes7.dex */
public class d implements a {
    @Override // com.otaliastudios.transcoder.sink.a
    public final void a(@N TrackType trackType, @N MediaFormat mediaFormat) {
        throw null;
    }

    @Override // com.otaliastudios.transcoder.sink.a
    public final void b(@N TrackType trackType, @N ByteBuffer byteBuffer, @N MediaCodec.BufferInfo bufferInfo) {
        byteBuffer.position();
        byteBuffer.limit();
        throw null;
    }
}
