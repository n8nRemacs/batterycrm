package com.otaliastudios.transcoder.internal.media;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import j.P;

/* compiled from: MediaFormatProvider.java */
/* loaded from: classes7.dex */
public class c {

    /* compiled from: MediaFormatProvider.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f366151a;

        static {
            int[] iArr = new int[TrackType.values().length];
            f366151a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f366151a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @P
    public static MediaFormat a(@N MediaCodec mediaCodec, @N com.otaliastudios.transcoder.internal.media.a aVar, @N MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -3) {
            return a(mediaCodec, aVar, bufferInfo);
        }
        if (iDequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        }
        if (iDequeueOutputBuffer != -1) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
        return null;
    }

    public static boolean b(@N TrackType trackType, @N MediaFormat mediaFormat) {
        if (trackType == TrackType.f365975c && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int iOrdinal = trackType.ordinal();
        if (iOrdinal == 0) {
            return mediaFormat.containsKey("mime") && mediaFormat.containsKey("channel-count") && mediaFormat.containsKey("sample-rate");
        }
        if (iOrdinal == 1) {
            return mediaFormat.containsKey("mime") && mediaFormat.containsKey("height") && mediaFormat.containsKey("width") && mediaFormat.containsKey("frame-rate");
        }
        throw new RuntimeException("Unexpected type: " + trackType);
    }
}
