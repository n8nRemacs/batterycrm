package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g3h extends i3 implements f3h {
    public static final lz1 d = new lz1(16);
    public final MediaCodecInfo.VideoCapabilities c;

    public g3h(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.c = videoCapabilities;
    }

    public static g3h L0(bc0 bc0Var) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = fd3.a;
        String str = bc0Var.a;
        LruCache lruCache2 = fd3.a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        if (mediaCodecInfo == null) {
            try {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e) {
                    throw new InvalidConfigException(e);
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCodecCreateEncoderByType = null;
            }
        }
        return new g3h(mediaCodecInfo, bc0Var.a);
    }

    @Override // defpackage.f3h
    public final int H() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.f3h
    public final Range I() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.f3h
    public final boolean L() {
        return true;
    }

    @Override // defpackage.f3h
    public final Range Q(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.f3h
    public final Range T(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // defpackage.f3h
    public final int U() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.f3h
    public final Range V() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.f3h
    public final boolean W(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.f3h
    public final Range Y() {
        return this.c.getSupportedHeights();
    }
}
